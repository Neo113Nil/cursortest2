package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sz4 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz4(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        switch (this.r) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                sz4 sz4Var = new sz4(3, (rq3) obj3, 0);
                sz4Var.t = booleanValue;
                return sz4Var.invokeSuspend(Unit.a);
            default:
                boolean booleanValue2 = bool.booleanValue();
                sz4 sz4Var2 = new sz4(3, (rq3) obj3, 1);
                sz4Var2.t = booleanValue2;
                return sz4Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                boolean z = this.t;
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    bfk g = ok3.p().g();
                    Boolean valueOf = Boolean.valueOf(z);
                    this.t = z;
                    this.s = 1;
                    if (bfk.e(g, null, null, null, valueOf, null, null, null, null, null, this, 8175) == lu3Var) {
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
                boolean z2 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var2 = ia0.q;
                    bfk g2 = ok3.p().g();
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    this.t = z2;
                    this.s = 1;
                    if (bfk.e(g2, null, null, null, null, null, null, valueOf2, null, null, this, 8063) == lu3Var2) {
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
}
