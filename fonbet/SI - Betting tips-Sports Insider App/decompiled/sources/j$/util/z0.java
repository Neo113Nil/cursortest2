package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface z0 extends c1 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.c1, j$.util.Spliterator
    z0 trySplit();
}
