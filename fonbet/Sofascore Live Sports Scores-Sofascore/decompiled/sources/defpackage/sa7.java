package defpackage;

import com.sofascore.model.fantasy.FantasyCompetition;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sa7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ta7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa7(ta7 ta7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ta7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ta7 ta7Var = this.t;
        switch (i) {
            case 0:
                return new sa7(ta7Var, rq3Var, 0);
            default:
                return new sa7(ta7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((sa7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ta7 ta7Var = this.t;
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
                wi7 wi7Var = ta7Var.e;
                int i3 = ta7Var.f;
                String str = ta7Var.g;
                this.s = 1;
                wi7Var.getClass();
                Object P = yaa.P(new kg7(wi7Var, i3, str, (rq3) null, 1), this);
                return P == lu3Var ? lu3Var : P;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = ta7Var.e;
                    int i5 = ta7Var.f;
                    this.s = 1;
                    obj = wi7Var2.e(i5, this);
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
                FantasyCompetition fantasyCompetition = (FantasyCompetition) obj;
                if (fantasyCompetition != null) {
                    return fkf.N(fantasyCompetition, ta7Var.i());
                }
                return null;
        }
    }
}
