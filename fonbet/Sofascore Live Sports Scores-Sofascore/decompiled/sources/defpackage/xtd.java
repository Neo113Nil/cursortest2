package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xtd extends cvd {
    public static final xtd c = new xtd(0, 4, 1);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        twc twcVar = (twc) zz0Var.h(2);
        twc twcVar2 = (twc) zz0Var.h(3);
        mg3 mg3Var = (mg3) zz0Var.h(1);
        swc swcVar = (swc) zz0Var.h(0);
        if (swcVar == null && (swcVar = mg3Var.p(twcVar)) == null) {
            sf3.b("Could not resolve state for movable content");
            pvd.x();
            return;
        }
        jlh a = llh.a(swcVar.a);
        if (mlhVar.n > 0 || mlhVar.t(mlhVar.t + 1) != 1) {
            sf3.a("Check failed");
        }
        int i = mlhVar.t;
        int i2 = mlhVar.i;
        int i3 = mlhVar.j;
        mlhVar.a(1);
        mlhVar.Q();
        mlhVar.d();
        mlh n = a.n();
        try {
            List C = wba.C(n, 2, mlhVar, false, true, true);
            n.e(true);
            mlhVar.j();
            mlhVar.i();
            mlhVar.t = i;
            mlhVar.i = i2;
            mlhVar.j = i3;
            yaa.l(mlhVar, C, twcVar2.c);
        } catch (Throwable th) {
            n.e(false);
            throw th;
        }
    }
}
