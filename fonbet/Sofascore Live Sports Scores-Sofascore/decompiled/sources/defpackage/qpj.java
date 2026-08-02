package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qpj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem.getClass();
                return dmi.o(footballTopTeamsStatisticsItem, footballTopTeamsStatisticsItem.getCorners());
            case 1:
                FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics.getClass();
                return footballTopTeamsStatistics.getGoalsConceded();
            case 2:
                FootballTopTeamsStatistics footballTopTeamsStatistics2 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics2.getClass();
                return footballTopTeamsStatistics2.getFouls();
            case 3:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem2.getClass();
                return dmi.o(footballTopTeamsStatisticsItem2, footballTopTeamsStatisticsItem2.getFouls());
            case 4:
                FootballTopTeamsStatistics footballTopTeamsStatistics3 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics3.getClass();
                return footballTopTeamsStatistics3.getPenaltyGoals();
            case 5:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem3 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem3.getClass();
                Integer penaltyGoals = footballTopTeamsStatisticsItem3.getPenaltyGoals();
                int intValue = penaltyGoals != null ? penaltyGoals.intValue() : 0;
                Integer penaltiesTaken = footballTopTeamsStatisticsItem3.getPenaltiesTaken();
                return penaltiesTaken != null ? fc6.g(intValue, penaltiesTaken.intValue(), "/") : String.valueOf(intValue);
            case 6:
                FootballTopTeamsStatistics footballTopTeamsStatistics4 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics4.getClass();
                return footballTopTeamsStatistics4.getPenaltyGoalsConceded();
            case 7:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem4 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem4.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem4.getBigChancesMissed()));
            case 8:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem5 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem5.getClass();
                return rei.i(8, footballTopTeamsStatisticsItem5.getPenaltyGoalsConceded(), footballTopTeamsStatisticsItem5.getPenaltiesCommited(), false);
            case 9:
                FootballTopTeamsStatistics footballTopTeamsStatistics5 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics5.getClass();
                return footballTopTeamsStatistics5.getCleanSheets();
            case 10:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem6 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem6.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem6.getCleanSheets()));
            case 11:
                FootballTopTeamsStatistics footballTopTeamsStatistics6 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics6.getClass();
                return footballTopTeamsStatistics6.getTitlesWon();
            case 12:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem7 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem7.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem7.getTitlesWon()));
            case 13:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem8 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem8.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem8.getGoalsConceded()));
            case 14:
                FootballTopTeamsStatistics footballTopTeamsStatistics7 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics7.getClass();
                return footballTopTeamsStatistics7.getKilometersCovered();
            case 15:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem9 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem9.getClass();
                return rei.m(footballTopTeamsStatisticsItem9.getKilometersCovered(), Integer.valueOf(footballTopTeamsStatisticsItem9.getMatches())).concat(" km");
            case 16:
                FootballTopTeamsStatistics footballTopTeamsStatistics8 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics8.getClass();
                return footballTopTeamsStatistics8.getNumberOfSprints();
            case 17:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem10 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem10.getClass();
                return dmi.o(footballTopTeamsStatisticsItem10, footballTopTeamsStatisticsItem10.getNumberOfSprints());
            case 18:
                FootballTopTeamsStatistics footballTopTeamsStatistics9 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics9.getClass();
                return footballTopTeamsStatistics9.getHitWoodwork();
            case 19:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem11 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem11.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem11.getHitWoodwork()));
            case 20:
                FootballTopTeamsStatistics footballTopTeamsStatistics10 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics10.getClass();
                return footballTopTeamsStatistics10.getExpectedGoals();
            case 21:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem12 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem12.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem12.getExpectedGoals());
            case 22:
                FootballTopTeamsStatistics footballTopTeamsStatistics11 = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics11.getClass();
                return footballTopTeamsStatistics11.getExpectedGoalsOnTarget();
            case 23:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics.getClass();
                return futsalTopTeamsStatistics.getGoalsScored();
            case 24:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics2 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics2.getClass();
                return futsalTopTeamsStatistics2.getRedCards();
            case 25:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem.getClass();
                return yid.j(futsalTopTeamsStatisticsItem.getRedCards());
            case 26:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics3 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics3.getClass();
                return futsalTopTeamsStatistics3.getPenaltyGoals();
            case 27:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem2 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem2.getClass();
                return yid.j(futsalTopTeamsStatisticsItem2.getPenaltyGoals());
            case 28:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem3 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem3.getClass();
                return yid.j(futsalTopTeamsStatisticsItem3.getGoalsScored());
            default:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics4 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics4.getClass();
                return futsalTopTeamsStatistics4.getGoalsConceded();
        }
    }
}
