package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fh9 implements ejh {
    public final boolean a;
    public final x52 b = new x52();
    public boolean c;
    public final /* synthetic */ ih9 d;

    public fh9(ih9 ih9Var, boolean z) {
        this.d = ih9Var;
        this.a = z;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        TimeZone timeZone = yol.a;
        x52 x52Var2 = this.b;
        x52Var2.W(x52Var, j);
        while (x52Var2.b >= 16384) {
            e(false);
        }
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ih9 ih9Var = this.d;
        TimeZone timeZone = yol.a;
        synchronized (ih9Var) {
            if (this.c) {
                return;
            }
            boolean z = ih9Var.f() == null;
            Unit unit = Unit.a;
            ih9 ih9Var2 = this.d;
            if (!ih9Var2.i.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        e(true);
                    }
                } else if (z) {
                    ih9Var2.b.j(ih9Var2.a, true, null, 0L);
                }
            }
            ih9 ih9Var3 = this.d;
            synchronized (ih9Var3) {
                this.c = true;
                ih9Var3.notifyAll();
                Unit unit2 = Unit.a;
            }
            this.d.b.x.flush();
            this.d.a();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void e(boolean z) {
        long min;
        boolean z2;
        ih9 ih9Var = this.d;
        synchronized (ih9Var) {
            try {
                ih9Var.k.h();
                while (ih9Var.d >= ih9Var.e && !this.a && !this.c && ih9Var.f() == null) {
                    try {
                        try {
                            ih9Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        ih9Var.k.k();
                        throw th;
                    }
                }
                ih9Var.k.k();
                ih9Var.b();
                min = Math.min(ih9Var.e - ih9Var.d, this.b.b);
                ih9Var.d += min;
                z2 = z && min == this.b.b;
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.d.k.h();
        try {
            ih9 ih9Var2 = this.d;
            ih9Var2.b.j(ih9Var2.a, z2, this.b, min);
        } finally {
            this.d.k.k();
        }
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final void flush() {
        ih9 ih9Var = this.d;
        TimeZone timeZone = yol.a;
        synchronized (ih9Var) {
            ih9Var.b();
            Unit unit = Unit.a;
        }
        while (this.b.b > 0) {
            e(false);
            this.d.b.x.flush();
        }
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.d.k;
    }
}
