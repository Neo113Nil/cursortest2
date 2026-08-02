package sf;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9685k implements K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final F f98723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Deflater f98724b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f98725c;

    public C9685k(@NotNull F sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f98723a = sink;
        this.f98724b = deflater;
    }

    private final void c(boolean z11) {
        C9681g c9681g;
        H W11;
        int deflate;
        F f7 = this.f98723a;
        while (true) {
            c9681g = f7.f98663b;
            W11 = c9681g.W(1);
            Deflater deflater = this.f98724b;
            byte[] bArr = W11.f98670a;
            if (z11) {
                int i11 = W11.f98672c;
                deflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
            } else {
                int i12 = W11.f98672c;
                deflate = deflater.deflate(bArr, i12, 8192 - i12);
            }
            if (deflate > 0) {
                W11.f98672c += deflate;
                c9681g.O(c9681g.size() + deflate);
                f7.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (W11.f98671b == W11.f98672c) {
            c9681g.f98708a = W11.a();
            I.a(W11);
        }
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f98725c) {
            return;
        }
        try {
            d();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f98724b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f98723a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f98725c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d() {
        this.f98724b.finish();
        c(false);
    }

    @Override // sf.K, java.io.Flushable
    public final void flush() throws IOException {
        c(true);
        this.f98723a.flush();
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return this.f98723a.f98662a.timeout();
    }

    @NotNull
    public final String toString() {
        return "DeflaterSink(" + this.f98723a + ')';
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C9676b.b(source.size(), 0L, j11);
        while (j11 > 0) {
            H h11 = source.f98708a;
            Intrinsics.f(h11);
            int min = (int) Math.min(j11, h11.f98672c - h11.f98671b);
            this.f98724b.setInput(h11.f98670a, h11.f98671b, min);
            c(false);
            long j12 = min;
            source.O(source.size() - j12);
            int i11 = h11.f98671b + min;
            h11.f98671b = i11;
            if (i11 == h11.f98672c) {
                source.f98708a = h11.a();
                I.a(h11);
            }
            j11 -= j12;
        }
    }
}
