package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vjl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qkl t;
    public final /* synthetic */ Integer u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vjl(qkl qklVar, Integer num, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qklVar;
        this.u = num;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Integer num = this.u;
        qkl qklVar = this.t;
        switch (i) {
            case 0:
                return new vjl(qklVar, num, rq3Var, 0);
            default:
                return new vjl(qklVar, num, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vjl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int i = this.r;
        Integer num = this.u;
        qkl qklVar = this.t;
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
                intValue = num != null ? num.intValue() : 0;
                this.s = 1;
                Object r = s9a.r(new jr5(qklVar, intValue, (rq3) null, 15), this);
                return r == lu3Var ? lu3Var : r;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = qklVar.o;
                    intValue = num != null ? num.intValue() : 0;
                    this.s = 1;
                    obj = j0jVar.k(intValue, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
        }
    }
}
