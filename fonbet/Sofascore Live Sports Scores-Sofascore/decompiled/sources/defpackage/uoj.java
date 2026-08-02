package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uoj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem.getClass();
                return rei.e(basketballTopTeamsStatisticsItem.getThreePointsPercentageAgainst(), 0, 6);
            case 1:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics.getClass();
                return basketballTopTeamsStatistics.getThreePointsMade();
            case 2:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem2.getClass();
                return String.valueOf(yid.m(basketballTopTeamsStatisticsItem2.getThreePointsMade()));
            case 3:
                FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics.getClass();
                return footballTopTeamsStatistics.getExpectedGoalsOnTarget();
            case 4:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem.getExpectedGoalsOnTarget());
            case 5:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem2.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem2.getAvgRating());
            case 6:
                FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics2.getClass();
                return footballTopTeamsStatistics2.getExpectedAssists();
            case 7:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem3.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem3.getExpectedAssists());
            case 8:
                FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics3.getClass();
                return footballTopTeamsStatistics3.getGoalsPrevented();
            case 9:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem4.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem4.getGoalsPrevented());
            case 10:
                FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics4.getClass();
                return footballTopTeamsStatistics4.getYellowCards();
            case 11:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem5.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem5.getYellowCards()));
            case 12:
                FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics5.getClass();
                return footballTopTeamsStatistics5.getRedCards();
            case 13:
                FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics6.getClass();
                return footballTopTeamsStatistics6.getAvgRating();
            case 14:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem6.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem6.getRedCards()));
            case 15:
                FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics7.getClass();
                return footballTopTeamsStatistics7.getAverageBallPossession();
            case 16:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem7.getClass();
                return rei.e(footballTopTeamsStatisticsItem7.getAverageBallPossession(), 1, 4);
            case 17:
                FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics8.getClass();
                return footballTopTeamsStatistics8.getGoalsScored();
            case 18:
                FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics9.getClass();
                return footballTopTeamsStatistics9.getAccuratePasses();
            case 19:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem8.getClass();
                return String.valueOf(wzb.a((footballTopTeamsStatisticsItem8.getAccuratePasses() != null ? r2.intValue() : 0) / footballTopTeamsStatisticsItem8.getMatches()));
            case 20:
                FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics10.getClass();
                return footballTopTeamsStatistics10.getAccurateLongBalls();
            case 21:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem9.getClass();
                return dmi.o(footballTopTeamsStatisticsItem9, footballTopTeamsStatisticsItem9.getAccurateLongBalls());
            case 22:
                FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics11.getClass();
                return footballTopTeamsStatistics11.getAccurateCrosses();
            case 23:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem10.getClass();
                return dmi.o(footballTopTeamsStatisticsItem10, footballTopTeamsStatisticsItem10.getAccurateCrosses());
            case 24:
                FootballTopTeamsStatistics footballTopTeamsStatistics12 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics12.getClass();
                return footballTopTeamsStatistics12.getBigChances();
            case 25:
                FootballTopTeamsStatistics footballTopTeamsStatistics13 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics13.getClass();
                return footballTopTeamsStatistics13.getShots();
            case 26:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem11.getClass();
                return dmi.o(footballTopTeamsStatisticsItem11, footballTopTeamsStatisticsItem11.getShots());
            case 27:
                FootballTopTeamsStatistics footballTopTeamsStatistics14 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics14.getClass();
                return footballTopTeamsStatistics14.getShotsOnTarget();
            case 28:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem12.getClass();
                return dmi.o(footballTopTeamsStatisticsItem12, footballTopTeamsStatisticsItem12.getShotsOnTarget());
            default:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem13 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem13.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem13.getGoalsScored()));
        }
    }
}
