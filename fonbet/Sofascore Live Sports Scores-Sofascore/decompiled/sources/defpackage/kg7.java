package defpackage;

import com.sofascore.model.fantasy.FantasyEditTeamNameBody;
import com.sofascore.model.fantasy.FantasyLeagueKickUserBody;
import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kg7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wi7 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg7(wi7 wi7Var, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wi7Var;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new kg7(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new kg7(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new kg7(this.t, this.v, this.u, rq3Var, 2);
            case 3:
                return new kg7(this.t, this.v, this.u, rq3Var, 3);
            case 4:
                return new kg7(this.t, this.v, this.u, rq3Var, 4);
            case 5:
                return new kg7(this.t, this.v, this.u, rq3Var, 5);
            case 6:
                return new kg7(this.t, this.v, this.u, rq3Var, 6);
            case 7:
                return new kg7(this.t, this.v, this.u, rq3Var, 7);
            case 8:
                return new kg7(this.t, this.v, this.u, rq3Var, 8);
            case 9:
                return new kg7(this.t, this.v, this.u, rq3Var, 9);
            case 10:
                return new kg7(this.t, this.v, this.u, rq3Var, 10);
            case 11:
                return new kg7(this.t, this.v, this.u, rq3Var, 11);
            case 12:
                return new kg7(this.t, this.u, this.v, rq3Var, 12);
            default:
                return new kg7(this.t, this.v, this.u, rq3Var, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((kg7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        String str = this.v;
        wi7 wi7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                FantasyAPI fantasyAPI = wi7Var.a;
                FantasyEditTeamNameBody fantasyEditTeamNameBody = new FantasyEditTeamNameBody(str);
                this.s = 1;
                Object editTeamName = fantasyAPI.editTeamName(i2, fantasyEditTeamNameBody, this);
                return editTeamName == lu3Var ? lu3Var : editTeamName;
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
                FantasyAPI fantasyAPI2 = wi7Var.a;
                this.s = 1;
                Object fantasyCompetitionAgeGroups = fantasyAPI2.getFantasyCompetitionAgeGroups(i2, str, this);
                return fantasyCompetitionAgeGroups == lu3Var2 ? lu3Var2 : fantasyCompetitionAgeGroups;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                FantasyAPI fantasyAPI3 = wi7Var.a;
                this.s = 1;
                Object userCompetition = fantasyAPI3.getUserCompetition(str, i2, this);
                return userCompetition == lu3Var3 ? lu3Var3 : userCompetition;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                FantasyAPI fantasyAPI4 = wi7Var.a;
                this.s = 1;
                Object userCompetitionRounds = fantasyAPI4.getUserCompetitionRounds(str, i2, this);
                return userCompetitionRounds == lu3Var4 ? lu3Var4 : userCompetitionRounds;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                FantasyAPI fantasyAPI5 = wi7Var.a;
                this.s = 1;
                Object userCompetitionTransfers = fantasyAPI5.getUserCompetitionTransfers(str, i2, this);
                return userCompetitionTransfers == lu3Var5 ? lu3Var5 : userCompetitionTransfers;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                FantasyAPI fantasyAPI6 = wi7Var.a;
                this.s = 1;
                Object userLeagueLeaderboards = fantasyAPI6.getUserLeagueLeaderboards(str, i2, this);
                return userLeagueLeaderboards == lu3Var6 ? lu3Var6 : userLeagueLeaderboards;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI7 = wi7Var.a;
                this.s = 1;
                Object userLeagues = fantasyAPI7.getUserLeagues(str, i2, this);
                return userLeagues == lu3Var7 ? lu3Var7 : userLeagues;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI8 = wi7Var.a;
                this.s = 1;
                Object userRound = fantasyAPI8.getUserRound(str, i2, this);
                return userRound == lu3Var8 ? lu3Var8 : userRound;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI9 = wi7Var.a;
                this.s = 1;
                Object userRoundRankings = fantasyAPI9.getUserRoundRankings(str, i2, this);
                return userRoundRankings == lu3Var9 ? lu3Var9 : userRoundRankings;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI10 = wi7Var.a;
                this.s = 1;
                Object userRoundSquad = fantasyAPI10.getUserRoundSquad(str, i2, this);
                return userRoundSquad == lu3Var10 ? lu3Var10 : userRoundSquad;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI11 = wi7Var.a;
                this.s = 1;
                Object hasUserRound = fantasyAPI11.hasUserRound(str, i2, this);
                return hasUserRound == lu3Var11 ? lu3Var11 : hasUserRound;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI12 = wi7Var.a;
                this.s = 1;
                Object hasUserRoundRankings = fantasyAPI12.hasUserRoundRankings(str, i2, this);
                return hasUserRoundRankings == lu3Var12 ? lu3Var12 : hasUserRoundRankings;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI13 = wi7Var.a;
                FantasyLeagueKickUserBody fantasyLeagueKickUserBody = new FantasyLeagueKickUserBody(str);
                this.s = 1;
                Object kickUserFromLeague = fantasyAPI13.kickUserFromLeague(i2, fantasyLeagueKickUserBody, this);
                return kickUserFromLeague == lu3Var13 ? lu3Var13 : kickUserFromLeague;
            default:
                lu3 lu3Var14 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI14 = wi7Var.a;
                this.s = 1;
                Object userHasSquadForRound = fantasyAPI14.userHasSquadForRound(str, i2, this);
                return userHasSquadForRound == lu3Var14 ? lu3Var14 : userHasSquadForRound;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg7(wi7 wi7Var, String str, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wi7Var;
        this.v = str;
        this.u = i;
    }
}
