package defpackage;

import android.content.Context;
import com.appsflyer.internal.i;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class afi {
    public static final Set a;
    public static final Set b;

    static {
        ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_PRELIMINARY});
        a = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_DELAYED});
        b = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_DELAYED});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ef, code lost:
    
        if (r12.equals("pen") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d1, code lost:
    
        if (r12.equals("first half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0389, code lost:
    
        if (r12.equals("2nd half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c0, code lost:
    
        if (r12.equals("2. half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r12.equals("1. half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d5, code lost:
    
        if (r13 == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02e3, code lost:
    
        return r11.getString(com.sofascore.results.R.string.buzzer_status_half_short, defpackage.yid.p(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02f0, code lost:
    
        return r11.getString(com.sofascore.results.R.string.status_half, defpackage.yid.p(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        if (r12.equals("1st half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        if (r12.equals("penalties") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fa, code lost:
    
        return r11.getString(com.sofascore.results.R.string.penalties_short);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r12.equals("second half") == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c3, code lost:
    
        if (r13 == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03d1, code lost:
    
        return r11.getString(com.sofascore.results.R.string.buzzer_status_half_short, defpackage.yid.p(2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03de, code lost:
    
        return r11.getString(com.sofascore.results.R.string.status_half, defpackage.yid.p(2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, String str, boolean z) {
        String str2;
        txb b2 = new Regex("^\\s*(\\d+)(?:st|nd|rd|th)?\\.?\\s+(period|quarter|extra|set|inning|break)\\b", uuf.IGNORE_CASE).b(str);
        if (b2 != null) {
            String lowerCase = ((String) ((sxb) b2.a()).get(2)).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1183937703:
                    if (lowerCase.equals("inning")) {
                        str2 = b(context, str, false, null, R.string.status_inning);
                        break;
                    }
                    str2 = null;
                    break;
                case -991726143:
                    if (lowerCase.equals("period")) {
                        str2 = b(context, str, z, Integer.valueOf(R.string.buzzer_status_period_short), R.string.status_period);
                        break;
                    }
                    str2 = null;
                    break;
                case 113762:
                    if (lowerCase.equals("set")) {
                        str2 = b(context, str, false, null, R.string.status_set);
                        break;
                    }
                    str2 = null;
                    break;
                case 94001407:
                    if (lowerCase.equals("break")) {
                        str2 = b(context, str, false, null, R.string.status_break);
                        break;
                    }
                    str2 = null;
                    break;
                case 96965648:
                    if (lowerCase.equals("extra")) {
                        str2 = b(context, str, z, Integer.valueOf(R.string.buzzer_status_extra_short), R.string.status_extra);
                        break;
                    }
                    str2 = null;
                    break;
                case 651403948:
                    if (lowerCase.equals("quarter")) {
                        str2 = b(context, str, z, Integer.valueOf(R.string.buzzer_status_quarter_short), R.string.status_quarter);
                        break;
                    }
                    str2 = null;
                    break;
                default:
                    str2 = null;
                    break;
            }
            if (str2 != null) {
                return str2;
            }
        }
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals(StatusKt.STATUS_INTERRUPTED)) {
                    return context.getString(R.string.interrupted);
                }
                return null;
            case -1897185151:
                if (str.equals(U3.i.d0)) {
                    return context.getString(R.string.status_started);
                }
                return null;
            case -1704911503:
                if (str.equals("seventh game")) {
                    return context.getString(R.string.status_game, yid.p(7));
                }
                return null;
            case -1661628965:
                if (str.equals(StatusKt.STATUS_SUSPENDED)) {
                    return context.getString(R.string.match_suspended);
                }
                return null;
            case -1519767657:
                break;
            case -1502128480:
                if (str.equals("defaulted")) {
                    return context.getString(R.string.defaulted);
                }
                return null;
            case -1406636265:
                if (str.equals("aw. et")) {
                    return z ? context.getString(R.string.status_awaiting_extra_time_short) : context.getString(R.string.status_awaiting_extra_time);
                }
                return null;
            case -1316976661:
                break;
            case -1094184492:
                if (str.equals("abandoned")) {
                    return context.getString(R.string.abandoned);
                }
                return null;
            case -1029795637:
                if (str.equals("golden set")) {
                    return context.getString(R.string.golden_set);
                }
                return null;
            case -1014104309:
                if (str.equals("third game")) {
                    return context.getString(R.string.status_game, yid.p(3));
                }
                return null;
            case -363170052:
                if (str.equals("sixth game")) {
                    return context.getString(R.string.status_game, yid.p(6));
                }
                return null;
            case -345259313:
                if (str.equals(FootballShotmapItem.SITUATION_TYPE_SHOOTOUT)) {
                    return context.getString(R.string.ice_hockey_penalty_shootout);
                }
                return null;
            case -264105416:
                if (str.equals("fourth game")) {
                    return context.getString(R.string.status_game, yid.p(4));
                }
                return null;
            case -219375774:
                if (str.equals("first game")) {
                    return context.getString(R.string.status_game, yid.p(1));
                }
                return null;
            case -219346013:
                break;
            case -123173735:
                if (str.equals(StatusKt.STATUS_CANCELED)) {
                    return context.getString(R.string.canceled);
                }
                return null;
            case 3119:
                if (str.equals(C4324ta.c)) {
                    return z ? context.getString(R.string.status_after_penalties_short) : context.getString(R.string.status_after_penalties);
                }
                return null;
            case 3122:
                if (str.equals("as")) {
                    return z ? context.getString(R.string.status_after_shootout_short) : context.getString(R.string.status_after_shootout);
                }
                return null;
            case 3278:
                if (str.equals("ft")) {
                    return z ? context.getString(R.string.status_full_time_short) : context.getString(R.string.finished);
                }
                return null;
            case 3340:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_HOST)) {
                    return z ? context.getString(R.string.status_halftime_short) : context.getString(R.string.halftime);
                }
                return null;
            case 3557:
                if (str.equals("ot")) {
                    return z ? context.getString(R.string.overtime_short) : context.getString(R.string.ot_start);
                }
                return null;
            case 3676:
                if (str.equals("so")) {
                    return z ? context.getString(R.string.shootout_short) : context.getString(R.string.ice_hockey_penalty_shootout);
                }
                return null;
            case 96464:
                if (str.equals("aet")) {
                    return z ? context.getString(R.string.status_after_extra_time_short) : context.getString(R.string.status_after_extra_time);
                }
                return null;
            case 110873:
                break;
            case 94001407:
                if (str.equals("break")) {
                    return context.getString(R.string.status_break);
                }
                return null;
            case 96765469:
                if (str.equals("et ht")) {
                    return z ? context.getString(R.string.status_extra_time_halftime_short) : context.getString(R.string.status_extra_time_halftime);
                }
                return null;
            case 106440182:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    return context.getString(R.string.pause);
                }
                return null;
            case 206872606:
                if (str.equals("second game")) {
                    return context.getString(R.string.status_game, yid.p(2));
                }
                return null;
            case 206902367:
                break;
            case 323731997:
                if (str.equals(CupTreeBlock.BLOCK_RESULT_WALKOVER)) {
                    return context.getString(R.string.walkover);
                }
                return null;
            case 476588369:
                if (str.equals("cancelled")) {
                    return context.getString(R.string.canceled);
                }
                return null;
            case 885690555:
                if (str.equals("fifth game")) {
                    return context.getString(R.string.status_game, yid.p(5));
                }
                return null;
            case 1080232679:
                break;
            case 1098118057:
                if (str.equals(CupTreeBlock.BLOCK_RESULT_RETIRED)) {
                    return context.getString(R.string.retired);
                }
                return null;
            case 1137564317:
                if (str.equals("aw. pen.")) {
                    return z ? context.getString(R.string.status_awaiting_penalties_short) : context.getString(R.string.status_awaiting_penalties);
                }
                return null;
            case 1137656604:
                if (str.equals("aw. sho.")) {
                    return z ? context.getString(R.string.status_awaiting_shootout_short) : context.getString(R.string.status_awaiting_shootout);
                }
                return null;
            case 1550348642:
                if (str.equals(StatusKt.STATUS_DELAYED)) {
                    return context.getString(R.string.delayed);
                }
                return null;
            case 1835797825:
                break;
            case 1887695958:
                break;
            case 2018521742:
                if (str.equals(StatusKt.STATUS_POSTPONED)) {
                    return context.getString(R.string.postponed);
                }
                return null;
            default:
                return null;
        }
    }

    public static String b(Context context, String str, boolean z, Integer num, int i) {
        List split$default;
        String string;
        int i2 = 0;
        split$default = StringsKt__StringsKt.split$default(StringsKt.l0(str).toString(), new String[]{" "}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.a0(0, split$default);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str2.charAt(i3);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            Integer intOrNull = StringsKt.toIntOrNull(sb.toString());
            if (intOrNull != null) {
                i2 = intOrNull.intValue();
            }
        }
        if (!z) {
            String string2 = context.getString(i, yid.p(i2));
            string2.getClass();
            return string2;
        }
        if (num != null && (string = context.getString(num.intValue(), Integer.valueOf(i2))) != null) {
            return string;
        }
        String string3 = context.getString(i, yid.p(i2));
        string3.getClass();
        return string3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String c(Context context, String str, String str2, boolean z) {
        String a2;
        context.getClass();
        str.getClass();
        Locale locale = Locale.US;
        String k = i.k(locale, str, locale);
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2002238939:
                    if (str2.equals(Sports.ICE_HOCKEY)) {
                        a2 = (k.equals("penalties") || k.equals("pen")) ? z ? context.getString(R.string.shootout_short) : context.getString(R.string.ice_hockey_penalty_shootout) : null;
                        if (a2 == null) {
                            a2 = a(context, k, z);
                            break;
                        }
                    }
                    break;
                case -1721090992:
                    if (str2.equals(Sports.BASEBALL)) {
                        a2 = k.equals("ot") ? z ? context.getString(R.string.baseball_extra_innings_short) : context.getString(R.string.baseball_extra_innings) : null;
                        if (a2 == null) {
                            a2 = a(context, k, z);
                            break;
                        }
                    }
                    break;
                case -1160328212:
                    if (str2.equals(Sports.VOLLEYBALL)) {
                        a2 = k.equals("period6") ? z ? context.getString(R.string.volleyball_golden_set_short) : context.getString(R.string.golden_set) : null;
                        if (a2 == null) {
                            a2 = a(context, k, z);
                            break;
                        }
                    }
                    break;
                case -83759494:
                    if (str2.equals(Sports.AMERICAN_FOOTBALL)) {
                        int hashCode = k.hashCode();
                        if (hashCode != 3278) {
                            if (hashCode != 3557) {
                                if (hashCode == 96464 && k.equals("aet")) {
                                    a2 = z ? context.getString(R.string.status_final_overtime_short) : context.getString(R.string.status_final_overtime_long);
                                }
                            } else if (k.equals("ot")) {
                                a2 = z ? context.getString(R.string.status_overtime_short) : context.getString(R.string.status_overtime_long);
                            }
                        } else if (k.equals("ft")) {
                            a2 = z ? context.getString(R.string.status_final_short) : context.getString(R.string.status_final_long);
                        }
                        if (a2 == null) {
                            a2 = a(context, k, z);
                            break;
                        }
                    }
                    break;
            }
            return a2 != null ? str : a2;
        }
        a2 = a(context, k, z);
        if (a2 != null) {
        }
    }

    public static boolean d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return (str.equals(Sports.TENNIS) || str.equals(Sports.VOLLEYBALL)) ? b.contains(str2) : a.contains(str2);
    }

    public static final boolean e(int i) {
        return i == 91 || i == 92 || i == 97 || i == 98;
    }
}
