package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zd6 implements Closeable {
    public static final Logger d = Logger.getLogger(ood.class.getName());
    public final ood a;
    public final rk0 b;
    public final by9 c;

    public zd6(ood oodVar, rk0 rk0Var) {
        Level level = Level.FINE;
        this.c = new by9(11);
        this.a = oodVar;
        this.b = rk0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    public final void e(boolean z, int i, x52 x52Var, int i2) {
        by9 by9Var = this.c;
        x52Var.getClass();
        by9Var.m(2, i, x52Var, i2, z);
        try {
            qg9 qg9Var = this.b.a;
            synchronized (qg9Var) {
                if (qg9Var.e) {
                    throw new IOException("closed");
                }
                qg9Var.e(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    qg9Var.a.W(x52Var, i2);
                }
            }
        } catch (IOException e) {
            this.a.m(e);
        }
    }

    public final void f(up5 up5Var, byte[] bArr) {
        rk0 rk0Var = this.b;
        gc2 gc2Var = gc2.d;
        this.c.p(2, 0, up5Var, q1f.r(bArr));
        try {
            rk0Var.i(up5Var, bArr);
            rk0Var.flush();
        } catch (IOException e) {
            this.a.m(e);
        }
    }

    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            this.a.m(e);
        }
    }

    public final void g(int i, int i2, boolean z) {
        by9 by9Var = this.c;
        if (z) {
            long j = (4294967295L & i2) | (i << 32);
            if (by9Var.l()) {
                ((Logger) by9Var.a).log(Level.FINE, "OUTBOUND PING: ack=true bytes=" + j);
            }
        } else {
            by9Var.q(2, (4294967295L & i2) | (i << 32));
        }
        try {
            this.b.j(i, i2, z);
        } catch (IOException e) {
            this.a.m(e);
        }
    }

    public final void h(int i, up5 up5Var) {
        this.c.r(2, i, up5Var);
        try {
            this.b.k(i, up5Var);
        } catch (IOException e) {
            this.a.m(e);
        }
    }

    public final void i(int i, long j) {
        this.c.u(2, i, j);
        try {
            this.b.n(i, j);
        } catch (IOException e) {
            this.a.m(e);
        }
    }
}
