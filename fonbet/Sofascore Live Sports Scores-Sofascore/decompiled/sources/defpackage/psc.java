package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class psc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qsc t;
    public final /* synthetic */ nx0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psc(qsc qscVar, nx0 nx0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qscVar;
        this.u = nx0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        nx0 nx0Var = this.u;
        qsc qscVar = this.t;
        switch (i) {
            case 0:
                return new psc(qscVar, nx0Var, rq3Var, 0);
            default:
                return new psc(qscVar, nx0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((psc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        nx0 nx0Var = this.u;
        qsc qscVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    q50 q50Var = qscVar.e;
                    Float f = new Float(wx0.a.c(nx0Var.c));
                    this.s = 1;
                    if (q50Var.f(this, f) == lu3Var) {
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
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    q50 q50Var2 = qscVar.e;
                    Float f2 = new Float(wx0.a.c(nx0Var.c));
                    this.s = 1;
                    if (q50Var2.f(this, f2) == lu3Var2) {
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
}
