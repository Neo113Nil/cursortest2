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
public final /* synthetic */ class ko9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ko9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                Double powerPlaySavePercentage = iceHockeyPlayerSeasonStatistics.getPowerPlaySavePercentage();
                r5 = powerPlaySavePercentage != null ? rei.a(Double.valueOf(powerPlaySavePercentage.doubleValue()), true) : null;
                Regex regex = yid.a;
                return r5 == null ? "-" : r5;
            case 1:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics2.getPowerPlaySavePercentage()));
            case 2:
                return new q9k(R.string.hockey_powerplay_average_time_on_ice_short);
            case 3:
                return new q9k(R.string.hockey_powerplay_average_time_on_ice);
            case 4:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics3 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics3.getClass();
                Double a = yid.a(iceHockeyPlayerSeasonStatistics3.getPowerPlayTimeOnIce(), iceHockeyPlayerSeasonStatistics3.getAppearances());
                r5 = a != null ? rei.k(wzb.a(a.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
            case 5:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics4 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics4.getClass();
                Double a2 = yid.a(iceHockeyPlayerSeasonStatistics4.getPowerPlayTimeOnIce(), iceHockeyPlayerSeasonStatistics4.getAppearances());
                r5 = a2 != null ? rei.k(wzb.a(a2.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
            case 6:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics5 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics5.getClass();
                return Double.valueOf(yid.k(yid.a(iceHockeyPlayerSeasonStatistics5.getPowerPlayTimeOnIce(), iceHockeyPlayerSeasonStatistics5.getAppearances())));
            case 7:
                return new q9k(R.string.hockey_save_percentage_short);
            case 8:
                return new q9k(R.string.hockey_save_percentage);
            case 9:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics6 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics6.getClass();
                Double savePercentage = iceHockeyPlayerSeasonStatistics6.getSavePercentage();
                r5 = savePercentage != null ? rei.a(Double.valueOf(savePercentage.doubleValue()), true) : null;
                Regex regex2 = yid.a;
                return r5 == null ? "-" : r5;
            case 10:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics7 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics7.getClass();
                Double savePercentage2 = iceHockeyPlayerSeasonStatistics7.getSavePercentage();
                r5 = savePercentage2 != null ? rei.a(Double.valueOf(savePercentage2.doubleValue()), true) : null;
                Regex regex3 = yid.a;
                return r5 == null ? "-" : r5;
            case 11:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics8 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics8.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics8.getSavePercentage()));
            case 12:
                return new q9k(R.string.hockey_shooting_percentage_short);
            case 13:
                return new q9k(R.string.shot_percentage);
            case 14:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics9 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics9.getClass();
                Double shotPercentage = iceHockeyPlayerSeasonStatistics9.getShotPercentage();
                r5 = shotPercentage != null ? o02.P(shotPercentage.doubleValue(), true) : null;
                Regex regex4 = yid.a;
                return r5 == null ? "-" : r5;
            case 15:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics10 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics10.getClass();
                Double shotPercentage2 = iceHockeyPlayerSeasonStatistics10.getShotPercentage();
                r5 = shotPercentage2 != null ? o02.P(shotPercentage2.doubleValue(), true) : null;
                Regex regex5 = yid.a;
                return r5 == null ? "-" : r5;
            case 16:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics11 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics11.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics11.getShotPercentage()));
            case 17:
                return new q9k(R.string.hockey_shorthanded_assists_short);
            case 18:
                return new q9k(R.string.hockey_shorthanded_assists);
            case 19:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics12 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics12.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics12.getShortHandedAssists());
            case 20:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics13 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics13.getClass();
                Integer shortHandedAssists = iceHockeyPlayerSeasonStatistics13.getShortHandedAssists();
                if (shortHandedAssists != null) {
                    Integer valueOf = Integer.valueOf(shortHandedAssists.intValue());
                    int m = yid.m(iceHockeyPlayerSeasonStatistics13.getAppearances());
                    r5 = m != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf.doubleValue() / m) : "0.00";
                }
                Regex regex6 = yid.a;
                return r5 == null ? "-" : r5;
            case 21:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics14 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics14.getShortHandedAssists()));
            case 22:
                return new q9k(R.string.hockey_shorthanded_goals_short);
            case 23:
                return new q9k(R.string.hockey_shorthanded_goals);
            case 24:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics15 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics15.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics15.getShortHandedGoals());
            case 25:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics16 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics16.getClass();
                Integer shortHandedGoals = iceHockeyPlayerSeasonStatistics16.getShortHandedGoals();
                if (shortHandedGoals != null) {
                    Integer valueOf2 = Integer.valueOf(shortHandedGoals.intValue());
                    int m2 = yid.m(iceHockeyPlayerSeasonStatistics16.getAppearances());
                    r5 = m2 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf2.doubleValue() / m2) : "0.00";
                }
                Regex regex7 = yid.a;
                return r5 == null ? "-" : r5;
            case 26:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics17 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics17.getShortHandedGoals()));
            case 27:
                return new q9k(R.string.hockey_shorthanded_save_percentage_short);
            case 28:
                return new q9k(R.string.hockey_shorthanded_save_percentage);
            default:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics18 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics18.getClass();
                Double shortHandedSavePercentage = iceHockeyPlayerSeasonStatistics18.getShortHandedSavePercentage();
                r5 = shortHandedSavePercentage != null ? rei.a(Double.valueOf(shortHandedSavePercentage.doubleValue()), true) : null;
                Regex regex8 = yid.a;
                return r5 == null ? "-" : r5;
        }
    }
}
