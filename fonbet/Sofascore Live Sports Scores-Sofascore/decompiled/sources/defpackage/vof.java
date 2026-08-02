package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vof extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ apf t;
    public final /* synthetic */ nt9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vof(apf apfVar, nt9 nt9Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = apfVar;
        this.u = nt9Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        nt9 nt9Var = this.u;
        apf apfVar = this.t;
        switch (i) {
            case 0:
                return new vof(apfVar, nt9Var, rq3Var, 0);
            default:
                return new vof(apfVar, nt9Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vof) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        nt9 nt9Var = this.u;
        apf apfVar = this.t;
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
                this.s = 1;
                int i3 = apf.f;
                Object b = apfVar.b(nt9Var, 0, this);
                return b == lu3Var ? lu3Var : b;
            default:
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
                this.s = 1;
                int i5 = apf.f;
                Object b2 = apfVar.b(nt9Var, 1, this);
                return b2 == lu3Var2 ? lu3Var2 : b2;
        }
    }
}
