package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kof implements k62 {
    public final ejh a;
    public final x52 b;
    public boolean c;

    public kof(ejh ejhVar) {
        ejhVar.getClass();
        this.a = ejhVar;
        this.b = new x52();
    }

    @Override // defpackage.k62
    public final k62 G(long j) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.c1(j);
        k();
        return this;
    }

    @Override // defpackage.k62
    public final long M0(cwh cwhVar) {
        cwhVar.getClass();
        long j = 0;
        while (true) {
            long read = cwhVar.read(this.b, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            k();
        }
    }

    @Override // defpackage.k62
    public final k62 R0(int i, int i2, byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.write(bArr, i, i2);
        k();
        return this;
    }

    @Override // defpackage.k62
    public final k62 S(String str) {
        str.getClass();
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.g1(str);
        k();
        return this;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        if (this.c) {
            a70.r("closed");
        } else {
            this.b.W(x52Var, j);
            k();
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ejh ejhVar = this.a;
        if (this.c) {
            return;
        }
        try {
            x52 x52Var = this.b;
            long j = x52Var.b;
            if (j > 0) {
                ejhVar.W(x52Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ejhVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.k62, defpackage.ejh, java.io.Flushable
    public final void flush() {
        if (this.c) {
            a70.r("closed");
            return;
        }
        x52 x52Var = this.b;
        long j = x52Var.b;
        ejh ejhVar = this.a;
        if (j > 0) {
            ejhVar.W(x52Var, j);
        }
        ejhVar.flush();
    }

    public final k62 h() {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        x52 x52Var = this.b;
        long j = x52Var.b;
        if (j > 0) {
            this.a.W(x52Var, j);
        }
        return this;
    }

    @Override // defpackage.k62
    public final k62 i0(gc2 gc2Var) {
        gc2Var.getClass();
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.X0(gc2Var);
        k();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final k62 k() {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        x52 x52Var = this.b;
        long m = x52Var.m();
        if (m > 0) {
            this.a.W(x52Var, m);
        }
        return this;
    }

    public final k62 m(long j) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.Z0(j);
        k();
        return this;
    }

    public final k62 n(int i) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.b1(i);
        k();
        return this;
    }

    public final k62 p(int i) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.d1(i);
        k();
        return this;
    }

    @Override // defpackage.k62
    public final k62 t0(int i) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.b1(yqo.I(i));
        k();
        return this;
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.k62
    public final x52 u() {
        return this.b;
    }

    @Override // defpackage.k62
    public final k62 write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.write(bArr, 0, bArr.length);
        k();
        return this;
    }

    @Override // defpackage.k62
    public final k62 writeByte(int i) {
        if (this.c) {
            a70.r("closed");
            return null;
        }
        this.b.Y0(i);
        k();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            k();
            return write;
        }
        a70.r("closed");
        return 0;
    }
}
