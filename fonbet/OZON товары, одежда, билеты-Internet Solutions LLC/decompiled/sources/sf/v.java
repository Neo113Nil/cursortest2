package sf;

import I0.C3173b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
final class v implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f98762a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N f98763b;

    public v(@NotNull InputStream input, @NotNull N timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f98762a = input;
        this.f98763b = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f98762a.close();
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 == 0) {
            return 0L;
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        try {
            this.f98763b.f();
            H W11 = sink.W(1);
            int read = this.f98762a.read(W11.f98670a, W11.f98672c, (int) Math.min(j11, 8192 - W11.f98672c));
            if (read != -1) {
                W11.f98672c += read;
                long j12 = read;
                sink.O(sink.size() + j12);
                return j12;
            }
            if (W11.f98671b != W11.f98672c) {
                return -1L;
            }
            sink.f98708a = W11.a();
            I.a(W11);
            return -1L;
        } catch (AssertionError e11) {
            if (z.e(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f98763b;
    }

    @NotNull
    public final String toString() {
        return "source(" + this.f98762a + ')';
    }
}
