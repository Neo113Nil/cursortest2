package defpackage;

import com.sofascore.model.newNetwork.BaseballAtBatsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a86 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ s96 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a86(s96 s96Var, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = s96Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        s96 s96Var = this.t;
        switch (i) {
            case 0:
                return new a86(s96Var, i2, rq3Var, 0);
            case 1:
                return new a86(s96Var, i2, rq3Var, 1);
            case 2:
                return new a86(s96Var, i2, rq3Var, 2);
            case 3:
                return new a86(s96Var, i2, rq3Var, 3);
            case 4:
                return new a86(s96Var, i2, rq3Var, 4);
            case 5:
                return new a86(s96Var, i2, rq3Var, 5);
            case 6:
                return new a86(s96Var, i2, rq3Var, 6);
            case 7:
                return new a86(s96Var, i2, rq3Var, 7);
            case 8:
                return new a86(s96Var, i2, rq3Var, 8);
            case 9:
                return new a86(s96Var, i2, rq3Var, 9);
            case 10:
                return new a86(s96Var, i2, rq3Var, 10);
            case 11:
                return new a86(s96Var, i2, rq3Var, 11);
            case 12:
                return new a86(s96Var, i2, rq3Var, 12);
            case 13:
                return new a86(s96Var, i2, rq3Var, 13);
            case 14:
                return new a86(s96Var, i2, rq3Var, 14);
            case 15:
                return new a86(s96Var, i2, rq3Var, 15);
            case 16:
                return new a86(s96Var, i2, rq3Var, 16);
            case 17:
                return new a86(s96Var, i2, rq3Var, 17);
            case 18:
                return new a86(s96Var, i2, rq3Var, 18);
            case 19:
                return new a86(s96Var, i2, rq3Var, 19);
            case 20:
                return new a86(s96Var, i2, rq3Var, 20);
            case 21:
                return new a86(s96Var, i2, rq3Var, 21);
            case 22:
                return new a86(s96Var, i2, rq3Var, 22);
            case 23:
                return new a86(s96Var, i2, rq3Var, 23);
            case 24:
                return new a86(s96Var, i2, rq3Var, 24);
            case 25:
                return new a86(s96Var, i2, rq3Var, 25);
            case 26:
                return new a86(s96Var, i2, rq3Var, 26);
            case 27:
                return new a86(s96Var, i2, rq3Var, 27);
            default:
                return new a86(s96Var, i2, rq3Var, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((a86) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        s96 s96Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = s96Var.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.baseballAtBats(i2, this);
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
                return ((BaseballAtBatsResponse) obj).getAtBats();
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
                NetworkCoroutineAPI networkCoroutineAPI2 = s96Var.a;
                this.s = 1;
                Object eventChildEvents = networkCoroutineAPI2.eventChildEvents(i2, this);
                return eventChildEvents == lu3Var2 ? lu3Var2 : eventChildEvents;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = s96Var.a;
                this.s = 1;
                Object event = networkCoroutineAPI3.getEvent(i2, this);
                return event == lu3Var3 ? lu3Var3 : event;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = s96Var.a;
                this.s = 1;
                Object eventBaseballTopPerformers = networkCoroutineAPI4.eventBaseballTopPerformers(i2, this);
                return eventBaseballTopPerformers == lu3Var4 ? lu3Var4 : eventBaseballTopPerformers;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = s96Var.a;
                this.s = 1;
                Object bestPlayersSummary = networkCoroutineAPI5.bestPlayersSummary(i2, this);
                return bestPlayersSummary == lu3Var5 ? lu3Var5 : bestPlayersSummary;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = s96Var.a;
                this.s = 1;
                Object eventGraph = networkCoroutineAPI6.eventGraph(i2, this);
                return eventGraph == lu3Var6 ? lu3Var6 : eventGraph;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = s96Var.a;
                this.s = 1;
                Object eventInnings = networkCoroutineAPI7.getEventInnings(i2, this);
                return eventInnings == lu3Var7 ? lu3Var7 : eventInnings;
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
                NetworkCoroutineAPI networkCoroutineAPI8 = s96Var.a;
                this.s = 1;
                Object eventSeries = networkCoroutineAPI8.getEventSeries(i2, this);
                return eventSeries == lu3Var8 ? lu3Var8 : eventSeries;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = s96Var.a;
                this.s = 1;
                Object eventUmpires = networkCoroutineAPI9.getEventUmpires(i2, this);
                return eventUmpires == lu3Var9 ? lu3Var9 : eventUmpires;
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
                NetworkCoroutineAPI networkCoroutineAPI10 = s96Var.a;
                this.s = 1;
                Object eventVotes = networkCoroutineAPI10.getEventVotes(i2, this);
                return eventVotes == lu3Var10 ? lu3Var10 : eventVotes;
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
                NetworkCoroutineAPI networkCoroutineAPI11 = s96Var.a;
                this.s = 1;
                Object eventWeather = networkCoroutineAPI11.getEventWeather(i2, this);
                return eventWeather == lu3Var11 ? lu3Var11 : eventWeather;
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
                NetworkCoroutineAPI networkCoroutineAPI12 = s96Var.a;
                this.s = 1;
                Object stageDetails = networkCoroutineAPI12.stageDetails(i2, this);
                return stageDetails == lu3Var12 ? lu3Var12 : stageDetails;
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
                NetworkCoroutineAPI networkCoroutineAPI13 = s96Var.a;
                this.s = 1;
                Object stageDetailsExtended = networkCoroutineAPI13.stageDetailsExtended(i2, this);
                return stageDetailsExtended == lu3Var13 ? lu3Var13 : stageDetailsExtended;
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
                NetworkCoroutineAPI networkCoroutineAPI14 = s96Var.a;
                this.s = 1;
                Object teamFeaturedPlayers = networkCoroutineAPI14.teamFeaturedPlayers(i2, this);
                return teamFeaturedPlayers == lu3Var14 ? lu3Var14 : teamFeaturedPlayers;
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
                NetworkCoroutineAPI networkCoroutineAPI15 = s96Var.a;
                this.s = 1;
                Object winProbability = networkCoroutineAPI15.winProbability(i2, this);
                return winProbability == lu3Var15 ? lu3Var15 : winProbability;
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
                NetworkCoroutineAPI networkCoroutineAPI16 = s96Var.a;
                this.s = 1;
                Object hasEventESportGames = networkCoroutineAPI16.hasEventESportGames(i2, this);
                return hasEventESportGames == lu3Var16 ? lu3Var16 : hasEventESportGames;
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
                NetworkCoroutineAPI networkCoroutineAPI17 = s96Var.a;
                this.s = 1;
                Object hasEventIncidents = networkCoroutineAPI17.hasEventIncidents(i2, this);
                return hasEventIncidents == lu3Var17 ? lu3Var17 : hasEventIncidents;
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
                NetworkCoroutineAPI networkCoroutineAPI18 = s96Var.a;
                this.s = 1;
                Object hasEventInnings = networkCoroutineAPI18.hasEventInnings(i2, this);
                return hasEventInnings == lu3Var18 ? lu3Var18 : hasEventInnings;
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
                NetworkCoroutineAPI networkCoroutineAPI19 = s96Var.a;
                this.s = 1;
                Object hasEventLineups = networkCoroutineAPI19.hasEventLineups(i2, this);
                return hasEventLineups == lu3Var19 ? lu3Var19 : hasEventLineups;
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
                NetworkCoroutineAPI networkCoroutineAPI20 = s96Var.a;
                this.s = 1;
                Object hasEventStatistics = networkCoroutineAPI20.hasEventStatistics(i2, this);
                return hasEventStatistics == lu3Var20 ? lu3Var20 : hasEventStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI21 = s96Var.a;
                this.s = 1;
                Object hasStageDriverPerformance = networkCoroutineAPI21.hasStageDriverPerformance(i2, this);
                return hasStageDriverPerformance == lu3Var21 ? lu3Var21 : hasStageDriverPerformance;
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
                NetworkCoroutineAPI networkCoroutineAPI22 = s96Var.a;
                this.s = 1;
                Object hasStageHighlights = networkCoroutineAPI22.hasStageHighlights(i2, this);
                return hasStageHighlights == lu3Var22 ? lu3Var22 : hasStageHighlights;
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
                NetworkCoroutineAPI networkCoroutineAPI23 = s96Var.a;
                this.s = 1;
                Object latestCrowdsourcingSuggests = networkCoroutineAPI23.latestCrowdsourcingSuggests(i2, this);
                return latestCrowdsourcingSuggests == lu3Var23 ? lu3Var23 : latestCrowdsourcingSuggests;
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
                NetworkCoroutineAPI networkCoroutineAPI24 = s96Var.a;
                this.s = 1;
                Object recentStageIds = networkCoroutineAPI24.recentStageIds(i2, this);
                return recentStageIds == lu3Var24 ? lu3Var24 : recentStageIds;
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
                NetworkCoroutineAPI networkCoroutineAPI25 = s96Var.a;
                this.s = 1;
                Object stageDetails2 = networkCoroutineAPI25.stageDetails(i2, this);
                return stageDetails2 == lu3Var25 ? lu3Var25 : stageDetails2;
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
                NetworkCoroutineAPI networkCoroutineAPI26 = s96Var.a;
                this.s = 1;
                Object stageDriverPerformanceGraph = networkCoroutineAPI26.stageDriverPerformanceGraph(i2, this);
                return stageDriverPerformanceGraph == lu3Var26 ? lu3Var26 : stageDriverPerformanceGraph;
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
                NetworkCoroutineAPI networkCoroutineAPI27 = s96Var.a;
                this.s = 1;
                Object stageSportSeasons = networkCoroutineAPI27.stageSportSeasons(i2, this);
                return stageSportSeasons == lu3Var27 ? lu3Var27 : stageSportSeasons;
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
                NetworkCoroutineAPI networkCoroutineAPI28 = s96Var.a;
                this.s = 1;
                Object stageSportSubStages = networkCoroutineAPI28.stageSportSubStages(i2, this);
                return stageSportSubStages == lu3Var28 ? lu3Var28 : stageSportSubStages;
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
                NetworkCoroutineAPI networkCoroutineAPI29 = s96Var.a;
                this.s = 1;
                Object stageSportUniqueStages = networkCoroutineAPI29.stageSportUniqueStages(i2, this);
                return stageSportUniqueStages == lu3Var29 ? lu3Var29 : stageSportUniqueStages;
        }
    }
}
