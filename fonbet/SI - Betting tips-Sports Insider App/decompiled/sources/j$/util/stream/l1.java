package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class l1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f17963a;

    public /* synthetic */ l1(LongStream longStream) {
        this.f17963a = longStream;
    }

    public static /* synthetic */ n1 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof m1 ? ((m1) longStream).f17984a : new l1(longStream);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.f17963a.mapToInt(null));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 a() {
        return f(this.f17963a.takeWhile(null));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ e0 asDoubleStream() {
        return c0.f(this.f17963a.asDoubleStream());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.E(this.f17963a.average());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 b() {
        return f(this.f17963a.filter(null));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ Stream boxed() {
        return z6.f(this.f17963a.boxed());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 c() {
        return f(this.f17963a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f17963a.close();
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f17963a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ long count() {
        return this.f17963a.count();
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 distinct() {
        return f(this.f17963a.distinct());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 e() {
        return f(this.f17963a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f17963a;
        if (obj instanceof l1) {
            obj = ((l1) obj).f17963a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.c0 findAny() {
        return j$.com.android.tools.r8.a.G(this.f17963a.findAny());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.c0 findFirst() {
        return j$.com.android.tools.r8.a.G(this.f17963a.findFirst());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f17963a.forEach(longConsumer);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f17963a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17963a.hashCode();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ boolean isParallel() {
        return this.f17963a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.n1, j$.util.stream.h
    public final /* synthetic */ j$.util.o0 iterator() {
        ?? it = this.f17963a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.n0 ? ((j$.util.n0) it).f17759a : new j$.util.m0(it);
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Iterator iterator() {
        return this.f17963a.iterator();
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ e0 j() {
        return c0.f(this.f17963a.mapToDouble(null));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 limit(long j) {
        return f(this.f17963a.limit(j));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ boolean m() {
        return this.f17963a.noneMatch(null);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return z6.f(this.f17963a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.c0 max() {
        return j$.com.android.tools.r8.a.G(this.f17963a.max());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.c0 min() {
        return j$.com.android.tools.r8.a.G(this.f17963a.min());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h onClose(Runnable runnable) {
        return f.f(this.f17963a.onClose(runnable));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h parallel() {
        return f.f(this.f17963a.parallel());
    }

    @Override // j$.util.stream.n1, j$.util.stream.h
    public final /* synthetic */ n1 parallel() {
        return f(this.f17963a.parallel());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 peek(LongConsumer longConsumer) {
        return f(this.f17963a.peek(longConsumer));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ boolean q() {
        return this.f17963a.anyMatch(null);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f17963a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.G(this.f17963a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h sequential() {
        return f.f(this.f17963a.sequential());
    }

    @Override // j$.util.stream.n1, j$.util.stream.h
    public final /* synthetic */ n1 sequential() {
        return f(this.f17963a.sequential());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 skip(long j) {
        return f(this.f17963a.skip(j));
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ n1 sorted() {
        return f(this.f17963a.sorted());
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f17963a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.n1, j$.util.stream.h
    public final /* synthetic */ j$.util.z0 spliterator() {
        return j$.util.x0.a(this.f17963a.spliterator());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ long sum() {
        return this.f17963a.sum();
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ long[] toArray() {
        return this.f17963a.toArray();
    }

    @Override // j$.util.stream.h
    public final /* synthetic */ h unordered() {
        return f.f(this.f17963a.unordered());
    }

    @Override // j$.util.stream.n1
    public final /* synthetic */ boolean w() {
        return this.f17963a.allMatch(null);
    }

    @Override // j$.util.stream.n1
    public final j$.util.z summaryStatistics() {
        this.f17963a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.n1
    public final n1 d(j$.util.p pVar) {
        LongStream longStream = this.f17963a;
        j$.util.p pVar2 = new j$.util.p(4);
        pVar2.f17766b = pVar;
        return f(longStream.flatMap(pVar2));
    }
}
