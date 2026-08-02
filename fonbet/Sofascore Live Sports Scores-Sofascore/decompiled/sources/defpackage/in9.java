package defpackage;

import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
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
public final /* synthetic */ class in9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ in9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics.getShots() != null);
            case 1:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(iceHockeyPlayerEventStatistics2.getHits()));
            case 2:
                return new q9k(R.string.hockey_assists_short);
            case 3:
                return new q9k(R.string.ice_hockey_assists);
            case 4:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics.getAssists());
            case 5:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                Integer assists = iceHockeyPlayerSeasonStatistics2.getAssists();
                if (assists != null) {
                    Integer valueOf = Integer.valueOf(assists.intValue());
                    int m = yid.m(iceHockeyPlayerSeasonStatistics2.getAppearances());
                    r5 = m != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf.doubleValue() / m) : "0.00";
                }
                Regex regex = yid.a;
                return r5 == null ? "-" : r5;
            case 6:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics3 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics3.getAssists()));
            case 7:
                return new q9k(R.string.hockey_average_shifts_short);
            case 8:
                return new q9k(R.string.hockey_average_shifts);
            case 9:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics4 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics4.getClass();
                Double a = yid.a(iceHockeyPlayerSeasonStatistics4.getShifts(), iceHockeyPlayerSeasonStatistics4.getAppearances());
                r5 = a != null ? o02.P(a.doubleValue(), false) : null;
                return r5 == null ? "-" : r5;
            case 10:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics5 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics5.getClass();
                Double a2 = yid.a(iceHockeyPlayerSeasonStatistics5.getShifts(), iceHockeyPlayerSeasonStatistics5.getAppearances());
                r5 = a2 != null ? o02.P(a2.doubleValue(), false) : null;
                return r5 == null ? "-" : r5;
            case 11:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics6 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics6.getClass();
                return Double.valueOf(yid.k(yid.a(iceHockeyPlayerSeasonStatistics6.getShifts(), iceHockeyPlayerSeasonStatistics6.getAppearances())));
            case 12:
                return new q9k(R.string.hockey_average_time_on_ice_short);
            case 13:
                return new q9k(R.string.hockey_average_time_on_ice);
            case 14:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics7 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics7.getClass();
                Double a3 = yid.a(iceHockeyPlayerSeasonStatistics7.getTimeOnIce(), iceHockeyPlayerSeasonStatistics7.getAppearances());
                r5 = a3 != null ? rei.k(wzb.a(a3.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
            case 15:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics8 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics8.getClass();
                Double a4 = yid.a(iceHockeyPlayerSeasonStatistics8.getTimeOnIce(), iceHockeyPlayerSeasonStatistics8.getAppearances());
                r5 = a4 != null ? rei.k(wzb.a(a4.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
            case 16:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics9 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics9.getClass();
                return Double.valueOf(yid.k(yid.a(iceHockeyPlayerSeasonStatistics9.getTimeOnIce(), iceHockeyPlayerSeasonStatistics9.getAppearances())));
            case 17:
                return new q9k(R.string.hockey_blocked_shots_short);
            case 18:
                return new q9k(R.string.hockey_blocked_shots);
            case 19:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics10 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics10.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics10.getBlocked());
            case 20:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics11 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics11.getClass();
                Integer blocked = iceHockeyPlayerSeasonStatistics11.getBlocked();
                if (blocked != null) {
                    Integer valueOf2 = Integer.valueOf(blocked.intValue());
                    int m2 = yid.m(iceHockeyPlayerSeasonStatistics11.getAppearances());
                    r5 = m2 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf2.doubleValue() / m2) : "0.00";
                }
                Regex regex2 = yid.a;
                return r5 == null ? "-" : r5;
            case 21:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics12 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics12.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics12.getBlocked()));
            case 22:
                return new q9k(R.string.hockey_even_strength_save_percentage_short);
            case 23:
                return new q9k(R.string.hockey_even_save_percentage);
            case 24:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics13 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics13.getClass();
                Double evenSavePercentage = iceHockeyPlayerSeasonStatistics13.getEvenSavePercentage();
                r5 = evenSavePercentage != null ? rei.a(Double.valueOf(evenSavePercentage.doubleValue()), true) : null;
                Regex regex3 = yid.a;
                return r5 == null ? "-" : r5;
            case 25:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics14 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics14.getClass();
                Double evenSavePercentage2 = iceHockeyPlayerSeasonStatistics14.getEvenSavePercentage();
                r5 = evenSavePercentage2 != null ? rei.a(Double.valueOf(evenSavePercentage2.doubleValue()), true) : null;
                Regex regex4 = yid.a;
                return r5 == null ? "-" : r5;
            case 26:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics15 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics15.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics15.getEvenSavePercentage()));
            case 27:
                return new q9k(R.string.hockey_average_even_strength_time_on_ice_short);
            case 28:
                return new q9k(R.string.hockey_even_strength_average_time_on_ice);
            default:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics16 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics16.getClass();
                Double a5 = yid.a(iceHockeyPlayerSeasonStatistics16.getEvenTimeOnIce(), iceHockeyPlayerSeasonStatistics16.getAppearances());
                r5 = a5 != null ? rei.k(wzb.a(a5.doubleValue()), false) : null;
                return r5 == null ? "-" : r5;
        }
    }
}
