package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b0b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0b(w3b w3bVar, int i, int i2, String str, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = w3bVar;
        this.u = i;
        this.v = i2;
        this.w = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new b0b(this.t, this.u, this.w, this.v, rq3Var, 0);
            case 1:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 1);
            case 2:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 2);
            case 3:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 3);
            case 4:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 4);
            case 5:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 5);
            case 6:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 6);
            case 7:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 7);
            case 8:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 8);
            case 9:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 9);
            case 10:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 10);
            case 11:
                return new b0b(this.t, this.u, this.v, this.w, rq3Var, 11);
            default:
                return new b0b(this.t, this.u, this.w, this.v, rq3Var, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((b0b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        String str = this.w;
        int i3 = this.u;
        w3b w3bVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentDraftPicks = networkCoroutineAPI.uniqueTournamentDraftPicks(i3, str, i2, this);
                return uniqueTournamentDraftPicks == lu3Var ? lu3Var : uniqueTournamentDraftPicks;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                this.s = 1;
                Object standings = networkCoroutineAPI2.standings(i3, i2, str, this);
                return standings == lu3Var2 ? lu3Var2 : standings;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
                this.s = 1;
                Object standingsForm = networkCoroutineAPI3.standingsForm(i3, i2, str, this);
                return standingsForm == lu3Var3 ? lu3Var3 : standingsForm;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = w3bVar.b;
                this.s = 1;
                Object uniqueStandings = networkCoroutineAPI4.uniqueStandings(i3, i2, str, this);
                return uniqueStandings == lu3Var4 ? lu3Var4 : uniqueStandings;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = w3bVar.b;
                this.s = 1;
                Object uniqueStandingsForm = networkCoroutineAPI5.uniqueStandingsForm(i3, i2, str, this);
                return uniqueStandingsForm == lu3Var5 ? lu3Var5 : uniqueStandingsForm;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = w3bVar.b;
                this.s = 1;
                Object hasLeagueTopPlayers = networkCoroutineAPI6.hasLeagueTopPlayers(i3, i2, str, this);
                return hasLeagueTopPlayers == lu3Var6 ? lu3Var6 : hasLeagueTopPlayers;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = w3bVar.b;
                this.s = 1;
                Object hasLeagueTopStats = networkCoroutineAPI7.hasLeagueTopStats(i3, i2, str, this);
                return hasLeagueTopStats == lu3Var7 ? lu3Var7 : hasLeagueTopStats;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI8 = w3bVar.b;
                this.s = 1;
                Object hasLeagueTopTeams = networkCoroutineAPI8.hasLeagueTopTeams(i3, i2, str, this);
                return hasLeagueTopTeams == lu3Var8 ? lu3Var8 : hasLeagueTopTeams;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = w3bVar.b;
                this.s = 1;
                Object hasStandings = networkCoroutineAPI9.hasStandings(i3, i2, str, this);
                return hasStandings == lu3Var9 ? lu3Var9 : hasStandings;
            case 9:
                lu3 lu3Var10 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI10 = w3bVar.b;
                this.s = 1;
                Object hasTournamentSeasonEvents = networkCoroutineAPI10.hasTournamentSeasonEvents(this.u, this.v, this.w, 0, this);
                return hasTournamentSeasonEvents == lu3Var10 ? lu3Var10 : hasTournamentSeasonEvents;
            case 10:
                lu3 lu3Var11 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI11 = w3bVar.b;
                this.s = 1;
                Object hasUniqueStandings = networkCoroutineAPI11.hasUniqueStandings(i3, i2, str, this);
                return hasUniqueStandings == lu3Var11 ? lu3Var11 : hasUniqueStandings;
            case 11:
                lu3 lu3Var12 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI12 = w3bVar.b;
                this.s = 1;
                Object leagueTopTeams = networkCoroutineAPI12.leagueTopTeams(i3, i2, str, this);
                return leagueTopTeams == lu3Var12 ? lu3Var12 : leagueTopTeams;
            default:
                lu3 lu3Var13 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI13 = w3bVar.b;
                this.s = 1;
                Object obj2 = networkCoroutineAPI13.tournamentEvents(i3, str, i2, this);
                return obj2 == lu3Var13 ? lu3Var13 : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0b(w3b w3bVar, int i, String str, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = w3bVar;
        this.u = i;
        this.w = str;
        this.v = i2;
    }
}
