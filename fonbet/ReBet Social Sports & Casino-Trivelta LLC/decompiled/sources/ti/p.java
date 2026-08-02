package ti;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements E {

    /* renamed from: a, reason: collision with root package name */
    public final z f65875a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f65876b;

    /* renamed from: c, reason: collision with root package name */
    public final l f65877c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65878d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f65879e;

    public p(E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        z zVar = new z(sink);
        this.f65875a = zVar;
        Deflater deflater = new Deflater(-1, true);
        this.f65876b = deflater;
        this.f65877c = new l((InterfaceC6479i) zVar, deflater);
        this.f65879e = new CRC32();
        C6478h c6478h = zVar.f65902b;
        c6478h.writeShort(8075);
        c6478h.writeByte(8);
        c6478h.writeByte(0);
        c6478h.writeInt(0);
        c6478h.writeByte(0);
        c6478h.writeByte(0);
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f65878d) {
            return;
        }
        try {
            this.f65877c.k();
            k();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f65876b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f65875a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f65878d = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(C6478h c6478h, long j10) {
        C6468B c6468b = c6478h.f65857a;
        Intrinsics.checkNotNull(c6468b);
        while (j10 > 0) {
            int min = (int) Math.min(j10, c6468b.f65836b - c6468b.f65835a);
            this.f65879e.update(c6468b.data, c6468b.f65835a, min);
            j10 -= min;
            c6468b = c6468b.f65839e;
            Intrinsics.checkNotNull(c6468b);
        }
    }

    @Override // ti.E, java.io.Flushable
    public void flush() {
        this.f65877c.flush();
    }

    public final void k() {
        this.f65875a.d((int) this.f65879e.getValue());
        this.f65875a.d((int) this.f65876b.getBytesRead());
    }

    @Override // ti.E
    public H timeout() {
        return this.f65875a.timeout();
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        d(source, j10);
        this.f65877c.write(source, j10);
    }
}
