package defpackage;

import com.sofascore.model.mvvm.model.SeasonRatingBreakdown;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u9b implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics.getClass();
                return footballPlayerEventStatistics.getTotalShots();
            case 1:
                FootballPlayerEventStatistics footballPlayerEventStatistics2 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics2.getClass();
                return footballPlayerEventStatistics2.getShotsOnTarget();
            case 2:
                FootballPlayerEventStatistics footballPlayerEventStatistics3 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics3.getClass();
                return footballPlayerEventStatistics3.getExpectedAssists();
            case 3:
                FootballPlayerEventStatistics footballPlayerEventStatistics4 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics4.getClass();
                return footballPlayerEventStatistics4.getAccuratePass();
            case 4:
                FootballPlayerEventStatistics footballPlayerEventStatistics5 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics5.getClass();
                return footballPlayerEventStatistics5.getKeyPass();
            case 5:
                FootballPlayerEventStatistics footballPlayerEventStatistics6 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics6.getClass();
                Integer wonContest = footballPlayerEventStatistics6.getWonContest();
                return wonContest != null ? wonContest : yid.m(footballPlayerEventStatistics6.getTotalContest()) > 0 ? 0 : null;
            case 6:
                FootballPlayerEventStatistics footballPlayerEventStatistics7 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics7.getClass();
                return footballPlayerEventStatistics7.getTouches();
            case 7:
                SeasonRatingBreakdown seasonRatingBreakdown = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown.getClass();
                SeasonRatingBreakdown.Shot shot = seasonRatingBreakdown.getShot();
                if (shot != null) {
                    return shot.getExpectedGoals();
                }
                return null;
            case 8:
                Double d = (Double) obj;
                d.doubleValue();
                return yid.c("%.1f", d);
            case 9:
                Double d2 = (Double) obj;
                d2.doubleValue();
                return yid.c("%.2f", d2);
            case 10:
                SeasonRatingBreakdown seasonRatingBreakdown2 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown2.getClass();
                SeasonRatingBreakdown.Defending defending = seasonRatingBreakdown2.getDefending();
                if (defending != null) {
                    return defending.getDuelsWonPerGame();
                }
                return null;
            case 11:
                Double d3 = (Double) obj;
                d3.doubleValue();
                return yid.c("%.1f", d3);
            case 12:
                SeasonRatingBreakdown seasonRatingBreakdown3 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown3.getClass();
                SeasonRatingBreakdown.Goalkeeping goalkeeping = seasonRatingBreakdown3.getGoalkeeping();
                if (goalkeeping != null) {
                    return goalkeeping.getGoalsPrevented();
                }
                return null;
            case 13:
                Double d4 = (Double) obj;
                d4.doubleValue();
                return yid.c("%.2f", d4);
            case 14:
                SeasonRatingBreakdown seasonRatingBreakdown4 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown4.getClass();
                SeasonRatingBreakdown.Goalkeeping goalkeeping2 = seasonRatingBreakdown4.getGoalkeeping();
                if (goalkeeping2 != null) {
                    return goalkeeping2.getSavesPerGame();
                }
                return null;
            case 15:
                Double d5 = (Double) obj;
                d5.doubleValue();
                return yid.c("%.1f", d5);
            case 16:
                SeasonRatingBreakdown seasonRatingBreakdown5 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown5.getClass();
                SeasonRatingBreakdown.Shot shot2 = seasonRatingBreakdown5.getShot();
                if (shot2 != null) {
                    return shot2.getExpectedGoalsOnTarget();
                }
                return null;
            case 17:
                Double d6 = (Double) obj;
                d6.doubleValue();
                return yid.c("%.2f", d6);
            case 18:
                SeasonRatingBreakdown seasonRatingBreakdown6 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown6.getClass();
                SeasonRatingBreakdown.Pass pass = seasonRatingBreakdown6.getPass();
                if (pass != null) {
                    return pass.getAccuratePassesPerGame();
                }
                return null;
            case 19:
                SeasonRatingBreakdown seasonRatingBreakdown7 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown7.getClass();
                SeasonRatingBreakdown.Shot shot3 = seasonRatingBreakdown7.getShot();
                if (shot3 != null) {
                    return shot3.getTotalShotsPerGame();
                }
                return null;
            case 20:
                Double d7 = (Double) obj;
                d7.doubleValue();
                return yid.c("%.1f", d7);
            case 21:
                SeasonRatingBreakdown seasonRatingBreakdown8 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown8.getClass();
                SeasonRatingBreakdown.Shot shot4 = seasonRatingBreakdown8.getShot();
                if (shot4 != null) {
                    return shot4.getShotsOnTargetPerGame();
                }
                return null;
            case 22:
                Double d8 = (Double) obj;
                d8.doubleValue();
                return yid.c("%.1f", d8);
            case 23:
                SeasonRatingBreakdown seasonRatingBreakdown9 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown9.getClass();
                SeasonRatingBreakdown.Pass pass2 = seasonRatingBreakdown9.getPass();
                if (pass2 != null) {
                    return pass2.getExpectedAssists();
                }
                return null;
            case 24:
                Double d9 = (Double) obj;
                d9.doubleValue();
                return yid.c("%.2f", d9);
            case 25:
                Double d10 = (Double) obj;
                d10.doubleValue();
                return yid.c("%.1f", d10);
            case 26:
                SeasonRatingBreakdown seasonRatingBreakdown10 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown10.getClass();
                SeasonRatingBreakdown.Pass pass3 = seasonRatingBreakdown10.getPass();
                if (pass3 != null) {
                    return pass3.getKeyPassesPerGame();
                }
                return null;
            case 27:
                Double d11 = (Double) obj;
                d11.doubleValue();
                return yid.c("%.1f", d11);
            case 28:
                SeasonRatingBreakdown seasonRatingBreakdown11 = (SeasonRatingBreakdown) obj;
                seasonRatingBreakdown11.getClass();
                SeasonRatingBreakdown.Dribble dribble = seasonRatingBreakdown11.getDribble();
                if (dribble != null) {
                    return dribble.getSuccessfulDribblesPerGame();
                }
                return null;
            default:
                Double d12 = (Double) obj;
                d12.doubleValue();
                return yid.c("%.1f", d12);
        }
    }
}
