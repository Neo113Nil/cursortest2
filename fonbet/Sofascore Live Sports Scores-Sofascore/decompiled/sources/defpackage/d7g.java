package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.results.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class d7g {
    public static final Regex a = new Regex("^(?:Round )?(\\d+)$");

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer a(String str, String str2) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1866976834:
                if (str.equals("Match for 5th place")) {
                    return Integer.valueOf(R.string.match_for_5th_place);
                }
                return null;
            case -1822468349:
                if (str.equals("Season")) {
                    return Integer.valueOf(R.string.season);
                }
                return null;
            case -1670738103:
                if (!str.equals("Quarterfinals")) {
                    return null;
                }
                return Integer.valueOf(!Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL) ? R.string.american_football_divisional_round : R.string.quarterfinals);
            case -1485348151:
                if (str.equals("Playoff round")) {
                    return Integer.valueOf(R.string.playoff_round);
                }
                return null;
            case -1287118745:
                if (!str.equals("3rd place playoff")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            case -1245975316:
                if (!str.equals("3rd place playoffs")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            case -992736006:
                if (!str.equals("Match for 3rd place")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            case -980161677:
                if (str.equals("Pre-tournament")) {
                    return Integer.valueOf(R.string.pre_tournament);
                }
                return null;
            case -885178774:
                if (!str.equals("Quarterfinal")) {
                    return null;
                }
                return Integer.valueOf(!Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL) ? R.string.american_football_divisional_round : R.string.quarterfinals);
            case -872862390:
                if (str.equals("Division Series")) {
                    return Integer.valueOf(R.string.baseball_division_series);
                }
                return null;
            case -369715236:
                if (!str.equals("Round of 16")) {
                    return null;
                }
                return Integer.valueOf(!Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL) ? R.string.american_football_wild_card : R.string.round_of_16);
            case -369715178:
                if (str.equals("Round of 32")) {
                    return Integer.valueOf(R.string.round_of_32);
                }
                return null;
            case -369715083:
                if (str.equals("Round of 64")) {
                    return Integer.valueOf(R.string.round_of_64);
                }
                return null;
            case -61593210:
                if (str.equals("Wild card")) {
                    return Integer.valueOf(R.string.baseball_wild_card);
                }
                return null;
            case -502788:
                if (!str.equals("Bronzefinal")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            case 48602:
                if (!str.equals("1/8")) {
                    return null;
                }
                return Integer.valueOf(!Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL) ? R.string.american_football_wild_card : R.string.round_of_16);
            case 67883350:
                if (str.equals("Final")) {
                    return Integer.valueOf(R.string.final_string);
                }
                return null;
            case 106389622:
                if (str.equals("League Championship")) {
                    return Integer.valueOf(R.string.baseball_league_championship);
                }
                return null;
            case 167628239:
                if (str.equals("Qualification")) {
                    return Integer.valueOf(R.string.qualification);
                }
                return null;
            case 345284118:
                if (str.equals("Preliminary")) {
                    return Integer.valueOf(R.string.preliminary);
                }
                return null;
            case 914414533:
                if (str.equals("Qualification Final")) {
                    return Integer.valueOf(R.string.qualification_final);
                }
                return null;
            case 1160296226:
                if (!str.equals("3rd place final")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            case 1178583813:
                if (str.equals("World Series")) {
                    return Integer.valueOf(R.string.baseball_world_series);
                }
                return null;
            case 1292469928:
                if (!str.equals("Semifinal")) {
                    return null;
                }
                return Integer.valueOf(R.string.semifinals);
            case 1411862219:
                if (!str.equals("Semifinals")) {
                    return null;
                }
                return Integer.valueOf(R.string.semifinals);
            case 1423729504:
                if (str.equals("Round of 128")) {
                    return Integer.valueOf(R.string.round_of_128);
                }
                return null;
            case 1789189025:
                if (str.equals("Round of 8")) {
                    return Integer.valueOf(R.string.round_of_8);
                }
                return null;
            case 1998221754:
                if (!str.equals("Bronze")) {
                    return null;
                }
                return Integer.valueOf(R.string.third_place);
            default:
                return null;
        }
    }

    public static String b(Context context, Round round, boolean z, String str) {
        String format;
        String prefix;
        context.getClass();
        Regex regex = new Regex("^\\D* \\d");
        String name = round != null ? round.getName() : null;
        if (round == null) {
            return "";
        }
        if (name == null || name.length() == 0 || (prefix = round.getPrefix()) == null || prefix.length() == 0) {
            boolean f = name != null ? regex.f(name) : false;
            int i = R.string.round;
            if (f && round.getRound() != null) {
                Locale d = dla.d();
                if (Intrinsics.c(str, Sports.AMERICAN_FOOTBALL)) {
                    i = R.string.week_number;
                }
                format = String.format(d, "%s %d", Arrays.copyOf(new Object[]{context.getString(i), round.getRound()}, 2));
            } else if (name == null || name.length() == 0) {
                String prefix2 = round.getPrefix();
                if (prefix2 == null || prefix2.length() == 0) {
                    Integer round2 = round.getRound();
                    Locale d2 = dla.d();
                    if (Intrinsics.c(str, Sports.AMERICAN_FOOTBALL)) {
                        i = R.string.week_number;
                    }
                    format = String.format(d2, "%s %d", Arrays.copyOf(new Object[]{context.getString(i), round2}, 2));
                } else {
                    String c = c(context, round.getPrefix(), str);
                    Locale d3 = dla.d();
                    if (Intrinsics.c(str, Sports.AMERICAN_FOOTBALL)) {
                        i = R.string.week_number;
                    }
                    format = lnb.o(c, ", ", String.format(d3, "%s %d", Arrays.copyOf(new Object[]{context.getString(i), round.getRound()}, 2)));
                }
            } else {
                format = c(context, name, str);
            }
        } else {
            format = lnb.o(c(context, round.getPrefix(), str), " ", c(context, name, str));
        }
        return z ? ", ".concat(format) : format;
    }

    public static String c(Context context, String str, String str2) {
        context.getClass();
        if (str == null) {
            return "";
        }
        Integer a2 = a(str, str2);
        if (a2 != null) {
            String string = context.getString(a2.intValue());
            string.getClass();
            return string;
        }
        txb e = a.e(str);
        if (e == null) {
            return str;
        }
        return wv8.i(context.getString(R.string.round), " ", (String) ((sxb) e.a()).get(1));
    }
}
