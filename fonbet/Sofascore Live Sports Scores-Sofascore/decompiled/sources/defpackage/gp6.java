package defpackage;

import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gp6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ hp6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp6(hp6 hp6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = hp6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        hp6 hp6Var = this.t;
        switch (i) {
            case 0:
                return new gp6(hp6Var, rq3Var, 0);
            case 1:
                return new gp6(hp6Var, rq3Var, 1);
            default:
                return new gp6(hp6Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((gp6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        FantasyUserCompetition userCompetition;
        int i = this.r;
        hp6 hp6Var = this.t;
        do7 do7Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    g62 g62Var = hp6Var.p;
                    this.s = 1;
                    if (g62Var.q(this, ep6.a) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    do7 do7Var2 = hp6Var.f;
                    Integer valueOf = do7Var2 != null ? Integer.valueOf(do7Var2.c.c) : hp6Var.g;
                    if (valueOf == null) {
                        break;
                    } else {
                        int intValue = valueOf.intValue();
                        wi7 wi7Var = hp6Var.e;
                        ia0 ia0Var = ia0.q;
                        String e = fc6.e();
                        this.s = 1;
                        obj = wi7Var.N(intValue, e, this);
                        if (obj == lu3Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyUserCompetitionResponse fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) obj;
                if (fantasyUserCompetitionResponse != null && (userCompetition = fantasyUserCompetitionResponse.getUserCompetition()) != null) {
                    do7Var = fkf.O(userCompetition, hp6Var.i());
                }
                fdi fdiVar = hp6Var.h;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, do7Var));
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    aeh aehVar = hp6Var.n;
                    this.s = 1;
                    if (aehVar.emit(dp6.a, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
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
