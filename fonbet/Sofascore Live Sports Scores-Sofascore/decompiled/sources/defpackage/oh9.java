package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oh9 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public /* synthetic */ Throwable u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh9(int i, List list, rq3 rq3Var) {
        super(3, rq3Var);
        this.r = i;
        this.v = list;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xj9 xj9Var = (xj9) obj;
        Throwable th = (Throwable) obj2;
        rq3 rq3Var = (rq3) obj3;
        switch (this.r) {
            case 0:
                oh9 oh9Var = new oh9(0, this.v, rq3Var);
                oh9Var.t = xj9Var;
                oh9Var.u = th;
                return oh9Var.invokeSuspend(Unit.a);
            default:
                oh9 oh9Var2 = new oh9(1, this.v, rq3Var);
                oh9Var2.t = xj9Var;
                oh9Var2.u = th;
                return oh9Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        List list = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.t;
                    y6a.M(obj);
                    return th;
                }
                y6a.M(obj);
                xj9 xj9Var = (xj9) this.t;
                Throwable Q = xw3.Q(this.u);
                this.t = Q;
                this.s = 1;
                return sh9.a(list, Q, xj9Var, this) == lu3Var ? lu3Var : Q;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = (Throwable) this.t;
                    y6a.M(obj);
                    return th2;
                }
                y6a.M(obj);
                xj9 xj9Var2 = (xj9) this.t;
                Throwable Q2 = xw3.Q(this.u);
                this.t = Q2;
                this.s = 1;
                return sh9.a(list, Q2, xj9Var2, this) == lu3Var2 ? lu3Var2 : Q2;
        }
    }
}
