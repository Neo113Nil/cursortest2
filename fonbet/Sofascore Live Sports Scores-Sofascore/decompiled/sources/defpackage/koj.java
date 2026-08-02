package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.UniqueTournamentConference;
import com.sofascore.model.newNetwork.UniqueTournamentDivisionsResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopStatsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopStatsPerGameStatistics;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0017\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lkoj;", "Lynb;", "Lynj;", "Lfnj;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class koj extends ynb {
    public final w3b l;
    public final j0j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koj(w3b w3bVar, j0j j0jVar, Application application) {
        super(application, tnb.a);
        w3bVar.getClass();
        j0jVar.getClass();
        this.l = w3bVar;
        this.m = j0jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.sofascore.results.league.fragment.topStats.TopStatsCategory] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static Pair E(gv9 gv9Var, qnj qnjVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = gv9Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TopStatsCategory topStatsCategory = (TopStatsCategory) it.next();
            boolean z = topStatsCategory instanceof TopPlayerCategoryUiModel;
            ?? r2 = topStatsCategory;
            if (z) {
                TopPlayerCategoryUiModel topPlayerCategoryUiModel = (TopPlayerCategoryUiModel) topStatsCategory;
                gv9 gv9Var2 = topPlayerCategoryUiModel.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : gv9Var2) {
                    if (((vnj) obj).a.g) {
                        arrayList2.add(obj);
                    }
                }
                r2 = TopPlayerCategoryUiModel.a(topPlayerCategoryUiModel, l6g.W(arrayList2), 29);
            }
            h3j h3jVar = r2.getB().isEmpty() ? null : r2;
            if (h3jVar != null) {
                arrayList.add(h3jVar);
            }
        }
        gv9 W = l6g.W(arrayList);
        if (qnjVar instanceof g3j) {
            g3j g3jVar = (g3j) qnjVar;
            c3j c3jVar = g3jVar.h;
            if ((c3jVar != null ? c3jVar.a : null) == h3j.a) {
                gv9Var = W;
            }
            qnjVar = g3j.d(g3jVar, null, null, null, z(gv9Var), null, 1791);
        }
        return new Pair(W, qnjVar);
    }

    public static gv9 z(gv9 gv9Var) {
        List H0;
        gv9 W;
        if (gv9Var != null) {
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                TopStatsCategory topStatsCategory = (TopStatsCategory) it.next();
                arrayList.add(new oxh(topStatsCategory.getA(), topStatsCategory.getA(), null, null, null, false, 252));
            }
            if (arrayList.size() <= 5) {
                arrayList = null;
            }
            if (arrayList != null && (H0 = CollectionsKt.H0(arrayList, new q6i(9))) != null && (W = l6g.W(H0)) != null) {
                return W;
            }
        }
        return rlh.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        if (r0 == r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(boj bojVar, Integer num, int i, int i2, String str, String str2, String str3, sq3 sq3Var) {
        goj gojVar;
        int i3;
        goj gojVar2;
        String str4;
        int i4;
        int i5;
        String str5;
        Object obj;
        TopPerformanceResponse topPerformanceResponse;
        if (sq3Var instanceof goj) {
            gojVar = (goj) sq3Var;
            int i6 = gojVar.x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gojVar.x = i6 - Integer.MIN_VALUE;
                Object obj2 = gojVar.v;
                lu3 lu3Var = lu3.a;
                i3 = gojVar.x;
                if (i3 != 0) {
                    y6a.M(obj2);
                    int ordinal = bojVar.ordinal();
                    if (ordinal == 0) {
                        gojVar2 = gojVar;
                        if (num != null) {
                            int intValue = num.intValue();
                            gojVar2.r = str;
                            str4 = str2;
                            gojVar2.s = str4;
                            gojVar2.t = i;
                            gojVar2.u = i2;
                            gojVar2.x = 2;
                            j0j j0jVar = this.m;
                            j0jVar.getClass();
                            Object P = yaa.P(new gzi(j0jVar, intValue, i, i2, str, null, 3), gojVar2);
                            if (P != lu3Var) {
                                i4 = i;
                                str5 = str;
                                obj = P;
                                i5 = i2;
                            }
                        } else {
                            str4 = str2;
                            i4 = i;
                            i5 = i2;
                            str5 = str;
                            gojVar2.r = null;
                            gojVar2.s = null;
                            gojVar2.t = i4;
                            gojVar2.u = i5;
                            gojVar2.x = 3;
                            goj gojVar3 = gojVar2;
                            obj2 = this.l.T(i4, i5, gojVar3, str5, str4);
                        }
                    } else if (ordinal == 1) {
                        gojVar.r = null;
                        gojVar.s = null;
                        gojVar.t = i;
                        gojVar.u = i2;
                        gojVar.x = 1;
                        Object U = this.l.U(i, i2, gojVar, str, str2);
                        if (U != lu3Var) {
                            return U;
                        }
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        w3b w3bVar = this.l;
                        if (str3 != null) {
                            gojVar.r = null;
                            gojVar.s = null;
                            gojVar.t = i;
                            gojVar.u = i2;
                            gojVar.x = 4;
                            Object W = w3bVar.W(i, i2, gojVar, str, str3);
                            if (W != lu3Var) {
                                return W;
                            }
                        } else {
                            gojVar.r = null;
                            gojVar.s = null;
                            gojVar.t = i;
                            gojVar.u = i2;
                            gojVar.x = 5;
                            Object V = w3bVar.V(i, i2, gojVar, str);
                            if (V != lu3Var) {
                                return V;
                            }
                        }
                    }
                    return lu3Var;
                }
                if (i3 == 1) {
                    y6a.M(obj2);
                    return obj2;
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        y6a.M(obj2);
                        return (TopPerformanceResponse) obj2;
                    }
                    if (i3 == 4) {
                        y6a.M(obj2);
                        return obj2;
                    }
                    if (i3 == 5) {
                        y6a.M(obj2);
                        return obj2;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = gojVar.u;
                i4 = gojVar.t;
                String str6 = gojVar.s;
                str5 = gojVar.r;
                y6a.M(obj2);
                str4 = str6;
                obj = obj2;
                i5 = i7;
                gojVar2 = gojVar;
                topPerformanceResponse = (TopPerformanceResponse) yaa.x((x2g) obj);
                if (topPerformanceResponse != null) {
                    return topPerformanceResponse;
                }
                gojVar2.r = null;
                gojVar2.s = null;
                gojVar2.t = i4;
                gojVar2.u = i5;
                gojVar2.x = 3;
                goj gojVar32 = gojVar2;
                obj2 = this.l.T(i4, i5, gojVar32, str5, str4);
            }
        }
        gojVar = new goj(this, sq3Var);
        Object obj22 = gojVar.v;
        lu3 lu3Var2 = lu3.a;
        i3 = gojVar.x;
        if (i3 != 0) {
        }
        topPerformanceResponse = (TopPerformanceResponse) yaa.x((x2g) obj);
        if (topPerformanceResponse != null) {
        }
        gojVar2.r = null;
        gojVar2.s = null;
        gojVar2.t = i4;
        gojVar2.u = i5;
        gojVar2.x = 3;
        goj gojVar322 = gojVar2;
        obj22 = this.l.T(i4, i5, gojVar322, str5, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(qnj qnjVar, rnj rnjVar, boj bojVar, sq3 sq3Var) {
        hoj hojVar;
        koj kojVar;
        int i;
        vue vueVar;
        gz3 gz3Var;
        qnj qnjVar2;
        vue vueVar2;
        wj1 wj1Var;
        boj bojVar2;
        TopPerformanceStatistics topPerformanceStatistics;
        Iterable W;
        rnj rnjVar2 = rnjVar;
        if (sq3Var instanceof hoj) {
            hojVar = (hoj) sq3Var;
            int i2 = hojVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hojVar.z = i2 - Integer.MIN_VALUE;
                kojVar = this;
                hoj hojVar2 = hojVar;
                Object obj = hojVar2.x;
                lu3 lu3Var = lu3.a;
                i = hojVar2.z;
                if (i != 0) {
                    y6a.M(obj);
                    lnj b = qnjVar.b();
                    knj knjVar = b instanceof knj ? (knj) b : null;
                    if (knjVar == null || (vueVar = knjVar.a) == null) {
                        pnj c = qnjVar.c();
                        onj onjVar = c instanceof onj ? (onj) c : null;
                        vueVar = onjVar != null ? onjVar.a : null;
                    }
                    pnj c2 = qnjVar.c();
                    nnj nnjVar = c2 instanceof nnj ? (nnj) c2 : null;
                    rp9 rp9Var = nnjVar != null ? nnjVar.a : null;
                    pnj c3 = qnjVar.c();
                    mnj mnjVar = c3 instanceof mnj ? (mnj) c3 : null;
                    wj1 wj1Var2 = mnjVar != null ? mnjVar.a : null;
                    lnj b2 = qnjVar.b();
                    jnj jnjVar = b2 instanceof jnj ? (jnj) b2 : null;
                    gz3Var = jnjVar != null ? jnjVar.a : null;
                    Integer num = rnjVar2.e;
                    int i3 = rnjVar2.a;
                    int i4 = rnjVar2.b;
                    String a = qnjVar.a();
                    if (a == null) {
                        a = "";
                    }
                    String g = vueVar != null ? vueVar.g() : null;
                    String str = rp9Var != null ? rp9Var.b : null;
                    hojVar2.r = qnjVar;
                    hojVar2.s = rnjVar2;
                    hojVar2.t = bojVar;
                    hojVar2.u = vueVar;
                    hojVar2.v = wj1Var2;
                    hojVar2.w = gz3Var;
                    hojVar2.z = 1;
                    Object A = kojVar.A(bojVar, num, i3, i4, a, g, str, hojVar2);
                    if (A == lu3Var) {
                        return lu3Var;
                    }
                    qnjVar2 = qnjVar;
                    vueVar2 = vueVar;
                    obj = A;
                    wj1Var = wj1Var2;
                    bojVar2 = bojVar;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gz3 gz3Var2 = hojVar2.w;
                    wj1 wj1Var3 = hojVar2.v;
                    vueVar2 = hojVar2.u;
                    bojVar2 = hojVar2.t;
                    rnj rnjVar3 = hojVar2.s;
                    qnjVar2 = hojVar2.r;
                    y6a.M(obj);
                    gz3Var = gz3Var2;
                    wj1Var = wj1Var3;
                    rnjVar2 = rnjVar3;
                }
                TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) obj;
                topPerformanceStatistics = topPerformanceResponse == null ? (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems() : null;
                if (topPerformanceStatistics != null) {
                    return rlh.b;
                }
                int ordinal = bojVar2.ordinal();
                if (ordinal == 0) {
                    W = l6g.W(zic.F(i(), topPerformanceStatistics, gz3Var, vueVar2 != null ? vueVar2.g() : null, rnjVar2.a == 132 && Intrinsics.c(qnjVar2.a(), Season.SubSeasonType.REGULAR_SEASON.getLabel()), wj1Var, null, rnjVar2.e == null, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE));
                } else if (ordinal == 1) {
                    Context i5 = i();
                    String g2 = vueVar2 != null ? vueVar2.g() : null;
                    boolean z = topPerformanceStatistics instanceof BaseballTopStatsStatistics;
                    xlj xljVar = xlj.a;
                    if (z) {
                        BaseballTopStatsStatistics baseballTopStatsStatistics = (BaseballTopStatsStatistics) topPerformanceStatistics;
                        xbb b3 = a.b();
                        int i6 = wj1Var == null ? -1 : vlj.a[wj1Var.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                xlj.a(b3, i5, R.string.baseball_hits, baseballTopStatsStatistics.getBattingHits(), null);
                                xlj.a(b3, i5, R.string.baseball_home_runs, baseballTopStatsStatistics.getBattingHomeRuns(), null);
                                xlj.a(b3, i5, R.string.baseball_runs, baseballTopStatsStatistics.getBattingRuns(), null);
                                xlj.a(b3, i5, R.string.baseball_runs_batted_in, baseballTopStatsStatistics.getBattingRbi(), null);
                                xlj.a(b3, i5, R.string.baseball_stolen_bases, baseballTopStatsStatistics.getBattingStolenBases(), null);
                            } else if (i6 == 2) {
                                xlj.a(b3, i5, R.string.baseball_innings_pitched, baseballTopStatsStatistics.getPitchingInningsPitched(), new chf(1, xljVar, xlj.class, "mapAsSingleDecimal", "mapAsSingleDecimal(Ljava/util/List;)Ljava/util/List;", 0, 27));
                                xlj.a(b3, i5, R.string.baseball_strikeouts, baseballTopStatsStatistics.getPitchingStrikeOuts(), null);
                            } else {
                                if (i6 != 3) {
                                    zzl.b();
                                    return null;
                                }
                                xlj.a(b3, i5, R.string.baseball_putouts, baseballTopStatsStatistics.getFieldingPutOuts(), null);
                                xlj.a(b3, i5, R.string.baseball_assists, baseballTopStatsStatistics.getFieldingAssists(), null);
                                xlj.a(b3, i5, R.string.baseball_errors, baseballTopStatsStatistics.getFieldingTotalErrors(), null);
                                xlj.a(b3, i5, R.string.baseball_total_chances, baseballTopStatsStatistics.getFieldingTotalChances(), null);
                                xlj.a(b3, i5, R.string.baseball_double_plays, baseballTopStatsStatistics.getFieldingDoublePlays(), null);
                            }
                        }
                        W = l6g.W(a.a(b3));
                    } else if (topPerformanceStatistics instanceof BasketballTopStatsPerGameStatistics) {
                        BasketballTopStatsPerGameStatistics basketballTopStatsPerGameStatistics = (BasketballTopStatsPerGameStatistics) topPerformanceStatistics;
                        xbb b4 = a.b();
                        xlj.a(b4, i5, R.string.sofascore_rating, basketballTopStatsPerGameStatistics.getRating(), null);
                        xlj.a(b4, i5, R.string.points_basketball, basketballTopStatsPerGameStatistics.getPoints(), null);
                        xlj.a(b4, i5, R.string.rebounds, basketballTopStatsPerGameStatistics.getRebounds(), null);
                        xlj.a(b4, i5, R.string.basketball_assists, basketballTopStatsPerGameStatistics.getAssists(), null);
                        xlj.a(b4, i5, R.string.three_pointers, basketballTopStatsPerGameStatistics.getThreePointsMade(), null);
                        xlj.a(b4, i5, R.string.defensive_rebounds, basketballTopStatsPerGameStatistics.getDefensiveRebounds(), null);
                        xlj.a(b4, i5, R.string.offensive_rebounds, basketballTopStatsPerGameStatistics.getOffensiveRebounds(), null);
                        xlj.a(b4, i5, R.string.steals, basketballTopStatsPerGameStatistics.getSteals(), null);
                        xlj.a(b4, i5, R.string.turnovers, basketballTopStatsPerGameStatistics.getTurnovers(), null);
                        xlj.a(b4, i5, R.string.blocks, basketballTopStatsPerGameStatistics.getBlocks(), null);
                        xlj.a(b4, i5, R.string.plus_minus, basketballTopStatsPerGameStatistics.getPlusMinus(), null);
                        xlj.a(b4, i5, R.string.performance_index_rating_long, basketballTopStatsPerGameStatistics.getPir(), null);
                        W = l6g.W(a.a(b4));
                    } else if (topPerformanceStatistics instanceof FootballTopStatsPerGameStatistics) {
                        FootballTopStatsPerGameStatistics footballTopStatsPerGameStatistics = (FootballTopStatsPerGameStatistics) topPerformanceStatistics;
                        xbb b5 = a.b();
                        xlj.a(b5, i5, R.string.sofascore_rating, footballTopStatsPerGameStatistics.getRating(), null);
                        xlj.a(b5, i5, R.string.goals, footballTopStatsPerGameStatistics.getGoals(), null);
                        int i7 = 0;
                        int i8 = 1;
                        Class<xlj> cls = xlj.class;
                        xlj.a(b5, i5, R.string.football_expected_goals, footballTopStatsPerGameStatistics.getExpectedGoals(), new chf(i8, xljVar, cls, "mapAsTwoDecimals", "mapAsTwoDecimals(Ljava/util/List;)Ljava/util/List;", i7, 28));
                        xlj.a(b5, i5, R.string.football_assists, footballTopStatsPerGameStatistics.getGoalAssist(), null);
                        xlj.a(b5, i5, R.string.football_expected_assists, footballTopStatsPerGameStatistics.getExpectedAssists(), new chf(i8, xljVar, cls, "mapAsTwoDecimals", "mapAsTwoDecimals(Ljava/util/List;)Ljava/util/List;", i7, 29));
                        xlj.a(b5, i5, R.string.football_running_distance_covered, footballTopStatsPerGameStatistics.getKilometersCovered(), new vt(i5, 18));
                        xlj.a(b5, i5, R.string.football_running_number_of_sprints, footballTopStatsPerGameStatistics.getNumberOfSprints(), null);
                        xlj.a(b5, i5, R.string.football_running_top_speed, footballTopStatsPerGameStatistics.getTopSpeed(), new vt(i5, 19));
                        xlj.a(b5, i5, R.string.errors_leading_to_goal, footballTopStatsPerGameStatistics.getErrorLeadToAGoal(), null);
                        xlj.a(b5, i5, R.string.football_big_chances_missed, footballTopStatsPerGameStatistics.getBigChanceMissed(), null);
                        xlj.a(b5, i5, R.string.football_big_chances_created, footballTopStatsPerGameStatistics.getBigChanceCreated(), null);
                        xlj.a(b5, i5, R.string.football_key_passes, footballTopStatsPerGameStatistics.getKeyPass(), null);
                        xlj.a(b5, i5, R.string.football_accurate_passes, footballTopStatsPerGameStatistics.getAccuratePass(), null);
                        xlj.a(b5, i5, R.string.football_total_passes, footballTopStatsPerGameStatistics.getTotalPass(), null);
                        xlj.a(b5, i5, R.string.football_successful_dribbles, footballTopStatsPerGameStatistics.getWonContest(), null);
                        xlj.a(b5, i5, R.string.football_tackles, footballTopStatsPerGameStatistics.getTotalTackle(), null);
                        xlj.a(b5, i5, R.string.football_clearances, footballTopStatsPerGameStatistics.getTotalClearance(), null);
                        xlj.a(b5, i5, R.string.football_saves, footballTopStatsPerGameStatistics.getSaves(), null);
                        xlj.a(b5, i5, R.string.football_goals_prevented, footballTopStatsPerGameStatistics.getGoalsPrevented(), new wlj(1, xljVar, cls, "mapAsTwoDecimals", "mapAsTwoDecimals(Ljava/util/List;)Ljava/util/List;", i7, 0));
                        xlj.a(b5, i5, R.string.football_penalties_saved, footballTopStatsPerGameStatistics.getPenaltySave(), null);
                        xlj.a(b5, i5, R.string.football_penalties_missed, footballTopStatsPerGameStatistics.getPenaltyMiss(), null);
                        W = l6g.W(a.a(b5));
                    } else if (topPerformanceStatistics instanceof HandballTopStatsPerGameStatistics) {
                        HandballTopStatsPerGameStatistics handballTopStatsPerGameStatistics = (HandballTopStatsPerGameStatistics) topPerformanceStatistics;
                        xbb b6 = a.b();
                        xlj.a(b6, i5, R.string.goals, handballTopStatsPerGameStatistics.getGoals(), null);
                        xlj.a(b6, i5, R.string.handball_assists, handballTopStatsPerGameStatistics.getAssists(), null);
                        xlj.a(b6, i5, R.string.m7_goals, handballTopStatsPerGameStatistics.getGoals7m(), null);
                        xlj.a(b6, i5, R.string.steals, handballTopStatsPerGameStatistics.getSteals(), null);
                        xlj.a(b6, i5, R.string.two_min_penalty, handballTopStatsPerGameStatistics.getTwoMinutePenalties(), null);
                        xlj.a(b6, i5, R.string.handball_saves, handballTopStatsPerGameStatistics.getSaves(), null);
                        xlj.a(b6, i5, R.string.save_percentage, handballTopStatsPerGameStatistics.getGoalkeeperEfficiencyPercentage(), new qaj(13));
                        xlj.a(b6, i5, R.string.m7_saves, handballTopStatsPerGameStatistics.getGk7mSaves(), null);
                        W = l6g.W(a.a(b6));
                    } else if (topPerformanceStatistics instanceof IceHockeyTopStatsPerGameStatistics) {
                        IceHockeyTopStatsPerGameStatistics iceHockeyTopStatsPerGameStatistics = (IceHockeyTopStatsPerGameStatistics) topPerformanceStatistics;
                        xbb b7 = a.b();
                        xlj.a(b7, i5, R.string.ice_hockey_saves, iceHockeyTopStatsPerGameStatistics.getSaves(), null);
                        xlj.a(b7, i5, R.string.even_saves, iceHockeyTopStatsPerGameStatistics.getEvenSaves(), null);
                        xlj.a(b7, i5, R.string.short_handed_saves, iceHockeyTopStatsPerGameStatistics.getShortHandedSaves(), null);
                        xlj.a(b7, i5, R.string.power_play_saves, iceHockeyTopStatsPerGameStatistics.getPowerPlaySaves(), null);
                        xbb a2 = a.a(b7);
                        xbb b8 = a.b();
                        yre[] yreVarArr = yre.c;
                        if (Intrinsics.c(g2, "goalie")) {
                            b8.addAll(a2);
                        }
                        xlj.a(b8, i5, R.string.points, iceHockeyTopStatsPerGameStatistics.getPoints(), null);
                        xlj.a(b8, i5, R.string.goals, iceHockeyTopStatsPerGameStatistics.getGoals(), null);
                        xlj.a(b8, i5, R.string.ice_hockey_assists, iceHockeyTopStatsPerGameStatistics.getAssists(), null);
                        xlj.a(b8, i5, R.string.hockey_powerplay_goals, iceHockeyTopStatsPerGameStatistics.getPowerPlayGoals(), null);
                        xlj.a(b8, i5, R.string.hockey_shorthanded_goals, iceHockeyTopStatsPerGameStatistics.getShortHandedGoals(), null);
                        xlj.a(b8, i5, R.string.hockey_powerplay_assists, iceHockeyTopStatsPerGameStatistics.getPowerPlayAssists(), null);
                        xlj.a(b8, i5, R.string.hockey_shorthanded_assists, iceHockeyTopStatsPerGameStatistics.getShortHandedAssists(), null);
                        xlj.a(b8, i5, R.string.plus_minus, iceHockeyTopStatsPerGameStatistics.getPlusMinus(), null);
                        xlj.a(b8, i5, R.string.time_on_ice, iceHockeyTopStatsPerGameStatistics.getSecondsPlayed(), new qaj(14));
                        xlj.a(b8, i5, R.string.blocks, iceHockeyTopStatsPerGameStatistics.getBlocked(), null);
                        xlj.a(b8, i5, R.string.hits, iceHockeyTopStatsPerGameStatistics.getHits(), null);
                        xlj.a(b8, i5, R.string.hockey_penalty_minutes, iceHockeyTopStatsPerGameStatistics.getPenaltyMinutes(), null);
                        if (!Intrinsics.c(g2, "goalie")) {
                            b8.addAll(a2);
                        }
                        W = l6g.W(a.a(b8));
                    } else if (topPerformanceStatistics instanceof VolleyballTopStatsPerGameStatistics) {
                        VolleyballTopStatsPerGameStatistics volleyballTopStatsPerGameStatistics = (VolleyballTopStatsPerGameStatistics) topPerformanceStatistics;
                        xbb b9 = a.b();
                        xlj.a(b9, i5, R.string.volleyball_points, volleyballTopStatsPerGameStatistics.getPointsTotal(), null);
                        xlj.a(b9, i5, R.string.volleyball_aces, volleyballTopStatsPerGameStatistics.getAces(), null);
                        xlj.a(b9, i5, R.string.volleyball_block_points, volleyballTopStatsPerGameStatistics.getBlockPoints(), null);
                        xlj.a(b9, i5, R.string.volleyball_attack_points, volleyballTopStatsPerGameStatistics.getAttackPoints(), null);
                        W = l6g.W(a.a(b9));
                    } else {
                        W = rlh.b;
                    }
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    W = w1a.x(i(), topPerformanceStatistics, null);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : W) {
                    if (!((TopStatsCategory) obj2).getB().isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                return l6g.W(arrayList);
            }
        }
        kojVar = this;
        hojVar = new hoj(kojVar, sq3Var);
        hoj hojVar22 = hojVar;
        Object obj3 = hojVar22.x;
        lu3 lu3Var2 = lu3.a;
        i = hojVar22.z;
        if (i != 0) {
        }
        TopPerformanceResponse topPerformanceResponse2 = (TopPerformanceResponse) obj3;
        if (topPerformanceResponse2 == null) {
        }
        if (topPerformanceStatistics != null) {
        }
    }

    public final void C(rnj rnjVar, List list, boj bojVar) {
        list.getClass();
        if (bojVar == null && (bojVar = (boj) CollectionsKt.firstOrNull(list)) == null) {
            bojVar = boj.PLAYERS;
        }
        xw3.L(un0.z(this), null, null, new ajj(this, list, rnjVar, bojVar, null, 2), 3);
    }

    public final void D(fnj fnjVar) {
        xw3.L(un0.z(this), null, null, new ioj(this, fnjVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[LOOP:0: B:38:0x009c->B:40:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(String str, sq3 sq3Var) {
        joj jojVar;
        int i;
        boolean z;
        qnj d;
        UniqueTournamentSpinnerData uniqueTournament;
        qnj qnjVar;
        if (sq3Var instanceof joj) {
            jojVar = (joj) sq3Var;
            int i2 = jojVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jojVar.u = i2 - Integer.MIN_VALUE;
                Object obj = jojVar.s;
                Object obj2 = lu3.a;
                i = jojVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    ynj ynjVar = (ynj) l().a();
                    if (ynjVar == null) {
                        return Unit.a;
                    }
                    qnj qnjVar2 = ynjVar.f;
                    if (qnjVar2 instanceof uza) {
                        d = uza.d((uza) qnjVar2, null, null, null, null, str, 63);
                    } else {
                        if (!(qnjVar2 instanceof g3j)) {
                            zzl.b();
                            return null;
                        }
                        g3j g3jVar = (g3j) qnjVar2;
                        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = g3jVar.f;
                        if (uniqueTournamentSeasonsSpinnerData != null && (uniqueTournament = uniqueTournamentSeasonsSpinnerData.getUniqueTournament()) != null && uniqueTournament.getId() == 132) {
                            if (Intrinsics.c(str, Season.SubSeasonType.REGULAR_SEASON.getLabel())) {
                                z = true;
                                kp5<h3j> kp5Var = h3j.c;
                                ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                                for (h3j h3jVar : kp5Var) {
                                    arrayList.add(new oxh(new c3j(h3jVar, z), h3jVar.a(i(), z), null, null, null, false, 252));
                                }
                                d = g3j.d(g3jVar, str, l6g.W(arrayList), null, null, null, 1981);
                            }
                        }
                        z = false;
                        kp5<h3j> kp5Var2 = h3j.c;
                        ArrayList arrayList2 = new ArrayList(k13.r(kp5Var2, 10));
                        while (r9.hasNext()) {
                        }
                        d = g3j.d(g3jVar, str, l6g.W(arrayList2), null, null, null, 1981);
                    }
                    n(null, new qdj(d, 2));
                    rnj rnjVar = ynjVar.d;
                    boj bojVar = ynjVar.c;
                    jojVar.r = d;
                    jojVar.u = 1;
                    obj = B(d, rnjVar, bojVar, jojVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    qnjVar = d;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qnjVar = jojVar.r;
                    y6a.M(obj);
                }
                gv9 gv9Var = (gv9) obj;
                Pair E = E(gv9Var, qnjVar);
                n(null, new coj(gv9Var, (gv9) E.a, (qnj) E.b, 0));
                return Unit.a;
            }
        }
        jojVar = new joj(this, sq3Var);
        Object obj3 = jojVar.s;
        Object obj22 = lu3.a;
        i = jojVar.u;
        if (i != 0) {
        }
        gv9 gv9Var2 = (gv9) obj3;
        Pair E2 = E(gv9Var2, qnjVar);
        n(null, new coj(gv9Var2, (gv9) E2.a, (qnj) E2.b, 0));
        return Unit.a;
    }

    public void G(int i, int i2, Integer num, String str) {
        str.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [km5] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    public final gv9 t(String str, boj bojVar) {
        ?? r12;
        if (Intrinsics.c(str, Sports.FOOTBALL) && bojVar != boj.TEAMS) {
            kp5<nre> kp5Var = nre.d;
            r12 = new ArrayList(k13.r(kp5Var, 10));
            for (nre nreVar : kp5Var) {
                r12.add(new vt2(new knj(nreVar), nreVar.a(i(), null), false, null, null, null, null, 252));
            }
        } else if (Intrinsics.c(str, Sports.CRICKET) && bojVar == boj.PLAYERS) {
            kp5<gz3> kp5Var2 = gz3.d;
            r12 = new ArrayList(k13.r(kp5Var2, 10));
            for (gz3 gz3Var : kp5Var2) {
                jnj jnjVar = new jnj(gz3Var);
                String string = i().getString(gz3Var.a);
                string.getClass();
                r12.add(new vt2(jnjVar, string, false, new tc3(1626525347, new g31(gz3Var, 12), true), null, null, null, 244));
            }
        } else {
            r12 = km5.a;
        }
        return l6g.W(r12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [km5] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public final gv9 u(gv9 gv9Var, gv9 gv9Var2, String str) {
        ?? r8;
        if (!gv9Var.isEmpty()) {
            r8 = new ArrayList(k13.r(gv9Var, 10));
            Iterator it = gv9Var.iterator();
            while (it.hasNext()) {
                oxh oxhVar = (oxh) it.next();
                r8.add(new oxh(new onj((vue) oxhVar.a), oxhVar.b, null, null, null, false, 252));
            }
        } else if (gv9Var2 != null && !gv9Var2.isEmpty()) {
            r8 = new ArrayList(k13.r(gv9Var2, 10));
            Iterator it2 = gv9Var2.iterator();
            while (it2.hasNext()) {
                oxh oxhVar2 = (oxh) it2.next();
                r8.add(new oxh(new nnj((rp9) oxhVar2.a), oxhVar2.b, oxhVar2.c, null, null, false, 248));
            }
        } else if (Intrinsics.c(str, Sports.BASEBALL)) {
            kp5<wj1> kp5Var = wj1.f;
            ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
            for (wj1 wj1Var : kp5Var) {
                arrayList.add(new oxh(new mnj(wj1Var), i().getString(wj1Var.a), null, null, null, false, 252));
            }
            r8 = arrayList;
        } else {
            r8 = km5.a;
        }
        return l6g.W(r8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115 A[LOOP:3: B:54:0x010c->B:56:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, int i2, sq3 sq3Var, String str) {
        doj dojVar;
        int i3;
        String str2;
        Object u0;
        UniqueTournamentDivisionsResponse uniqueTournamentDivisionsResponse;
        List<UniqueTournamentConference> list;
        ArrayList arrayList;
        ListIterator listIterator;
        hc9 hc9Var;
        int i4 = i;
        if (sq3Var instanceof doj) {
            dojVar = (doj) sq3Var;
            int i5 = dojVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dojVar.v = i5 - Integer.MIN_VALUE;
                Object obj = dojVar.t;
                lu3 lu3Var = lu3.a;
                i3 = dojVar.v;
                if (i3 != 0) {
                    y6a.M(obj);
                    str2 = str;
                    dojVar.s = str2;
                    dojVar.r = i4;
                    dojVar.v = 1;
                    u0 = this.l.u0(i4, i2, dojVar);
                    if (u0 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = dojVar.r;
                    String str3 = dojVar.s;
                    y6a.M(obj);
                    u0 = obj;
                    str2 = str3;
                }
                uniqueTournamentDivisionsResponse = (UniqueTournamentDivisionsResponse) u0;
                if (uniqueTournamentDivisionsResponse != null || (list = uniqueTournamentDivisionsResponse.getConferences()) == null) {
                    list = km5.a;
                }
                xbb b = a.b();
                if (!list.isEmpty()) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    b.add(new rp9(str2, null));
                    ArrayList arrayList2 = new ArrayList();
                    for (UniqueTournamentConference uniqueTournamentConference : list) {
                        String W = ml4.W(i(), uniqueTournamentConference.getConference());
                        rp9 rp9Var = W != null ? new rp9(W, uniqueTournamentConference.getConference()) : null;
                        if (rp9Var != null) {
                            arrayList2.add(rp9Var);
                        }
                    }
                    b.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        List<String> divisions = ((UniqueTournamentConference) it.next()).getDivisions();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : divisions) {
                            String W2 = ml4.W(i(), str4);
                            rp9 rp9Var2 = W2 != null ? new rp9(W2, str4) : null;
                            if (rp9Var2 != null) {
                                arrayList4.add(rp9Var2);
                            }
                        }
                        o13.v(arrayList4, arrayList3);
                    }
                    b.addAll(arrayList3);
                }
                xbb a = a.a(b);
                arrayList = new ArrayList(k13.r(a, 10));
                listIterator = a.listIterator(0);
                while (true) {
                    hc9Var = (hc9) listIterator;
                    if (hc9Var.hasNext()) {
                        return l6g.W(arrayList);
                    }
                    rp9 rp9Var3 = (rp9) hc9Var.next();
                    arrayList.add(new oxh(rp9Var3, rp9Var3.a, new tc3(1031376768, new h66(i4, 7), true), null, null, false, 248));
                }
            }
        }
        dojVar = new doj(this, sq3Var);
        Object obj2 = dojVar.t;
        lu3 lu3Var2 = lu3.a;
        i3 = dojVar.v;
        if (i3 != 0) {
        }
        uniqueTournamentDivisionsResponse = (UniqueTournamentDivisionsResponse) u0;
        if (uniqueTournamentDivisionsResponse != null) {
        }
        list = km5.a;
        xbb b2 = a.b();
        if (!list.isEmpty()) {
        }
        xbb a2 = a.a(b2);
        arrayList = new ArrayList(k13.r(a2, 10));
        listIterator = a2.listIterator(0);
        while (true) {
            hc9Var = (hc9) listIterator;
            if (hc9Var.hasNext()) {
            }
            rp9 rp9Var32 = (rp9) hc9Var.next();
            arrayList.add(new oxh(rp9Var32, rp9Var32.a, new tc3(1031376768, new h66(i4, 7), true), null, null, false, 248));
        }
    }

    public Object x(List list, rnj rnjVar, boj bojVar, ajj ajjVar) {
        return s9a.r(new d40(rnjVar, bojVar, this, list, null), ajjVar);
    }

    public final gv9 y(String str, boj bojVar) {
        if (!Intrinsics.c(str, Sports.ICE_HOCKEY) || bojVar == boj.TEAMS) {
            return rlh.b;
        }
        kp5<yre> kp5Var = yre.d;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        for (yre yreVar : kp5Var) {
            Context i = i();
            yreVar.getClass();
            String string = i.getString(yreVar.b);
            string.getClass();
            arrayList.add(new oxh(yreVar, string, null, null, null, false, 252));
        }
        return l6g.W(arrayList);
    }

    public void v(c3j c3jVar) {
    }
}
