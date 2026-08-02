package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FootballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FutsalTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pab implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics.getClass();
                return footballTopPlayersStatistics.getNumberOfSprints();
            case 1:
                FootballTopPlayersStatistics footballTopPlayersStatistics2 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics2.getClass();
                return footballTopPlayersStatistics2.getAssists();
            case 2:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem.getClass();
                return yid.j(footballTopPlayersStatisticsItem.getAssists());
            case 3:
                FootballTopPlayersStatistics footballTopPlayersStatistics3 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics3.getClass();
                return footballTopPlayersStatistics3.getExpectedAssists();
            case 4:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem2 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem2.getClass();
                return rei.b(2, footballTopPlayersStatisticsItem2.getExpectedAssists()) + " (" + footballTopPlayersStatisticsItem2.getAssists() + ")";
            case 5:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem3 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem3.getClass();
                Number numberOfSprints = footballTopPlayersStatisticsItem3.getNumberOfSprints();
                if (numberOfSprints == null) {
                    numberOfSprints = Double.valueOf(0.0d);
                }
                Integer minutesPlayed = footballTopPlayersStatisticsItem3.getMinutesPlayed();
                return rei.q(minutesPlayed != null ? minutesPlayed.intValue() : 0, numberOfSprints);
            case 6:
                FootballTopPlayersStatistics footballTopPlayersStatistics4 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics4.getClass();
                return footballTopPlayersStatistics4.getTopSpeed();
            case 7:
                FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem4 = (FootballTopPlayersStatisticsItem) obj;
                footballTopPlayersStatisticsItem4.getClass();
                String f = yid.f(footballTopPlayersStatisticsItem4.getTopSpeed());
                if (f == null) {
                    f = "-";
                }
                return f.concat(" km/h");
            case 8:
                FootballTopPlayersStatistics footballTopPlayersStatistics5 = (FootballTopPlayersStatistics) obj;
                footballTopPlayersStatistics5.getClass();
                return footballTopPlayersStatistics5.getPenaltyGoals();
            case 9:
                FutsalTopPlayersStatistics futsalTopPlayersStatistics = (FutsalTopPlayersStatistics) obj;
                futsalTopPlayersStatistics.getClass();
                return futsalTopPlayersStatistics.getGoals();
            case 10:
                FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem = (FutsalTopPlayersStatisticsItem) obj;
                futsalTopPlayersStatisticsItem.getClass();
                return yid.j(futsalTopPlayersStatisticsItem.getGoals());
            case 11:
                FutsalTopPlayersStatistics futsalTopPlayersStatistics2 = (FutsalTopPlayersStatistics) obj;
                futsalTopPlayersStatistics2.getClass();
                return futsalTopPlayersStatistics2.getAssists();
            case 12:
                FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem2 = (FutsalTopPlayersStatisticsItem) obj;
                futsalTopPlayersStatisticsItem2.getClass();
                return yid.j(futsalTopPlayersStatisticsItem2.getAssists());
            case 13:
                FutsalTopPlayersStatistics futsalTopPlayersStatistics3 = (FutsalTopPlayersStatistics) obj;
                futsalTopPlayersStatistics3.getClass();
                return futsalTopPlayersStatistics3.getYellowCards();
            case 14:
                FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem3 = (FutsalTopPlayersStatisticsItem) obj;
                futsalTopPlayersStatisticsItem3.getClass();
                return yid.j(futsalTopPlayersStatisticsItem3.getYellowCards());
            case 15:
                FutsalTopPlayersStatistics futsalTopPlayersStatistics4 = (FutsalTopPlayersStatistics) obj;
                futsalTopPlayersStatistics4.getClass();
                return futsalTopPlayersStatistics4.getRedCards();
            case 16:
                FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem4 = (FutsalTopPlayersStatisticsItem) obj;
                futsalTopPlayersStatisticsItem4.getClass();
                return yid.j(futsalTopPlayersStatisticsItem4.getRedCards());
            case 17:
                HandballTopPlayersStatistics handballTopPlayersStatistics = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics.getClass();
                return handballTopPlayersStatistics.getGoals();
            case 18:
                HandballTopPlayersStatistics handballTopPlayersStatistics2 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics2.getClass();
                return handballTopPlayersStatistics2.getGoals7m();
            case 19:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem.getClass();
                return rei.i(8, handballTopPlayersStatisticsItem.getGoals7m(), handballTopPlayersStatisticsItem.getShots7m(), true);
            case 20:
                HandballTopPlayersStatistics handballTopPlayersStatistics3 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics3.getClass();
                return handballTopPlayersStatistics3.getSteals();
            case 21:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem2 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem2.getClass();
                return yid.j(handballTopPlayersStatisticsItem2.getSteals());
            case 22:
                HandballTopPlayersStatistics handballTopPlayersStatistics4 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics4.getClass();
                return handballTopPlayersStatistics4.getTwoMinutePenalties();
            case 23:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem3 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem3.getClass();
                return yid.j(handballTopPlayersStatisticsItem3.getTwoMinutePenalties());
            case 24:
                HandballTopPlayersStatistics handballTopPlayersStatistics5 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics5.getClass();
                return handballTopPlayersStatistics5.getSaves();
            case 25:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem4 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem4.getClass();
                return yid.j(handballTopPlayersStatisticsItem4.getSaves());
            case 26:
                HandballTopPlayersStatistics handballTopPlayersStatistics6 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics6.getClass();
                return handballTopPlayersStatistics6.getGoalkeeperEfficiencyPercentage();
            case 27:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem5 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem5.getClass();
                return rei.e(handballTopPlayersStatisticsItem5.getGoalkeeperEfficiencyPercentage(), 2, 4);
            case 28:
                HandballTopPlayersStatistics handballTopPlayersStatistics7 = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics7.getClass();
                return handballTopPlayersStatistics7.getGk7mSaves();
            default:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem6 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem6.getClass();
                return rei.i(8, handballTopPlayersStatisticsItem6.getGk7mSaves(), handballTopPlayersStatisticsItem6.getGk7mShots(), true);
        }
    }
}
