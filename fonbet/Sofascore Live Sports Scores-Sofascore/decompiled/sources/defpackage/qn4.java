package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qn4 {
    public final /* synthetic */ sn4 a;

    public /* synthetic */ qn4(sn4 sn4Var) {
        this.a = sn4Var;
    }

    public final void a(int i) {
        sn4 sn4Var = this.a;
        synchronized (sn4Var) {
            int i2 = sn4Var.i;
            if (i2 == 0 || sn4Var.e) {
                if (i2 == i) {
                    return;
                }
                sn4Var.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    sn4Var.l = sn4Var.a(i);
                    sn4Var.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    sn4Var.b(sn4Var.f > 0 ? (int) (elapsedRealtime - sn4Var.g) : 0, sn4Var.h, sn4Var.l);
                    sn4Var.g = elapsedRealtime;
                    sn4Var.h = 0L;
                    sn4Var.k = 0L;
                    sn4Var.j = 0L;
                    flh flhVar = sn4Var.c;
                    flhVar.b.clear();
                    flhVar.c = -1;
                    flhVar.d = 0;
                    flhVar.e = 0;
                }
            }
        }
    }
}
