package defpackage;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mk2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f7, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0201, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020b, code lost:
    
        if (r10.equals("CB") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_SAFETY) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x020f, code lost:
    
        r9 = kotlin.collections.b.j(defpackage.qt.f, defpackage.qt.c, defpackage.qt.e, defpackage.qt.d, defpackage.qt.g, defpackage.qt.h, defpackage.qt.i, defpackage.qt.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f3, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        r9 = kotlin.collections.b.j(defpackage.qt.d, defpackage.qt.e, defpackage.qt.c, defpackage.qt.f, defpackage.qt.g, defpackage.qt.h, defpackage.qt.i, defpackage.qt.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011b, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_TIGHT_END) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014d, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
    
        if (r10.equals("RB") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
    
        r9 = kotlin.collections.b.j(defpackage.qt.e, defpackage.qt.d, defpackage.qt.c, defpackage.qt.f, defpackage.qt.g, defpackage.qt.h, defpackage.qt.i, defpackage.qt.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0193, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        if (r10.equals("LB") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b1, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FULLBACK) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e3, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        if (r10.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN) == false) goto L106;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(String str, String str2, PlayerCareerStatistics playerCareerStatistics, CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData) {
        List j;
        playerCareerStatistics.getClass();
        careerStatsFilterData.getClass();
        switch (str.hashCode()) {
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    lp9.b.getClass();
                    List j2 = Intrinsics.c(str2, "G") ? b.j(lp9.h, lp9.i, lp9.k, lp9.j) : b.j(lp9.c, lp9.d, lp9.e, lp9.f, lp9.g);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : j2) {
                        lp9 lp9Var = (lp9) obj;
                        List seasons = playerCareerStatistics.getSeasons();
                        if (seasons == null || !seasons.isEmpty()) {
                            Iterator it = seasons.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) it.next();
                                    bp9 bp9Var = lp9.b;
                                    playerSeasonStatisticsInfo.getClass();
                                    bp9Var.getClass();
                                    if (bp9.a(playerSeasonStatisticsInfo, lp9Var, careerStatsFilterData)) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                        }
                    }
                    return arrayList;
                }
                break;
            case -1721090992:
                if (str.equals(Sports.BASEBALL)) {
                    c9h c9hVar = new c9h();
                    List seasons2 = playerCareerStatistics.getSeasons();
                    if (seasons2 == null || !seasons2.isEmpty()) {
                        Iterator it2 = seasons2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (yid.m(d81.a((PlayerSeasonStatisticsInfo) it2.next()).getPitchingGamesPlayed()) > 0) {
                                    c9hVar.add(wj1.c);
                                }
                            }
                        }
                    }
                    List seasons3 = playerCareerStatistics.getSeasons();
                    if (seasons3 == null || !seasons3.isEmpty()) {
                        Iterator it3 = seasons3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (yid.m(d81.a((PlayerSeasonStatisticsInfo) it3.next()).getBattingGamesPlayed()) > 0) {
                                    c9hVar.add(wj1.b);
                                }
                            }
                        }
                    }
                    List seasons4 = playerCareerStatistics.getSeasons();
                    if (seasons4 == null || !seasons4.isEmpty()) {
                        Iterator it4 = seasons4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (yid.m(d81.a((PlayerSeasonStatisticsInfo) it4.next()).getFieldingGamesPlayed()) > 0) {
                                    c9hVar.add(wj1.d);
                                }
                            }
                        }
                    }
                    c9h a = w9h.a(c9hVar);
                    kp5 kp5Var = vj1.w;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : kp5Var) {
                        if (a.a.containsKey(((vj1) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(new e81((vj1) it5.next()));
                    }
                    return arrayList3;
                }
                break;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    qt.b.getClass();
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                                if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_KICKER)) {
                                    j = b.j(qt.h, qt.g, qt.c, qt.e, qt.d, qt.f, qt.i, qt.j);
                                    break;
                                }
                                break;
                            case 80:
                                if (str2.equals("P")) {
                                    j = b.j(qt.g, qt.h, qt.c, qt.e, qt.d, qt.f, qt.i, qt.j);
                                    break;
                                }
                                break;
                            case 2143:
                                break;
                            case 2174:
                                break;
                            case 2177:
                                break;
                            case 2184:
                                break;
                            case 2192:
                                break;
                            case 2236:
                                break;
                            case 2253:
                                break;
                            case 2422:
                                break;
                            case 2502:
                                break;
                            case 2577:
                                if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)) {
                                    j = b.j(qt.c, qt.e, qt.d, qt.f, qt.g, qt.h, qt.i, qt.j);
                                    break;
                                }
                                break;
                            case 2608:
                                break;
                            case 2656:
                                break;
                            case 2673:
                                break;
                            case 2779:
                                break;
                            case 72575:
                                break;
                            case 76419:
                                break;
                            case 78341:
                                break;
                            case 81848:
                                break;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : j) {
                            qt qtVar = (qt) obj3;
                            List seasons5 = playerCareerStatistics.getSeasons();
                            if (seasons5 == null || !seasons5.isEmpty()) {
                                Iterator it6 = seasons5.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo2 = (PlayerSeasonStatisticsInfo) it6.next();
                                        gt gtVar = qt.b;
                                        playerSeasonStatisticsInfo2.getClass();
                                        gtVar.getClass();
                                        if (gt.a(playerSeasonStatisticsInfo2, qtVar, careerStatsFilterData)) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                }
                            }
                        }
                        return arrayList4;
                    }
                    j = b.j(qt.c, qt.e, qt.d, qt.f, qt.g, qt.h, qt.i, qt.j);
                    ArrayList arrayList42 = new ArrayList();
                    while (r9.hasNext()) {
                    }
                    return arrayList42;
                }
                break;
            case 394668909:
                if (str.equals(Sports.FOOTBALL)) {
                    hj8.b.getClass();
                    List j3 = Intrinsics.c(str2, "G") ? b.j(hj8.d, hj8.j, hj8.g, hj8.h, hj8.k, hj8.l) : b.j(hj8.c, hj8.e, hj8.f, hj8.g, hj8.h, hj8.i);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : j3) {
                        hj8 hj8Var = (hj8) obj4;
                        List seasons6 = playerCareerStatistics.getSeasons();
                        if (seasons6 == null || !seasons6.isEmpty()) {
                            Iterator it7 = seasons6.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo3 = (PlayerSeasonStatisticsInfo) it7.next();
                                    zi8 zi8Var = hj8.b;
                                    playerSeasonStatisticsInfo3.getClass();
                                    zi8Var.getClass();
                                    if (zi8.a(playerSeasonStatisticsInfo3, hj8Var, careerStatsFilterData)) {
                                        arrayList5.add(obj4);
                                    }
                                }
                            }
                        }
                    }
                    return arrayList5;
                }
                break;
            case 727149765:
                if (str.equals(Sports.BASKETBALL)) {
                    er1.a.getClass();
                    return a.c(er1.b);
                }
                break;
        }
        s38.a().c(new IllegalArgumentException("Requested available career stats categories for ".concat(str)));
        return km5.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r6.intValue() <= defpackage.yid.m(r7.getStartYear())) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        if (r6.equals(com.sofascore.model.Sports.BASEBALL) == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo, nk2 nk2Var, CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData) {
        int i;
        Team team;
        List<Team> previousTeams;
        playerSeasonStatisticsInfo.getClass();
        careerStatsFilterData.getClass();
        switch (str.hashCode()) {
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    lp9.b.getClass();
                    return bp9.a(playerSeasonStatisticsInfo, nk2Var, careerStatsFilterData);
                }
                s38.a().c(new IllegalArgumentException("Career stats isSeasonRowVisible for ".concat(str)));
                return true;
            case -1721090992:
                break;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    qt.b.getClass();
                    return gt.a(playerSeasonStatisticsInfo, nk2Var, careerStatsFilterData);
                }
                s38.a().c(new IllegalArgumentException("Career stats isSeasonRowVisible for ".concat(str)));
                return true;
            case 394668909:
                if (str.equals(Sports.FOOTBALL)) {
                    hj8.b.getClass();
                    return zi8.a(playerSeasonStatisticsInfo, nk2Var, careerStatsFilterData);
                }
                s38.a().c(new IllegalArgumentException("Career stats isSeasonRowVisible for ".concat(str)));
                return true;
            case 727149765:
                if (str.equals(Sports.BASKETBALL)) {
                    er1.a.getClass();
                    List g = nk2Var.g();
                    if (g == null || !g.isEmpty()) {
                        Iterator it = g.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((Number) ((lk2) it.next()).g().invoke(playerSeasonStatisticsInfo.getStatistics())).doubleValue() != 0.0d && (i = i + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1 && ((team = careerStatsFilterData.a) == null || team.equals(playerSeasonStatisticsInfo.getTeam()) || ((previousTeams = playerSeasonStatisticsInfo.getPreviousTeams()) != null && CollectionsKt.R(previousTeams, careerStatsFilterData.a)))) {
                        Integer num = careerStatsFilterData.d;
                        if (num != null) {
                            Regex regex = yid.a;
                            break;
                        }
                        Integer num2 = careerStatsFilterData.e;
                        if (num2 != null) {
                            Regex regex2 = yid.a;
                            if (num2.intValue() >= yid.m(playerSeasonStatisticsInfo.getEndYear())) {
                            }
                        }
                        return true;
                    }
                    return false;
                }
                s38.a().c(new IllegalArgumentException("Career stats isSeasonRowVisible for ".concat(str)));
                return true;
            default:
                s38.a().c(new IllegalArgumentException("Career stats isSeasonRowVisible for ".concat(str)));
                return true;
        }
    }
}
