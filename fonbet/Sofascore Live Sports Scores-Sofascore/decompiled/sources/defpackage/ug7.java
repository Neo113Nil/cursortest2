package defpackage;

import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ug7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wi7 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug7(wi7 wi7Var, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = wi7Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        wi7 wi7Var = this.t;
        switch (i) {
            case 0:
                return new ug7(wi7Var, str, rq3Var, 0);
            case 1:
                return new ug7(wi7Var, str, rq3Var, 1);
            case 2:
                return new ug7(wi7Var, str, rq3Var, 2);
            case 3:
                return new ug7(wi7Var, str, rq3Var, 3);
            case 4:
                return new ug7(wi7Var, str, rq3Var, 4);
            case 5:
                return new ug7(wi7Var, str, rq3Var, 5);
            default:
                return new ug7(wi7Var, str, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ug7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        wi7 wi7Var = this.t;
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
                FantasyAPI fantasyAPI = wi7Var.a;
                this.s = 1;
                Object fantasyNewsArticles = fantasyAPI.getFantasyNewsArticles(str, this);
                return fantasyNewsArticles == lu3Var ? lu3Var : fantasyNewsArticles;
            case 1:
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
                FantasyAPI fantasyAPI2 = wi7Var.a;
                this.s = 1;
                Object hasUserFinishedCompetitions = fantasyAPI2.getHasUserFinishedCompetitions(str, this);
                return hasUserFinishedCompetitions == lu3Var2 ? lu3Var2 : hasUserFinishedCompetitions;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                FantasyAPI fantasyAPI3 = wi7Var.a;
                this.s = 1;
                Object uniqueTournamentCompetitionMapping = fantasyAPI3.getUniqueTournamentCompetitionMapping(str, this);
                return uniqueTournamentCompetitionMapping == lu3Var3 ? lu3Var3 : uniqueTournamentCompetitionMapping;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI4 = wi7Var.a;
                this.s = 1;
                Object userCompetitions = fantasyAPI4.getUserCompetitions(str, this);
                return userCompetitions == lu3Var4 ? lu3Var4 : userCompetitions;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                FantasyAPI fantasyAPI5 = wi7Var.a;
                this.s = 1;
                Object userCompetitions2 = fantasyAPI5.getUserCompetitions(str, this);
                return userCompetitions2 == lu3Var5 ? lu3Var5 : userCompetitions2;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI6 = wi7Var.a;
                this.s = 1;
                Object userFinishedCompetitions = fantasyAPI6.getUserFinishedCompetitions(str, this);
                return userFinishedCompetitions == lu3Var6 ? lu3Var6 : userFinishedCompetitions;
            default:
                lu3 lu3Var7 = lu3.a;
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
                FantasyAPI fantasyAPI7 = wi7Var.a;
                this.s = 1;
                Object joinLeague = fantasyAPI7.joinLeague(str, this);
                return joinLeague == lu3Var7 ? lu3Var7 : joinLeague;
        }
    }
}
