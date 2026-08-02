package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y49 implements ejh {
    public final kof a;
    public final Deflater b;
    public final hv4 c;
    public boolean d;
    public final CRC32 e;

    public y49(k62 k62Var) {
        kof kofVar = new kof(k62Var);
        this.a = kofVar;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new hv4(kofVar, deflater, 0);
        this.e = new CRC32();
        x52 x52Var = kofVar.b;
        x52Var.d1(8075);
        x52Var.Y0(8);
        x52Var.Y0(0);
        x52Var.b1(0);
        x52Var.Y0(0);
        x52Var.Y0(0);
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        b1h b1hVar = x52Var.a;
        b1hVar.getClass();
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, b1hVar.c - b1hVar.b);
            this.e.update(b1hVar.a, b1hVar.b, min);
            j2 -= min;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
        }
        this.c.W(x52Var, j);
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.b;
        kof kofVar = this.a;
        if (this.d) {
            return;
        }
        try {
            hv4 hv4Var = this.c;
            ((Deflater) hv4Var.d).finish();
            hv4Var.e(false);
            kofVar.t0((int) this.e.getValue());
            kofVar.t0((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            kofVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        this.c.flush();
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.a.a.timeout();
    }
}
