package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface w0 extends c1 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.c1, j$.util.Spliterator
    w0 trySplit();
}
