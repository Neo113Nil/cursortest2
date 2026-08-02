package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface t0 extends c1 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.c1, j$.util.Spliterator
    t0 trySplit();
}
