package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o11 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u6b t;
    public final /* synthetic */ e6b u;
    public final /* synthetic */ b1d v;
    public final /* synthetic */ u11 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o11(u6b u6bVar, e6b e6bVar, b1d b1dVar, rq3 rq3Var, u11 u11Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = u6bVar;
        this.u = e6bVar;
        this.v = b1dVar;
        this.w = u11Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new o11(this.t, this.u, this.v, rq3Var, this.w, 0);
            case 1:
                return new o11(this.t, this.u, this.v, rq3Var, this.w, 1);
            default:
                return new o11(this.t, this.u, this.v, rq3Var, this.w, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o11) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        u11 u11Var = this.w;
        b1d b1dVar = this.v;
        e6b e6bVar = this.u;
        u6b u6bVar = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    n11 n11Var = new n11(b1dVar, rq3Var, u11Var, 0);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, n11Var, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    n11 n11Var2 = new n11(b1dVar, rq3Var, u11Var, i2);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, n11Var2, this) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    n11 n11Var3 = new n11(b1dVar, rq3Var, u11Var, 2);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, n11Var3, this) == lu3Var3) {
                        break;
                    }
                } else if (i5 != 1) {
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
