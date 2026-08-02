package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pn9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pn9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                Double a = yid.a(iceHockeyPlayerSeasonStatistics.getEvenTimeOnIce(), iceHockeyPlayerSeasonStatistics.getAppearances());
                r5 = a != null ? rei.k(wzb.a(a.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
            case 1:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(yid.a(iceHockeyPlayerSeasonStatistics2.getEvenTimeOnIce(), iceHockeyPlayerSeasonStatistics2.getAppearances())));
            case 2:
                return new q9k(R.string.hockey_games_played_short);
            case 3:
                return new q9k(R.string.hockey_games_played);
            case 4:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics3 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics3.getClass();
                String y0 = o02.y0(iceHockeyPlayerSeasonStatistics3.getAppearances());
                Regex regex = yid.a;
                return y0;
            case 5:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics4 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(iceHockeyPlayerSeasonStatistics4.getAppearances());
                Regex regex2 = yid.a;
                return y02;
            case 6:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics5 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics5.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics5.getAppearances()));
            case 7:
                return new q9k(R.string.hockey_games_started_short);
            case 8:
                return new q9k(R.string.hockey_games_started);
            case 9:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics6 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics6.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics6.getGamesStarted());
            case 10:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics7 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics7.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics7.getGamesStarted());
            case 11:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics8 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics8.getGamesStarted()));
            case 12:
                return new q9k(R.string.hockey_game_winning_goals_short);
            case 13:
                return new q9k(R.string.game_winning_goals);
            case 14:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics9 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics9.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics9.getGameWinningGoals());
            case 15:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics10 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics10.getClass();
                Integer gameWinningGoals = iceHockeyPlayerSeasonStatistics10.getGameWinningGoals();
                if (gameWinningGoals != null) {
                    Integer valueOf = Integer.valueOf(gameWinningGoals.intValue());
                    int m = yid.m(iceHockeyPlayerSeasonStatistics10.getAppearances());
                    r5 = m != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf.doubleValue() / m) : "0.00";
                }
                Regex regex3 = yid.a;
                return r5 == null ? "-" : r5;
            case 16:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics11 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics11.getGameWinningGoals()));
            case 17:
                return new q9k(R.string.hockey_assists_short);
            case 18:
                return new q9k(R.string.ice_hockey_assists);
            case 19:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics12 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics12.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics12.getAssists());
            case 20:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics13 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics13.getClass();
                Integer assists = iceHockeyPlayerSeasonStatistics13.getAssists();
                if (assists != null) {
                    Integer valueOf2 = Integer.valueOf(assists.intValue());
                    int m2 = yid.m(iceHockeyPlayerSeasonStatistics13.getAppearances());
                    r5 = m2 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf2.doubleValue() / m2) : "0.00";
                }
                Regex regex4 = yid.a;
                return r5 == null ? "-" : r5;
            case 21:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics14 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics14.getAssists()));
            case 22:
                return new q9k(R.string.hockey_goals_short);
            case 23:
                return new q9k(R.string.hockey_goals);
            case 24:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics15 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics15.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics15.getGoals());
            case 25:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics16 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics16.getClass();
                Integer goals = iceHockeyPlayerSeasonStatistics16.getGoals();
                if (goals != null) {
                    Integer valueOf3 = Integer.valueOf(goals.intValue());
                    int m3 = yid.m(iceHockeyPlayerSeasonStatistics16.getAppearances());
                    r5 = m3 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf3.doubleValue() / m3) : "0.00";
                }
                Regex regex5 = yid.a;
                return r5 == null ? "-" : r5;
            case 26:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics17 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics17.getGoals()));
            case 27:
                return new q9k(R.string.hockey_goals_short);
            case 28:
                return new q9k(R.string.hockey_goals);
            default:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics18 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics18.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics18.getGoals());
        }
    }
}
