package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.RugbyTopPlayersStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uab implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uab(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics.getClass();
                return iceHockeyTopPlayersStatistics.getPowerPlaySavePercentage();
            case 1:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem.getClass();
                return rei.a(Double.valueOf(yid.k(iceHockeyTopPlayersStatisticsItem.getPowerPlaySavePercentage())), true);
            case 2:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics2 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics2.getClass();
                return iceHockeyTopPlayersStatistics2.getAssists();
            case 3:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem2 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem2.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem2.getAssists());
            case 4:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics3 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics3.getClass();
                return iceHockeyTopPlayersStatistics3.getPowerPlayGoals();
            case 5:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem3 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem3.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem3.getPowerPlayGoals());
            case 6:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics4 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics4.getClass();
                return iceHockeyTopPlayersStatistics4.getShortHandedAssists();
            case 7:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics5 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics5.getClass();
                return iceHockeyTopPlayersStatistics5.getShortHandedGoals();
            case 8:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem4 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem4.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem4.getShortHandedGoals());
            case 9:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem5 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem5.getClass();
                return yid.j(iceHockeyTopPlayersStatisticsItem5.getShortHandedAssists());
            case 10:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics6 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics6.getClass();
                return iceHockeyTopPlayersStatistics6.getShotPercentage();
            case 11:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem6 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem6.getClass();
                return rei.e(iceHockeyTopPlayersStatisticsItem6.getShotPercentage(), 0, 6);
            case 12:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics7 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics7.getClass();
                return iceHockeyTopPlayersStatistics7.getFaceOffPercentage();
            case 13:
                IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem7 = (IceHockeyTopPlayersStatisticsItem) obj;
                iceHockeyTopPlayersStatisticsItem7.getClass();
                return rei.e(iceHockeyTopPlayersStatisticsItem7.getFaceOffPercentage(), 0, 6);
            case 14:
                IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics8 = (IceHockeyTopPlayersStatistics) obj;
                iceHockeyTopPlayersStatistics8.getClass();
                return iceHockeyTopPlayersStatistics8.getPlusMinus();
            case 15:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics.getClass();
                return rugbyTopPlayersStatistics.getPoints();
            case 16:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem.getDefendersBeaten());
            case 17:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem2 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem2.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem2.getPoints());
            case 18:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics2 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics2.getClass();
                return rugbyTopPlayersStatistics2.getMetresMade();
            case 19:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem3 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem3.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem3.getMetresMade());
            case 20:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics3 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics3.getClass();
                return rugbyTopPlayersStatistics3.getHandlingError();
            case 21:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem4 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem4.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem4.getHandlingError());
            case 22:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics4 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics4.getClass();
                return rugbyTopPlayersStatistics4.getCarriesCrossedGainLine();
            case 23:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem5 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem5.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem5.getCarriesCrossedGainLine());
            case 24:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics5 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics5.getClass();
                return rugbyTopPlayersStatistics5.getCarriesNotMadeGainLine();
            case 25:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem6 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem6.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem6.getCarriesNotMadeGainLine());
            case 26:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics6 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics6.getClass();
                return rugbyTopPlayersStatistics6.getPassesSuccessful();
            case 27:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics7 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics7.getClass();
                return rugbyTopPlayersStatistics7.getKickMetres();
            case 28:
                RugbyTopPlayersStatisticsItem rugbyTopPlayersStatisticsItem7 = (RugbyTopPlayersStatisticsItem) obj;
                rugbyTopPlayersStatisticsItem7.getClass();
                return yid.j(rugbyTopPlayersStatisticsItem7.getKickMetres());
            default:
                RugbyTopPlayersStatistics rugbyTopPlayersStatistics8 = (RugbyTopPlayersStatistics) obj;
                rugbyTopPlayersStatistics8.getClass();
                return rugbyTopPlayersStatistics8.getTries();
        }
    }
}
