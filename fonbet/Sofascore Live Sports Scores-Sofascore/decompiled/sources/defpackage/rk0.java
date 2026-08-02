package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rk0 implements Closeable {
    public final qg9 a;
    public final /* synthetic */ tk0 b;

    public rk0(tk0 tk0Var, qg9 qg9Var) {
        this.b = tk0Var;
        this.a = qg9Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void e(e7a e7aVar) {
        this.b.k++;
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            if (qg9Var.e) {
                throw new IOException("closed");
            }
            int i = qg9Var.d;
            if ((e7aVar.b & 32) != 0) {
                i = e7aVar.a[5];
            }
            qg9Var.d = i;
            qg9Var.e(0, 0, (byte) 4, (byte) 1);
            qg9Var.a.flush();
        }
    }

    public final void flush() {
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            if (qg9Var.e) {
                throw new IOException("closed");
            }
            qg9Var.a.flush();
        }
    }

    public final void h() {
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            try {
                if (qg9Var.e) {
                    throw new IOException("closed");
                }
                Logger logger = sg9.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + sg9.b.i());
                }
                qg9Var.a.write(sg9.b.v());
                qg9Var.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(up5 up5Var, byte[] bArr) {
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            try {
                if (qg9Var.e) {
                    throw new IOException("closed");
                }
                if (up5Var.a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                qg9Var.e(0, bArr.length + 8, (byte) 7, (byte) 0);
                qg9Var.a.n(0);
                qg9Var.a.n(up5Var.a);
                if (bArr.length > 0) {
                    qg9Var.a.write(bArr);
                }
                qg9Var.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        if (z) {
            this.b.k++;
        }
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            if (qg9Var.e) {
                throw new IOException("closed");
            }
            qg9Var.e(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            qg9Var.a.n(i);
            qg9Var.a.n(i2);
            qg9Var.a.flush();
        }
    }

    public final void k(int i, up5 up5Var) {
        this.b.k++;
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            if (qg9Var.e) {
                throw new IOException("closed");
            }
            if (up5Var.a == -1) {
                throw new IllegalArgumentException();
            }
            qg9Var.e(i, 4, (byte) 3, (byte) 0);
            qg9Var.a.n(up5Var.a);
            qg9Var.a.flush();
        }
    }

    public final void m(e7a e7aVar) {
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            try {
                if (qg9Var.e) {
                    throw new IOException("closed");
                }
                qg9Var.e(0, Integer.bitCount(e7aVar.b) * 6, (byte) 4, (byte) 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & e7aVar.b) == 0) {
                        z = false;
                    }
                    if (z) {
                        qg9Var.a.p(i == 4 ? 3 : i == 7 ? 4 : i);
                        qg9Var.a.n(e7aVar.a[i]);
                    }
                    i++;
                }
                qg9Var.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(int i, long j) {
        qg9 qg9Var = this.a;
        synchronized (qg9Var) {
            if (qg9Var.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            qg9Var.e(i, 4, (byte) 8, (byte) 0);
            qg9Var.a.n((int) j);
            qg9Var.a.flush();
        }
    }
}
