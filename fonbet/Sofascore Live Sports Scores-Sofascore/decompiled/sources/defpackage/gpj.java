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
public final /* synthetic */ class gpj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                TennisTopTeamsStatistics tennisTopTeamsStatistics = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics.getClass();
                return tennisTopTeamsStatistics.getFirstServePointsWonPercentage();
            case 1:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem.getClass();
                return rei.e(tennisTopTeamsStatisticsItem.getFirstServePointsWonPercentage(), 0, 6);
            case 2:
                TennisTopTeamsStatistics tennisTopTeamsStatistics2 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics2.getClass();
                return tennisTopTeamsStatistics2.getSecondServePercentage();
            case 3:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem2 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem2.getClass();
                return rei.e(tennisTopTeamsStatisticsItem2.getSecondServePercentage(), 0, 6);
            case 4:
                TennisTopTeamsStatistics tennisTopTeamsStatistics3 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics3.getClass();
                return tennisTopTeamsStatistics3.getSecondServePointsWonPercentage();
            case 5:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem3 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem3.getClass();
                return rei.e(tennisTopTeamsStatisticsItem3.getSecondServePointsWonPercentage(), 0, 6);
            case 6:
                TennisTopTeamsStatistics tennisTopTeamsStatistics4 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics4.getClass();
                return tennisTopTeamsStatistics4.getAvgAces();
            case 7:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem4 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem4.getClass();
                return String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{tennisTopTeamsStatisticsItem4.getAvgAces()}, 1));
            case 8:
                TennisTopTeamsStatistics tennisTopTeamsStatistics5 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics5.getClass();
                return tennisTopTeamsStatistics5.getAvgDoubleFaults();
            case 9:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem5 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem5.getClass();
                return String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{tennisTopTeamsStatisticsItem5.getAvgDoubleFaults()}, 1));
            case 10:
                TennisTopTeamsStatistics tennisTopTeamsStatistics6 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics6.getClass();
                return tennisTopTeamsStatistics6.getBreakPointsSavedPercentage();
            case 11:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem6 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem6.getClass();
                Integer opponentBreakPointsTotal = tennisTopTeamsStatisticsItem6.getOpponentBreakPointsTotal();
                Integer opponentBreakPointsScored = tennisTopTeamsStatisticsItem6.getOpponentBreakPointsScored();
                if (opponentBreakPointsTotal == null || opponentBreakPointsScored == null) {
                    return null;
                }
                int intValue = opponentBreakPointsScored.intValue();
                int intValue2 = opponentBreakPointsTotal.intValue();
                return rei.f(intValue2 - intValue, 1, Integer.valueOf(intValue2));
            case 12:
                TennisTopTeamsStatistics tennisTopTeamsStatistics7 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics7.getClass();
                return tennisTopTeamsStatistics7.getBreakPointsSavedConvertedPercentage();
            case 13:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem7 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem7.getClass();
                Integer breakPointsTotal = tennisTopTeamsStatisticsItem7.getBreakPointsTotal();
                Integer breakPointsScored = tennisTopTeamsStatisticsItem7.getBreakPointsScored();
                if (breakPointsTotal == null || breakPointsScored == null) {
                    return null;
                }
                return rei.f(breakPointsScored.intValue(), 1, Integer.valueOf(breakPointsTotal.intValue()));
            case 14:
                TennisTopTeamsStatistics tennisTopTeamsStatistics8 = (TennisTopTeamsStatistics) obj;
                tennisTopTeamsStatistics8.getClass();
                return tennisTopTeamsStatistics8.getTiebreakWinPercentage();
            case 15:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem8 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem8.getClass();
                Integer tiebreaksWon = tennisTopTeamsStatisticsItem8.getTiebreaksWon();
                Integer tiebreakLosses = tennisTopTeamsStatisticsItem8.getTiebreakLosses();
                if (tiebreaksWon == null || tiebreakLosses == null) {
                    return null;
                }
                int intValue3 = tiebreakLosses.intValue();
                int intValue4 = tiebreaksWon.intValue();
                return rei.f(intValue4, 1, Integer.valueOf(intValue3 + intValue4));
            case 16:
                TennisTopTeamsStatisticsItem tennisTopTeamsStatisticsItem9 = (TennisTopTeamsStatisticsItem) obj;
                tennisTopTeamsStatisticsItem9.getClass();
                return rei.e(tennisTopTeamsStatisticsItem9.getFirstServePercentage(), 0, 6);
            case 17:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics.getClass();
                return volleyballTopTeamsStatistics.getPointsTotal();
            case 18:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem.getAttacksBlocked());
            case 19:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem2 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem2.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem2.getPointsTotal());
            case 20:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics2 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics2.getClass();
                return volleyballTopTeamsStatistics2.getAces();
            case 21:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem3 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem3.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem3.getAces());
            case 22:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics3 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics3.getClass();
                return volleyballTopTeamsStatistics3.getServeEfficiency();
            case 23:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem4 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem4.getClass();
                Double serveEfficiency = volleyballTopTeamsStatisticsItem4.getServeEfficiency();
                return rei.e(serveEfficiency != null ? Double.valueOf(serveEfficiency.doubleValue() * 100.0d) : null, 2, 4);
            case 24:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics4 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics4.getClass();
                return volleyballTopTeamsStatistics4.getBlockPoints();
            case 25:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem5 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem5.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem5.getBlockPoints());
            case 26:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics5 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics5.getClass();
                return volleyballTopTeamsStatistics5.getAttackPoints();
            case 27:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem6 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem6.getClass();
                return yid.j(volleyballTopTeamsStatisticsItem6.getAttackPoints());
            case 28:
                VolleyballTopTeamsStatistics volleyballTopTeamsStatistics6 = (VolleyballTopTeamsStatistics) obj;
                volleyballTopTeamsStatistics6.getClass();
                return volleyballTopTeamsStatistics6.getAttacksEfficiency();
            default:
                VolleyballTopTeamsStatisticsItem volleyballTopTeamsStatisticsItem7 = (VolleyballTopTeamsStatisticsItem) obj;
                volleyballTopTeamsStatisticsItem7.getClass();
                Double attacksEfficiency = volleyballTopTeamsStatisticsItem7.getAttacksEfficiency();
                return rei.e(attacksEfficiency != null ? Double.valueOf(attacksEfficiency.doubleValue() * 100.0d) : null, 2, 4);
        }
    }
}
