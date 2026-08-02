package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fu3 extends lec {
    public ox9 m;

    @Override // defpackage.lec, defpackage.keb
    public final void g() {
        super.g();
        ox9 ox9Var = this.m;
        if (ox9Var != null) {
            yda ydaVar = (yda) ox9Var.g;
            rq3 rq3Var = null;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            ox9Var.g = null;
            if (((yda) ox9Var.f) != null) {
                return;
            }
            ox9Var.f = xw3.L((ad2) ox9Var.d, null, null, new hy1(ox9Var, rq3Var, 0), 3);
        }
    }

    @Override // defpackage.lec, defpackage.keb
    public final void h() {
        super.h();
        ox9 ox9Var = this.m;
        if (ox9Var != null) {
            if (((yda) ox9Var.g) != null) {
                a70.r("Cancel call cannot happen without a maybeRun");
                return;
            }
            ad2 ad2Var = (ad2) ox9Var.d;
            hs4 hs4Var = z45.a;
            ox9Var.g = xw3.L(ad2Var, rob.a.f, null, new q3(ox9Var, null, 10), 2);
        }
    }

    public final Unit m(sq3 sq3Var) {
        eu3 eu3Var;
        int i;
        if (sq3Var instanceof eu3) {
            eu3Var = (eu3) sq3Var;
            int i2 = eu3Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eu3Var.t = i2 - Integer.MIN_VALUE;
                Object obj = eu3Var.r;
                lu3 lu3Var = lu3.a;
                i = eu3Var.t;
                if (i != 0 || i == 1) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        eu3Var = new eu3(this, sq3Var);
        Object obj2 = eu3Var.r;
        lu3 lu3Var2 = lu3.a;
        i = eu3Var.t;
        if (i != 0) {
        }
        y6a.M(obj2);
        return Unit.a;
    }
}
