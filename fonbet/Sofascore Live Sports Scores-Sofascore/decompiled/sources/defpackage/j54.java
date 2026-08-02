package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j54 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ q54 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j54(rq3 rq3Var, q54 q54Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = q54Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        q54 q54Var = this.v;
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                j54 j54Var = new j54(rq3Var, q54Var, 0);
                j54Var.t = b98Var;
                j54Var.u = obj2;
                return j54Var.invokeSuspend(Unit.a);
            default:
                j54 j54Var2 = new j54(rq3Var, q54Var, 1);
                j54Var2.t = b98Var;
                j54Var2.u = obj2;
                return j54Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        o63 q;
        int i = this.r;
        q54 q54Var = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                b98 b98Var = this.t;
                Object obj2 = this.u;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    fdi fdiVar = q54Var.o;
                    o63 r = booleanValue ? dy0.r(fdiVar, q54Var.v, q54Var.n, new y66(4, rq3Var, 2)) : dy0.q(fdiVar, q54Var.v, q54Var.r, new wj0(q54Var.h, 1), q54Var.n, new u44(q54Var, null));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var, r, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                b98 b98Var2 = this.t;
                Object obj3 = this.u;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    int ordinal = ((q44) obj3).ordinal();
                    if (ordinal == 0) {
                        q = dy0.q(q54Var.C, q54Var.D, q54Var.E, q54Var.r, q54Var.v, new g54(q54Var, null));
                    } else if (ordinal != 1) {
                        zzl.b();
                        break;
                    } else {
                        q = dy0.q(q54Var.t, q54Var.z, q54Var.x, q54Var.h, q54Var.u, new h54(q54Var, null));
                    }
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var2, q, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
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
