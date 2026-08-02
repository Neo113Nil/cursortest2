package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class azi extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ j0j t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azi(j0j j0jVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = j0jVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        j0j j0jVar = this.t;
        switch (i) {
            case 0:
                return new azi(j0jVar, i2, rq3Var, 0);
            case 1:
                return new azi(j0jVar, i2, rq3Var, 1);
            case 2:
                return new azi(j0jVar, i2, rq3Var, 2);
            case 3:
                return new azi(j0jVar, i2, rq3Var, 3);
            case 4:
                return new azi(j0jVar, i2, rq3Var, 4);
            case 5:
                return new azi(j0jVar, i2, rq3Var, 5);
            case 6:
                return new azi(j0jVar, i2, rq3Var, 6);
            case 7:
                return new azi(j0jVar, i2, rq3Var, 7);
            case 8:
                return new azi(j0jVar, i2, rq3Var, 8);
            case 9:
                return new azi(j0jVar, i2, rq3Var, 9);
            case 10:
                return new azi(j0jVar, i2, rq3Var, 10);
            case 11:
                return new azi(j0jVar, i2, rq3Var, 11);
            case 12:
                return new azi(j0jVar, i2, rq3Var, 12);
            case 13:
                return new azi(j0jVar, i2, rq3Var, 13);
            case 14:
                return new azi(j0jVar, i2, rq3Var, 14);
            case 15:
                return new azi(j0jVar, i2, rq3Var, 15);
            case 16:
                return new azi(j0jVar, i2, rq3Var, 16);
            case 17:
                return new azi(j0jVar, i2, rq3Var, 17);
            case 18:
                return new azi(j0jVar, i2, rq3Var, 18);
            case 19:
                return new azi(j0jVar, i2, rq3Var, 19);
            case 20:
                return new azi(j0jVar, i2, rq3Var, 20);
            case 21:
                return new azi(j0jVar, i2, rq3Var, 21);
            case 22:
                return new azi(j0jVar, i2, rq3Var, 22);
            case 23:
                return new azi(j0jVar, i2, rq3Var, 23);
            case 24:
                return new azi(j0jVar, i2, rq3Var, 24);
            case 25:
                return new azi(j0jVar, i2, rq3Var, 25);
            case 26:
                return new azi(j0jVar, i2, rq3Var, 26);
            case 27:
                return new azi(j0jVar, i2, rq3Var, 27);
            default:
                return new azi(j0jVar, i2, rq3Var, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((azi) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        j0j j0jVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = j0jVar.b;
                this.s = 1;
                Object allTeamTournaments = networkCoroutineAPI.allTeamTournaments(i2, this);
                return allTeamTournaments == lu3Var ? lu3Var : allTeamTournaments;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = j0jVar.b;
                e2f e2fVar = yyi.c;
                this.s = 1;
                Object hasTeamEventList = networkCoroutineAPI2.hasTeamEventList(this.u, "doubles", "last", 0, this);
                return hasTeamEventList == lu3Var2 ? lu3Var2 : hasTeamEventList;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = j0jVar.b;
                e2f e2fVar2 = yyi.c;
                this.s = 1;
                Object hasTeamEventList2 = networkCoroutineAPI3.hasTeamEventList(this.u, "singles", "last", 0, this);
                return hasTeamEventList2 == lu3Var3 ? lu3Var3 : hasTeamEventList2;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = j0jVar.b;
                this.s = 1;
                Object driverStageSeasons = networkCoroutineAPI4.driverStageSeasons(i2, this);
                return driverStageSeasons == lu3Var4 ? lu3Var4 : driverStageSeasons;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = j0jVar.b;
                this.s = 1;
                Object recentTeamTournaments = networkCoroutineAPI5.recentTeamTournaments(i2, this);
                return recentTeamTournaments == lu3Var5 ? lu3Var5 : recentTeamTournaments;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = j0jVar.b;
                this.s = 1;
                Object stageTeamCareerHistory = networkCoroutineAPI6.stageTeamCareerHistory(i2, this);
                return stageTeamCareerHistory == lu3Var6 ? lu3Var6 : stageTeamCareerHistory;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = j0jVar.b;
                this.s = 1;
                Object teamAchievements = networkCoroutineAPI7.getTeamAchievements(i2, this);
                return teamAchievements == lu3Var7 ? lu3Var7 : teamAchievements;
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
                NetworkCoroutineAPI networkCoroutineAPI8 = j0jVar.b;
                this.s = 1;
                Object teamCareerStatistics = networkCoroutineAPI8.teamCareerStatistics(i2, this);
                return teamCareerStatistics == lu3Var8 ? lu3Var8 : teamCareerStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = j0jVar.b;
                this.s = 1;
                Object teamDetails = networkCoroutineAPI9.teamDetails(i2, this);
                return teamDetails == lu3Var9 ? lu3Var9 : teamDetails;
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
                NetworkCoroutineAPI networkCoroutineAPI10 = j0jVar.b;
                this.s = 1;
                Object teamEventIds = networkCoroutineAPI10.teamEventIds(i2, this);
                return teamEventIds == lu3Var10 ? lu3Var10 : teamEventIds;
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
                NetworkCoroutineAPI networkCoroutineAPI11 = j0jVar.b;
                this.s = 1;
                Object teamFeaturedEvent = networkCoroutineAPI11.teamFeaturedEvent(i2, this);
                return teamFeaturedEvent == lu3Var11 ? lu3Var11 : teamFeaturedEvent;
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
                NetworkCoroutineAPI networkCoroutineAPI12 = j0jVar.b;
                this.s = 1;
                Object teamPerformance = networkCoroutineAPI12.teamPerformance(i2, this);
                return teamPerformance == lu3Var12 ? lu3Var12 : teamPerformance;
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
                NetworkCoroutineAPI networkCoroutineAPI13 = j0jVar.b;
                this.s = 1;
                Object teamRankings = networkCoroutineAPI13.teamRankings(i2, this);
                return teamRankings == lu3Var13 ? lu3Var13 : teamRankings;
            case 13:
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
                NetworkCoroutineAPI networkCoroutineAPI14 = j0jVar.b;
                this.s = 1;
                Object teamSquad = networkCoroutineAPI14.getTeamSquad(i2, this);
                return teamSquad == lu3Var14 ? lu3Var14 : teamSquad;
            case 14:
                lu3 lu3Var15 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI15 = j0jVar.b;
                this.s = 1;
                Object teamStandingsSeasons = networkCoroutineAPI15.teamStandingsSeasons(i2, this);
                return teamStandingsSeasons == lu3Var15 ? lu3Var15 : teamStandingsSeasons;
            case 15:
                lu3 lu3Var16 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI16 = j0jVar.b;
                this.s = 1;
                Object teamStatisticsSeasons = networkCoroutineAPI16.teamStatisticsSeasons(i2, SearchResponseKt.PLAYER_ENTITY, this);
                return teamStatisticsSeasons == lu3Var16 ? lu3Var16 : teamStatisticsSeasons;
            case 16:
                lu3 lu3Var17 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI17 = j0jVar.b;
                this.s = 1;
                Object teamStatisticsSeasons2 = networkCoroutineAPI17.teamStatisticsSeasons(i2, "team", this);
                return teamStatisticsSeasons2 == lu3Var17 ? lu3Var17 : teamStatisticsSeasons2;
            case 17:
                lu3 lu3Var18 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI18 = j0jVar.b;
                this.s = 1;
                Object teamStreaks = networkCoroutineAPI18.getTeamStreaks(i2, this);
                return teamStreaks == lu3Var18 ? lu3Var18 : teamStreaks;
            case 18:
                lu3 lu3Var19 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI19 = j0jVar.b;
                this.s = 1;
                Object teamTopPlayer = networkCoroutineAPI19.teamTopPlayer(i2, 16, 58210, this);
                return teamTopPlayer == lu3Var19 ? lu3Var19 : teamTopPlayer;
            case 19:
                lu3 lu3Var20 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI20 = j0jVar.b;
                this.s = 1;
                Object teamTournaments = networkCoroutineAPI20.teamTournaments(i2, this);
                return teamTournaments == lu3Var20 ? lu3Var20 : teamTournaments;
            case 20:
                lu3 lu3Var21 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI21 = j0jVar.b;
                this.s = 1;
                Object teamTransfers = networkCoroutineAPI21.teamTransfers(i2, this);
                return teamTransfers == lu3Var21 ? lu3Var21 : teamTransfers;
            case 21:
                lu3 lu3Var22 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI22 = j0jVar.b;
                this.s = 1;
                Object tennisTeamGrandSlamPerformance = networkCoroutineAPI22.tennisTeamGrandSlamPerformance(i2, this);
                return tennisTeamGrandSlamPerformance == lu3Var22 ? lu3Var22 : tennisTeamGrandSlamPerformance;
            case 22:
                lu3 lu3Var23 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI23 = j0jVar.b;
                this.s = 1;
                Object hasDriverCareerHistory = networkCoroutineAPI23.hasDriverCareerHistory(i2, this);
                return hasDriverCareerHistory == lu3Var23 ? lu3Var23 : hasDriverCareerHistory;
            case 23:
                lu3 lu3Var24 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI24 = j0jVar.b;
                this.s = 1;
                Object hasDriverStageSeasons = networkCoroutineAPI24.hasDriverStageSeasons(i2, this);
                return hasDriverStageSeasons == lu3Var24 ? lu3Var24 : hasDriverStageSeasons;
            case 24:
                lu3 lu3Var25 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI25 = j0jVar.b;
                this.s = 1;
                Object hasTeamCareerStatistics = networkCoroutineAPI25.hasTeamCareerStatistics(i2, this);
                return hasTeamCareerStatistics == lu3Var25 ? lu3Var25 : hasTeamCareerStatistics;
            case 25:
                lu3 lu3Var26 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI26 = j0jVar.b;
                this.s = 1;
                Object hasTeamSquad = networkCoroutineAPI26.hasTeamSquad(i2, this);
                return hasTeamSquad == lu3Var26 ? lu3Var26 : hasTeamSquad;
            case 26:
                lu3 lu3Var27 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI27 = j0jVar.b;
                this.s = 1;
                Object hasTeamStandingsSeasons = networkCoroutineAPI27.hasTeamStandingsSeasons(i2, this);
                return hasTeamStandingsSeasons == lu3Var27 ? lu3Var27 : hasTeamStandingsSeasons;
            case 27:
                lu3 lu3Var28 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI28 = j0jVar.b;
                this.s = 1;
                Object hasTeamStatisticsSeasons = networkCoroutineAPI28.hasTeamStatisticsSeasons(i2, "team", this);
                return hasTeamStatisticsSeasons == lu3Var28 ? lu3Var28 : hasTeamStatisticsSeasons;
            default:
                lu3 lu3Var29 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI29 = j0jVar.b;
                this.s = 1;
                Object hasTeamTransfers = networkCoroutineAPI29.hasTeamTransfers(i2, this);
                return hasTeamTransfers == lu3Var29 ? lu3Var29 : hasTeamTransfers;
        }
    }
}
