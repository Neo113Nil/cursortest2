package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k21 implements re4 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public xe4 d;

    public k21(boolean z) {
        this.a = z;
    }

    public final void c(int i) {
        xe4 xe4Var = this.d;
        String str = nik.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            tn4 tn4Var = (tn4) this.b.get(i2);
            boolean z = this.a;
            synchronized (tn4Var) {
                vvf vvfVar = tn4.p;
                if (z && (xe4Var.i & 8) != 8) {
                    tn4Var.i += i;
                }
            }
        }
    }

    public final void d() {
        xe4 xe4Var = this.d;
        String str = nik.a;
        for (int i = 0; i < this.c; i++) {
            tn4 tn4Var = (tn4) this.b.get(i);
            boolean z = this.a;
            synchronized (tn4Var) {
                try {
                    vvf vvfVar = tn4.p;
                    if (z && (xe4Var.i & 8) != 8) {
                        z1a.E(tn4Var.g > 0);
                        tn4Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (elapsedRealtime - tn4Var.h);
                        tn4Var.j += i2;
                        long j = tn4Var.k;
                        long j2 = tn4Var.i;
                        tn4Var.k = j + j2;
                        if (i2 > 0) {
                            tn4Var.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                            if (tn4Var.j < 2000) {
                                if (tn4Var.k >= 524288) {
                                }
                                tn4Var.b(i2, tn4Var.i, tn4Var.l);
                                tn4Var.h = elapsedRealtime;
                                tn4Var.i = 0L;
                            }
                            tn4Var.l = (long) tn4Var.f.i();
                            tn4Var.b(i2, tn4Var.i, tn4Var.l);
                            tn4Var.h = elapsedRealtime;
                            tn4Var.i = 0L;
                        }
                        tn4Var.g--;
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
            ((tn4) this.b.get(i)).getClass();
        }
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(tn4Var)) {
            return;
        }
        arrayList.add(tn4Var);
        this.c++;
    }

    public final void g(xe4 xe4Var) {
        this.d = xe4Var;
        for (int i = 0; i < this.c; i++) {
            tn4 tn4Var = (tn4) this.b.get(i);
            boolean z = this.a;
            synchronized (tn4Var) {
                try {
                    vvf vvfVar = tn4.p;
                    if (z && (xe4Var.i & 8) != 8) {
                        if (tn4Var.g == 0) {
                            tn4Var.d.getClass();
                            tn4Var.h = SystemClock.elapsedRealtime();
                        }
                        tn4Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
