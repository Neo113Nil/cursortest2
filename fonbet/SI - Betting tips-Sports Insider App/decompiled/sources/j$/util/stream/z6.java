package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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
public final /* synthetic */ class z6 implements Stream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f18180a;

    public /* synthetic */ z6(java.util.stream.Stream stream) {
        this.f18180a = stream;
    }

    public static /* synthetic */ Stream f(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new z6(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f18180a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f18180a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18180a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f18180a.collect(collector == null ? null : collector instanceof i ? ((i) collector).f17925a : new j(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f18180a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f18180a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream d(j$.util.p pVar) {
        return f(this.f18180a.flatMap(x3.q0(pVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return f(this.f18180a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return f(this.f18180a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f18180a;
        if (obj instanceof z6) {
            obj = ((z6) obj).f18180a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return f(this.f18180a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.com.android.tools.r8.a.D(this.f18180a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.com.android.tools.r8.a.D(this.f18180a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f18180a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f18180a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18180a.hashCode();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ boolean isParallel() {
        return this.f18180a.isParallel();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Iterator iterator() {
        return this.f18180a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ n1 l(j$.util.p pVar) {
        return l1.f(this.f18180a.flatMapToLong(x3.q0(pVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return f(this.f18180a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return f(this.f18180a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ e0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return c0.f(this.f18180a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f18180a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ n1 mapToLong(ToLongFunction toLongFunction) {
        return l1.f(this.f18180a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.com.android.tools.r8.a.D(this.f18180a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.com.android.tools.r8.a.D(this.f18180a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream n(j$.util.p pVar) {
        return IntStream.VivifiedWrapper.convert(this.f18180a.flatMapToInt(x3.q0(pVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f18180a.noneMatch(predicate);
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h onClose(Runnable runnable) {
        return f.f(this.f18180a.onClose(runnable));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h parallel() {
        return f.f(this.f18180a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return f(this.f18180a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.com.android.tools.r8.a.D(this.f18180a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f18180a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f18180a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h sequential() {
        return f.f(this.f18180a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return f(this.f18180a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return f(this.f18180a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return f(this.f18180a.sorted(comparator));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f18180a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return f(this.f18180a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f18180a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f18180a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.f18180a.toList();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h unordered() {
        return f.f(this.f18180a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ e0 y(j$.util.p pVar) {
        return c0.f(this.f18180a.flatMapToDouble(x3.q0(pVar)));
    }
}
