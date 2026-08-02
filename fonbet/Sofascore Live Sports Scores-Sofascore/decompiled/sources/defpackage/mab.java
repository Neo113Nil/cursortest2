package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FootballTopPlayersStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mab implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics.getClass();
                return basketballTopPlayersStatistics.getThreePointsPercentage();
            case 1:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem.getClass();
                return rei.s(basketballTopPlayersStatisticsItem.getThreePointsPercentage(), basketballTopPlayersStatisticsItem.getThreePointsMade(), basketballTopPlayersStatisticsItem.getAppearances());
            case 2:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics2 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics2.getClass();
                return basketballTopPlayersStatistics2.getThreePointsMade();
            case 3:
                BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem2 = (BasketballTopPlayersStatisticsItem) obj;
                basketballTopPlayersStatisticsItem2.getClass();
                return yid.j(basketballTopPlayersStatisticsItem2.getThreePointsMade());
            case 4:
                BasketballTopPlayersStatistics basketballTopPlayersStatistics3 = (BasketballTopPlayersStatistics) obj;
                basketballTopPlayersStatistics3.getClass();
                return basketballTopPlayersStatistics3.getDefensiveRebounds();
            case 5:
                FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics.getClass();
                return footballTopPlayersStatistics.getRating();
            case 6:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem.getClass();
                Integer penaltyGoals = footballTopPlayersStatisticsItem.getPenaltyGoals();
                int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                Integer penaltiesTaken = footballTopPlayersStatisticsItem.getPenaltiesTaken();
                return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
            case 7:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem2.getClass();
                return rei.b(2, footballTopPlayersStatisticsItem2.getRating());
            case 8:
                FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics2.getClass();
                return footballTopPlayersStatistics2.getFreeKickGoal();
            case 9:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem3.getClass();
                return rei.i(8, footballTopPlayersStatisticsItem3.getFreeKickGoal(), footballTopPlayersStatisticsItem3.getShotFromSetPiece(), false);
            case 10:
                FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics3.getClass();
                return footballTopPlayersStatistics3.getScoringFrequency();
            case 11:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem4.getClass();
                Double scoringFrequency = footballTopPlayersStatisticsItem4.getScoringFrequency();
                return yid.j(scoringFrequency != null ? Integer.valueOf(wzb.a(scoringFrequency.doubleValue())) : null);
            case 12:
                FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics4.getClass();
                return footballTopPlayersStatistics4.getTotalShots();
            case 13:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem5 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem5.getClass();
                return rei.m(footballTopPlayersStatisticsItem5.getTotalShots(), footballTopPlayersStatisticsItem5.getAppearances());
            case 14:
                FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics5.getClass();
                return footballTopPlayersStatistics5.getShotsOnTarget();
            case 15:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem6 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem6.getClass();
                return rei.m(footballTopPlayersStatisticsItem6.getShotsOnTarget(), footballTopPlayersStatisticsItem6.getAppearances());
            case 16:
                FootballTopPlayersStatistics footballTopPlayersStatistics6 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics6.getClass();
                return footballTopPlayersStatistics6.getGoalsAssistsSum();
            case 17:
                FootballTopPlayersStatistics footballTopPlayersStatistics7 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics7.getClass();
                return footballTopPlayersStatistics7.getBigChancesMissed();
            case 18:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem7 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem7.getClass();
                return yid.j(footballTopPlayersStatisticsItem7.getBigChancesMissed());
            case 19:
                FootballTopPlayersStatistics footballTopPlayersStatistics8 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics8.getClass();
                return footballTopPlayersStatistics8.getGoals();
            case 20:
                FootballTopPlayersStatistics footballTopPlayersStatistics9 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics9.getClass();
                return footballTopPlayersStatistics9.getBigChancesCreated();
            case 21:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem8 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem8.getClass();
                return yid.j(footballTopPlayersStatisticsItem8.getBigChancesCreated());
            case 22:
                FootballTopPlayersStatistics footballTopPlayersStatistics10 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics10.getClass();
                return footballTopPlayersStatistics10.getAccuratePasses();
            case 23:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem9 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem9.getClass();
                return rei.o(footballTopPlayersStatisticsItem9.getAccuratePasses(), footballTopPlayersStatisticsItem9.getAppearances(), footballTopPlayersStatisticsItem9.getAccuratePassesPercentage(), 0);
            case 24:
                FootballTopPlayersStatistics footballTopPlayersStatistics11 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics11.getClass();
                return footballTopPlayersStatistics11.getKeyPasses();
            case 25:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem10 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem10.getClass();
                return rei.m(footballTopPlayersStatisticsItem10.getKeyPasses(), footballTopPlayersStatisticsItem10.getAppearances());
            case 26:
                FootballTopPlayersStatistics footballTopPlayersStatistics12 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics12.getClass();
                return footballTopPlayersStatistics12.getAccurateLongBalls();
            case 27:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem11 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem11.getClass();
                return yid.j(footballTopPlayersStatisticsItem11.getGoalsAssistsSum());
            case 28:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem12 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem12.getClass();
                return rei.m(footballTopPlayersStatisticsItem12.getAccurateLongBalls(), footballTopPlayersStatisticsItem12.getAppearances());
            default:
                FootballTopPlayersStatistics footballTopPlayersStatistics13 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics13.getClass();
                return footballTopPlayersStatistics13.getSuccessfulDribbles();
        }
    }
}
