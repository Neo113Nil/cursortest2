package defpackage;

import com.sofascore.model.newNetwork.MediaVideoResponse;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerVoteBody;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zza extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zza(w3b w3bVar, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = w3bVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new zza(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new zza(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new zza(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new zza(this.t, this.u, this.v, rq3Var, 3);
            case 4:
                return new zza(this.t, this.u, this.v, rq3Var, 4);
            case 5:
                return new zza(this.t, this.u, this.v, rq3Var, 5);
            case 6:
                return new zza(this.t, this.u, this.v, rq3Var, 6);
            case 7:
                return new zza(this.t, this.u, this.v, rq3Var, 7);
            case 8:
                return new zza(this.t, this.u, this.v, rq3Var, 8);
            case 9:
                return new zza(this.t, this.u, this.v, rq3Var, 9);
            case 10:
                return new zza(this.t, this.u, this.v, rq3Var, 10);
            case 11:
                return new zza(this.t, this.u, this.v, rq3Var, 11);
            case 12:
                return new zza(this.t, this.u, this.v, rq3Var, 12);
            case 13:
                return new zza(this.t, this.u, this.v, rq3Var, 13);
            case 14:
                return new zza(this.t, this.u, this.v, rq3Var, 14);
            case 15:
                return new zza(this.t, this.u, this.v, rq3Var, 15);
            case 16:
                return new zza(this.t, this.u, this.v, rq3Var, 16);
            case 17:
                return new zza(this.t, this.u, this.v, rq3Var, 17);
            case 18:
                return new zza(this.t, this.u, this.v, rq3Var, 18);
            case 19:
                return new zza(this.t, this.u, this.v, rq3Var, 19);
            case 20:
                return new zza(this.t, this.u, this.v, rq3Var, 20);
            case 21:
                return new zza(this.t, this.u, this.v, rq3Var, 21);
            case 22:
                return new zza(this.t, this.u, this.v, rq3Var, 22);
            case 23:
                return new zza(this.t, this.u, this.v, rq3Var, 23);
            case 24:
                return new zza(this.t, this.u, this.v, rq3Var, 24);
            case 25:
                return new zza(this.t, this.u, this.v, rq3Var, 25);
            case 26:
                return new zza(this.t, this.u, this.v, rq3Var, 26);
            case 27:
                return new zza(this.t, this.u, this.v, rq3Var, 27);
            case 28:
                return new zza(this.t, this.u, this.v, rq3Var, 28);
            default:
                return new zza(this.t, this.u, this.v, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((zza) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
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
                Object uniqueTournamentDraftInfo = networkCoroutineAPI.uniqueTournamentDraftInfo(i3, i2, this);
                return uniqueTournamentDraftInfo == lu3Var ? lu3Var : uniqueTournamentDraftInfo;
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
                Object uniqueTournamentSeasonInfo = networkCoroutineAPI2.uniqueTournamentSeasonInfo(i3, i2, this);
                return uniqueTournamentSeasonInfo == lu3Var2 ? lu3Var2 : uniqueTournamentSeasonInfo;
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
                Object uniqueTournamentMatchdayTopPerformers = networkCoroutineAPI3.uniqueTournamentMatchdayTopPerformers(i3, i2, this);
                return uniqueTournamentMatchdayTopPerformers == lu3Var3 ? lu3Var3 : uniqueTournamentMatchdayTopPerformers;
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
                Object hasUniqueTournamentTeamOfThePeriodAwarded = networkCoroutineAPI4.hasUniqueTournamentTeamOfThePeriodAwarded(i3, i2, this);
                return hasUniqueTournamentTeamOfThePeriodAwarded == lu3Var4 ? lu3Var4 : hasUniqueTournamentTeamOfThePeriodAwarded;
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
                Object hasUniqueTournamentChampions = networkCoroutineAPI5.hasUniqueTournamentChampions(i3, i2, this);
                return hasUniqueTournamentChampions == lu3Var5 ? lu3Var5 : hasUniqueTournamentChampions;
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
                Object hasUniqueTournamentIndividualAwards = networkCoroutineAPI6.hasUniqueTournamentIndividualAwards(i3, i2, this);
                return hasUniqueTournamentIndividualAwards == lu3Var6 ? lu3Var6 : hasUniqueTournamentIndividualAwards;
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
                Object hasUniqueTournamentDraftInfo = networkCoroutineAPI7.hasUniqueTournamentDraftInfo(i3, i2, this);
                return hasUniqueTournamentDraftInfo == lu3Var7 ? lu3Var7 : hasUniqueTournamentDraftInfo;
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
                Object hasPowerRankingRounds = networkCoroutineAPI8.hasPowerRankingRounds(i3, i2, this);
                return hasPowerRankingRounds == lu3Var8 ? lu3Var8 : hasPowerRankingRounds;
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
                Object hasTournamentPlayerStatisticsTypes = networkCoroutineAPI9.hasTournamentPlayerStatisticsTypes(i3, i2, this);
                return hasTournamentPlayerStatisticsTypes == lu3Var9 ? lu3Var9 : hasTournamentPlayerStatisticsTypes;
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
                Object hasTournamentTeamStatisticsTypes = networkCoroutineAPI10.hasTournamentTeamStatisticsTypes(i3, i2, this);
                return hasTournamentTeamStatisticsTypes == lu3Var10 ? lu3Var10 : hasTournamentTeamStatisticsTypes;
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
                Object hasUniqueCupTree = networkCoroutineAPI11.hasUniqueCupTree(i3, i2, this);
                return hasUniqueCupTree == lu3Var11 ? lu3Var11 : hasUniqueCupTree;
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
                Object hasUniqueTournamentRounds = networkCoroutineAPI12.hasUniqueTournamentRounds(i3, i2, this);
                return hasUniqueTournamentRounds == lu3Var12 ? lu3Var12 : hasUniqueTournamentRounds;
            case 12:
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
                LeagueGoatPlayerVoteBody leagueGoatPlayerVoteBody = new LeagueGoatPlayerVoteBody(i2);
                this.s = 1;
                Object leagueGoatPlayerVote = networkCoroutineAPI13.leagueGoatPlayerVote(i3, leagueGoatPlayerVoteBody, this);
                return leagueGoatPlayerVote == lu3Var13 ? lu3Var13 : leagueGoatPlayerVote;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI14 = w3bVar.b;
                this.s = 1;
                Object playerOfTheSeason = networkCoroutineAPI14.playerOfTheSeason(i3, i2, this);
                return playerOfTheSeason == lu3Var14 ? lu3Var14 : playerOfTheSeason;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI15 = w3bVar.b;
                this.s = 1;
                Object playerOfTheSeasonRace = networkCoroutineAPI15.playerOfTheSeasonRace(i3, i2, this);
                return playerOfTheSeasonRace == lu3Var15 ? lu3Var15 : playerOfTheSeasonRace;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI16 = w3bVar.b;
                this.s = 1;
                Object powerRankingRounds = networkCoroutineAPI16.powerRankingRounds(i3, i2, this);
                return powerRankingRounds == lu3Var16 ? lu3Var16 : powerRankingRounds;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI17 = w3bVar.b;
                this.s = 1;
                Object teamOfThePeriodAwardedPeriods = networkCoroutineAPI17.teamOfThePeriodAwardedPeriods(i3, i2, this);
                return teamOfThePeriodAwardedPeriods == lu3Var17 ? lu3Var17 : teamOfThePeriodAwardedPeriods;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i21 = this.s;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI18 = w3bVar.b;
                this.s = 1;
                Object teamOfTheWeekPeriods = networkCoroutineAPI18.teamOfTheWeekPeriods(i3, i2, this);
                return teamOfTheWeekPeriods == lu3Var18 ? lu3Var18 : teamOfTheWeekPeriods;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i22 = this.s;
                if (i22 != 0) {
                    if (i22 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI19 = w3bVar.b;
                this.s = 1;
                Object topFollowedPlayers = networkCoroutineAPI19.getTopFollowedPlayers(i3, i2, this);
                return topFollowedPlayers == lu3Var19 ? lu3Var19 : topFollowedPlayers;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI20 = w3bVar.b;
                this.s = 1;
                Object obj2 = networkCoroutineAPI20.tournamentPlayerStatisticsTypes(i3, i2, this);
                return obj2 == lu3Var20 ? lu3Var20 : obj2;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i24 = this.s;
                if (i24 != 0) {
                    if (i24 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI21 = w3bVar.b;
                this.s = 1;
                Object obj3 = networkCoroutineAPI21.tournamentTeamStatisticsTypes(i3, i2, this);
                return obj3 == lu3Var21 ? lu3Var21 : obj3;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i25 = this.s;
                if (i25 != 0) {
                    if (i25 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI22 = w3bVar.b;
                this.s = 1;
                Object uniqueCupTree = networkCoroutineAPI22.uniqueCupTree(i3, i2, this);
                return uniqueCupTree == lu3Var22 ? lu3Var22 : uniqueCupTree;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i26 = this.s;
                if (i26 != 0) {
                    if (i26 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI23 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentAwards = networkCoroutineAPI23.uniqueTournamentAwards(i3, i2, this);
                return uniqueTournamentAwards == lu3Var23 ? lu3Var23 : uniqueTournamentAwards;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI24 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentChampions = networkCoroutineAPI24.uniqueTournamentChampions(i3, i2, this);
                return uniqueTournamentChampions == lu3Var24 ? lu3Var24 : uniqueTournamentChampions;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI25 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentDivisions = networkCoroutineAPI25.uniqueTournamentDivisions(i3, i2, this);
                return uniqueTournamentDivisions == lu3Var25 ? lu3Var25 : uniqueTournamentDivisions;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i29 = this.s;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI26 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentSeasonFeaturedEvents = networkCoroutineAPI26.uniqueTournamentSeasonFeaturedEvents(i3, i2, this);
                return uniqueTournamentSeasonFeaturedEvents == lu3Var26 ? lu3Var26 : uniqueTournamentSeasonFeaturedEvents;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i30 = this.s;
                if (i30 != 0) {
                    if (i30 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI27 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentGroups = networkCoroutineAPI27.uniqueTournamentGroups(i3, i2, this);
                return uniqueTournamentGroups == lu3Var27 ? lu3Var27 : uniqueTournamentGroups;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i31 = this.s;
                if (i31 != 0) {
                    if (i31 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI28 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentRounds = networkCoroutineAPI28.uniqueTournamentRounds(i3, i2, this);
                return uniqueTournamentRounds == lu3Var28 ? lu3Var28 : uniqueTournamentRounds;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i32 = this.s;
                if (i32 != 0) {
                    if (i32 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI29 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentSeasonInfo2 = networkCoroutineAPI29.uniqueTournamentSeasonInfo(i3, i2, this);
                return uniqueTournamentSeasonInfo2 == lu3Var29 ? lu3Var29 : uniqueTournamentSeasonInfo2;
            default:
                lu3 lu3Var30 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI30 = w3bVar.b;
                    this.s = 1;
                    obj = networkCoroutineAPI30.uniqueTournamentTeamVideos(i3, i2, this);
                    if (obj == lu3Var30) {
                        return lu3Var30;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((MediaVideoResponse) obj).getVideos();
        }
    }
}
