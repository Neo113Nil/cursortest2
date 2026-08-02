package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc4 b;

    public /* synthetic */ nc4(oc4 oc4Var, int i) {
        this.a = i;
        this.b = oc4Var;
    }

    public final Object a(ddi ddiVar) {
        int i = this.a;
        oc4 oc4Var = this.b;
        switch (i) {
            case 0:
                mc4 mc4Var = oc4Var.a;
                return new ij(pd0.s(mc4Var.c.b), ddiVar, (umd) mc4Var.r0.get(), (amd) oc4Var.b.e.get());
            case 1:
                mc4 mc4Var2 = oc4Var.a;
                return new kk(pd0.s(mc4Var2.c.b), ddiVar, (umd) mc4Var2.r0.get(), (amd) oc4Var.b.e.get(), (SharedPreferences) mc4Var2.l.get());
            case 2:
                mc4 mc4Var3 = oc4Var.a;
                return new ov5((s96) mc4Var3.U.get(), ddiVar, pd0.s(mc4Var3.c.b));
            case 3:
                mc4 mc4Var4 = oc4Var.a;
                return new c36(pd0.s(mc4Var4.c.b), ddiVar, (s96) mc4Var4.U.get(), (j0j) mc4Var4.I.get(), (umd) mc4Var4.r0.get(), (amd) oc4Var.b.e.get());
            default:
                mc4 mc4Var5 = oc4Var.a;
                return new l66(pd0.s(mc4Var5.c.b), ddiVar, (umd) mc4Var5.r0.get(), (amd) oc4Var.b.e.get());
        }
    }
}
