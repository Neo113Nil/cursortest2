package gf;

import gf.C6728d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.F;

/* loaded from: classes6.dex */
public final class o implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f64446g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C9681g f64447a;

    /* renamed from: b, reason: collision with root package name */
    private int f64448b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64449c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6728d.b f64450d;

    /* renamed from: e, reason: collision with root package name */
    private final F f64451e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f64452f;

    public o(@NotNull F sink, boolean z11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f64451e = sink;
        this.f64452f = z11;
        C9681g c9681g = new C9681g();
        this.f64447a = c9681g;
        this.f64448b = 16384;
        this.f64450d = new C6728d.b(c9681g);
    }

    public final synchronized void c(@NotNull s peerSettings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f64449c) {
                throw new IOException("closed");
            }
            this.f64448b = peerSettings.e(this.f64448b);
            if (peerSettings.b() != -1) {
                this.f64450d.c(peerSettings.b());
            }
            k(0, 0, 4, 1);
            this.f64451e.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f64449c = true;
        this.f64451e.close();
    }

    public final synchronized void d() throws IOException {
        try {
            if (this.f64449c) {
                throw new IOException("closed");
            }
            if (this.f64452f) {
                Logger logger = f64446g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Ye.b.k(">> CONNECTION " + e.f64323a.h(), new Object[0]));
                }
                this.f64451e.Q1(e.f64323a);
                this.f64451e.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.f64449c) {
            throw new IOException("closed");
        }
        this.f64451e.flush();
    }

    public final synchronized void j(boolean z11, int i11, C9681g c9681g, int i12) throws IOException {
        if (this.f64449c) {
            throw new IOException("closed");
        }
        k(i11, i12, 0, z11 ? 1 : 0);
        if (i12 > 0) {
            Intrinsics.f(c9681g);
            this.f64451e.z0(c9681g, i12);
        }
    }

    public final void k(int i11, int i12, int i13, int i14) throws IOException {
        Level level = Level.FINE;
        Logger logger = f64446g;
        if (logger.isLoggable(level)) {
            e.f64327e.getClass();
            logger.fine(e.b(i11, i12, i13, i14, false));
        }
        if (i12 > this.f64448b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f64448b + ": " + i12).toString());
        }
        if ((((int) 2147483648L) & i11) != 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "reserved bit set: ").toString());
        }
        byte[] bArr = Ye.b.f34900a;
        F writeMedium = this.f64451e;
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.h0((i12 >>> 16) & 255);
        writeMedium.h0((i12 >>> 8) & 255);
        writeMedium.h0(i12 & 255);
        writeMedium.h0(i13 & 255);
        writeMedium.h0(i14 & 255);
        writeMedium.j(i11 & Integer.MAX_VALUE);
    }

    public final synchronized void m(int i11, @NotNull EnumC6726b errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f64449c) {
            throw new IOException("closed");
        }
        if (errorCode.a() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        k(0, debugData.length + 8, 7, 0);
        this.f64451e.j(i11);
        this.f64451e.j(errorCode.a());
        if (debugData.length != 0) {
            this.f64451e.U(debugData);
        }
        this.f64451e.flush();
    }

    public final synchronized void o(int i11, @NotNull List headerBlock, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f64449c) {
            throw new IOException("closed");
        }
        this.f64450d.e(headerBlock);
        long size = this.f64447a.size();
        long min = Math.min(this.f64448b, size);
        int i12 = size == min ? 4 : 0;
        if (z11) {
            i12 |= 1;
        }
        k(i11, (int) min, 1, i12);
        this.f64451e.z0(this.f64447a, min);
        if (size > min) {
            long j11 = size - min;
            while (j11 > 0) {
                long min2 = Math.min(this.f64448b, j11);
                j11 -= min2;
                k(i11, (int) min2, 9, j11 == 0 ? 4 : 0);
                this.f64451e.z0(this.f64447a, min2);
            }
        }
    }

    public final int p() {
        return this.f64448b;
    }

    public final synchronized void q(int i11, int i12, boolean z11) throws IOException {
        if (this.f64449c) {
            throw new IOException("closed");
        }
        k(0, 8, 6, z11 ? 1 : 0);
        this.f64451e.j(i11);
        this.f64451e.j(i12);
        this.f64451e.flush();
    }

    public final synchronized void r(int i11, @NotNull EnumC6726b errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f64449c) {
            throw new IOException("closed");
        }
        if (errorCode.a() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        k(i11, 4, 3, 0);
        this.f64451e.j(errorCode.a());
        this.f64451e.flush();
    }

    public final synchronized void s(@NotNull s settings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f64449c) {
                throw new IOException("closed");
            }
            int i11 = 0;
            k(0, settings.i() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.f(i11)) {
                    int i12 = i11 != 4 ? i11 != 7 ? i11 : 4 : 3;
                    F f7 = this.f64451e;
                    if (f7.f98664c) {
                        throw new IllegalStateException("closed");
                    }
                    f7.f98663b.u0(i12);
                    f7.c();
                    this.f64451e.j(settings.a(i11));
                }
                i11++;
            }
            this.f64451e.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void t(int i11, long j11) throws IOException {
        if (this.f64449c) {
            throw new IOException("closed");
        }
        if (j11 == 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j11).toString());
        }
        k(i11, 4, 8, 0);
        this.f64451e.j((int) j11);
        this.f64451e.flush();
    }
}
