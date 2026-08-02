package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m63 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m63(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (this.r) {
            case 0:
                m63 m63Var = new m63(3, rq3Var, 0);
                m63Var.t = b98Var;
                m63Var.u = obj2;
                return m63Var.invokeSuspend(Unit.a);
            case 1:
                m63 m63Var2 = new m63(3, rq3Var, 1);
                m63Var2.t = b98Var;
                m63Var2.u = obj2;
                return m63Var2.invokeSuspend(Unit.a);
            default:
                m63 m63Var3 = new m63(3, rq3Var, 2);
                m63Var3.t = b98Var;
                m63Var3.u = obj2;
                return m63Var3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                b98 b98Var = this.t;
                Object obj2 = this.u;
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    z88 z88Var = ((g5e) obj2).a;
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var, z88Var, this) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                b98 b98Var2 = this.t;
                Object obj3 = this.u;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    z88 z88Var2 = ((g5e) obj3).a;
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    kik.n(b98Var2);
                    Object collect = z88Var2.collect(new vj0(b98Var2, 14), this);
                    if (collect != lu3Var2) {
                        collect = Unit.a;
                    }
                    if (collect != lu3Var2) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var2) {
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
                b98 b98Var3 = this.t;
                Object obj4 = this.u;
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    z88 z88Var3 = ((g5e) obj4).a;
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var3, z88Var3, this) == lu3Var3) {
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
