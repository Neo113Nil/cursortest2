package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wn2 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ zn2 u;
    public final /* synthetic */ b98 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(zn2 zn2Var, b98 b98Var, Object obj, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = zn2Var;
        this.v = b98Var;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        b98 b98Var = this.v;
        zn2 zn2Var = this.u;
        switch (i) {
            case 0:
                return new wn2(zn2Var, b98Var, this.t, rq3Var);
            default:
                wn2 wn2Var = new wn2(zn2Var, b98Var, rq3Var);
                wn2Var.t = obj;
                return wn2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wn2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    ct8 ct8Var = this.u.e;
                    Object obj2 = this.t;
                    this.s = 1;
                    if (ct8Var.invoke(this.v, obj2, this) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    fsf g = lnb.g(obj);
                    zn2 zn2Var = this.u;
                    z88 z88Var = zn2Var.d;
                    yn2 yn2Var = new yn2(g, ku3Var, zn2Var, this.v, 0);
                    this.t = null;
                    this.s = 1;
                    if (z88Var.collect(yn2Var, this) == lu3Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(zn2 zn2Var, b98 b98Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = zn2Var;
        this.v = b98Var;
    }
}
