package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jh9 implements Closeable {
    public static final Logger f = Logger.getLogger(rg9.class.getName());
    public final kof a;
    public final x52 b;
    public int c;
    public boolean d;
    public final bg9 e;

    public jh9(kof kofVar) {
        this.a = kofVar;
        x52 x52Var = new x52();
        this.b = x52Var;
        this.c = 16384;
        this.e = new bg9(x52Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
            Unit unit = Unit.a;
        }
    }

    public final void e(aah aahVar) {
        aahVar.getClass();
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = aahVar.a;
                if ((i2 & 32) != 0) {
                    i = aahVar.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? aahVar.b[1] : -1) != -1) {
                    bg9 bg9Var = this.e;
                    int min = Math.min((i2 & 2) != 0 ? aahVar.b[1] : -1, 16384);
                    int i3 = bg9Var.d;
                    if (i3 != min) {
                        if (min < i3) {
                            bg9Var.b = Math.min(bg9Var.b, min);
                        }
                        bg9Var.c = true;
                        bg9Var.d = min;
                        int i4 = bg9Var.h;
                        if (min < i4) {
                            if (min == 0) {
                                v79[] v79VarArr = bg9Var.e;
                                mh0.m(0, v79VarArr.length, null, v79VarArr);
                                bg9Var.f = bg9Var.e.length - 1;
                                bg9Var.g = 0;
                                bg9Var.h = 0;
                            } else {
                                bg9Var.a(i4 - min);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.a.flush();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(boolean z, int i, x52 x52Var, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            g(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                kof kofVar = this.a;
                x52Var.getClass();
                kofVar.W(x52Var, i2);
            }
            Unit unit = Unit.a;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(rg9.b(i, i2, i3, i4, false));
            }
        }
        if (i2 > this.c) {
            is8.d(": ", "FRAME_SIZE_ERROR length > ", this.c, i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            ogj.h(ljg.j(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = wol.a;
        kof kofVar = this.a;
        kofVar.writeByte((i2 >>> 16) & 255);
        kofVar.writeByte((i2 >>> 8) & 255);
        kofVar.writeByte(i2 & 255);
        kofVar.writeByte(i3 & 255);
        kofVar.writeByte(i4 & 255);
        kofVar.n(i & Integer.MAX_VALUE);
    }

    public final void h(int i, tp5 tp5Var, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (tp5Var.a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, bArr.length + 8, 7, 0);
            this.a.n(i);
            this.a.n(tp5Var.a);
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void i(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long min = Math.min(this.c, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            g(i, (int) min, 1, i2);
            this.a.W(this.b, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.c, j2);
                    j2 -= min2;
                    g(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.a.W(this.b, min2);
                }
            }
            Unit unit = Unit.a;
        }
    }

    public final void j(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z ? 1 : 0);
            this.a.n(i);
            this.a.n(i2);
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void k(int i, tp5 tp5Var) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (tp5Var.a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i, 4, 3, 0);
            this.a.n(tp5Var.a);
            this.a.flush();
            Unit unit = Unit.a;
        }
    }

    public final void m(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(rg9.c(i, 4, j, false));
                }
                g(i, 4, 8, 0);
                this.a.n((int) j);
                this.a.flush();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
