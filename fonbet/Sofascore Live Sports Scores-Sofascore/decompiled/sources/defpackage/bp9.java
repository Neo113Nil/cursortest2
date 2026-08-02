package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bp9 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r7.intValue() <= defpackage.yid.m(r6.getStartYear())) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo, nk2 nk2Var, CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData) {
        int i;
        Team team;
        List<Team> previousTeams;
        playerSeasonStatisticsInfo.getClass();
        nk2Var.getClass();
        careerStatsFilterData.getClass();
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
        if (i > 0 && ((team = careerStatsFilterData.a) == null || team.equals(playerSeasonStatisticsInfo.getTeam()) || ((previousTeams = playerSeasonStatisticsInfo.getPreviousTeams()) != null && CollectionsKt.R(previousTeams, careerStatsFilterData.a)))) {
            Integer num = careerStatsFilterData.d;
            if (num != null) {
                Regex regex = yid.a;
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
}
