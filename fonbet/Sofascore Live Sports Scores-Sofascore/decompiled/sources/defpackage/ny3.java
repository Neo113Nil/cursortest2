package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ny3 implements oy3, ph2 {
    public final /* synthetic */ lj2 a;

    public /* synthetic */ ny3(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // defpackage.oy3
    public void c(Object obj) {
        fw2 fw2Var = (fw2) obj;
        fw2Var.getClass();
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(fw2Var));
        }
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        p2g p2gVar = w2g.b;
        this.a.resumeWith(c2gVar);
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        p2g p2gVar = w2g.b;
        this.a.resumeWith(new u2g(th));
    }

    @Override // defpackage.oy3
    public void onResult(Object obj) {
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(Unit.a);
        }
    }
}
