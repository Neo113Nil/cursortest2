package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j98 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ z88 u;
    public final /* synthetic */ ct8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j98(z88 z88Var, ct8 ct8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = z88Var;
        this.v = ct8Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ct8 ct8Var = this.v;
        z88 z88Var = this.u;
        switch (i) {
            case 0:
                j98 j98Var = new j98(z88Var, ct8Var, rq3Var, 0);
                j98Var.t = obj;
                return j98Var;
            default:
                j98 j98Var2 = new j98(z88Var, ct8Var, rq3Var, 1);
                j98Var2.t = obj;
                return j98Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((j98) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j98) create((nhh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ct8 ct8Var = this.v;
        z88 z88Var = this.u;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    b98 b98Var = (b98) this.t;
                    fsf fsfVar = new fsf();
                    fsfVar.a = k53.i;
                    m70 m70Var = new m70(4, fsfVar, ct8Var, b98Var);
                    this.s = 1;
                    if (z88Var.collect(m70Var, this) == lu3Var) {
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
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    zi7 zi7Var = new zi7(ct8Var, new f10((nhh) this.t), rq3Var, 9);
                    this.s = 1;
                    if (fcp.c0(z88Var, zi7Var, this) == lu3Var2) {
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
