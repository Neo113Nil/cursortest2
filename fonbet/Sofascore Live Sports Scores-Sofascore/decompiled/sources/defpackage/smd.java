package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class smd extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ umd u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smd(umd umdVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = umdVar;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new smd(this.u, this.t, rq3Var);
            default:
                smd smdVar = new smd(this.u, rq3Var);
                smdVar.t = ((Number) obj).intValue();
                return smdVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((smd) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((smd) create(Integer.valueOf(((Number) obj).intValue()), (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        umd umdVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    lmd lmdVar = new lmd(umdVar, this.t, null, 1);
                    this.s = 1;
                    obj = yaa.P(lmdVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            default:
                int i3 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.t = i3;
                    this.s = 1;
                    umdVar.getClass();
                    obj = s9a.r(new smd(umdVar, i3, null), this);
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
                if (((Boolean) obj).booleanValue()) {
                    return obj;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smd(umd umdVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = umdVar;
    }
}
