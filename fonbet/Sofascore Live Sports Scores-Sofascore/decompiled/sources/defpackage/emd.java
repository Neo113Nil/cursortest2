package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class emd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emd(int i, rq3 rq3Var, umd umdVar, String str) {
        super(2, rq3Var);
        this.r = 3;
        this.t = umdVar;
        this.v = str;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new emd(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new emd(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new emd(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new emd(this.u, rq3Var, this.t, this.v);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((emd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i != 0) {
                    if (i == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dmd dmdVar = new dmd(this.t, this.u, this.v, (rq3) null, 0);
                this.s = 1;
                Object P = yaa.P(dmdVar, this);
                return P == lu3Var ? lu3Var : P;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                dmd dmdVar2 = new dmd(this.t, this.u, this.v, (rq3) null, 1);
                this.s = 1;
                Object P2 = yaa.P(dmdVar2, this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dmd dmdVar3 = new dmd(this.t, this.u, this.v, (rq3) null, 3);
                this.s = 1;
                Object P3 = yaa.P(dmdVar3, this);
                return P3 == lu3Var3 ? lu3Var3 : P3;
            default:
                lu3 lu3Var4 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    dmd dmdVar4 = new dmd(this.t, this.v, this.u, (rq3) null, 4);
                    this.s = 1;
                    obj = yaa.P(dmdVar4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emd(umd umdVar, int i, String str, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.u = i;
        this.v = str;
    }
}
