package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j21 implements qe4 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public we4 d;

    public j21(boolean z) {
        this.a = z;
    }

    public final void b(int i) {
        boolean z;
        we4 we4Var = this.d;
        int i2 = lik.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            sn4 sn4Var = (sn4) this.b.get(i3);
            boolean z2 = this.a;
            synchronized (sn4Var) {
                vvf vvfVar = sn4.n;
                if (z2) {
                    int i4 = we4Var.g;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sn4Var.h += i;
                }
            }
        }
    }

    @Override // defpackage.qe4
    public final void c(sn4 sn4Var) {
        sn4Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(sn4Var)) {
            return;
        }
        arrayList.add(sn4Var);
        this.c++;
    }

    public final void d() {
        boolean z;
        we4 we4Var = this.d;
        int i = lik.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            sn4 sn4Var = (sn4) this.b.get(i2);
            boolean z2 = this.a;
            synchronized (sn4Var) {
                try {
                    vvf vvfVar = sn4.n;
                    if (z2) {
                        int i3 = we4Var.g;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        qx9.t(sn4Var.f > 0);
                        sn4Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i4 = (int) (elapsedRealtime - sn4Var.g);
                        sn4Var.j += i4;
                        long j = sn4Var.k;
                        long j2 = sn4Var.h;
                        sn4Var.k = j + j2;
                        if (i4 > 0) {
                            sn4Var.c.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i4);
                            if (sn4Var.j < 2000) {
                                if (sn4Var.k >= 524288) {
                                }
                                sn4Var.b(i4, sn4Var.h, sn4Var.l);
                                sn4Var.g = elapsedRealtime;
                                sn4Var.h = 0L;
                            }
                            sn4Var.l = (long) sn4Var.c.i();
                            sn4Var.b(i4, sn4Var.h, sn4Var.l);
                            sn4Var.g = elapsedRealtime;
                            sn4Var.h = 0L;
                        }
                        sn4Var.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void e() {
        for (int i = 0; i < this.c; i++) {
            ((sn4) this.b.get(i)).getClass();
        }
    }

    public final void f(we4 we4Var) {
        this.d = we4Var;
        for (int i = 0; i < this.c; i++) {
            sn4 sn4Var = (sn4) this.b.get(i);
            boolean z = this.a;
            synchronized (sn4Var) {
                try {
                    vvf vvfVar = sn4.n;
                    if (z) {
                        if (sn4Var.f == 0) {
                            sn4Var.d.getClass();
                            sn4Var.g = SystemClock.elapsedRealtime();
                        }
                        sn4Var.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
