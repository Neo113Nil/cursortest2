package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ire extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ jre t;
    public final /* synthetic */ tn6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ire(jre jreVar, tn6 tn6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = jreVar;
        this.u = tn6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tn6 tn6Var = this.u;
        jre jreVar = this.t;
        switch (i) {
            case 0:
                return new ire(jreVar, tn6Var, rq3Var, 0);
            case 1:
                return new ire(jreVar, tn6Var, rq3Var, 1);
            case 2:
                return new ire(jreVar, tn6Var, rq3Var, 2);
            default:
                return new ire(jreVar, tn6Var, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ire) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        tn6 tn6Var = this.u;
        jre jreVar = this.t;
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
                wi7 wi7Var = jreVar.e;
                int i3 = tn6Var.a;
                this.s = 1;
                Object e = wi7Var.e(i3, this);
                return e == lu3Var ? lu3Var : e;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = jreVar.e;
                int i5 = tn6Var.c;
                this.s = 1;
                Object B = wi7Var2.B(i5, this);
                return B == lu3Var2 ? lu3Var2 : B;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var3 = jreVar.e;
                int i7 = tn6Var.c;
                this.s = 1;
                Object E = wi7Var3.E(i7, this);
                return E == lu3Var3 ? lu3Var3 : E;
            default:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var4 = jreVar.e;
                int i9 = tn6Var.c;
                this.s = 1;
                Object F = wi7Var4.F(i9, this);
                return F == lu3Var4 ? lu3Var4 : F;
        }
    }
}
