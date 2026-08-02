package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pv4 extends c5n {
    public final c5n h;
    public volatile boolean i;
    public List j = new ArrayList();

    public pv4(c5n c5nVar) {
        this.h = c5nVar;
    }

    @Override // defpackage.c5n
    public final void J(xei xeiVar, qic qicVar) {
        Q(new lv4(1, this, xeiVar, qicVar));
    }

    @Override // defpackage.c5n
    public final void K(qic qicVar) {
        if (this.i) {
            this.h.K(qicVar);
        } else {
            Q(new vlo(this, qicVar, false, 7));
        }
    }

    @Override // defpackage.c5n
    public final void L(Object obj) {
        if (this.i) {
            this.h.L(obj);
        } else {
            Q(new a8p(this, obj, false, 7));
        }
    }

    public final void Q(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.i) {
                    runnable.run();
                } else {
                    this.j.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
