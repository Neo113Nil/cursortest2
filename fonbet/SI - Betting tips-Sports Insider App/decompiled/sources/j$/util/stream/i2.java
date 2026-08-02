package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface i2 {
    i2 a(int i5);

    long count();

    void forEach(Consumer consumer);

    i2 i(long j, long j6, IntFunction intFunction);

    void k(Object[] objArr, int i5);

    Object[] m(IntFunction intFunction);

    int o();

    Spliterator spliterator();
}
