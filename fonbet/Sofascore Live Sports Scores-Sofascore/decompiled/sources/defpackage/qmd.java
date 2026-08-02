package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qmd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ umd u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmd(umd umdVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = umdVar;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.v;
        umd umdVar = this.u;
        switch (i) {
            case 0:
                qmd qmdVar = new qmd(umdVar, i2, rq3Var, 0);
                qmdVar.t = ((Number) obj).intValue();
                return qmdVar;
            case 1:
                qmd qmdVar2 = new qmd(umdVar, i2, rq3Var, 1);
                qmdVar2.t = ((Number) obj).intValue();
                return qmdVar2;
            default:
                qmd qmdVar3 = new qmd(umdVar, i2, rq3Var, 2);
                qmdVar3.t = ((Number) obj).intValue();
                return qmdVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        int intValue = ((Number) obj).intValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((qmd) create(Integer.valueOf(intValue), rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    fmd fmdVar = new fmd(this.u, this.v, i2, null, 3);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(fmdVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    fmd fmdVar2 = new fmd(this.u, this.v, i2, null, 4);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(fmdVar2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    fmd fmdVar3 = new fmd(this.u, this.v, i2, null, 6);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(fmdVar3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
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
}
