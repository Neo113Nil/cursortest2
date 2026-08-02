package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.MessageFormat;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rld {
    public static boolean a(int i) {
        return zu3.V.hasMcc(Integer.valueOf(i)) || zu3.d0.hasMcc(Integer.valueOf(i)) || zu3.z.hasMcc(Integer.valueOf(i));
    }

    public static double b(String str) {
        str.getClass();
        String[] strArr = (String[]) new Regex("/").h(str).toArray(new String[0]);
        if (strArr.length != 2) {
            throw new NumberFormatException(str);
        }
        double parseDouble = Double.parseDouble(strArr[0]);
        double parseDouble2 = Double.parseDouble(strArr[1]);
        if (parseDouble2 > 0.0d) {
            return (parseDouble / parseDouble2) + 1.0d;
        }
        throw new NumberFormatException(str);
    }

    public static Double c(String str) {
        List h = new Regex("/").h(str);
        String str2 = (String) CollectionsKt.firstOrNull(h);
        Double f = str2 != null ? b.f(str2) : null;
        String str3 = (String) CollectionsKt.a0(1, h);
        Double f2 = str3 != null ? b.f(str3) : null;
        if (f != null) {
            if (((f2 == null || f2.doubleValue() == 0.0d) ? null : f2) != null) {
                return Double.valueOf((f.doubleValue() / f2.doubleValue()) + 1.0d);
            }
        }
        if (f != null) {
            return Double.valueOf(f.doubleValue() + 1.0d);
        }
        return null;
    }

    public static String d(String str, Double d) {
        Object u2gVar;
        if (d == null || str == null || str.length() == 0 || str.equals("-")) {
            return str;
        }
        try {
            p2g p2gVar = w2g.b;
            double c = wzb.c((((1.0d - d.doubleValue()) * b(str)) + 0.001d) / 0.05d) * 0.05d;
            if (c < 1.0d) {
                c = 1.0d;
            }
            u2gVar = Double.valueOf(c);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Double d2 = (Double) u2gVar;
        if (d2 == null) {
            return "-";
        }
        long round = Math.round(((Math.floor(d2.doubleValue() * 100.0d) / 100.0d) - 1.0d) * 100.0d);
        long g = g(round, 100L);
        String g2 = fc6.g((int) (round / g), (int) (100 / g), "/");
        return g2.equals("333/100") ? "10/3" : g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List e(Integer num, List list) {
        Object obj;
        OddsCountryProvider oddsCountryProvider;
        OddsCountryProvider copy;
        Object obj2;
        if (num == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((OddsCountryProvider) obj).getProvider().getId() == num.intValue()) {
                break;
            }
        }
        OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) obj;
        if (oddsCountryProvider2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<OddsCountryProvider> subProviders = ((OddsCountryProvider) it2.next()).getSubProviders();
                if (subProviders != null) {
                    Iterator<T> it3 = subProviders.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (((OddsCountryProvider) obj2).getProvider().getId() == num.intValue()) {
                            break;
                        }
                    }
                    oddsCountryProvider2 = (OddsCountryProvider) obj2;
                } else {
                    oddsCountryProvider2 = null;
                }
                if (oddsCountryProvider2 != null) {
                }
            }
            oddsCountryProvider = null;
            if (oddsCountryProvider != null) {
                return null;
            }
            copy = oddsCountryProvider.copy((r34 & 1) != 0 ? oddsCountryProvider.provider : null, (r34 & 2) != 0 ? oddsCountryProvider.branded : false, (r34 & 4) != 0 ? oddsCountryProvider.featuredOddsType : null, (r34 & 8) != 0 ? oddsCountryProvider.defaultBetSlipLink : null, (r34 & 16) != 0 ? oddsCountryProvider.betSlipLink : null, (r34 & 32) != 0 ? oddsCountryProvider.group : null, (r34 & 64) != 0 ? oddsCountryProvider.fallbackProvider : null, (r34 & 128) != 0 ? oddsCountryProvider.oddsOffset : null, (r34 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? oddsCountryProvider.impressionCostEncrypted : null, (r34 & 512) != 0 ? oddsCountryProvider.sort : null, (r34 & 1024) != 0 ? oddsCountryProvider.weight : 0, (r34 & a.o) != 0 ? oddsCountryProvider.oddsMayDiffer : null, (r34 & 4096) != 0 ? oddsCountryProvider.signupLink : null, (r34 & 8192) != 0 ? oddsCountryProvider.featuredUniqueTournamentId : null, (r34 & 16384) != 0 ? oddsCountryProvider.featuredOddsDisplayArea : null, (r34 & 32768) != 0 ? oddsCountryProvider.type : null);
            copy.setImpressionCostDecrypted(oddsCountryProvider.getImpressionCostDecrypted());
            return kotlin.collections.a.c(copy);
        }
        oddsCountryProvider = oddsCountryProvider2;
        if (oddsCountryProvider != null) {
        }
    }

    public static String f(Context context, boolean z) {
        context.getClass();
        String q = z ? dmi.q("\n", context.getString(R.string.disclaimer_odds_may_differ)) : "";
        Country e = dv3.e();
        String string = context.getString(R.string.gamble_responsibly, yid.e(3, null, 18));
        string.getClass();
        if (Intrinsics.c(e, zu3.u0)) {
            string = string.concat(" | www.begambleaware.org");
        } else if (Intrinsics.c(e, zu3.d)) {
            string = string.concat(" | www.gamblinghelponline.org.au");
        } else if (Intrinsics.c(e, zu3.j)) {
            string = string.concat(" | nss-bg.org/hi-kodeks");
        } else if (Intrinsics.c(e, zu3.V)) {
            string = "Wat kost gokken jou? Stop op tijd. 18+, hands24x7.nl";
        } else if (Intrinsics.c(e, zu3.m0)) {
            string = "18+. stödlinjen.se. Spela ansvarsfullt.";
        } else if (Intrinsics.c(e, zu3.r)) {
            string = "18+ | Regler og vilkår gælder | Spil ansvarligt | Selvudeluk via ROFUS.nu | StopSpillet.dk";
        } else {
            Country country = zu3.C;
            if (Intrinsics.c(e, country) || Intrinsics.c(e, zu3.f)) {
                string = context.getString(R.string.gamble_responsibly, (Intrinsics.c(e, country) || Intrinsics.c(e, zu3.f) || Intrinsics.c(e, zu3.v0)) ? "21" : Intrinsics.c(e, zu3.k) ? "19" : "18");
                string.getClass();
            } else if (Intrinsics.c(e, zu3.k)) {
                string = context.getString(R.string.gambling_disclaimer_canada);
                string.getClass();
            } else if (Intrinsics.c(e, zu3.r0)) {
                string = "İddaa oranları anlık olarak değişiklik gösterebilmektedir.";
            } else if (Intrinsics.c(e, zu3.v0)) {
                string = "21+. Gambling problem?\nCall 1-800-GAMBLER";
            }
        }
        return string.concat(q);
    }

    public static long g(long j, long j2) {
        return j2 > 0 ? g(j2, j % j2) : j;
    }

    public static ald h(int i, boolean z) {
        if (zu3.C.hasMcc(Integer.valueOf(i))) {
            return new ald(R.string.greek_betting_regulations_text, 5, Integer.valueOf(R.drawable.eeep_logo));
        }
        if (zu3.z.hasMcc(Integer.valueOf(i))) {
            return new ald(R.string.germany_betting_regulations_text, 3, null);
        }
        if (!zu3.k.hasMcc(Integer.valueOf(i)) || z) {
            return null;
        }
        return new ald(R.string.gambling_disclaimer_canada, 5, null);
    }

    public static String i(Context context) {
        context.getClass();
        String[] stringArray = context.getResources().getStringArray(R.array.australia_gambling_texts);
        stringArray.getClass();
        String str = (String) ph0.F((int) (((LocalDate.now().getMonthValue() - 1) / 2.0d) + 0.1d), stringArray);
        if (str == null) {
            str = stringArray[0];
        }
        String string = context.getString(R.string.responsible_gambling_australia_additional_text);
        string.getClass();
        return str + " " + string;
    }

    public static String j(Context context) {
        context.getClass();
        int i = ke0.c;
        if (zu3.h.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309749";
        }
        if (zu3.S.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309751";
        }
        if (zu3.d.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309759";
        }
        if (zu3.k.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309760";
        }
        if (zu3.q.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309761";
        }
        if (zu3.z.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309755";
        }
        if (zu3.r.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309754";
        }
        if (zu3.l0.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309750";
        }
        if (zu3.Q.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309763";
        }
        if (zu3.W.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309764";
        }
        if (zu3.c0.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309752";
        }
        if (zu3.m0.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309758";
        }
        if (zu3.e.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03309756";
        }
        if (zu3.j0.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03310161";
        }
        if (zu3.I.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03310186";
        }
        if (zu3.w.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03310171";
        }
        if (zu3.N.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.com/olp/open-account?affiliate=365_03310196";
        }
        if (zu3.V.hasMcc(Integer.valueOf(i))) {
            return "https://www.bet365.nl/olp/open-account?affiliate=365_03309757";
        }
        if (zu3.v0.hasMcc(Integer.valueOf(i))) {
            List j = kotlin.collections.b.j(yuf.c, yuf.d, yuf.e, yuf.f, yuf.g, yuf.h, yuf.j, yuf.i, yuf.k, yuf.l);
            ArrayList arrayList = new ArrayList(k13.r(j, 10));
            Iterator it = j.iterator();
            while (it.hasNext()) {
                arrayList.add(((yuf) it.next()).b);
            }
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (arrayList.contains(sharedPreferences.getString("REGION_USER_LAST_REGION", null))) {
                return "https://www.bet365.com/olp/open-account?affiliate=365_03310146";
            }
        }
        return null;
    }

    public static String k(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds, OddsChoice oddsChoice) {
        context.getClass();
        oddsCountryProvider.getClass();
        providerOdds.getClass();
        oddsChoice.getClass();
        return l(context, oddsCountryProvider, providerOdds.getFid(), providerOdds.getSourceId(), providerOdds.getMarketId(), providerOdds.getMarketName(), oddsChoice);
    }

    public static String l(Context context, OddsCountryProvider oddsCountryProvider, Integer num, Integer num2, int i, String str, OddsChoice oddsChoice) {
        String str2;
        String str3;
        context.getClass();
        oddsCountryProvider.getClass();
        str.getClass();
        oddsChoice.getClass();
        String betSlipLink = oddsCountryProvider.getBetSlipLink();
        String defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
        while (new Regex(".*\\{.*").f(betSlipLink)) {
            String substring = betSlipLink.substring(StringsKt.P(betSlipLink, "{", 0, false, 6), StringsKt.P(betSlipLink, "}", 0, false, 6) + 1);
            switch (substring.hashCode()) {
                case -1618539747:
                    if (!substring.equals("{parent.marketId}")) {
                        return defaultBetSlipLink;
                    }
                    betSlipLink = c.r(betSlipLink, substring, String.valueOf(i), false);
                    break;
                case -799635329:
                    if (substring.equals("{slipContent}") && oddsChoice.getSlipContent() != null) {
                        betSlipLink = c.r(betSlipLink, substring, String.valueOf(oddsChoice.getSlipContent()), false);
                        break;
                    }
                    return defaultBetSlipLink;
                case -668996681:
                    if (substring.equals("{name}")) {
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        if (oddsChoice.getReversibleName(teamSides) != null) {
                            String reversibleName = oddsChoice.getReversibleName(teamSides);
                            reversibleName.getClass();
                            betSlipLink = c.r(betSlipLink, substring, reversibleName, false);
                            break;
                        }
                    }
                    return defaultBetSlipLink;
                case -634019603:
                    if (!substring.equals("{parent.marketName}")) {
                        return defaultBetSlipLink;
                    }
                    betSlipLink = c.r(betSlipLink, substring, str, false);
                    break;
                case -333155323:
                    if (substring.equals("{parent.fid}") && num != null) {
                        betSlipLink = c.r(betSlipLink, substring, String.valueOf(num.intValue()), false);
                        break;
                    }
                    return defaultBetSlipLink;
                case -328215628:
                    if (substring.equals("{fractionalValue}") && oddsChoice.getFractionalValue() != null) {
                        betSlipLink = c.r(betSlipLink, substring, String.valueOf(oddsChoice.getFractionalValue()), false);
                        break;
                    }
                    return defaultBetSlipLink;
                case -99789172:
                    if (substring.equals("{sourceId}") && oddsChoice.getSourceId() != null) {
                        betSlipLink = c.r(betSlipLink, substring, String.valueOf(oddsChoice.getSourceId()), false);
                        break;
                    }
                    return defaultBetSlipLink;
                case 1911797470:
                    if (substring.equals("{parent.sourceId}") && num2 != null) {
                        betSlipLink = c.r(betSlipLink, substring, String.valueOf(num2.intValue()), false);
                        break;
                    }
                    return defaultBetSlipLink;
                default:
                    return defaultBetSlipLink;
            }
        }
        if (!Intrinsics.c(oddsCountryProvider.getProvider().getSlug(), "nesine-turkey")) {
            return betSlipLink;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("ADVERTISING_ID", null);
        Calendar calendar = ke0.a;
        String d = ke0.d(context);
        if (StringsKt.J(betSlipLink, "?", false)) {
            str2 = "&advertisingId=";
            str3 = "&mobileUserId=";
        } else {
            str2 = "?advertisingId=";
            str3 = "&mobileUserId=";
        }
        return betSlipLink.concat(fc6.n(str2, string, str3, d));
    }

    public static final String m(Context context, String str) {
        context.getClass();
        if (str != null && str.length() != 0 && !str.equals("-")) {
            String B = x2a.B(context);
            int hashCode = B.hashCode();
            if (hashCode != -2034720975) {
                if (hashCode != -1009757152) {
                    if (hashCode == 368001453 && B.equals("FRACTIONAL")) {
                        return str;
                    }
                } else if (B.equals("AMERICAN")) {
                    try {
                        double b = b(str) - 1.0d;
                        double d = (b <= 0.0d || b >= 1.0d) ? 100.0d * b : (-100.0d) / b;
                        DecimalFormat decimalFormat = new DecimalFormat("+#;-#", new DecimalFormatSymbols(dla.d()));
                        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                        String format = decimalFormat.format(d);
                        format.getClass();
                        return format;
                    } catch (NumberFormatException e) {
                        s38.a().c(e);
                    }
                }
            } else if (B.equals("DECIMAL")) {
                try {
                    double b2 = b(str);
                    if (b2 >= 100.0d) {
                        return String.valueOf(wzb.a(b2));
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat("#.00", new DecimalFormatSymbols(dla.d()));
                    decimalFormat2.setRoundingMode(RoundingMode.FLOOR);
                    String format2 = decimalFormat2.format(b2);
                    format2.getClass();
                    return format2;
                } catch (NumberFormatException e2) {
                    s38.a().c(e2);
                }
            }
        }
        return "-";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x049a, code lost:
    
        if (r0.equals("full-time") == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04af, code lost:
    
        return r2.getString(com.sofascore.results.R.string.odds_full_time);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04a4, code lost:
    
        if (r0.equals("full time") == false) goto L373;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n(Context context, String str, String str2) {
        String str3;
        Object u2gVar;
        context.getClass();
        if (str != null) {
            str3 = str.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = null;
        }
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2015309800:
                    if (str3.equals("to win shootout")) {
                        return context.getString(R.string.shootout_win_market);
                    }
                    break;
                case -1983675556:
                    if (str3.equals("correct score")) {
                        return context.getString(R.string.betting_market_correct_score);
                    }
                    break;
                case -1939367464:
                    if (str3.equals("most match sixes")) {
                        return context.getString(R.string.most_match_sixes_market);
                    }
                    break;
                case -1901872765:
                    if (str3.equals("home team match goals")) {
                        return context.getString(R.string.home_team_goals);
                    }
                    break;
                case -1871203014:
                    if (str3.equals("a fifty to be scored in the match")) {
                        return context.getString(R.string.fifty_scored_market);
                    }
                    break;
                case -1847588313:
                    if (str3.equals("next over runs")) {
                        return context.getString(R.string.runs_next_over_market);
                    }
                    break;
                case -1774404366:
                    if (str3.equals("corners 2-way")) {
                        return context.getString(R.string.corners_2_way);
                    }
                    break;
                case -1754481212:
                    if (str3.equals("1st half double chance")) {
                        return context.getString(R.string.first_half_double_chance);
                    }
                    break;
                case -1735171650:
                    break;
                case -1723165877:
                    break;
                case -1467402666:
                    if (str3.equals("both teams to score")) {
                        return context.getString(R.string.both_teams_to_score);
                    }
                    break;
                case -1316976661:
                    if (str3.equals("2nd half")) {
                        return context.getString(R.string.second_half);
                    }
                    break;
                case -1236823728:
                    if (str3.equals("both teams to score half time")) {
                        return context.getString(R.string.both_score_half_time_market);
                    }
                    break;
                case -1206947929:
                    if (str3.equals("full time (including overtime)")) {
                        return context.getString(R.string.market_full_time_including_overtime);
                    }
                    break;
                case -1190111589:
                    if (str3.equals("tie break in match")) {
                        return context.getString(R.string.tie_break_in_match);
                    }
                    break;
                case -965542204:
                    if (str3.equals("current set winner")) {
                        return context.getString(R.string.current_set_winner);
                    }
                    break;
                case -934489074:
                    if (str3.equals("draw no bet")) {
                        return context.getString(R.string.draw_no_bet);
                    }
                    break;
                case -893104622:
                    if (str3.equals("to score most runs")) {
                        return context.getString(R.string.most_runs_market);
                    }
                    break;
                case -861632652:
                    if (str3.equals("asian handicap")) {
                        return context.getString(R.string.asian_handicap);
                    }
                    break;
                case -832438890:
                    if (str3.equals("game total")) {
                        return context.getString(R.string.odds_game_total);
                    }
                    break;
                case -725360641:
                    if (str3.equals("1x2 and score sum")) {
                        return context.getString(R.string.betting_market_one_x_and_two_score_sum);
                    }
                    break;
                case -719443705:
                    if (str3.equals("to go to distance")) {
                        return context.getString(R.string.go_the_distance_market);
                    }
                    break;
                case -631749197:
                    if (str3.equals("to win the toss")) {
                        return context.getString(R.string.toss_win_market);
                    }
                    break;
                case -497464761:
                    if (str3.equals("highest individual score")) {
                        return context.getString(R.string.highest_ind_score_market);
                    }
                    break;
                case -494466746:
                    if (str3.equals("1st half match goals")) {
                        return context.getString(R.string.first_half_goals_market);
                    }
                    break;
                case -433307037:
                    if (str3.equals("double chance")) {
                        return context.getString(R.string.double_chance);
                    }
                    break;
                case 3521:
                    if (str3.equals("no")) {
                        return context.getString(R.string.no);
                    }
                    break;
                case 50859:
                    if (str3.equals("1x2")) {
                        return context.getString(R.string.betting_market_one_x_two);
                    }
                    break;
                case 109871:
                    if (str3.equals("odd")) {
                        return context.getString(R.string.odd_market);
                    }
                    break;
                case 119527:
                    if (str3.equals("yes")) {
                        return context.getString(R.string.yes);
                    }
                    break;
                case 1977272:
                    if (str3.equals("handicap")) {
                        return context.getString(R.string.handicap);
                    }
                    break;
                case 3125530:
                    if (str3.equals("even")) {
                        return context.getString(R.string.even_market);
                    }
                    break;
                case 3423444:
                    if (str3.equals("over")) {
                        return context.getString(R.string.over);
                    }
                    break;
                case 111428312:
                    if (str3.equals("under")) {
                        return context.getString(R.string.under);
                    }
                    break;
                case 172829093:
                    if (str3.equals("match goals")) {
                        return context.getString(R.string.match_goals);
                    }
                    break;
                case 385081760:
                    if (str3.equals("first team to score")) {
                        return context.getString(R.string.first_to_score);
                    }
                    break;
                case 428051124:
                    if (str3.equals("to go to super over?")) {
                        return context.getString(R.string.super_over_market);
                    }
                    break;
                case 454066113:
                    if (str3.equals("1st quarter winner")) {
                        return context.getString(R.string.first_quarter_winner_market);
                    }
                    break;
                case 537949503:
                    if (str3.equals("total points")) {
                        Object obj = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        try {
                            p2g p2gVar = w2g.b;
                            u2gVar = MessageFormat.format(context.getString(R.string.total_points_market), (Map<String, Object>) sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, str2)));
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        Throwable a = w2g.a(u2gVar);
                        if (a == null) {
                            obj = u2gVar;
                        } else {
                            s38.a().c(a);
                        }
                        return (String) obj;
                    }
                    break;
                case 594070790:
                    if (str3.equals("total runs in match")) {
                        return context.getString(R.string.total_runs_match_market);
                    }
                    break;
                case 595564801:
                    if (str3.equals("total rounds")) {
                        return context.getString(R.string.total_rounds_market);
                    }
                    break;
                case 613963229:
                    if (str3.equals("over/under")) {
                        return context.getString(R.string.betting_market_over_under);
                    }
                    break;
                case 661131743:
                    if (str3.equals("total sets/games")) {
                        return context.getString(R.string.betting_market_total_sets_games);
                    }
                    break;
                case 662266663:
                    if (str3.equals("cards in match")) {
                        return context.getString(R.string.cards_in_match_market);
                    }
                    break;
                case 689682653:
                    if (str3.equals("extra time")) {
                        return context.getString(R.string.extra_time_market);
                    }
                    break;
                case 718943081:
                    if (str3.equals("european handicap")) {
                        return context.getString(R.string.betting_market_european_handicap);
                    }
                    break;
                case 720161620:
                    if (str3.equals("away team match goals")) {
                        return context.getString(R.string.away_team_goals);
                    }
                    break;
                case 802402332:
                    if (str3.equals("to win in round")) {
                        return context.getString(R.string.win_in_round_market);
                    }
                    break;
                case 870922486:
                    if (str3.equals("goal number")) {
                        return context.getString(R.string.goal_number_market);
                    }
                    break;
                case 982449371:
                    if (str3.equals("total games won")) {
                        return Intrinsics.c(str2, Sports.TENNIS) ? context.getString(R.string.tennis_total_number_of_games) : context.getString(R.string.total_games_won);
                    }
                    break;
                case 1029890895:
                    if (str3.equals("a hundred to be scored in match")) {
                        return context.getString(R.string.hundred_scored_market);
                    }
                    break;
                case 1082533501:
                    if (str3.equals("wicket in next over")) {
                        return context.getString(R.string.wicket_next_over_market);
                    }
                    break;
                case 1122238109:
                    if (str3.equals("highest 1st 6 overs score")) {
                        return context.getString(R.string.highest_1_6_overs_market);
                    }
                    break;
                case 1158661152:
                    if (str3.equals("next goal")) {
                        return context.getString(R.string.next_goal);
                    }
                    break;
                case 1198006038:
                    if (str3.equals("total match fours")) {
                        return context.getString(R.string.match_fours_market);
                    }
                    break;
                case 1209835545:
                    if (str3.equals("total match sixes")) {
                        return context.getString(R.string.match_sixes_market);
                    }
                    break;
                case 1235964205:
                    if (str3.equals("first set winner")) {
                        return context.getString(R.string.first_set_winner);
                    }
                    break;
                case 1282247296:
                    if (str3.equals("next game winner")) {
                        return context.getString(R.string.next_game_winner);
                    }
                    break;
                case 1305846275:
                    if (str3.equals("point spread")) {
                        return context.getString(R.string.point_spread);
                    }
                    break;
                case 1495349167:
                    if (str3.equals("1st period goals")) {
                        return context.getString(R.string.first_period_goals_market);
                    }
                    break;
                case 1515648762:
                    if (str3.equals("match winner")) {
                        return context.getString(R.string.betting_market_match_winner);
                    }
                    break;
                case 1573970755:
                    if (str3.equals("current innings sixes")) {
                        return context.getString(R.string.current_innings_sixes_market);
                    }
                    break;
                case 1643957232:
                    if (str3.equals("goal number half time")) {
                        return context.getString(R.string.goal_number_halftime_market);
                    }
                    break;
                case 1652973491:
                    if (str3.equals("match handicap")) {
                        return context.getString(R.string.betting_market_match_handicap);
                    }
                    break;
                case 1713322677:
                    if (str3.equals("current innings runs")) {
                        return context.getString(R.string.current_innings_runs_market);
                    }
                    break;
                case 1792058781:
                    if (str3.equals("runs at fall of next wicket")) {
                        return context.getString(R.string.runs_fall_wicket_market);
                    }
                    break;
                case 1835797825:
                    if (str3.equals("1st half")) {
                        return context.getString(R.string.first_half);
                    }
                    break;
                case 1922515874:
                    if (str3.equals("1st over total runs")) {
                        return context.getString(R.string.first_over_total_runs_market);
                    }
                    break;
                case 2051723794:
                    if (str3.equals("no goal")) {
                        return context.getString(R.string.no_goal);
                    }
                    break;
                case 2073326110:
                    if (str3.equals("home/away")) {
                        return context.getString(R.string.betting_market_home_away);
                    }
                    break;
            }
        }
        return str;
    }

    public static ArrayList o(List list) {
        ArrayList k = me4.k(list);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i <= 0 || ((ProviderOdds) list.get(i)).getMarketId() != ((ProviderOdds) list.get(i - 1)).getMarketId()) {
                if (!arrayList.isEmpty()) {
                    k.add(arrayList);
                    arrayList = new ArrayList();
                }
                arrayList.add(list.get(i));
            } else {
                arrayList.add(list.get(i));
            }
        }
        k.add(arrayList);
        return k;
    }

    public static boolean p(Context context) {
        OddsCountryProvider a = xld.a(context, false);
        if (a == null || r(a.getProvider().getSlug())) {
            List b = xld.b(context);
            if (!b.isEmpty()) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) it.next();
                    if (r(oddsCountryProvider.getProvider().getSlug()) && oddsCountryProvider.getBranded()) {
                        bga bgaVar = xld.a;
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        if (sharedPreferences.getInt("ODDS_TAB_MINIMUM_REQUIRED_PROVIDERS", 0) > 1 || !aef.h(context)) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(Context context) {
        List b = xld.b(context);
        if (b.isEmpty()) {
            return false;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            if (((OddsCountryProvider) it.next()).getGroup() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(String str) {
        str.getClass();
        return StringsKt.J(str, "bet365", false) || StringsKt.J(str, "bet-365", false);
    }

    public static boolean s(Context context, vmd vmdVar, Event event, boolean z) {
        context.getClass();
        event.getClass();
        int i = ke0.c;
        if (vmdVar == vmd.EVENT_MATCHES && !z) {
            return false;
        }
        if ((a(i) && ok3.D(event)) || !t(context)) {
            return false;
        }
        yea yeaVar = j58.a;
        return !j58.i(o3a.F(event.getTournament()), dv3.c());
    }

    public static boolean t(Context context) {
        SharedPreferences d;
        context.getClass();
        if (!zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            return true;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        ccd ccdVar = vl.b;
        String string = sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
        ccd ccdVar2 = vl.b;
        return Intrinsics.c(string, "25_or_older");
    }

    public static boolean u(Context context, Integer num) {
        SharedPreferences d;
        int i = ke0.c;
        boolean hasMcc = zu3.d0.hasMcc(Integer.valueOf(i));
        if (q(context)) {
            return false;
        }
        if (!hasMcc) {
            if (!zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                return false;
            }
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            ccd ccdVar = vl.b;
            if (!Intrinsics.c(sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older")) {
                return false;
            }
        }
        yea yeaVar = j58.a;
        ArrayList arrayList = dv3.a;
        Country b = dv3.b(Integer.valueOf(i));
        return !j58.i(num, b != null ? b.getIso2Alpha() : null);
    }

    public static boolean v(Context context, Integer num, String str) {
        SharedPreferences d;
        context.getClass();
        str.getClass();
        int i = ke0.c;
        if (a(i) && (str.equals(StatusKt.STATUS_IN_PROGRESS) || str.equals(StatusKt.STATUS_WILL_CONTINUE))) {
            return false;
        }
        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            ccd ccdVar = vl.b;
            if (!Intrinsics.c(sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older")) {
                return false;
            }
        }
        yea yeaVar = j58.a;
        ArrayList arrayList = dv3.a;
        Country b = dv3.b(Integer.valueOf(i));
        if (j58.i(num, b != null ? b.getIso2Alpha() : null)) {
            return false;
        }
        return !k13.s(kotlin.collections.a.c(zu3.v0.getMccList())).contains(Integer.valueOf(i));
    }

    public static String w(String str, ProviderOdds.Type type, String str2) {
        if (type != ProviderOdds.Type.HANDICAP || str2 == null) {
            return str;
        }
        return StringsKt.l0(str + " " + str2).toString();
    }
}
