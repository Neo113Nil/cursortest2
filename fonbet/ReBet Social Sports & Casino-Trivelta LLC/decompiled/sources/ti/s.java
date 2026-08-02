package ti;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class s implements G {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f65889a;

    /* renamed from: b, reason: collision with root package name */
    public final H f65890b;

    public s(InputStream input, H timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f65889a = input;
        this.f65890b = timeout;
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65889a.close();
    }

    @Override // ti.G
    public long read(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f65890b.throwIfReached();
            C6468B h22 = sink.h2(1);
            int read = this.f65889a.read(h22.data, h22.f65836b, (int) Math.min(j10, 8192 - h22.f65836b));
            if (read != -1) {
                h22.f65836b += read;
                long j11 = read;
                sink.e2(sink.size() + j11);
                return j11;
            }
            if (h22.f65835a != h22.f65836b) {
                return -1L;
            }
            sink.f65857a = h22.b();
            C6469C.b(h22);
            return -1L;
        } catch (AssertionError e10) {
            if (t.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // ti.G
    public H timeout() {
        return this.f65890b;
    }

    public String toString() {
        return "source(" + this.f65889a + ')';
    }
}
