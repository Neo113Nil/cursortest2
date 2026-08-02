package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hh3 extends fsg {
    public final vf3 a;
    public final vf3 b;
    public final vf3 c;
    public final jh3 d;
    public volatile boolean e;

    public hh3(jh3 jh3Var) {
        this.d = jh3Var;
        vf3 vf3Var = new vf3(1);
        this.a = vf3Var;
        vf3 vf3Var2 = new vf3(0);
        this.b = vf3Var2;
        vf3 vf3Var3 = new vf3(1);
        this.c = vf3Var3;
        vf3Var3.a(vf3Var);
        vf3Var3.a(vf3Var2);
    }

    @Override // defpackage.fsg
    public final k55 a(Runnable runnable, TimeUnit timeUnit) {
        if (this.e) {
            return em5.a;
        }
        return this.d.c(runnable, TimeUnit.NANOSECONDS, this.b);
    }

    @Override // defpackage.fsg
    public final void b(tc8 tc8Var) {
        if (this.e) {
            return;
        }
        this.d.c(tc8Var, TimeUnit.MILLISECONDS, this.a);
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.d();
    }
}
