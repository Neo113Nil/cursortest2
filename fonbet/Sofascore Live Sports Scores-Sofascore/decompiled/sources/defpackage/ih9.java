package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ih9 implements ooh {
    public final int a;
    public final zg9 b;
    public final dw1 c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final gh9 h;
    public final fh9 i;
    public final hh9 j;
    public final hh9 k;
    public tp5 l;
    public IOException m;

    public ih9(int i, zg9 zg9Var, boolean z, boolean z2, q89 q89Var) {
        zg9Var.getClass();
        this.a = i;
        this.b = zg9Var;
        this.c = new dw1(i);
        this.e = zg9Var.s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new gh9(this, zg9Var.r.a(), z2);
        this.i = new fh9(this, z);
        this.j = new hh9(this);
        this.k = new hh9(this);
        if (q89Var == null) {
            if (g()) {
                return;
            }
            a70.r("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            a70.r("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(q89Var);
    }

    public final void a() {
        boolean z;
        boolean h;
        TimeZone timeZone = yol.a;
        synchronized (this) {
            try {
                gh9 gh9Var = this.h;
                if (!gh9Var.b && gh9Var.e) {
                    fh9 fh9Var = this.i;
                    if (!fh9Var.a) {
                        if (fh9Var.c) {
                        }
                    }
                    z = true;
                    h = h();
                    Unit unit = Unit.a;
                }
                z = false;
                h = h();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(tp5.CANCEL, null);
        } else {
            if (h) {
                return;
            }
            this.b.g(this.a);
        }
    }

    public final void b() {
        fh9 fh9Var = this.i;
        if (fh9Var.c) {
            is8.e("stream closed");
            return;
        }
        if (fh9Var.a) {
            is8.e("stream finished");
            return;
        }
        if (f() != null) {
            IOException iOException = this.m;
            if (iOException != null) {
                throw iOException;
            }
            tp5 f = f();
            f.getClass();
            throw new sgi(f);
        }
    }

    public final void c(tp5 tp5Var, IOException iOException) {
        if (d(tp5Var, iOException)) {
            this.b.x.k(this.a, tp5Var);
        }
    }

    public final boolean d(tp5 tp5Var, IOException iOException) {
        TimeZone timeZone = yol.a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.l = tp5Var;
            this.m = iOException;
            notifyAll();
            if (this.h.b && this.i.a) {
                return false;
            }
            Unit unit = Unit.a;
            this.b.g(this.a);
            return true;
        }
    }

    public final void e(tp5 tp5Var) {
        if (d(tp5Var, null)) {
            this.b.k(this.a, tp5Var);
        }
    }

    public final tp5 f() {
        tp5 tp5Var;
        synchronized (this) {
            tp5Var = this.l;
        }
        return tp5Var;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    @Override // defpackage.ooh
    public final cwh getSource() {
        return this.h;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                gh9 gh9Var = this.h;
                if (!gh9Var.b) {
                    if (gh9Var.e) {
                    }
                    return true;
                }
                fh9 fh9Var = this.i;
                if (fh9Var.a || fh9Var.c) {
                    if (this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ooh
    public final ejh i() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:13:0x002d, B:14:0x0031, B:22:0x0024), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(q89 q89Var, boolean z) {
        boolean h;
        q89Var.getClass();
        TimeZone timeZone = yol.a;
        synchronized (this) {
            try {
                if (this.g && q89Var.a(":status") == null && q89Var.a(":method") == null) {
                    this.h.getClass();
                    if (z) {
                        this.h.b = true;
                    }
                    h = h();
                    notifyAll();
                    Unit unit = Unit.a;
                }
                this.g = true;
                this.f.add(q89Var);
                if (z) {
                }
                h = h();
                notifyAll();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.b.g(this.a);
    }
}
