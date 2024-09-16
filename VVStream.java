import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VVStream {
    public static void main(String[] args) {

        //creating a Stream

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();



        //Intermediate Operations

        //filter(Predicate<T> predicate): Filters elements based on a predicate.
        stream.filter(s -> s.startsWith("a"));

        stream = list.stream();

        //map(Function<T, R> mapper): Transforms elements using a given function.
        stream.map(String::toUpperCase);

        stream = list.stream();

        //flatMap(Function<T, Stream<R>>): Transforms elements into streams
        // and then flattens them into a single stream.
        stream.flatMap(s -> Arrays.stream(s.split("")));

        stream = list.stream();

        //distinct(): Removes duplicate elements
        stream.distinct();

        stream = list.stream();

        //sorted(): Sorts the elements in natural order or using a provided comparator.
        stream.sorted();
        stream = list.stream();
        stream.sorted(Comparator.reverseOrder());

        stream = list.stream();

        //peek(Consumer<T> action): Performs an action on each element without modifying the stream
        stream.peek(System.out::println);

        stream = list.stream();


        //Terminal Operations


        //forEach(Consumer<T> action): Performs an action for each element.
        stream.forEach(System.out::println);

        stream = list.stream();

        //collect(Collector<T, A, R> collector): Collects the elements into a collection
        List<String> result = stream.collect(Collectors.toList());

        stream = list.stream();

        //reduce(BinaryOperator<T> accumulator): Performs a reduction on the elements using an associative accumulation function.
        Optional<String> concatenated = stream.reduce((s1, s2) -> s1 + s2);

        stream = list.stream();

        //count(): Returns the count of elements in the stream
        long count = stream.count();

        stream = list.stream();

        //anyMatch(Predicate<T> predicate): Returns true if any elements match the provided predicate.
        boolean anyStartsWithA = stream.anyMatch(s -> s.startsWith("a"));

        stream = list.stream();

        //allMatch(Predicate<T> predicate): Returns true if all elements match the provided predicate
        boolean allStartWithA = stream.allMatch(s -> s.startsWith("a"));

        stream = list.stream();

        //noneMatch(Predicate<T> predicate): Returns true if no elements match the provided predicate
        boolean noneStartWithZ = stream.noneMatch(s -> s.startsWith("z"));

        stream = list.stream();

        //findFirst(): Returns the first element of the stream, if present.
        Optional<String> first = stream.findFirst();

        stream = list.stream();

        //findAny(): Returns any element of the stream, useful in parallel streams.
        Optional<String> any = stream.findAny();



    }
}
