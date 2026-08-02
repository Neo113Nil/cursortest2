package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vpj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics.getClass();
                return iceHockeyTopTeamsStatistics.getGoalsAgainst();
            case 1:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem.getGoalsAgainst(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem.getMatches()));
            case 2:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics2 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics2.getClass();
                return iceHockeyTopTeamsStatistics2.getShots();
            case 3:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem2 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem2.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem2.getShots(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem2.getMatches()));
            case 4:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics3 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics3.getClass();
                return iceHockeyTopTeamsStatistics3.getShotsAgainst();
            case 5:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem3 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem3.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem3.getShotsAgainst(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem3.getMatches()));
            case 6:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics4 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics4.getClass();
                return iceHockeyTopTeamsStatistics4.getHits();
            case 7:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem4 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem4.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem4.getHits(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem4.getMatches()));
            case 8:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics5 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics5.getClass();
                return iceHockeyTopTeamsStatistics5.getBlocks();
            case 9:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem5 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem5.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem5.getBlocks(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem5.getMatches()));
            case 10:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics6 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics6.getClass();
                return iceHockeyTopTeamsStatistics6.getFaceOffPercentage();
            case 11:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem6 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem6.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem6.getFaceOffPercentage(), 0, 6);
            case 12:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics7 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics7.getClass();
                return iceHockeyTopTeamsStatistics7.getPenaltyMinutes();
            case 13:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics.getClass();
                return rugbyTopTeamsStatistics.getPoints();
            case 14:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem.getClass();
                return yid.j(rugbyTopTeamsStatisticsItem.getOffloads());
            case 15:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem2.getClass();
                return yid.j(rugbyTopTeamsStatisticsItem2.getPoints());
            case 16:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics2.getClass();
                return rugbyTopTeamsStatistics2.getCarries();
            case 17:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem3.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarries());
            case 18:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics3.getClass();
                return rugbyTopTeamsStatistics3.getCleanBreaks();
            case 19:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem4.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCleanBreaks());
            case 20:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics4.getClass();
                return rugbyTopTeamsStatistics4.getDefendersBeaten();
            case 21:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem5.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getDefendersBeaten());
            case 22:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics5 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics5.getClass();
                return rugbyTopTeamsStatistics5.getMetresMade();
            case 23:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem6 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem6.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem6, rugbyTopTeamsStatisticsItem6.getMetresMade());
            case 24:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics6 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics6.getClass();
                return rugbyTopTeamsStatistics6.getDropGoals();
            case 25:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics7 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics7.getClass();
                return rugbyTopTeamsStatistics7.getHandlingError();
            case 26:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem7 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem7.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem7, rugbyTopTeamsStatisticsItem7.getHandlingError());
            case 27:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics8 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics8.getClass();
                return rugbyTopTeamsStatistics8.getTries();
            case 28:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics9 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics9.getClass();
                return rugbyTopTeamsStatistics9.getCarriesCrossedGainLine();
            default:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem8 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem8.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem8, rugbyTopTeamsStatisticsItem8.getCarriesCrossedGainLine());
        }
    }
}
