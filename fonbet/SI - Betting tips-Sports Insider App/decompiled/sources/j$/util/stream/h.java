package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    h onClose(Runnable runnable);

    h parallel();

    h sequential();

    Spliterator spliterator();

    h unordered();
}
