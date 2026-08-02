package defpackage;

import com.sofascore.model.mvvm.model.SeasonRatingBreakdown;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z9b implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                SeasonRatingBreakdown seasonRatingBreakdown = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown.getClass();
                SeasonRatingBreakdown.Dribble dribble = seasonRatingBreakdown.getDribble();
                if (dribble != null) {
                    return dribble.getTouchesPerGame();
                }
                return null;
            case 1:
                Double d = (Double) obj;
                d.doubleValue();
                return yid.c("%.1f", d);
            case 2:
                SeasonRatingBreakdown seasonRatingBreakdown2 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown2.getClass();
                SeasonRatingBreakdown.Defending defending = seasonRatingBreakdown2.getDefending();
                if (defending != null) {
                    return defending.getDefensiveContributionsPerGame();
                }
                return null;
            case 3:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics.getClass();
                return footballTeamSeasonStatistics.getExpectedGoals();
            case 4:
                Double d2 = (Double) obj;
                d2.doubleValue();
                return yid.c("%.1f", d2);
            case 5:
                Double d3 = (Double) obj;
                d3.doubleValue();
                return yid.c("%.2f", d3);
            case 6:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics2 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics2.getClass();
                if (footballTeamSeasonStatistics2.getDuelsWon() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 7:
                Double d4 = (Double) obj;
                d4.doubleValue();
                return yid.c("%.1f", d4);
            case 8:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics3 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics3.getClass();
                return footballTeamSeasonStatistics3.getGoalsPrevented();
            case 9:
                Double d5 = (Double) obj;
                d5.doubleValue();
                return yid.c("%.2f", d5);
            case 10:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics4 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics4.getClass();
                if (footballTeamSeasonStatistics4.getSaves() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 11:
                Double d6 = (Double) obj;
                d6.doubleValue();
                return yid.c("%.1f", d6);
            case 12:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics5 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics5.getClass();
                return footballTeamSeasonStatistics5.getExpectedGoalsOnTarget();
            case 13:
                Double d7 = (Double) obj;
                d7.doubleValue();
                return yid.c("%.2f", d7);
            case 14:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics6 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics6.getClass();
                if (footballTeamSeasonStatistics6.getAccuratePasses() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 15:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics7 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics7.getClass();
                if (footballTeamSeasonStatistics7.getShots() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 16:
                Double d8 = (Double) obj;
                d8.doubleValue();
                return yid.c("%.1f", d8);
            case 17:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics8 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics8.getClass();
                if (footballTeamSeasonStatistics8.getShotsOnTarget() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 18:
                Double d9 = (Double) obj;
                d9.doubleValue();
                return yid.c("%.1f", d9);
            case 19:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics9 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics9.getClass();
                return footballTeamSeasonStatistics9.getExpectedAssists();
            case 20:
                Double d10 = (Double) obj;
                d10.doubleValue();
                return yid.c("%.2f", d10);
            case 21:
                Double d11 = (Double) obj;
                d11.doubleValue();
                return yid.c("%.1f", d11);
            case 22:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics10 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics10.getClass();
                if (footballTeamSeasonStatistics10.getKeyPasses() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 23:
                Double d12 = (Double) obj;
                d12.doubleValue();
                return yid.c("%.1f", d12);
            case 24:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics11 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics11.getClass();
                if (footballTeamSeasonStatistics11.getSuccessfulDribbles() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 25:
                Double d13 = (Double) obj;
                d13.doubleValue();
                return yid.c("%.1f", d13);
            case 26:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics12 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics12.getClass();
                if (footballTeamSeasonStatistics12.getTouches() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            case 27:
                Double d14 = (Double) obj;
                d14.doubleValue();
                return yid.c("%.1f", d14);
            case 28:
                FootballTeamSeasonStatistics footballTeamSeasonStatistics13 = (FootballTeamSeasonStatistics) obj;
                footballTeamSeasonStatistics13.getClass();
                if (footballTeamSeasonStatistics13.getDefensiveContributions() != null) {
                    return Double.valueOf(r3.intValue());
                }
                return null;
            default:
                AmericanFootballTopPlayersStatistics americanFootballTopPlayersStatistics = (AmericanFootballTopPlayersStatistics) obj;
                americanFootballTopPlayersStatistics.getClass();
                return americanFootballTopPlayersStatistics.getPassingTouchdowns();
        }
    }
}
