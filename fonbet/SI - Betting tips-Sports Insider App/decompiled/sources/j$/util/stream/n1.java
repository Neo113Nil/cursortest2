package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface n1 extends h {
    IntStream A();

    n1 a();

    e0 asDoubleStream();

    j$.util.a0 average();

    n1 b();

    Stream boxed();

    n1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    n1 d(j$.util.p pVar);

    n1 distinct();

    n1 e();

    j$.util.c0 findAny();

    j$.util.c0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.h
    j$.util.o0 iterator();

    e0 j();

    n1 limit(long j);

    boolean m();

    Stream mapToObj(LongFunction longFunction);

    j$.util.c0 max();

    j$.util.c0 min();

    @Override // j$.util.stream.h
    n1 parallel();

    n1 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.c0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.h
    n1 sequential();

    n1 skip(long j);

    n1 sorted();

    @Override // j$.util.stream.h
    j$.util.z0 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    long[] toArray();

    boolean w();
}
