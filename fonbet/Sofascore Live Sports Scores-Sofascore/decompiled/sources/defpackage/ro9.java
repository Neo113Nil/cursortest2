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
public final /* synthetic */ class ro9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ro9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                Double shortHandedSavePercentage = iceHockeyPlayerSeasonStatistics.getShortHandedSavePercentage();
                r4 = shortHandedSavePercentage != null ? rei.a(Double.valueOf(shortHandedSavePercentage.doubleValue()), true) : null;
                Regex regex = yid.a;
                return r4 == null ? "-" : r4;
            case 1:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics2.getShortHandedSavePercentage()));
            case 2:
                return new q9k(R.string.hockey_shorthanded_average_time_on_ice_short);
            case 3:
                return new q9k(R.string.hockey_shorthanded_average_time_on_ice);
            case 4:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics3 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics3.getClass();
                Double a = yid.a(iceHockeyPlayerSeasonStatistics3.getShortHandedTimeOnIce(), iceHockeyPlayerSeasonStatistics3.getAppearances());
                r4 = a != null ? rei.k(wzb.a(a.doubleValue()), false) : null;
                return r4 == null ? "-" : r4;
            case 5:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics4 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics4.getClass();
                Double a2 = yid.a(iceHockeyPlayerSeasonStatistics4.getShortHandedTimeOnIce(), iceHockeyPlayerSeasonStatistics4.getAppearances());
                r4 = a2 != null ? rei.k(wzb.a(a2.doubleValue()), false) : null;
                return r4 == null ? "-" : r4;
            case 6:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics5 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics5.getClass();
                return Double.valueOf(yid.k(yid.a(iceHockeyPlayerSeasonStatistics5.getShortHandedTimeOnIce(), iceHockeyPlayerSeasonStatistics5.getAppearances())));
            case 7:
                return new q9k(R.string.hockey_shots_against_short);
            case 8:
                return new q9k(R.string.shots_against);
            case 9:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics6 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics6.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics6.getShotsAgainst());
            case 10:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics7 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics7.getClass();
                Integer shotsAgainst = iceHockeyPlayerSeasonStatistics7.getShotsAgainst();
                if (shotsAgainst != null) {
                    Integer valueOf = Integer.valueOf(shotsAgainst.intValue());
                    int m = yid.m(iceHockeyPlayerSeasonStatistics7.getAppearances());
                    r4 = m != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf.doubleValue() / m) : "0.00";
                }
                Regex regex2 = yid.a;
                return r4 == null ? "-" : r4;
            case 11:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics8 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics8.getShotsAgainst()));
            case 12:
                return new q9k(R.string.hockey_shots_on_goal_short);
            case 13:
                return new q9k(R.string.legend_hockey_shots_on_goal);
            case 14:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics9 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics9.getClass();
                String y0 = o02.y0(iceHockeyPlayerSeasonStatistics9.getShots());
                Regex regex3 = yid.a;
                return y0;
            case 15:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics10 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics10.getClass();
                Integer shots = iceHockeyPlayerSeasonStatistics10.getShots();
                if (shots != null) {
                    Integer valueOf2 = Integer.valueOf(shots.intValue());
                    int m2 = yid.m(iceHockeyPlayerSeasonStatistics10.getAppearances());
                    r4 = m2 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf2.doubleValue() / m2) : "0.00";
                }
                Regex regex4 = yid.a;
                return r4 == null ? "-" : r4;
            case 16:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics11 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics11.getShots()));
            case 17:
                return new q9k(R.string.hockey_shutouts_short);
            case 18:
                return new q9k(R.string.hockey_shutouts);
            case 19:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics12 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics12.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics12.getShutouts());
            case 20:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics13 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics13.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics13.getShutouts());
            case 21:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics14 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics14.getShutouts()));
            case 22:
                return new q9k(R.string.hockey_takeaways_short);
            case 23:
                return new q9k(R.string.hockey_takeaways);
            case 24:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics15 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics15.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics15.getTakeaways());
            case 25:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics16 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics16.getClass();
                Integer takeaways = iceHockeyPlayerSeasonStatistics16.getTakeaways();
                if (takeaways != null) {
                    Integer valueOf3 = Integer.valueOf(takeaways.intValue());
                    int m3 = yid.m(iceHockeyPlayerSeasonStatistics16.getAppearances());
                    r4 = m3 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf3.doubleValue() / m3) : "0.00";
                }
                Regex regex5 = yid.a;
                return r4 == null ? "-" : r4;
            case 26:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics17 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics17.getTakeaways()));
            case 27:
                return new q9k(R.string.any_sport_wins_short);
            case 28:
                return new q9k(R.string.any_sport_wins_long);
            default:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics18 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics18.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics18.getWins());
        }
    }
}
