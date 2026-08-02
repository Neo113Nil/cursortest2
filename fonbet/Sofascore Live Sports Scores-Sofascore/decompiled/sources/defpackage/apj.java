package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class apj implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                HandballTopTeamsStatisticsItem handballTopTeamsStatisticsItem = (HandballTopTeamsStatisticsItem) obj;
                handballTopTeamsStatisticsItem.getClass();
                return rei.m(handballTopTeamsStatisticsItem.getGoalsScored(), Integer.valueOf(handballTopTeamsStatisticsItem.getMatches()));
            case 1:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics.getClass();
                return iceHockeyTopTeamsStatistics.getPowerPlayPercentage();
            case 2:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem.getPenaltyMinutes(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem.getMatches()));
            case 3:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem2 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem2.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem2.getPowerPlayPercentage(), 0, 6);
            case 4:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics2 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics2.getClass();
                return iceHockeyTopTeamsStatistics2.getPenaltyKillPercentage();
            case 5:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem3 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem3.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem3.getPenaltyKillPercentage(), 0, 6);
            case 6:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics3 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics3.getClass();
                return iceHockeyTopTeamsStatistics3.getGoals();
            case 7:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem4 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem4.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem4.getGoals(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem4.getMatches()));
            case 8:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics4 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics4.getClass();
                return iceHockeyTopTeamsStatistics4.getGoalsAgainst();
            case 9:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem5 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem5.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem5.getGoalsAgainst(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem5.getMatches()));
            case 10:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics5 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics5.getClass();
                return iceHockeyTopTeamsStatistics5.getShots();
            case 11:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem6 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem6.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem6.getShots(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem6.getMatches()));
            case 12:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics6 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics6.getClass();
                return iceHockeyTopTeamsStatistics6.getShotsAgainst();
            case 13:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem7 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem7.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem7.getShotsAgainst(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem7.getMatches()));
            case 14:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics7 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics7.getClass();
                return iceHockeyTopTeamsStatistics7.getHits();
            case 15:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem8 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem8.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem8.getHits(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem8.getMatches()));
            case 16:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics8 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics8.getClass();
                return iceHockeyTopTeamsStatistics8.getBlocks();
            case 17:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem9 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem9.getClass();
                return rei.m(iceHockeyTopTeamsStatisticsItem9.getBlocks(), Integer.valueOf(iceHockeyTopTeamsStatisticsItem9.getMatches()));
            case 18:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics9 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics9.getClass();
                return iceHockeyTopTeamsStatistics9.getFaceOffPercentage();
            case 19:
                IceHockeyTopTeamsStatisticsItem iceHockeyTopTeamsStatisticsItem10 = (IceHockeyTopTeamsStatisticsItem) obj;
                iceHockeyTopTeamsStatisticsItem10.getClass();
                return rei.e(iceHockeyTopTeamsStatisticsItem10.getFaceOffPercentage(), 0, 6);
            case 20:
                IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics10 = (IceHockeyTopTeamsStatistics) obj;
                iceHockeyTopTeamsStatistics10.getClass();
                return iceHockeyTopTeamsStatistics10.getPenaltyMinutes();
            case 21:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics.getClass();
                return rugbyTopTeamsStatistics.getOffloads();
            case 22:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem.getClass();
                return yid.j(rugbyTopTeamsStatisticsItem.getOffloads());
            case 23:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem2 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem2.getClass();
                return yid.j(rugbyTopTeamsStatisticsItem2.getPoints());
            case 24:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics2 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics2.getClass();
                return rugbyTopTeamsStatistics2.getCarries();
            case 25:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem3 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem3.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem3, rugbyTopTeamsStatisticsItem3.getCarries());
            case 26:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics3 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics3.getClass();
                return rugbyTopTeamsStatistics3.getCleanBreaks();
            case 27:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem4 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem4.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem4, rugbyTopTeamsStatisticsItem4.getCleanBreaks());
            case 28:
                RugbyTopTeamsStatistics rugbyTopTeamsStatistics4 = (RugbyTopTeamsStatistics) obj;
                rugbyTopTeamsStatistics4.getClass();
                return rugbyTopTeamsStatistics4.getDefendersBeaten();
            default:
                RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem5 = (RugbyTopTeamsStatisticsItem) obj;
                rugbyTopTeamsStatisticsItem5.getClass();
                return dmi.p(rugbyTopTeamsStatisticsItem5, rugbyTopTeamsStatisticsItem5.getDefendersBeaten());
        }
    }
}
