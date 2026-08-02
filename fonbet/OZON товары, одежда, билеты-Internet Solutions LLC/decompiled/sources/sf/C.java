package sf;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
final class C implements K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OutputStream f98652a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N f98653b;

    public C(@NotNull OutputStream out, @NotNull N timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f98652a = out;
        this.f98653b = timeout;
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f98652a.close();
    }

    @Override // sf.K, java.io.Flushable
    public final void flush() {
        this.f98652a.flush();
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return this.f98653b;
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.f98652a + ')';
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        C9676b.b(source.size(), 0L, j11);
        while (j11 > 0) {
            this.f98653b.f();
            H h11 = source.f98708a;
            Intrinsics.f(h11);
            int min = (int) Math.min(j11, h11.f98672c - h11.f98671b);
            this.f98652a.write(h11.f98670a, h11.f98671b, min);
            h11.f98671b += min;
            long j12 = min;
            j11 -= j12;
            source.O(source.size() - j12);
            if (h11.f98671b == h11.f98672c) {
                source.f98708a = h11.a();
                I.a(h11);
            }
        }
    }
}
