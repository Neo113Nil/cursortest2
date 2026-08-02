package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jcj extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ lcj t;
    public final /* synthetic */ qze u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcj(qze qzeVar, lcj lcjVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = qzeVar;
        this.t = lcjVar;
        this.v = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        boolean z = this.v;
        qze qzeVar = this.u;
        lcj lcjVar = this.t;
        switch (i) {
            case 0:
                return new jcj(qzeVar, lcjVar, z, rq3Var);
            default:
                return new jcj(lcjVar, qzeVar, z, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jcj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        boolean z = this.v;
        qze qzeVar = this.u;
        lcj lcjVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    fjg fjgVar = new fjg(lcjVar, z);
                    mo1 mo1Var = new mo1(lcjVar, 6);
                    this.s = 1;
                    Object s = oyn.s(qzeVar, new qp1(fjgVar, mo1Var, rq3Var, 2), this);
                    if (s != obj2) {
                        s = Unit.a;
                    }
                    if (s == obj2) {
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
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.g(qzeVar, z, this) == lu3Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcj(lcj lcjVar, qze qzeVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = lcjVar;
        this.u = qzeVar;
        this.v = z;
    }
}
