package ti;

import java.io.Closeable;

/* loaded from: classes5.dex */
public interface G extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(C6478h c6478h, long j10);

    H timeout();
}
