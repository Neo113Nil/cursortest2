package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kkl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qkl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kkl(qkl qklVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qklVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qkl qklVar = this.t;
        switch (i) {
            case 0:
                return new kkl(qklVar, rq3Var, 0);
            default:
                return new kkl(qklVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((kkl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    kgl kglVar = this.t.x;
                    this.s = 1;
                    kglVar.g = true;
                    Object g = kglVar.b.g("WC_26_TEAM_PICKER_RETARGET_SHOWN", true, this);
                    if (g != lu3Var) {
                        g = Unit.a;
                    }
                    if (g == lu3Var) {
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
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = this.t.q;
                    this.s = 1;
                    if (cg4Var.g("WC_26_SHOW_TIMELINE_INFO", false, this) == lu3Var2) {
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
