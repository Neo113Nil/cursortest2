package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oy5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dz5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy5(dz5 dz5Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = dz5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                return new oy5(dz5Var, rq3Var, 0);
            default:
                return new oy5(dz5Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((oy5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r10 == r4) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = dz5Var.r;
                    this.s = 1;
                    if (cg4Var.g("PREF_SHOW_BASEBALL_HOME_AWAY_BUBBLE", false, this) == lu3Var) {
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
                cg4 cg4Var2 = dz5Var.r;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = cg4Var2.b(0, "PREF_POTM_VOTING_BUBBLE_DISMISS_COUNT", this);
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                int intValue = ((Number) obj).intValue() + 1;
                this.s = 2;
                Object x = o6a.x(cg4Var2.a, new ce4(intValue, "PREF_POTM_VOTING_BUBBLE_DISMISS_COUNT", (rq3) null), this);
                if (x != lu3Var2) {
                    x = Unit.a;
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
