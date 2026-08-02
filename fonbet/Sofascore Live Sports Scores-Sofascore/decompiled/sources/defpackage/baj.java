package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class baj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ lcj t;
    public final /* synthetic */ qze u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baj(qze qzeVar, lcj lcjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.u = qzeVar;
        this.t = lcjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qze qzeVar = this.u;
        lcj lcjVar = this.t;
        switch (i) {
            case 0:
                return new baj(lcjVar, qzeVar, rq3Var, 0);
            case 1:
                return new baj(lcjVar, qzeVar, rq3Var, 1);
            case 2:
                return new baj(lcjVar, qzeVar, rq3Var, 2);
            case 3:
                return new baj(qzeVar, lcjVar, rq3Var);
            default:
                return new baj(lcjVar, qzeVar, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((baj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qze qzeVar = this.u;
        lcj lcjVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.i(qzeVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.i(qzeVar, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.e(qzeVar, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    qo1 qo1Var = new qo1(lcjVar, 1);
                    this.s = 1;
                    if (rti.d(qzeVar, null, qo1Var, this, 7) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.i(qzeVar, this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
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
    public /* synthetic */ baj(lcj lcjVar, qze qzeVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = lcjVar;
        this.u = qzeVar;
    }
}
