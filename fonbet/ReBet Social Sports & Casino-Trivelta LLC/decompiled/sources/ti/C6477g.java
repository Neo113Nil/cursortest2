package ti;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ti.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6477g implements E {
    @Override // ti.E
    public H timeout() {
        return H.NONE;
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ti.E, java.io.Flushable
    public void flush() {
    }
}
