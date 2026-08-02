package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class spj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem.getClass();
                return yid.j(futsalTopTeamsStatisticsItem.getGoalsConceded());
            case 1:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics.getClass();
                return futsalTopTeamsStatistics.getCleanSheets();
            case 2:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem2 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem2.getClass();
                return yid.j(futsalTopTeamsStatisticsItem2.getCleanSheets());
            case 3:
                FutsalTopTeamsStatistics futsalTopTeamsStatistics2 = (FutsalTopTeamsStatistics) obj;
                futsalTopTeamsStatistics2.getClass();
                return futsalTopTeamsStatistics2.getYellowCards();
            case 4:
                FutsalTopTeamsStatisticsItem futsalTopTeamsStatisticsItem3 = (FutsalTopTeamsStatisticsItem) obj;
                futsalTopTeamsStatisticsItem3.getClass();
                return yid.j(futsalTopTeamsStatisticsItem3.getYellowCards());
            case 5:
                HandballTopTeamsStatistics handballTopTeamsStatistics = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics.getClass();
                return handballTopTeamsStatistics.getGoalsScored();
            case 6:
                HandballTopTeamsStatistics handballTopTeamsStatistics2 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics2.getClass();
                return handballTopTeamsStatistics2.getGoalsConceded();
            case 7:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem.getClass();
                return rei.m(handballTopTeamsStatisticsItem.getGoalsConceded(), Integer.valueOf(handballTopTeamsStatisticsItem.getMatches()));
            case 8:
                HandballTopTeamsStatistics handballTopTeamsStatistics3 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics3.getClass();
                return handballTopTeamsStatistics3.getShootingPercentage();
            case 9:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem2 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem2.getClass();
                return rei.e(handballTopTeamsStatisticsItem2.getShootingPercentage(), 0, 6);
            case 10:
                HandballTopTeamsStatistics handballTopTeamsStatistics4 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics4.getClass();
                return handballTopTeamsStatistics4.getFastbreakGoals();
            case 11:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem3 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem3.getClass();
                return rei.m(handballTopTeamsStatisticsItem3.getFastbreakGoals(), Integer.valueOf(handballTopTeamsStatisticsItem3.getMatches()));
            case 12:
                HandballTopTeamsStatistics handballTopTeamsStatistics5 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics5.getClass();
                return handballTopTeamsStatistics5.getSevenMetersScored();
            case 13:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem4 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem4.getClass();
                return rei.i(8, handballTopTeamsStatisticsItem4.getSevenMetersScored(), handballTopTeamsStatisticsItem4.getSevenMetersTotal(), false);
            case 14:
                HandballTopTeamsStatistics handballTopTeamsStatistics6 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics6.getClass();
                return handballTopTeamsStatistics6.getSteals();
            case 15:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem5 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem5.getClass();
                return rei.m(handballTopTeamsStatisticsItem5.getSteals(), Integer.valueOf(handballTopTeamsStatisticsItem5.getMatches()));
            case 16:
                HandballTopTeamsStatistics handballTopTeamsStatistics7 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics7.getClass();
                return handballTopTeamsStatistics7.getTwoMinutePenalties();
            case 17:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem6 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem6.getClass();
                return rei.m(handballTopTeamsStatisticsItem6.getTwoMinutePenalties(), Integer.valueOf(handballTopTeamsStatisticsItem6.getMatches()));
            case 18:
                HandballTopTeamsStatistics handballTopTeamsStatistics8 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics8.getClass();
                return handballTopTeamsStatistics8.getGoalsInPowerplay();
            case 19:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem7 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem7.getClass();
                return rei.m(handballTopTeamsStatisticsItem7.getGoalsInPowerplay(), Integer.valueOf(handballTopTeamsStatisticsItem7.getMatches()));
            case 20:
                HandballTopTeamsStatistics handballTopTeamsStatistics9 = (HandballTopTeamsStatistics) obj;
                handballTopTeamsStatistics9.getClass();
                return handballTopTeamsStatistics9.getShorthandedGoals();
            case 21:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem8 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem8.getClass();
                return rei.m(handballTopTeamsStatisticsItem8.getShorthandedGoals(), Integer.valueOf(handballTopTeamsStatisticsItem8.getMatches()));
            case 22:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem9 = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem9.getClass();
                return rei.m(handballTopTeamsStatisticsItem9.getGoalsScored(), Integer.valueOf(handballTopTeamsStatisticsItem9.getMatches()));
            case 23:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics.getClass();
                return iceHockeyTopTeamsStatistics.getPowerPlayPercentage();
            case 24:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem.getPenaltyMinutes(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem.getMatches()));
            case 25:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem2 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem2.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem2.getPowerPlayPercentage(), 0, 6);
            case 26:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics2 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics2.getClass();
                return iceHockeyTopTeamsStatistics2.getPenaltyKillPercentage();
            case 27:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem3 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem3.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem3.getPenaltyKillPercentage(), 0, 6);
            case 28:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics3 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics3.getClass();
                return iceHockeyTopTeamsStatistics3.getGoals();
            default:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem4 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem4.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem4.getGoals(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem4.getMatches()));
        }
    }
}
