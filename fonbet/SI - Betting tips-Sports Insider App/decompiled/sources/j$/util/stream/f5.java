package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public abstract class f5 extends b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new j6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new p(this, c7.f17833m | c7.f17839t);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) G0(j0.f17936d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) G0(j0.f17935c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new j6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return G0(new c4(d7.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return G0(new c4(d7.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        G0(new q0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        G0(new q0(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.b
    public final d7 K0() {
        return d7.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) G0(new a4(d7.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.b
    public final i2 I0(b bVar, Spliterator spliterator, boolean z5, IntFunction intFunction) {
        return x3.a0(bVar, spliterator, z5, intFunction);
    }

    @Override // j$.util.stream.b
    public final Spliterator R0(b bVar, Supplier supplier, boolean z5) {
        return new g8(bVar, supplier, z5);
    }

    @Override // j$.util.stream.b
    public final boolean J0(Spliterator spliterator, n5 n5Var) {
        boolean e7;
        do {
            e7 = n5Var.e();
            if (e7) {
                break;
            }
        } while (spliterator.tryAdvance(n5Var));
        return e7;
    }

    @Override // j$.util.stream.x3
    public final a2 z0(long j, IntFunction intFunction) {
        return x3.Y(j, intFunction);
    }

    @Override // j$.util.stream.h
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new s(this, c7.f17839t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new s(this, c7.f17836p | c7.f17834n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new w0(this, c7.f17836p | c7.f17834n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return G0(new c4(d7.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final n1 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new g1(this, c7.f17836p | c7.f17834n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final e0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new x(this, c7.f17836p | c7.f17834n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) G0(new e4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new s(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream n(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new w0(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final e0 y(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new x(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object G0;
        if (!this.f17800h.f17808r || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (c7.ORDERED.n(this.f17804m) && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            G0 = G0(new j4(d7.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            G0 = collector.supplier().get();
            forEach(new j$.util.concurrent.r(6, collector.accumulator(), G0));
            collector2 = collector;
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? G0 : collector2.finisher().apply(G0);
    }

    @Override // j$.util.stream.Stream
    public final n1 l(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new g1(this, c7.f17836p | c7.f17834n | c7.f17839t, pVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new s(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return x3.B0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : x3.B0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i5 = c9.f17848a;
        Objects.requireNonNull(predicate);
        return new l8(this, c9.f17848a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i5 = c9.f17848a;
        Objects.requireNonNull(predicate);
        return new l8(this, c9.f17849b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return x3.m0(H0(intFunction), intFunction).m(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new u0(28));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) G0(x3.A0(v1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) G0(x3.A0(v1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) G0(x3.A0(v1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
