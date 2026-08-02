package ti;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface E extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    H timeout();

    void write(C6478h c6478h, long j10);
}
