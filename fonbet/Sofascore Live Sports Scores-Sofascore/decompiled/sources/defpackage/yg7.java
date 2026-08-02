package defpackage;

import com.sofascore.model.fantasy.FantasyRoundPlayerResponse;
import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yg7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wi7 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg7(wi7 wi7Var, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = wi7Var;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new yg7(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new yg7(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new yg7(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new yg7(this.t, this.u, this.v, rq3Var, 3);
            default:
                return new yg7(this.t, this.u, this.v, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((yg7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        wi7 wi7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                FantasyAPI fantasyAPI = wi7Var.a;
                this.s = 1;
                Object competitionNextFixturesFDR = fantasyAPI.getCompetitionNextFixturesFDR(i3, i2, this);
                return competitionNextFixturesFDR == lu3Var ? lu3Var : competitionNextFixturesFDR;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                FantasyAPI fantasyAPI2 = wi7Var.a;
                this.s = 1;
                Object leagueLeaderboard = fantasyAPI2.getLeagueLeaderboard(i3, i2, this);
                return leagueLeaderboard == lu3Var2 ? lu3Var2 : leagueLeaderboard;
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
                FantasyAPI fantasyAPI3 = wi7Var.a;
                this.s = 1;
                Object leagueMatchupsForRound = fantasyAPI3.getLeagueMatchupsForRound(i3, i2, this);
                return leagueMatchupsForRound == lu3Var3 ? lu3Var3 : leagueMatchupsForRound;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                FantasyAPI fantasyAPI4 = wi7Var.a;
                this.s = 1;
                Object leagueRoundSquads = fantasyAPI4.getLeagueRoundSquads(i3, i2, this);
                return leagueRoundSquads == lu3Var4 ? lu3Var4 : leagueRoundSquads;
            default:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    FantasyAPI fantasyAPI5 = wi7Var.a;
                    this.s = 1;
                    obj = fantasyAPI5.getRoundPlayer(i3, i2, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((FantasyRoundPlayerResponse) obj).getRoundPlayer();
        }
    }
}
