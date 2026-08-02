package defpackage;

import com.appsflyer.internal.i;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bii {
    public static final mqi a = ypa.b(new egi(5));

    public static int a(String str, Integer num, String str2, String str3) {
        if (Intrinsics.c(str, Sports.TENNIS)) {
            return R.string.tennis_draw;
        }
        if (Intrinsics.c(str, Sports.BASEBALL) && !CollectionsKt.R((List) a.getValue(), num)) {
            return R.string.baseball_postseason;
        }
        if (Intrinsics.c(str3, "usa-college")) {
            return R.string.tournament_bracket;
        }
        if (num != null && num.intValue() == 132 && str2 != null) {
            Locale locale = Locale.US;
            String k = i.k(locale, str2, locale);
            if (StringsKt.J(k, "cup", false) || StringsKt.J(k, "tournament", false)) {
                return R.string.tournament_bracket;
            }
        }
        return (num != null && num.intValue() == 132) ? R.string.playoffs : (num != null && num.intValue() == 9464) ? R.string.playoffs : R.string.competition_type_knockout;
    }

    public static int b(String str, boolean z) {
        if (str == null) {
            return R.string.matches;
        }
        switch (str.hashCode()) {
            case -2056128771:
                return !str.equals(Sports.SNOOKER) ? R.string.matches : R.string.snooker_matches;
            case -2005973498:
                return !str.equals(Sports.BADMINTON) ? R.string.matches : R.string.badminton_matches;
            case -1721090992:
                return !str.equals(Sports.BASEBALL) ? R.string.matches : z ? R.string.american_sports_games : R.string.am_football_games_tab;
            case -1452201948:
                return !str.equals(Sports.E_SPORTS) ? R.string.matches : R.string.esport_matches;
            case -877324069:
                return !str.equals(Sports.TENNIS) ? R.string.matches : R.string.tennis_matches;
            case -83759494:
                return !str.equals(Sports.AMERICAN_FOOTBALL) ? R.string.matches : R.string.am_football_games_tab;
            case 108225:
                return !str.equals(Sports.MMA) ? R.string.matches : R.string.events;
            case 95355092:
                return !str.equals(Sports.DARTS) ? R.string.matches : R.string.darts_matches;
            case 203883450:
                return !str.equals(Sports.TABLE_TENNIS) ? R.string.matches : R.string.table_tennis_matches;
            case 400486431:
                return !str.equals(Sports.MOTORSPORT) ? R.string.matches : R.string.series;
            case 727149765:
                return !str.equals(Sports.BASKETBALL) ? R.string.matches : R.string.am_football_games_tab;
            case 1227428899:
                return !str.equals(Sports.CYCLING) ? R.string.matches : R.string.cycling;
            case 1394955557:
                return !str.equals(Sports.TRENDING) ? R.string.matches : R.string.trending;
            default:
                return R.string.matches;
        }
    }
}
