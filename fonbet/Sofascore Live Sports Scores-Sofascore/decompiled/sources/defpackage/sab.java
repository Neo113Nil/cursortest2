package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sab implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sab(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem.getClass();
                return yid.j(handballTopPlayersStatisticsItem.getGoals());
            case 1:
                HandballTopPlayersStatistics handballTopPlayersStatistics = (HandballTopPlayersStatistics) obj;
                handballTopPlayersStatistics.getClass();
                return handballTopPlayersStatistics.getAssists();
            case 2:
                HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem2 = (HandballTopPlayersStatisticsItem) obj;
                handballTopPlayersStatisticsItem2.getClass();
                return yid.j(handballTopPlayersStatisticsItem2.getAssists());
            case 3:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics.getClass();
                return iceHockeyTopPlayersStatistics.getPoints();
            case 4:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem.getPlusMinus());
            case 5:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem2 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem2.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem2.getPoints());
            case 6:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics2 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics2.getClass();
                return iceHockeyTopPlayersStatistics2.getTimeOnIce();
            case 7:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem3 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem3.getClass();
                return rei.j(iceHockeyTopPlayersStatisticsItem3.getTimeOnIce(), iceHockeyTopPlayersStatisticsItem3.getAppearances());
            case 8:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics3 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics3.getClass();
                return iceHockeyTopPlayersStatistics3.getBlocked();
            case 9:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem4 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem4.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem4.getBlocked());
            case 10:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics4 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics4.getClass();
                return iceHockeyTopPlayersStatistics4.getHits();
            case 11:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem5 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem5.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem5.getHits());
            case 12:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics5 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics5.getClass();
                return iceHockeyTopPlayersStatistics5.getPenaltyMinutes();
            case 13:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem6 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem6.getClass();
                return rei.m(iceHockeyTopPlayersStatisticsItem6.getPenaltyMinutes(), iceHockeyTopPlayersStatisticsItem6.getAppearances());
            case 14:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics6 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics6.getClass();
                return iceHockeyTopPlayersStatistics6.getPowerPlayAssists();
            case 15:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics7 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics7.getClass();
                return iceHockeyTopPlayersStatistics7.getSavePercentage();
            case 16:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem7 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem7.getClass();
                return rei.a(Double.valueOf(yid.k(iceHockeyTopPlayersStatisticsItem7.getSavePercentage())), true);
            case 17:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics8 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics8.getClass();
                return iceHockeyTopPlayersStatistics8.getGoals();
            case 18:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics9 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics9.getClass();
                return iceHockeyTopPlayersStatistics9.getGoalsAgainstAverage();
            case 19:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem8 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem8.getClass();
                return rei.b(2, iceHockeyTopPlayersStatisticsItem8.getGoalsAgainstAverage());
            case 20:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics10 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics10.getClass();
                return iceHockeyTopPlayersStatistics10.getWins();
            case 21:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem9 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem9.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem9.getWins());
            case 22:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics11 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics11.getClass();
                return iceHockeyTopPlayersStatistics11.getShutouts();
            case 23:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem10 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem10.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem10.getShutouts());
            case 24:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics12 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics12.getClass();
                return iceHockeyTopPlayersStatistics12.getEvenSavePercentage();
            case 25:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem11 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem11.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem11.getPowerPlayAssists());
            case 26:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem12 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem12.getClass();
                return rei.a(Double.valueOf(yid.k(iceHockeyTopPlayersStatisticsItem12.getEvenSavePercentage())), true);
            case 27:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics13 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics13.getClass();
                return iceHockeyTopPlayersStatistics13.getShortHandedSavePercentage();
            case 28:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem13 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem13.getClass();
                return rei.a(Double.valueOf(yid.k(iceHockeyTopPlayersStatisticsItem13.getShortHandedSavePercentage())), true);
            default:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem14 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem14.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem14.getGoals());
        }
    }
}
