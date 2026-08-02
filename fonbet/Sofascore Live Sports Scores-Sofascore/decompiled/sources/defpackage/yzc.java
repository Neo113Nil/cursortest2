package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class yzc extends keb {
    @Override // defpackage.keb
    public void j(Object obj) {
        keb.a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void k(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == keb.k;
            this.f = obj;
        }
        if (z) {
            ig0 G = ig0.G();
            b8 b8Var = this.j;
            dt4 dt4Var = G.h;
            if (dt4Var.j == null) {
                synchronized (dt4Var.h) {
                    try {
                        if (dt4Var.j == null) {
                            dt4Var.j = dt4.G(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            dt4Var.j.post(b8Var);
        }
    }
}
