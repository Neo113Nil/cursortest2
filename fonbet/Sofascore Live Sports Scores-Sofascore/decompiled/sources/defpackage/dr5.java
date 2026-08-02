package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dr5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ mr5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr5(mr5 mr5Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mr5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        mr5 mr5Var = this.t;
        switch (i) {
            case 0:
                return new dr5(mr5Var, rq3Var, 0);
            default:
                return new dr5(mr5Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((dr5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            default:
                ((dr5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long R;
        int i = this.r;
        mr5 mr5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var = mr5Var.f;
                int i3 = mr5Var.p;
                this.s = 1;
                s96Var.getClass();
                Object P = yaa.P(new a86(s96Var, i3, null, 1), this);
                return P == lu3Var ? lu3Var : P;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0 && i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                do {
                    mr5Var.Q.j(new Long(System.currentTimeMillis()));
                    wd5 wd5Var = xd5.b;
                    R = wkn.R(1, be5.SECONDS);
                    this.s = 1;
                } while (n4o.z(R, this) != lu3Var2);
                return lu3Var2;
        }
    }
}
