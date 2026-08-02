package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lte {
    public final jte a;
    public final ih6 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public lte(ih6 ih6Var, jte jteVar, mij mijVar, int i, Looper looper) {
        this.b = ih6Var;
        this.a = jteVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        z1a.E(!this.f);
        this.f = true;
        ih6 ih6Var = this.b;
        if (!ih6Var.I && ih6Var.j.getThread().isAlive()) {
            ih6Var.h.c(14, this).b();
        } else {
            tgj.d0("Ignoring messages sent after release.");
            a(false);
        }
    }
}
