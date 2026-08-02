package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z71 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ z71(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float aggregate$lambda$13;
        switch (this.a) {
            case 0:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 1:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics.getPitchingStrikes()));
            case 2:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPitchingRuns()));
            case 3:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPitchingStrikes()));
            case 4:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 5:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 6:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics2 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics2.getClass();
                return rei.b(3, Double.valueOf(yid.k(baseballPlayerEventStatistics2.getPitchingWhipToDate())));
            case 7:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics3 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics3.getClass();
                return Double.valueOf(yid.k(baseballPlayerEventStatistics3.getPitchingWhipToDate()));
            case 8:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 9:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics4 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics4.getClass();
                return rei.b(2, Double.valueOf(yid.k(baseballPlayerEventStatistics4.getPitchingEarnedRunsAverageToDate())));
            case 10:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics5 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics5.getClass();
                return Double.valueOf(yid.k(baseballPlayerEventStatistics5.getPitchingEarnedRunsAverageToDate()));
            case 11:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 12:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics6 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics6.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics6.getPitchingHitsAllowed()));
            case 13:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 14:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPitchingHitsAllowed()));
            case 15:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 16:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics7 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics7.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics7.getPitchingRuns()));
            case 17:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics8 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics8.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics8.getPitchingEarnedRuns()));
            case 18:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPitchingEarnedRuns()));
            case 19:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 20:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics9 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics9.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics9.getPitchingBaseOnBalls()));
            case 21:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPitchingBaseOnBalls()));
            case 22:
                ((BaseballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 23:
                BaseballPlayerEventStatistics baseballPlayerEventStatistics10 = (BaseballPlayerEventStatistics) obj;
                baseballPlayerEventStatistics10.getClass();
                return String.valueOf(yid.m(baseballPlayerEventStatistics10.getPitchingStrikeOuts()));
            case 24:
                ((BaseballPlayerSeasonStatistics) obj).getClass();
                return "0";
            case 25:
                ((BaseballPlayerSeasonStatistics) obj).getClass();
                return 0;
            case 26:
                Context context = (Context) obj;
                context.getClass();
                return new k91(context);
            case 27:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics.getClass();
                if (playerMatchesEventStatistics.getBattingGamesPlayed() <= 0 && playerMatchesEventStatistics.getBattingAtBats() <= 0) {
                    r0 = false;
                }
                return Boolean.valueOf(r0);
            case 28:
                PlayerMatchesEventStatistics playerMatchesEventStatistics2 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics2.getClass();
                return Boolean.valueOf(playerMatchesEventStatistics2.getPitchingInningsPitched() > 0.0d);
            default:
                aggregate$lambda$13 = BaseballPlayerSeasonStatistics.Companion.aggregate$lambda$13((BaseballPlayerSeasonStatistics) obj);
                return aggregate$lambda$13;
        }
    }
}
