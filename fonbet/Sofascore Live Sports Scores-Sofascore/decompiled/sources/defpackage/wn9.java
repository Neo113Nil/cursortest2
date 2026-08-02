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
public final /* synthetic */ class wn9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wn9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                Integer goals = iceHockeyPlayerSeasonStatistics.getGoals();
                if (goals != null) {
                    Integer valueOf = Integer.valueOf(goals.intValue());
                    int m = yid.m(iceHockeyPlayerSeasonStatistics.getAppearances());
                    r4 = m != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf.doubleValue() / m) : "0.00";
                }
                Regex regex = yid.a;
                return r4 == null ? "-" : r4;
            case 1:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics2.getGoals()));
            case 2:
                return new q9k(R.string.hockey_goals_against_average_short);
            case 3:
                return new q9k(R.string.goals_against_average);
            case 4:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics3 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics3.getClass();
                Double goalsAgainstAverage = iceHockeyPlayerSeasonStatistics3.getGoalsAgainstAverage();
                r4 = goalsAgainstAverage != null ? yid.c("%.2f", goalsAgainstAverage) : null;
                Regex regex2 = yid.a;
                return r4 == null ? "-" : r4;
            case 5:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics4 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics4.getClass();
                Double goalsAgainstAverage2 = iceHockeyPlayerSeasonStatistics4.getGoalsAgainstAverage();
                r4 = goalsAgainstAverage2 != null ? yid.c("%.2f", goalsAgainstAverage2) : null;
                Regex regex3 = yid.a;
                return r4 == null ? "-" : r4;
            case 6:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics5 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics5.getClass();
                return Double.valueOf(yid.k(iceHockeyPlayerSeasonStatistics5.getGoalsAgainstAverage()));
            case 7:
                return new q9k(R.string.hockey_hits_short);
            case 8:
                return new q9k(R.string.hockey_hits);
            case 9:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics6 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics6.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics6.getHits());
            case 10:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics7 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics7.getClass();
                Integer hits = iceHockeyPlayerSeasonStatistics7.getHits();
                if (hits != null) {
                    Integer valueOf2 = Integer.valueOf(hits.intValue());
                    int m2 = yid.m(iceHockeyPlayerSeasonStatistics7.getAppearances());
                    r4 = m2 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf2.doubleValue() / m2) : "0.00";
                }
                Regex regex4 = yid.a;
                return r4 == null ? "-" : r4;
            case 11:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics8 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics8.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics8.getHits()));
            case 12:
                return new q9k(R.string.any_sport_losses_short);
            case 13:
                return new q9k(R.string.any_sport_losses_long);
            case 14:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics9 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics9.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics9.getLosses());
            case 15:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics10 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics10.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics10.getLosses());
            case 16:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics11 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics11.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics11.getLosses()));
            case 17:
                return new q9k(R.string.hockey_overtime_goals_short);
            case 18:
                return new q9k(R.string.over_time_goals);
            case 19:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics12 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics12.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics12.getOverTimeGoals());
            case 20:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics13 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics13.getClass();
                Integer overTimeGoals = iceHockeyPlayerSeasonStatistics13.getOverTimeGoals();
                if (overTimeGoals != null) {
                    Integer valueOf3 = Integer.valueOf(overTimeGoals.intValue());
                    int m3 = yid.m(iceHockeyPlayerSeasonStatistics13.getAppearances());
                    r4 = m3 != 0 ? ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, valueOf3.doubleValue() / m3) : "0.00";
                }
                Regex regex5 = yid.a;
                return r4 == null ? "-" : r4;
            case 21:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics14 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics14.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics14.getOverTimeGoals()));
            case 22:
                return new q9k(R.string.hockey_overtime_shootout_losses_short);
            case 23:
                return new q9k(R.string.hockey_overtime_shootout_losses);
            case 24:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics15 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics15.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics15.getOverTimeLosses());
            case 25:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics16 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics16.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics16.getOverTimeLosses());
            case 26:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics17 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics17.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics17.getOverTimeLosses()));
            case 27:
                return new q9k(R.string.hockey_penalty_minutes_short);
            case 28:
                return new q9k(R.string.hockey_penalty_minutes);
            default:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics18 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics18.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics18.getPenaltyMinutes());
        }
    }
}
