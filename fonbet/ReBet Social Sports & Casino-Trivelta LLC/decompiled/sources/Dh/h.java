package Dh;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import yh.C6896e;

/* loaded from: classes3.dex */
public interface h extends Closeable {
    C6896e O(Collection collection);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().g(10L, TimeUnit.SECONDS);
    }

    C6896e shutdown();
}
