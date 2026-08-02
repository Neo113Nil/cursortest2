package defpackage;

import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyRound;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fz6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ jz6 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz6(jz6 jz6Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = jz6Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        jz6 jz6Var = this.t;
        switch (i) {
            case 0:
                return new fz6(jz6Var, i2, rq3Var, 0);
            default:
                return new fz6(jz6Var, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fz6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        jz6 jz6Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = jz6Var.e;
                    this.s = 1;
                    obj = wi7Var.e(i2, this);
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
                FantasyCompetition fantasyCompetition = (FantasyCompetition) obj;
                if (fantasyCompetition != null) {
                    return fkf.N(fantasyCompetition, jz6Var.i());
                }
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = jz6Var.e;
                    this.s = 1;
                    obj = wi7Var2.g(i2, this);
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
                FantasyRound fantasyRound = (FantasyRound) obj;
                if (fantasyRound != null) {
                    return pd0.K(fantasyRound);
                }
                return null;
        }
    }
}
