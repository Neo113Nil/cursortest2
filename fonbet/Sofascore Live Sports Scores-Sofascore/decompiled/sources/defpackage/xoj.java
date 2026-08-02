package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xoj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem.getClass();
                return String.valueOf(yid.m(footballTopTeamsStatisticsItem.getHitWoodwork()));
            case 1:
                FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) obj;
                footballTopTeamsStatistics.getClass();
                return footballTopTeamsStatistics.getExpectedGoals();
            case 2:
                FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem2 = (FootballTopTeamsStatisticsItem) obj;
                footballTopTeamsStatisticsItem2.getClass();
                return rei.b(2, footballTopTeamsStatisticsItem2.getExpectedGoals());
            case 3:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics.getClass();
                return futsalTopTeamsStatistics.getGoalsScored();
            case 4:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem.getClass();
                return yid.j(futsalTopTeamsStatisticsItem.getGoalsScored());
            case 5:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics2 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics2.getClass();
                return futsalTopTeamsStatistics2.getGoalsConceded();
            case 6:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem2 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem2.getClass();
                return yid.j(futsalTopTeamsStatisticsItem2.getGoalsConceded());
            case 7:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics3 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics3.getClass();
                return futsalTopTeamsStatistics3.getCleanSheets();
            case 8:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem3 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem3.getClass();
                return yid.j(futsalTopTeamsStatisticsItem3.getCleanSheets());
            case 9:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics4 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics4.getClass();
                return futsalTopTeamsStatistics4.getYellowCards();
            case 10:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem4 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem4.getClass();
                return yid.j(futsalTopTeamsStatisticsItem4.getYellowCards());
            case 11:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics5 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics5.getClass();
                return futsalTopTeamsStatistics5.getRedCards();
            case 12:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem5 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem5.getClass();
                return yid.j(futsalTopTeamsStatisticsItem5.getRedCards());
            case 13:
                HandballTopTeamsStatistics handballTopTeamsStatistics = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics.getClass();
                return handballTopTeamsStatistics.getGoalsScored();
            case 14:
                HandballTopTeamsStatistics handballTopTeamsStatistics2 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics2.getClass();
                return handballTopTeamsStatistics2.getGoalsConceded();
            case 15:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem.getClass();
                return rei.m(handballTopTeamsStatisticsItem.getGoalsConceded(), Integer.valueOf(handballTopTeamsStatisticsItem.getMatches()));
            case 16:
                HandballTopTeamsStatistics handballTopTeamsStatistics3 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics3.getClass();
                return handballTopTeamsStatistics3.getShootingPercentage();
            case 17:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem2 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem2.getClass();
                return rei.e(handballTopTeamsStatisticsItem2.getShootingPercentage(), 0, 6);
            case 18:
                HandballTopTeamsStatistics handballTopTeamsStatistics4 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics4.getClass();
                return handballTopTeamsStatistics4.getFastbreakGoals();
            case 19:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem3 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem3.getClass();
                return rei.m(handballTopTeamsStatisticsItem3.getFastbreakGoals(), Integer.valueOf(handballTopTeamsStatisticsItem3.getMatches()));
            case 20:
                HandballTopTeamsStatistics handballTopTeamsStatistics5 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics5.getClass();
                return handballTopTeamsStatistics5.getSevenMetersScored();
            case 21:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem4 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem4.getClass();
                return rei.i(8, handballTopTeamsStatisticsItem4.getSevenMetersScored(), handballTopTeamsStatisticsItem4.getSevenMetersTotal(), false);
            case 22:
                HandballTopTeamsStatistics handballTopTeamsStatistics6 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics6.getClass();
                return handballTopTeamsStatistics6.getSteals();
            case 23:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem5 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem5.getClass();
                return rei.m(handballTopTeamsStatisticsItem5.getSteals(), Integer.valueOf(handballTopTeamsStatisticsItem5.getMatches()));
            case 24:
                HandballTopTeamsStatistics handballTopTeamsStatistics7 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics7.getClass();
                return handballTopTeamsStatistics7.getTwoMinutePenalties();
            case 25:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem6 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem6.getClass();
                return rei.m(handballTopTeamsStatisticsItem6.getTwoMinutePenalties(), Integer.valueOf(handballTopTeamsStatisticsItem6.getMatches()));
            case 26:
                HandballTopTeamsStatistics handballTopTeamsStatistics8 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics8.getClass();
                return handballTopTeamsStatistics8.getGoalsInPowerplay();
            case 27:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem7 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem7.getClass();
                return rei.m(handballTopTeamsStatisticsItem7.getGoalsInPowerplay(), Integer.valueOf(handballTopTeamsStatisticsItem7.getMatches()));
            case 28:
                HandballTopTeamsStatistics handballTopTeamsStatistics9 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics9.getClass();
                return handballTopTeamsStatistics9.getShorthandedGoals();
            default:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem8 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem8.getClass();
                return rei.m(handballTopTeamsStatisticsItem8.getShorthandedGoals(), Integer.valueOf(handballTopTeamsStatisticsItem8.getMatches()));
        }
    }
}
