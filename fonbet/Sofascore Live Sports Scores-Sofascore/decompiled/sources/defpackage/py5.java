package defpackage;

import android.content.Context;
import com.ironsource.U3;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.GetCrowdsourcingEventContributionsResponse;
import com.sofascore.model.crowdsourcing.LatestCrowdsourcingSuggestResponse;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.EventUmpireItem;
import com.sofascore.model.network.response.EventUmpiresResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.BaseballAtBatData;
import com.sofascore.model.newNetwork.BaseballEventTopPerformersResponse;
import com.sofascore.model.newNetwork.BaseballTopPerformer;
import com.sofascore.model.newNetwork.BaseballTopPerformerRole;
import com.sofascore.model.newNetwork.PointByPointResponse;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.SeasonInfoResponse;
import com.sofascore.model.newNetwork.SetPP;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class py5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dz5 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py5(dz5 dz5Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = dz5Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                return new py5(dz5Var, event, rq3Var, 0);
            case 1:
                return new py5(dz5Var, event, rq3Var, 1);
            case 2:
                return new py5(dz5Var, event, rq3Var, 2);
            case 3:
                return new py5(dz5Var, event, rq3Var, 3);
            case 4:
                return new py5(dz5Var, event, rq3Var, 4);
            case 5:
                return new py5(dz5Var, event, rq3Var, 5);
            case 6:
                return new py5(dz5Var, event, rq3Var, 6);
            case 7:
                return new py5(dz5Var, event, rq3Var, 7);
            case 8:
                return new py5(event, dz5Var, rq3Var, 8);
            case 9:
                return new py5(dz5Var, event, rq3Var, 9);
            case 10:
                return new py5(dz5Var, event, rq3Var, 10);
            case 11:
                return new py5(dz5Var, event, rq3Var, 11);
            case 12:
                return new py5(dz5Var, event, rq3Var, 12);
            case 13:
                return new py5(dz5Var, event, rq3Var, 13);
            case 14:
                return new py5(dz5Var, event, rq3Var, 14);
            case 15:
                return new py5(dz5Var, event, rq3Var, 15);
            case 16:
                return new py5(dz5Var, event, rq3Var, 16);
            case 17:
                return new py5(dz5Var, event, rq3Var, 17);
            case 18:
                return new py5(dz5Var, event, rq3Var, 18);
            case 19:
                return new py5(dz5Var, event, rq3Var, 19);
            case 20:
                return new py5(dz5Var, event, rq3Var, 20);
            case 21:
                return new py5(dz5Var, event, rq3Var, 21);
            case 22:
                return new py5(dz5Var, event, rq3Var, 22);
            case 23:
                return new py5(dz5Var, event, rq3Var, 23);
            case 24:
                return new py5(event, dz5Var, rq3Var, 24);
            case 25:
                return new py5(dz5Var, event, rq3Var, 25);
            case 26:
                return new py5(dz5Var, event, rq3Var, 26);
            case 27:
                return new py5(dz5Var, event, rq3Var, 27);
            case 28:
                return new py5(dz5Var, event, rq3Var, 28);
            default:
                return new py5(dz5Var, event, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((py5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:419:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Type inference failed for: r12v0, types: [tm1] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object P;
        List<EventSuggest> contributions;
        TeamSides teamSides;
        Object o;
        Object obj3;
        Object obj4;
        Object obj5;
        Integer pitchingSavedGamesToDate;
        Integer pitchingSaves;
        Integer pitchingLosses;
        Integer pitchingWins;
        Object f;
        Iterator it;
        Context context;
        BaseballTopPerformer baseballTopPerformer;
        String str;
        ?? r17;
        int[] iArr;
        List x;
        rq3 rq3Var;
        Object P2;
        CrowdsourcingContribution incidentSuggests;
        Object P3;
        Object c;
        Integer valueOf;
        gv9 W;
        float f2;
        int max;
        float f3;
        BaseballInningInfo currentInningInfo;
        Object r;
        Object v;
        SeasonInfo seasonInfo;
        Object Y;
        Object P4;
        q9k q9kVar;
        String fullName;
        dn1 dn1Var;
        int i = this.r;
        int i2 = 8;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        Event event = this.u;
        dz5 dz5Var = this.t;
        int i6 = 1;
        rq3 rq3Var2 = null;
        r11 = null;
        r11 = null;
        x2g x2gVar = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    s96 s96Var = dz5Var.i;
                    int id = event.getId();
                    this.s = 1;
                    s96Var.getClass();
                    obj2 = null;
                    P = yaa.P(new a86(s96Var, id, null, 22), this);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                    obj2 = null;
                }
                LatestCrowdsourcingSuggestResponse latestCrowdsourcingSuggestResponse = (LatestCrowdsourcingSuggestResponse) yaa.x((x2g) P);
                return (latestCrowdsourcingSuggestResponse == null || (contributions = latestCrowdsourcingSuggestResponse.getContributions()) == null) ? obj2 : (EventSuggest) CollectionsKt.firstOrNull(contributions);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = dz5Var.i;
                    int id2 = event.getId();
                    this.s = 1;
                    teamSides = null;
                    o = s96Var2.o(id2, null, this);
                    if (o == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    o = obj;
                    teamSides = null;
                }
                LineupsResponse lineupsResponse = (LineupsResponse) o;
                if (lineupsResponse != null) {
                    Context i9 = dz5Var.i();
                    ArrayList w0 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, teamSides, 1, teamSides).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, teamSides, 1, teamSides).getPlayers());
                    Iterator it2 = w0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            PlayerEventStatistics statistics = ((PlayerData) obj3).getStatistics();
                            BaseballPlayerEventStatistics baseballPlayerEventStatistics = statistics instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics : null;
                            if (baseballPlayerEventStatistics == null || (pitchingWins = baseballPlayerEventStatistics.getPitchingWins()) == null || pitchingWins.intValue() != 1) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    PlayerData playerData = (PlayerData) obj3;
                    Iterator it3 = w0.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            PlayerEventStatistics statistics2 = ((PlayerData) obj4).getStatistics();
                            BaseballPlayerEventStatistics baseballPlayerEventStatistics2 = statistics2 instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics2 : null;
                            if (baseballPlayerEventStatistics2 == null || (pitchingLosses = baseballPlayerEventStatistics2.getPitchingLosses()) == null || pitchingLosses.intValue() != 1) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    PlayerData playerData2 = (PlayerData) obj4;
                    Iterator it4 = w0.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj5 = it4.next();
                            PlayerEventStatistics statistics3 = ((PlayerData) obj5).getStatistics();
                            BaseballPlayerEventStatistics baseballPlayerEventStatistics3 = statistics3 instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics3 : null;
                            if (baseballPlayerEventStatistics3 == null || (pitchingSaves = baseballPlayerEventStatistics3.getPitchingSaves()) == null || pitchingSaves.intValue() != 1) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    PlayerData playerData3 = (PlayerData) obj5;
                    PlayerEventStatistics statistics4 = playerData != null ? playerData.getStatistics() : null;
                    BaseballPlayerEventStatistics baseballPlayerEventStatistics4 = statistics4 instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics4 : null;
                    PlayerEventStatistics statistics5 = playerData2 != null ? playerData2.getStatistics() : null;
                    BaseballPlayerEventStatistics baseballPlayerEventStatistics5 = statistics5 instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics5 : null;
                    PlayerEventStatistics statistics6 = playerData3 != null ? playerData3.getStatistics() : null;
                    BaseballPlayerEventStatistics baseballPlayerEventStatistics6 = statistics6 instanceof BaseballPlayerEventStatistics ? (BaseballPlayerEventStatistics) statistics6 : null;
                    xbb b = a.b();
                    if (playerData != null) {
                        b.add(yso.D(i9, mm1.WINNING, playerData, ljg.m(baseballPlayerEventStatistics4 != null ? baseballPlayerEventStatistics4.getPitchingWonGamesToDate() : null, baseballPlayerEventStatistics4 != null ? baseballPlayerEventStatistics4.getPitchingLostGamesToDate() : null, " - "), baseballPlayerEventStatistics4 != null ? baseballPlayerEventStatistics4.getPitchingEarnedRunsAverageToDate() : null));
                    }
                    if (playerData2 != null) {
                        b.add(yso.D(i9, mm1.LOSING, playerData2, ljg.m(baseballPlayerEventStatistics5 != null ? baseballPlayerEventStatistics5.getPitchingWonGamesToDate() : null, baseballPlayerEventStatistics5 != null ? baseballPlayerEventStatistics5.getPitchingLostGamesToDate() : null, " - "), baseballPlayerEventStatistics5 != null ? baseballPlayerEventStatistics5.getPitchingEarnedRunsAverageToDate() : null));
                    }
                    if (playerData3 != null) {
                        b.add(yso.D(i9, mm1.SAVING, playerData3, String.valueOf((baseballPlayerEventStatistics6 == null || (pitchingSavedGamesToDate = baseballPlayerEventStatistics6.getPitchingSavedGamesToDate()) == null) ? 1 : pitchingSavedGamesToDate.intValue()), baseballPlayerEventStatistics6 != null ? baseballPlayerEventStatistics6.getPitchingEarnedRunsAverageToDate() : null));
                    }
                    return l6g.W(a.a(b));
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    s96 s96Var3 = dz5Var.i;
                    int id3 = event.getId();
                    this.s = 1;
                    f = s96Var3.f(id3, this);
                    if (f == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    f = obj;
                }
                BaseballEventTopPerformersResponse baseballEventTopPerformersResponse = (BaseballEventTopPerformersResponse) f;
                if (baseballEventTopPerformersResponse != null) {
                    Context i11 = dz5Var.i();
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it5 = baseballEventTopPerformersResponse.getTopPerformers().iterator();
                    while (it5.hasNext()) {
                        BaseballTopPerformer baseballTopPerformer2 = (BaseballTopPerformer) it5.next();
                        BaseballTopPerformerRole role = baseballTopPerformer2.getRole();
                        if (role == null) {
                            it = it5;
                            context = i11;
                            baseballTopPerformer = baseballTopPerformer2;
                            rq3Var = rq3Var2;
                        } else {
                            BaseballPlayerEventStatistics statistics7 = baseballTopPerformer2.getStatistics();
                            int id4 = baseballTopPerformer2.getPlayer().getId();
                            int id5 = baseballTopPerformer2.getTeam().getId();
                            Player player = baseballTopPerformer2.getPlayer();
                            String C = tba.C(player);
                            if (C == null) {
                                C = tba.t(player);
                            }
                            String str2 = C;
                            int[] iArr2 = um1.a;
                            int i12 = iArr2[role.ordinal()];
                            if (i12 == i6) {
                                it = it5;
                                context = i11;
                                baseballTopPerformer = baseballTopPerformer2;
                                Integer battingAtBats = statistics7.getBattingAtBats();
                                if (battingAtBats != null) {
                                    str = yid.m(statistics7.getBattingHits()) + "-" + battingAtBats;
                                    r17 = str;
                                    iArr = iArr2;
                                }
                                iArr = iArr2;
                                r17 = null;
                            } else if (i12 == i4) {
                                Double pitchingInningsPitched = statistics7.getPitchingInningsPitched();
                                String c2 = pitchingInningsPitched != null ? yid.c("%.1f", pitchingInningsPitched) : null;
                                Integer pitchingWins2 = statistics7.getPitchingWins();
                                int intValue = pitchingWins2 != null ? pitchingWins2.intValue() : 0;
                                Integer pitchingSaves2 = statistics7.getPitchingSaves();
                                int intValue2 = pitchingSaves2 != null ? pitchingSaves2.intValue() : 0;
                                String string = i11.getString(R.string.baseball_innings_pitched_short);
                                string.getClass();
                                String string2 = i11.getString(R.string.any_sport_wins_short);
                                string2.getClass();
                                it = it5;
                                String string3 = i11.getString(R.string.baseball_saves_short);
                                string3.getClass();
                                if (c2 == null) {
                                    context = i11;
                                    baseballTopPerformer = baseballTopPerformer2;
                                    iArr = iArr2;
                                    r17 = null;
                                } else {
                                    context = i11;
                                    baseballTopPerformer = baseballTopPerformer2;
                                    str = intValue == 1 ? bf3.k(string2, ", ", c2, " ", string) : intValue2 == 1 ? bf3.k(string3, ", ", c2, " ", string) : lnb.o(c2, " ", string);
                                    r17 = str;
                                    iArr = iArr2;
                                }
                            } else {
                                if (i12 != i3) {
                                    zzl.b();
                                    return rq3Var2;
                                }
                                it = it5;
                                context = i11;
                                baseballTopPerformer = baseballTopPerformer2;
                                iArr = iArr2;
                                r17 = rq3Var2;
                            }
                            int i13 = iArr[role.ordinal()];
                            if (i13 == 1) {
                                i3 = 3;
                                Integer battingHomeRuns = statistics7.getBattingHomeRuns();
                                sm1 sm1Var = battingHomeRuns != null ? new sm1(R.string.baseball_home_runs_short, String.valueOf(battingHomeRuns.intValue())) : null;
                                Integer battingRbi = statistics7.getBattingRbi();
                                sm1 sm1Var2 = battingRbi != null ? new sm1(R.string.baseball_runs_batted_in_short, String.valueOf(battingRbi.intValue())) : null;
                                Integer battingRuns = statistics7.getBattingRuns();
                                sm1 sm1Var3 = battingRuns != null ? new sm1(R.string.baseball_runs_short, String.valueOf(battingRuns.intValue())) : null;
                                Integer battingStolenBases = statistics7.getBattingStolenBases();
                                sm1 sm1Var4 = battingStolenBases != null ? new sm1(R.string.baseball_stolen_bases_short, String.valueOf(battingStolenBases.intValue())) : null;
                                Integer battingBaseOnBalls = statistics7.getBattingBaseOnBalls();
                                x = ph0.x(new sm1[]{sm1Var, sm1Var2, sm1Var3, sm1Var4, battingBaseOnBalls != null ? new sm1(R.string.baseball_walks_short, String.valueOf(battingBaseOnBalls.intValue())) : null});
                            } else if (i13 != 2) {
                                i3 = 3;
                                if (i13 == 3) {
                                    Integer fieldingPutOuts = statistics7.getFieldingPutOuts();
                                    sm1 sm1Var5 = fieldingPutOuts != null ? new sm1(R.string.baseball_putouts_short, String.valueOf(fieldingPutOuts.intValue())) : null;
                                    Integer fieldingAssists = statistics7.getFieldingAssists();
                                    sm1 sm1Var6 = fieldingAssists != null ? new sm1(R.string.baseball_assists_short, String.valueOf(fieldingAssists.intValue())) : null;
                                    Integer fieldingDoublePlays = statistics7.getFieldingDoublePlays();
                                    sm1 sm1Var7 = fieldingDoublePlays != null ? new sm1(R.string.baseball_double_plays_short, String.valueOf(fieldingDoublePlays.intValue())) : null;
                                    Integer fieldingStolenBasesCaught = statistics7.getFieldingStolenBasesCaught();
                                    sm1 sm1Var8 = fieldingStolenBasesCaught != null ? new sm1(R.string.baseball_outcome_caught_stealing_short, String.valueOf(fieldingStolenBasesCaught.intValue())) : null;
                                    Integer fieldingTotalErrors = statistics7.getFieldingTotalErrors();
                                    x = ph0.x(new sm1[]{sm1Var5, sm1Var6, sm1Var7, sm1Var8, fieldingTotalErrors != null ? new sm1(R.string.baseball_fielding_errors_short, String.valueOf(fieldingTotalErrors.intValue())) : null});
                                } else {
                                    zzl.b();
                                }
                            } else {
                                i3 = 3;
                                Integer pitchingStrikeOuts = statistics7.getPitchingStrikeOuts();
                                sm1 sm1Var9 = pitchingStrikeOuts != null ? new sm1(R.string.baseball_strikeouts_short, String.valueOf(pitchingStrikeOuts.intValue())) : null;
                                Integer pitchingEarnedRuns = statistics7.getPitchingEarnedRuns();
                                sm1 sm1Var10 = pitchingEarnedRuns != null ? new sm1(R.string.baseball_earned_runs_short, String.valueOf(pitchingEarnedRuns.intValue())) : null;
                                Integer pitchingBaseOnBalls = statistics7.getPitchingBaseOnBalls();
                                sm1 sm1Var11 = pitchingBaseOnBalls != null ? new sm1(R.string.baseball_walks_short, String.valueOf(pitchingBaseOnBalls.intValue())) : null;
                                Integer pitchingHitsAllowed = statistics7.getPitchingHitsAllowed();
                                x = ph0.x(new sm1[]{sm1Var9, sm1Var10, sm1Var11, pitchingHitsAllowed != null ? new sm1(R.string.baseball_hits_short, String.valueOf(pitchingHitsAllowed.intValue())) : null});
                            }
                            rq3Var = new tm1(id4, id5, str2, role, r17, l6g.W(x));
                        }
                        if (rq3Var != null) {
                            arrayList.add(rq3Var);
                            linkedHashMap.put(Integer.valueOf(baseballTopPerformer.getPlayer().getId()), new rm1(baseballTopPerformer.getPlayer(), baseballTopPerformer.getTeam()));
                        }
                        it5 = it;
                        i11 = context;
                        i4 = 2;
                        i6 = 1;
                        rq3Var2 = null;
                    }
                    return new vm1(l6g.W(arrayList), linkedHashMap);
                }
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    e64 e64Var = dz5Var.s;
                    int id6 = event.getId();
                    this.s = 1;
                    e64Var.getClass();
                    P2 = yaa.P(new b64(e64Var, id6, null, 1), this);
                    if (P2 == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                GetCrowdsourcingEventContributionsResponse getCrowdsourcingEventContributionsResponse = (GetCrowdsourcingEventContributionsResponse) yaa.x((x2g) P2);
                if (getCrowdsourcingEventContributionsResponse == null || (incidentSuggests = getCrowdsourcingEventContributionsResponse.getIncidentSuggests()) == null || incidentSuggests.getCount() <= 0) {
                    return null;
                }
                return incidentSuggests;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r2 = s9a.r(new qy5(dz5Var, event, rq3Var2, 0), this);
                    return r2 == lu3Var5 ? lu3Var5 : r2;
                }
                if (i15 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r3 = s9a.r(new az5(null, dz5Var, event), this);
                    return r3 == lu3Var6 ? lu3Var6 : r3;
                }
                if (i16 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                String customId = event.getCustomId();
                this.s = 1;
                Object o2 = dz5Var.o(customId, this);
                return o2 == lu3Var7 ? lu3Var7 : o2;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                s96 s96Var4 = dz5Var.i;
                int id7 = event.getId();
                String b2 = ceb.b(event);
                this.s = 1;
                Object L = s96Var4.L(id7, b2, this);
                return L == lu3Var8 ? lu3Var8 : L;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    MmaEvent mmaEvent = (MmaEvent) event;
                    UniqueTournament uniqueTournament = mmaEvent.getTournament().getUniqueTournament();
                    Integer num = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
                    String weightClass = mmaEvent.getWeightClass();
                    Gender gender = mmaEvent.getGender();
                    if (num != null && weightClass != null && gender != null) {
                        int intValue3 = num.intValue();
                        pai paiVar = dz5Var.l;
                        this.s = 1;
                        paiVar.getClass();
                        P3 = yaa.P(new kai(paiVar, intValue3, weightClass, gender, null, 1), this);
                        if (P3 == lu3Var9) {
                            return lu3Var9;
                        }
                    }
                    return x2gVar != null ? new q2g(new Throwable()) : x2gVar;
                }
                if (i19 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                P3 = obj;
                x2gVar = (x2g) P3;
                if (x2gVar != null) {
                }
            case 9:
                lu3 lu3Var10 = lu3.a;
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
                s96 s96Var5 = dz5Var.i;
                int id8 = event.getId();
                boolean shouldReverseTeams = event.shouldReverseTeams();
                this.s = 1;
                Serializable D = s96Var5.D(id8, shouldReverseTeams, this);
                return D == lu3Var10 ? lu3Var10 : D;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    s96 s96Var6 = dz5Var.i;
                    int id9 = event.getId();
                    this.s = 1;
                    c = s96Var6.c(id9, this);
                    if (c == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                List<BaseballAtBatData> list = (List) c;
                if (list == null || list.isEmpty() || list.isEmpty()) {
                    return null;
                }
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (((BaseballAtBatData) it6.next()).getHomeTeamWinningProbability() != null) {
                        BaseballEvent baseballEvent = event instanceof BaseballEvent ? (BaseballEvent) event : null;
                        Integer valueOf2 = (baseballEvent == null || (currentInningInfo = baseballEvent.getCurrentInningInfo()) == null) ? null : Integer.valueOf(currentInningInfo.getInning());
                        Iterator it7 = list.iterator();
                        if (it7.hasNext()) {
                            valueOf = Integer.valueOf(((BaseballAtBatData) it7.next()).getInning());
                            while (it7.hasNext()) {
                                Integer valueOf3 = Integer.valueOf(((BaseballAtBatData) it7.next()).getInning());
                                if (valueOf.compareTo(valueOf3) < 0) {
                                    valueOf = valueOf3;
                                }
                            }
                        } else {
                            valueOf = null;
                        }
                        int max2 = Math.max(9, yid.m(valueOf));
                        boolean D2 = ok3.D(event);
                        boolean shouldReverseTeams2 = event.shouldReverseTeams();
                        if (list.isEmpty()) {
                            W = rlh.b;
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (BaseballAtBatData baseballAtBatData : list) {
                                Integer valueOf4 = Integer.valueOf(baseballAtBatData.getInning());
                                Object obj6 = linkedHashMap2.get(valueOf4);
                                if (obj6 == null) {
                                    obj6 = new ArrayList();
                                    linkedHashMap2.put(valueOf4, obj6);
                                }
                                ((List) obj6).add(baseballAtBatData.getProbability(!shouldReverseTeams2));
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(linkedHashMap2.size()));
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                linkedHashMap3.put(entry.getKey(), CollectionsKt.W((List) entry.getValue()));
                            }
                            List G0 = CollectionsKt.G0(linkedHashMap3.keySet());
                            xbb b3 = a.b();
                            Iterator it8 = G0.iterator();
                            while (it8.hasNext()) {
                                int intValue4 = ((Number) it8.next()).intValue();
                                List list2 = (List) linkedHashMap3.get(Integer.valueOf(intValue4));
                                if (list2 == null) {
                                    list2 = km5.a;
                                }
                                int size = list2.size();
                                int i22 = i5;
                                for (Object obj7 : list2) {
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    float floatValue = ((Number) obj7).floatValue();
                                    if (size <= 1) {
                                        f3 = 0.5f;
                                    } else {
                                        if (valueOf2 != null && intValue4 == valueOf2.intValue() && D2) {
                                            f2 = i23;
                                            max = Math.max(i2, size);
                                        } else {
                                            f2 = i22;
                                            max = Math.max(1, size - 1);
                                        }
                                        f3 = f2 / max;
                                    }
                                    float b4 = llf.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    int i24 = intValue4 - 1;
                                    if (i24 < 0) {
                                        i24 = 0;
                                    }
                                    b3.add(new nn1(intValue4, (i24 + b4) / max2, llf.b(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f) - 50.0f));
                                    i22 = i23;
                                    i2 = 8;
                                    i5 = 0;
                                }
                            }
                            W = l6g.W(a.a(b3));
                        }
                        gv9 gv9Var = W;
                        if (gv9Var.isEmpty()) {
                            return null;
                        }
                        return new mn1(Event.getHomeTeam$default(event, null, 1, null).getId(), Event.getAwayTeam$default(event, null, 1, null).getId(), ok3.D(event), max2, valueOf2, gv9Var);
                    }
                }
                return null;
            case 11:
                lu3 lu3Var12 = lu3.a;
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
                s96 s96Var7 = dz5Var.i;
                this.s = 1;
                Object g = s96Var7.g(event, this);
                return g == lu3Var12 ? lu3Var12 : g;
            case 12:
                lu3 lu3Var13 = lu3.a;
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
                wy5 wy5Var = new wy5(dz5Var, event, rq3Var2, i5);
                this.s = 1;
                Object P5 = yaa.P(wy5Var, this);
                return P5 == lu3Var13 ? lu3Var13 : P5;
            case 13:
                lu3 lu3Var14 = lu3.a;
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
                s96 s96Var8 = dz5Var.i;
                this.s = 1;
                Object t = s96Var8.t(event, this);
                return t == lu3Var14 ? lu3Var14 : t;
            case 14:
                lu3 lu3Var15 = lu3.a;
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
                s96 s96Var9 = dz5Var.i;
                this.s = 1;
                Object j = s96Var9.j(event, this);
                return j == lu3Var15 ? lu3Var15 : j;
            case 15:
                lu3 lu3Var16 = lu3.a;
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
                s96 s96Var10 = dz5Var.i;
                this.s = 1;
                Serializable n = s96Var10.n(event, this);
                return n == lu3Var16 ? lu3Var16 : n;
            case 16:
                lu3 lu3Var17 = lu3.a;
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
                s96 s96Var11 = dz5Var.i;
                this.s = 1;
                Object p = s96Var11.p(event, this);
                return p == lu3Var17 ? lu3Var17 : p;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    s96 s96Var12 = dz5Var.i;
                    this.s = 1;
                    r = s96Var12.r(event, this);
                    if (r == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                PointByPointResponse pointByPointResponse = (PointByPointResponse) r;
                List<SetPP> pointByPoint = pointByPointResponse != null ? pointByPointResponse.getPointByPoint() : null;
                return pointByPoint == null ? km5.a : pointByPoint;
            case 18:
                lu3 lu3Var19 = lu3.a;
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
                wy5 wy5Var2 = new wy5(dz5Var, event, rq3Var2, i6);
                this.s = 1;
                Object P6 = yaa.P(wy5Var2, this);
                return P6 == lu3Var19 ? lu3Var19 : P6;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r4 = s9a.r(new h10(dz5Var, event, rq3Var2, 6), this);
                    return r4 == lu3Var20 ? lu3Var20 : r4;
                }
                if (i33 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i34 = this.s;
                if (i34 != 0) {
                    if (i34 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wy5 wy5Var3 = new wy5(dz5Var, event, rq3Var2, i4);
                this.s = 1;
                Object P7 = yaa.P(wy5Var3, this);
                return P7 == lu3Var21 ? lu3Var21 : P7;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i35 = this.s;
                if (i35 != 0) {
                    if (i35 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var13 = dz5Var.i;
                int id10 = event.getId();
                this.s = 1;
                Object h = s96Var13.h(id10, this);
                return h == lu3Var22 ? lu3Var22 : h;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    iy5 iy5Var = (iy5) dz5Var.w.d();
                    if (iy5Var != null && (seasonInfo = iy5Var.p) != null) {
                        return seasonInfo;
                    }
                    UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                    if (uniqueTournament2 == null) {
                        return null;
                    }
                    int id11 = uniqueTournament2.getId();
                    Season season = event.getSeason();
                    if (season == null) {
                        return null;
                    }
                    int id12 = season.getId();
                    w3b w3bVar = dz5Var.n;
                    this.s = 1;
                    v = w3bVar.v(id11, id12, this);
                    if (v == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    v = obj;
                }
                SeasonInfoResponse seasonInfoResponse = (SeasonInfoResponse) v;
                if (seasonInfoResponse != null) {
                    return seasonInfoResponse.getInfo();
                }
                return null;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i37 = this.s;
                if (i37 != 0) {
                    if (i37 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wy5 wy5Var4 = new wy5(dz5Var, event, rq3Var2, i3);
                this.s = 1;
                Object P8 = yaa.P(wy5Var4, this);
                return P8 == lu3Var24 ? lu3Var24 : P8;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    Integer F = o3a.F(event.getTournament());
                    if (F == null) {
                        return null;
                    }
                    int intValue5 = F.intValue();
                    w3b w3bVar2 = dz5Var.n;
                    Context i39 = dz5Var.i();
                    this.s = 1;
                    Y = w3bVar2.Y(i39, intValue5, this);
                    if (Y == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    Y = obj;
                }
                return (OffersBannerResponse) Y;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i40 = this.s;
                if (i40 != 0) {
                    if (i40 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = dz5Var.n;
                int id13 = event.getTournament().getId();
                Season season2 = event.getSeason();
                season2.getClass();
                int id14 = season2.getId();
                rv8 rv8Var = rv8.b;
                this.s = 1;
                Object r5 = w3bVar3.r(id13, id14, this, U3.i.l);
                return r5 == lu3Var26 ? lu3Var26 : r5;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    s96 s96Var14 = dz5Var.i;
                    int id15 = event.getId();
                    this.s = 1;
                    s96Var14.getClass();
                    P4 = yaa.P(new a86(s96Var14, id15, null, 8), this);
                    if (P4 == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P4 = obj;
                }
                EventUmpiresResponse eventUmpiresResponse = (EventUmpiresResponse) yaa.x((x2g) P4);
                if (eventUmpiresResponse == null) {
                    return null;
                }
                List<EventUmpireItem> umpires = eventUmpiresResponse.getUmpires();
                ArrayList arrayList2 = new ArrayList();
                for (EventUmpireItem eventUmpireItem : umpires) {
                    BaseballRole assignment = eventUmpireItem.getAssignment();
                    switch (assignment == null ? -1 : q71.a[assignment.ordinal()]) {
                        case 1:
                            q9kVar = new q9k(R.string.baseball_umpire_home_plate);
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                                String firstName = eventUmpireItem.getUmpire().getFirstName();
                                if (firstName == null) {
                                    firstName = "";
                                }
                                String lastName = eventUmpireItem.getUmpire().getLastName();
                                fullName = lnb.o(firstName, " ", lastName != null ? lastName : "");
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        case 2:
                            q9kVar = new q9k(R.string.baseball_umpire_base_number, l6g.K(yid.p(1)));
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        case 3:
                            q9kVar = new q9k(R.string.baseball_umpire_base_number, l6g.K(yid.p(2)));
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        case 4:
                            q9kVar = new q9k(R.string.baseball_umpire_base_number, l6g.K(yid.p(3)));
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        case 5:
                            q9kVar = new q9k(R.string.baseball_umpire_left_field);
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        case 6:
                            q9kVar = new q9k(R.string.baseball_umpire_right_field);
                            fullName = eventUmpireItem.getUmpire().getFullName();
                            if (fullName == null) {
                            }
                            dn1Var = new dn1(q9kVar, fullName);
                            break;
                        default:
                            dn1Var = null;
                            break;
                    }
                    if (dn1Var != null) {
                        arrayList2.add(dn1Var);
                    }
                }
                return l6g.W(arrayList2);
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i42 = this.s;
                if (i42 != 0) {
                    if (i42 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var = dz5Var.q;
                int id16 = event.getId();
                this.s = 1;
                Object e = g39Var.e(id16, this);
                return e == lu3Var28 ? lu3Var28 : e;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i43 = this.s;
                if (i43 != 0) {
                    if (i43 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var15 = dz5Var.i;
                this.s = 1;
                Object l = s96Var15.l(event, this);
                return l == lu3Var29 ? lu3Var29 : l;
            default:
                lu3 lu3Var30 = lu3.a;
                int i44 = this.s;
                if (i44 != 0) {
                    if (i44 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar = dz5Var.k;
                int id17 = event.getId();
                this.s = 1;
                j0jVar.getClass();
                Object P9 = yaa.P(new azi(j0jVar, id17, null, 17), this);
                return P9 == lu3Var30 ? lu3Var30 : P9;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py5(Event event, dz5 dz5Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = event;
        this.t = dz5Var;
    }
}
