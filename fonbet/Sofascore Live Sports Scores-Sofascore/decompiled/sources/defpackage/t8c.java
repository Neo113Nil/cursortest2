package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t8c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ w31 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8c(u8c u8cVar, w31 w31Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = u8cVar;
        this.u = w31Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        w31 w31Var = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                return new t8c(u8cVar, w31Var, rq3Var, 0);
            default:
                return new t8c(u8cVar, w31Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((t8c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        w31 w31Var = this.u;
        u8c u8cVar = this.t;
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
                m7c m7cVar = u8cVar.b;
                int g = w31Var.getG();
                this.s = 1;
                m7cVar.getClass();
                Object P = yaa.P(new i7c(m7cVar, g, null, 3), this);
                return P == lu3Var ? lu3Var : P;
            default:
                lu3 lu3Var2 = lu3.a;
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
                m7c m7cVar2 = u8cVar.b;
                int g2 = w31Var.getG();
                this.s = 1;
                m7cVar2.getClass();
                Object P2 = yaa.P(new i7c(m7cVar2, g2, null, 2), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
        }
    }
}
