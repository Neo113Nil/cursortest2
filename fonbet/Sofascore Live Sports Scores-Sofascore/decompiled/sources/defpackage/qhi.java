package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import java.text.Normalizer;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qhi {
    public static final mqi a = ypa.b(new egi(1));
    public static final mqi b = ypa.b(new egi(2));
    public static final mqi c = ypa.b(new egi(3));
    public static final mqi d = ypa.b(new egi(4));

    public static Spanned a(String str) {
        Spanned fromHtml = Html.fromHtml(str, 0);
        fromHtml.getClass();
        return fromHtml;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String b(Context context, int i, String str) {
        int i2;
        context.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -2056128771:
                if (str.equals(Sports.SNOOKER)) {
                    i2 = R.plurals.snooker_last_x_matches;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -2005973498:
                if (str.equals(Sports.BADMINTON)) {
                    i2 = R.plurals.badminton_last_x_matches;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    i2 = R.plurals.ice_hockey_last_x_games;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -1721090992:
                if (str.equals(Sports.BASEBALL)) {
                    i2 = R.plurals.baseball_last_x_games;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -1452201948:
                if (str.equals(Sports.E_SPORTS)) {
                    i2 = R.plurals.esports_last_x_events;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -877324069:
                if (str.equals(Sports.TENNIS)) {
                    i2 = R.plurals.tennis_last_x_matches;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    i2 = R.plurals.am_football_last_x_games;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case 95355092:
                if (str.equals(Sports.DARTS)) {
                    i2 = R.plurals.darts_last_x_matches;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case 203883450:
                if (str.equals(Sports.TABLE_TENNIS)) {
                    i2 = R.plurals.table_tennis_last_x_matches;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            case 727149765:
                if (str.equals(Sports.BASKETBALL)) {
                    i2 = R.plurals.basketball_last_x_games;
                    break;
                }
                i2 = R.plurals.general_last_x_matches;
                break;
            default:
                i2 = R.plurals.general_last_x_matches;
                break;
        }
        String quantityString = context.getResources().getQuantityString(i2, i, Integer.valueOf(i));
        quantityString.getClass();
        return quantityString;
    }

    public static String c(String str, boolean z) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        c38 c38Var = new c38(i5h.o(z ? ((Regex) b.getValue()).c(str) : ((Regex) a.getValue()).c(str), new c31(z, 12)));
        if (c38Var.hasNext()) {
            Object next = c38Var.next();
            if (!c38Var.hasNext()) {
                obj = next;
            }
        }
        return (String) obj;
    }

    public static String d(String str) {
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        normalize.getClass();
        return new Regex("[^\\p{ASCII}]").replace(normalize, "");
    }
}
