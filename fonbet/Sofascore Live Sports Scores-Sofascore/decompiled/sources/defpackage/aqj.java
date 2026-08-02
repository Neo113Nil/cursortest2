package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TennisTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.VolleyballTopTeamsStatisticsItem;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class aqj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ aqj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r6 = null;
        Integer num = null;
        switch (this.a) {
            case 0:
                TennisTopTeamsStatistics tennisTopTeamsStatistics = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics.getClass();
                return tennisTopTeamsStatistics.getAvgDoubleFaults();
            case 1:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem.getClass();
                return String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{tennisTopTeamsStatisticsItem.getAvgDoubleFaults()}, 1));
            case 2:
                TennisTopTeamsStatistics tennisTopTeamsStatistics2 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics2.getClass();
                return tennisTopTeamsStatistics2.getBreakPointsSavedPercentage();
            case 3:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem2 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem2.getClass();
                Integer opponentBreakPointsTotal = tennisTopTeamsStatisticsItem2.getOpponentBreakPointsTotal();
                Integer opponentBreakPointsScored = tennisTopTeamsStatisticsItem2.getOpponentBreakPointsScored();
                if (opponentBreakPointsTotal == null || opponentBreakPointsScored == null) {
                    return null;
                }
                int intValue = opponentBreakPointsScored.intValue();
                int intValue2 = opponentBreakPointsTotal.intValue();
                return rei.f(intValue2 - intValue, 1, Integer.valueOf(intValue2));
            case 4:
                TennisTopTeamsStatistics tennisTopTeamsStatistics3 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics3.getClass();
                return tennisTopTeamsStatistics3.getBreakPointsSavedConvertedPercentage();
            case 5:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem3 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem3.getClass();
                Integer breakPointsTotal = tennisTopTeamsStatisticsItem3.getBreakPointsTotal();
                Integer breakPointsScored = tennisTopTeamsStatisticsItem3.getBreakPointsScored();
                if (breakPointsTotal == null || breakPointsScored == null) {
                    return null;
                }
                return rei.f(breakPointsScored.intValue(), 1, Integer.valueOf(breakPointsTotal.intValue()));
            case 6:
                TennisTopTeamsStatistics tennisTopTeamsStatistics4 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics4.getClass();
                return tennisTopTeamsStatistics4.getTiebreakWinPercentage();
            case 7:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem4 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem4.getClass();
                Integer tiebreaksWon = tennisTopTeamsStatisticsItem4.getTiebreaksWon();
                Integer tiebreakLosses = tennisTopTeamsStatisticsItem4.getTiebreakLosses();
                if (tiebreaksWon == null || tiebreakLosses == null) {
                    return null;
                }
                int intValue3 = tiebreakLosses.intValue();
                int intValue4 = tiebreaksWon.intValue();
                return rei.f(intValue4, 1, Integer.valueOf(intValue3 + intValue4));
            case 8:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem5 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem5.getClass();
                return rei.e(tennisTopTeamsStatisticsItem5.getFirstServePercentage(), 0, 6);
            case 9:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics.getClass();
                return volleyballTopTeamsStatistics.getPointsTotal();
            case 10:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem.getAttacksBlocked());
            case 11:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem2 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem2.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem2.getPointsTotal());
            case 12:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics2 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics2.getClass();
                return volleyballTopTeamsStatistics2.getAces();
            case 13:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem3 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem3.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem3.getAces());
            case 14:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics3 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics3.getClass();
                return volleyballTopTeamsStatistics3.getServeEfficiency();
            case 15:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem4 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem4.getClass();
                Double serveEfficiency = volleyballTopTeamsStatisticsItem4.getServeEfficiency();
                return rei.e(serveEfficiency != null ? Double.valueOf(serveEfficiency.doubleValue() * 100.0d) : null, 2, 4);
            case 16:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics4 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics4.getClass();
                return volleyballTopTeamsStatistics4.getBlockPoints();
            case 17:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem5 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem5.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem5.getBlockPoints());
            case 18:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics5 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics5.getClass();
                return volleyballTopTeamsStatistics5.getAttackPoints();
            case 19:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem6 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem6.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem6.getAttackPoints());
            case 20:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics6 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics6.getClass();
                return volleyballTopTeamsStatistics6.getAttacksEfficiency();
            case 21:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem7 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem7.getClass();
                Double attacksEfficiency = volleyballTopTeamsStatisticsItem7.getAttacksEfficiency();
                return rei.e(attacksEfficiency != null ? Double.valueOf(attacksEfficiency.doubleValue() * 100.0d) : null, 2, 4);
            case 22:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics7 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics7.getClass();
                return volleyballTopTeamsStatistics7.getAttackErrors();
            case 23:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem8 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem8.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem8.getAttackErrors());
            case 24:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics8 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics8.getClass();
                return volleyballTopTeamsStatistics8.getServeErrors();
            case 25:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem9 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem9.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem9.getServeErrors());
            case 26:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics9 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics9.getClass();
                return volleyballTopTeamsStatistics9.getReceptionErrors();
            case 27:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem10 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem10.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem10.getReceptionErrors());
            case 28:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics10 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics10.getClass();
                return volleyballTopTeamsStatistics10.getAttacksBlocked();
            default:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT MAX(orderIndex) FROM pinned_tournaments_table");
                try {
                    if (V0.U0() && !V0.isNull(0)) {
                        num = Integer.valueOf((int) V0.getLong(0));
                    }
                    return num;
                } finally {
                    V0.close();
                }
        }
    }
}
