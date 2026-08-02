package sf;

import I0.C3173b;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class s implements K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final F f98748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Deflater f98749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9685k f98750c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f98751d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CRC32 f98752e;

    public s(@NotNull InterfaceC9682h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        F f7 = new F(sink);
        this.f98748a = f7;
        Deflater deflater = new Deflater(-1, true);
        this.f98749b = deflater;
        this.f98750c = new C9685k(f7, deflater);
        this.f98752e = new CRC32();
        C9681g c9681g = f7.f98663b;
        c9681g.u0(8075);
        c9681g.d0(8);
        c9681g.d0(0);
        c9681g.r0(0);
        c9681g.d0(0);
        c9681g.d0(0);
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int value;
        boolean z11;
        C9681g c9681g;
        Deflater deflater = this.f98749b;
        F f7 = this.f98748a;
        if (this.f98751d) {
            return;
        }
        try {
            this.f98750c.d();
            value = (int) this.f98752e.getValue();
            z11 = f7.f98664c;
            c9681g = f7.f98663b;
        } catch (Throwable th2) {
            th = th2;
        }
        if (z11) {
            throw new IllegalStateException("closed");
        }
        c9681g.getClass();
        c9681g.r0(C9676b.h(value));
        f7.c();
        int bytesRead = (int) deflater.getBytesRead();
        if (f7.f98664c) {
            throw new IllegalStateException("closed");
        }
        c9681g.getClass();
        c9681g.r0(C9676b.h(bytesRead));
        f7.c();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            f7.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f98751d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // sf.K, java.io.Flushable
    public final void flush() throws IOException {
        this.f98750c.flush();
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return this.f98748a.f98662a.timeout();
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        if (j11 == 0) {
            return;
        }
        H h11 = source.f98708a;
        Intrinsics.f(h11);
        long j12 = j11;
        while (j12 > 0) {
            int min = (int) Math.min(j12, h11.f98672c - h11.f98671b);
            this.f98752e.update(h11.f98670a, h11.f98671b, min);
            j12 -= min;
            h11 = h11.f98675f;
            Intrinsics.f(h11);
        }
        this.f98750c.z0(source, j11);
    }
}
