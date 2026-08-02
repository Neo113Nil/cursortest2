package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface e0 extends h {
    boolean B();

    e0 a();

    j$.util.a0 average();

    e0 b();

    Stream boxed();

    e0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    e0 d(j$.util.p pVar);

    e0 distinct();

    e0 e();

    j$.util.a0 findAny();

    j$.util.a0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.h
    j$.util.g0 iterator();

    e0 limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.a0 max();

    j$.util.a0 min();

    boolean o();

    @Override // j$.util.stream.h
    e0 parallel();

    e0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.h
    e0 sequential();

    e0 skip(long j);

    e0 sorted();

    @Override // j$.util.stream.h
    j$.util.t0 spliterator();

    double sum();

    j$.util.w summaryStatistics();

    boolean t();

    double[] toArray();

    n1 u();

    IntStream z();
}
