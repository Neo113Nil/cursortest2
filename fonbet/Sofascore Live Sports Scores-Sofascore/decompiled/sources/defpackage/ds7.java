package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ds7 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ is7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds7(int i, rq3 rq3Var, is7 is7Var) {
        super(3, rq3Var);
        this.r = i;
        this.v = is7Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        is7 is7Var = this.v;
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                ds7 ds7Var = new ds7(0, rq3Var, is7Var);
                ds7Var.t = b98Var;
                ds7Var.u = obj2;
                return ds7Var.invokeSuspend(Unit.a);
            default:
                ds7 ds7Var2 = new ds7(1, rq3Var, is7Var);
                ds7Var2.t = b98Var;
                ds7Var2.u = obj2;
                return ds7Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 0;
        is7 is7Var = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                b98 b98Var = this.t;
                Object obj2 = this.u;
                Object obj3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    o63 c = is7Var.i.c((String) obj2);
                    fdi fdiVar = is7Var.o;
                    br3 br3Var = new br3(3, rq3Var, 6);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    kik.n(b98Var);
                    Object v = un0.v(this, b98Var, new c37(br3Var, rq3Var, 5), o67.m, new z88[]{c, fdiVar});
                    if (v != lu3.a) {
                        v = Unit.a;
                    }
                    if (v != lu3.a) {
                        v = Unit.a;
                    }
                    if (v == obj3) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                b98 b98Var2 = this.t;
                Object obj4 = this.u;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ((Boolean) obj4).getClass();
                    zn2 a = la8.a(is7Var.n, new ds7(i2, rq3Var, is7Var));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var2, a, this) == lu3Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
