package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f17821a;

    public /* synthetic */ c0(DoubleStream doubleStream) {
        this.f17821a = doubleStream;
    }

    public static /* synthetic */ e0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof d0 ? ((d0) doubleStream).f17854a : new c0(doubleStream);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean B() {
        return this.f17821a.noneMatch(null);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 a() {
        return f(this.f17821a.takeWhile(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.E(this.f17821a.average());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 b() {
        return f(this.f17821a.filter(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Stream boxed() {
        return z6.f(this.f17821a.boxed());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 c() {
        return f(this.f17821a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f17821a.close();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f17821a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ long count() {
        return this.f17821a.count();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 distinct() {
        return f(this.f17821a.distinct());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 e() {
        return f(this.f17821a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f17821a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f17821a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 findAny() {
        return j$.com.android.tools.r8.a.E(this.f17821a.findAny());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 findFirst() {
        return j$.com.android.tools.r8.a.E(this.f17821a.findFirst());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f17821a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f17821a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17821a.hashCode();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ boolean isParallel() {
        return this.f17821a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.e0, j$.util.stream.h
    public final /* synthetic */ j$.util.g0 iterator() {
        ?? it = this.f17821a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.f0 ? ((j$.util.f0) it).f17708a : new j$.util.e0(it);
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Iterator iterator() {
        return this.f17821a.iterator();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 limit(long j) {
        return f(this.f17821a.limit(j));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return z6.f(this.f17821a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 max() {
        return j$.com.android.tools.r8.a.E(this.f17821a.max());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 min() {
        return j$.com.android.tools.r8.a.E(this.f17821a.min());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean o() {
        return this.f17821a.anyMatch(null);
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h onClose(Runnable runnable) {
        return f.f(this.f17821a.onClose(runnable));
    }

    @Override // j$.util.stream.e0, j$.util.stream.h
    public final /* synthetic */ e0 parallel() {
        return f(this.f17821a.parallel());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h parallel() {
        return f.f(this.f17821a.parallel());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 peek(DoubleConsumer doubleConsumer) {
        return f(this.f17821a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f17821a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.E(this.f17821a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.e0, j$.util.stream.h
    public final /* synthetic */ e0 sequential() {
        return f(this.f17821a.sequential());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h sequential() {
        return f.f(this.f17821a.sequential());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 skip(long j) {
        return f(this.f17821a.skip(j));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 sorted() {
        return f(this.f17821a.sorted());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f17821a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.e0, j$.util.stream.h
    public final /* synthetic */ j$.util.t0 spliterator() {
        return j$.util.r0.a(this.f17821a.spliterator());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double sum() {
        return this.f17821a.sum();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean t() {
        return this.f17821a.allMatch(null);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double[] toArray() {
        return this.f17821a.toArray();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ n1 u() {
        return l1.f(this.f17821a.mapToLong(null));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h unordered() {
        return f.f(this.f17821a.unordered());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ IntStream z() {
        return IntStream.VivifiedWrapper.convert(this.f17821a.mapToInt(null));
    }

    @Override // j$.util.stream.e0
    public final j$.util.w summaryStatistics() {
        this.f17821a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.e0
    public final e0 d(j$.util.p pVar) {
        DoubleStream doubleStream = this.f17821a;
        j$.util.p pVar2 = new j$.util.p(2);
        pVar2.f17766b = pVar;
        return f(doubleStream.flatMap(pVar2));
    }
}
