package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class wyh {
    public static final Set A;
    public static final Set a = ph0.a0(new String[]{Sports.AMERICAN_FOOTBALL, Sports.BASEBALL, Sports.BASKETBALL, Sports.SNOOKER, Sports.ICE_HOCKEY, Sports.TENNIS, Sports.VOLLEYBALL, Sports.BADMINTON, Sports.DARTS, Sports.TABLE_TENNIS, Sports.BEACH_VOLLEY});
    public static final Set b = ph0.a0(new String[]{Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.WATERPOLO, Sports.BADMINTON, Sports.FLOORBALL, Sports.AUSSIE_RULES, Sports.TABLE_TENNIS, Sports.BEACH_VOLLEY});
    public static final Set c = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.AMERICAN_FOOTBALL, Sports.HANDBALL, Sports.VOLLEYBALL, Sports.ICE_HOCKEY});
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;
    public static final Set h;
    public static final Set i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final Set p;
    public static final Set q;
    public static final Set r;
    public static final Set s;
    public static final Set t;
    public static final Set u;
    public static final Set v;
    public static final Set w;
    public static final Set x;
    public static final Set y;
    public static final Set z;

    static {
        ph0.a0(new String[]{Sports.FOOTBALL, Sports.TENNIS, Sports.HANDBALL, Sports.VOLLEYBALL, Sports.CRICKET, Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.ICE_HOCKEY, Sports.RUGBY, Sports.BASEBALL, Sports.FUTSAL, Sports.AUSSIE_RULES, Sports.WATERPOLO, Sports.SNOOKER, Sports.DARTS, Sports.BADMINTON, Sports.FLOORBALL, Sports.BANDY, Sports.TABLE_TENNIS, Sports.BEACH_VOLLEY, Sports.E_SPORTS, Sports.MINI_FOOTBALL});
        d = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL});
        ph0.a0(new String[]{Sports.FOOTBALL, Sports.HANDBALL, Sports.RUGBY, Sports.FUTSAL, Sports.MINI_FOOTBALL, Sports.BANDY});
        e = ph0.a0(new String[]{Sports.TENNIS, Sports.BADMINTON, Sports.DARTS, Sports.SNOOKER, Sports.MMA, Sports.TABLE_TENNIS, Sports.BEACH_VOLLEY});
        f = ph0.a0(new String[]{Sports.TENNIS, Sports.DARTS, Sports.SNOOKER, Sports.BADMINTON, Sports.TABLE_TENNIS});
        g = ph0.a0(new String[]{Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.AMERICAN_FOOTBALL, Sports.HANDBALL, Sports.FOOTBALL, Sports.MINI_FOOTBALL, Sports.RUGBY, Sports.VOLLEYBALL, Sports.BASEBALL, Sports.FUTSAL});
        h = ph0.a0(new String[]{Sports.BASKETBALL, Sports.FOOTBALL, Sports.HANDBALL, Sports.ICE_HOCKEY, Sports.VOLLEYBALL, Sports.BASEBALL});
        i = ph0.a0(new String[]{Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.HANDBALL, Sports.FOOTBALL, Sports.TENNIS, Sports.RUGBY, Sports.VOLLEYBALL, Sports.FUTSAL});
        j = ph0.a0(new String[]{Sports.FOOTBALL, Sports.AMERICAN_FOOTBALL, Sports.BASKETBALL, Sports.BASEBALL});
        k = ph0.a0(new String[]{Sports.BASKETBALL, Sports.VOLLEYBALL});
        l = ph0.a0(new String[]{Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.AMERICAN_FOOTBALL, Sports.HANDBALL, Sports.BASEBALL, Sports.RUGBY, Sports.VOLLEYBALL});
        m = ph0.a0(new String[]{Sports.AMERICAN_FOOTBALL, Sports.BASKETBALL, Sports.FOOTBALL, Sports.BASEBALL, Sports.ICE_HOCKEY});
        n = ph0.a0(new String[]{Sports.AMERICAN_FOOTBALL, Sports.BASKETBALL, Sports.BASEBALL});
        o = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL});
        p = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL});
        q = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.TENNIS});
        r = ph0.a0(new String[]{Sports.TENNIS, Sports.DARTS, Sports.TABLE_TENNIS, Sports.BADMINTON});
        s = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.VOLLEYBALL, Sports.HANDBALL, Sports.CRICKET, Sports.AMERICAN_FOOTBALL, Sports.RUGBY, Sports.FUTSAL, Sports.MINI_FOOTBALL, Sports.WATERPOLO, Sports.AUSSIE_RULES, Sports.FLOORBALL, Sports.BANDY});
        t = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.VOLLEYBALL, Sports.HANDBALL, Sports.E_SPORTS, Sports.BASEBALL, Sports.CRICKET, Sports.AMERICAN_FOOTBALL, Sports.RUGBY, Sports.FUTSAL, Sports.MINI_FOOTBALL, Sports.AUSSIE_RULES});
        u = ph0.a0(new String[]{Sports.BASEBALL, Sports.BASKETBALL, Sports.FOOTBALL, Sports.TENNIS});
        v = ph0.a0(new String[]{Sports.FOOTBALL, Sports.TENNIS});
        w = ph0.a0(new String[]{Sports.FOOTBALL, Sports.HANDBALL, Sports.VOLLEYBALL, Sports.CRICKET, Sports.BASKETBALL, Sports.AMERICAN_FOOTBALL, Sports.ICE_HOCKEY, Sports.RUGBY, Sports.BASEBALL, Sports.FUTSAL, Sports.MINI_FOOTBALL});
        x = ph0.a0(new String[]{Sports.TENNIS, Sports.BADMINTON, Sports.E_SPORTS, Sports.TABLE_TENNIS, Sports.SNOOKER, Sports.DARTS});
        y = ph0.a0(new String[]{Sports.MOTORSPORT, Sports.CYCLING});
        z = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.HANDBALL, Sports.AMERICAN_FOOTBALL, Sports.MINI_FOOTBALL, Sports.CRICKET, Sports.VOLLEYBALL, Sports.RUGBY, Sports.BASEBALL});
        A = ph0.a0(new String[]{Sports.TENNIS, Sports.TABLE_TENNIS, Sports.BADMINTON});
    }

    public static int a(String str) {
        if (str == null) {
            return R.drawable.ic_football;
        }
        switch (str.hashCode()) {
            case -2056128771:
                return !str.equals(Sports.SNOOKER) ? R.drawable.ic_football : R.drawable.ic_snooker;
            case -2005973498:
                return !str.equals(Sports.BADMINTON) ? R.drawable.ic_football : R.drawable.ic_badminton;
            case -2002238939:
                return !str.equals(Sports.ICE_HOCKEY) ? R.drawable.ic_football : R.drawable.ic_ice_hockey;
            case -1721090992:
                return !str.equals(Sports.BASEBALL) ? R.drawable.ic_football : R.drawable.ic_baseball;
            case -1711979509:
                return !str.equals(Sports.FLOORBALL) ? R.drawable.ic_football : R.drawable.ic_floorball;
            case -1452201948:
                return !str.equals(Sports.E_SPORTS) ? R.drawable.ic_football : R.drawable.ic_esport;
            case -1263172551:
                return !str.equals(Sports.FUTSAL) ? R.drawable.ic_football : R.drawable.ic_futsal_24;
            case -1160328212:
                return !str.equals(Sports.VOLLEYBALL) ? R.drawable.ic_football : R.drawable.ic_volleyball;
            case -877324069:
                return !str.equals(Sports.TENNIS) ? R.drawable.ic_football : R.drawable.ic_tennis;
            case -433846249:
                return !str.equals(Sports.BEACH_VOLLEY) ? R.drawable.ic_football : R.drawable.ic_beach_volleyball;
            case -213321383:
                return !str.equals(Sports.WATERPOLO) ? R.drawable.ic_football : R.drawable.ic_waterpolo;
            case -83759494:
                return !str.equals(Sports.AMERICAN_FOOTBALL) ? R.drawable.ic_football : R.drawable.ic_american_football;
            case 108225:
                return !str.equals(Sports.MMA) ? R.drawable.ic_football : R.drawable.ic_mma;
            case 1767150:
                return !str.equals(Sports.HANDBALL) ? R.drawable.ic_football : R.drawable.ic_handball;
            case 93503716:
                return !str.equals(Sports.BANDY) ? R.drawable.ic_football : R.drawable.ic_bandy;
            case 95355092:
                return !str.equals(Sports.DARTS) ? R.drawable.ic_football : R.drawable.ic_darts;
            case 108869083:
                return !str.equals(Sports.RUGBY) ? R.drawable.ic_football : R.drawable.ic_rugby;
            case 203883450:
                return !str.equals(Sports.TABLE_TENNIS) ? R.drawable.ic_football : R.drawable.ic_table_tennis;
            case 394668909:
                str.equals(Sports.FOOTBALL);
                return R.drawable.ic_football;
            case 400486431:
                return !str.equals(Sports.MOTORSPORT) ? R.drawable.ic_football : R.drawable.ic_motorsport;
            case 470363802:
                return !str.equals(Sports.AUSSIE_RULES) ? R.drawable.ic_football : R.drawable.ic_aussie_rules;
            case 727149765:
                return !str.equals(Sports.BASKETBALL) ? R.drawable.ic_football : R.drawable.ic_basketball;
            case 932645060:
                return !str.equals(Sports.MINI_FOOTBALL) ? R.drawable.ic_football : R.drawable.ic_minifootball_24;
            case 1032299505:
                return !str.equals(Sports.CRICKET) ? R.drawable.ic_football : R.drawable.ic_cricket;
            case 1227428899:
                return !str.equals(Sports.CYCLING) ? R.drawable.ic_football : R.drawable.ic_cycling;
            case 1394955557:
                return !str.equals(Sports.TRENDING) ? R.drawable.ic_football : R.drawable.ic_trending_fire;
            default:
                return R.drawable.ic_football;
        }
    }

    public static Integer b(String str) {
        return Intrinsics.c(str, Sports.AMERICAN_FOOTBALL) ? Integer.valueOf(R.string.american_football_short) : d(str);
    }

    public static final String c(Context context, String str) {
        String string;
        context.getClass();
        Integer d2 = d(str);
        return (d2 == null || (string = context.getString(d2.intValue())) == null) ? str == null ? "" : str : string;
    }

    public static Integer d(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2056128771:
                if (str.equals(Sports.SNOOKER)) {
                    return Integer.valueOf(R.string.snooker);
                }
                return null;
            case -2005973498:
                if (str.equals(Sports.BADMINTON)) {
                    return Integer.valueOf(R.string.badminton);
                }
                return null;
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    return Integer.valueOf(R.string.ice_hockey);
                }
                return null;
            case -1721090992:
                if (str.equals(Sports.BASEBALL)) {
                    return Integer.valueOf(R.string.baseball);
                }
                return null;
            case -1711979509:
                if (str.equals(Sports.FLOORBALL)) {
                    return Integer.valueOf(R.string.floorball);
                }
                return null;
            case -1452201948:
                if (str.equals(Sports.E_SPORTS)) {
                    return Integer.valueOf(R.string.esports);
                }
                return null;
            case -1263172551:
                if (str.equals(Sports.FUTSAL)) {
                    return Integer.valueOf(R.string.futsal);
                }
                return null;
            case -1160328212:
                if (str.equals(Sports.VOLLEYBALL)) {
                    return Integer.valueOf(R.string.volleyball);
                }
                return null;
            case -877324069:
                if (str.equals(Sports.TENNIS)) {
                    return Integer.valueOf(R.string.tennis);
                }
                return null;
            case -433846249:
                if (str.equals(Sports.BEACH_VOLLEY)) {
                    return Integer.valueOf(R.string.beach_volley);
                }
                return null;
            case -213321383:
                if (str.equals(Sports.WATERPOLO)) {
                    return Integer.valueOf(R.string.waterpolo);
                }
                return null;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    return Integer.valueOf(R.string.american_football);
                }
                return null;
            case 108225:
                if (str.equals(Sports.MMA)) {
                    return Integer.valueOf(R.string.mma);
                }
                return null;
            case 1767150:
                if (str.equals(Sports.HANDBALL)) {
                    return Integer.valueOf(R.string.handball);
                }
                return null;
            case 93503716:
                if (str.equals(Sports.BANDY)) {
                    return Integer.valueOf(R.string.bandy);
                }
                return null;
            case 95355092:
                if (str.equals(Sports.DARTS)) {
                    return Integer.valueOf(R.string.darts);
                }
                return null;
            case 108869083:
                if (str.equals(Sports.RUGBY)) {
                    return Integer.valueOf(R.string.rugby);
                }
                return null;
            case 203883450:
                if (str.equals(Sports.TABLE_TENNIS)) {
                    return Integer.valueOf(R.string.table_tennis);
                }
                return null;
            case 394668909:
                if (str.equals(Sports.FOOTBALL)) {
                    return Integer.valueOf(R.string.football);
                }
                return null;
            case 400486431:
                if (str.equals(Sports.MOTORSPORT)) {
                    return Integer.valueOf(R.string.motorsport);
                }
                return null;
            case 470363802:
                if (str.equals(Sports.AUSSIE_RULES)) {
                    return Integer.valueOf(R.string.aussie_rules);
                }
                return null;
            case 727149765:
                if (str.equals(Sports.BASKETBALL)) {
                    return Integer.valueOf(R.string.basketball);
                }
                return null;
            case 932645060:
                if (str.equals(Sports.MINI_FOOTBALL)) {
                    return Integer.valueOf(zu3.h.hasMcc(Integer.valueOf(ke0.c)) ? R.string.fut7 : R.string.sport_minifootball);
                }
                return null;
            case 1032299505:
                if (str.equals(Sports.CRICKET)) {
                    return Integer.valueOf(R.string.cricket);
                }
                return null;
            case 1227428899:
                if (str.equals(Sports.CYCLING)) {
                    return Integer.valueOf(R.string.cycling);
                }
                return null;
            case 1394955557:
                if (str.equals(Sports.TRENDING)) {
                    return Integer.valueOf(R.string.trending);
                }
                return null;
            default:
                return null;
        }
    }

    public static boolean e(String str) {
        return CollectionsKt.R(e, str);
    }

    public static boolean f(String str) {
        return CollectionsKt.R(v, str);
    }

    public static boolean g(String str) {
        str.getClass();
        return !str.equals(Sports.BASEBALL) && l.contains(str);
    }

    public static boolean h(String str) {
        return j.contains(str);
    }

    public static boolean i(String str) {
        return CollectionsKt.R(q, str);
    }

    public static boolean j(Tournament tournament) {
        tournament.getClass();
        if (tournament.getId() == 2843) {
            return false;
        }
        return a.contains(tournament.getCategory().getSport().getSlug());
    }

    public static boolean k(String str) {
        str.getClass();
        return r.contains(str);
    }

    public static boolean l(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2002238939:
                return str.equals(Sports.ICE_HOCKEY);
            case -1721090992:
                return str.equals(Sports.BASEBALL);
            case -1711979509:
                return str.equals(Sports.FLOORBALL);
            case -1452201948:
                return str.equals(Sports.E_SPORTS);
            case -1263172551:
                return str.equals(Sports.FUTSAL);
            case -1160328212:
                return str.equals(Sports.VOLLEYBALL);
            case -213321383:
                return str.equals(Sports.WATERPOLO);
            case -83759494:
                return str.equals(Sports.AMERICAN_FOOTBALL);
            case 1767150:
                return str.equals(Sports.HANDBALL);
            case 93503716:
                return str.equals(Sports.BANDY);
            case 108869083:
                return str.equals(Sports.RUGBY);
            case 394668909:
                return str.equals(Sports.FOOTBALL);
            case 470363802:
                return str.equals(Sports.AUSSIE_RULES);
            case 727149765:
                return str.equals(Sports.BASKETBALL);
            case 932645060:
                return str.equals(Sports.MINI_FOOTBALL);
            default:
                return false;
        }
    }

    public static boolean m(String str) {
        return CollectionsKt.R(y, str);
    }
}
