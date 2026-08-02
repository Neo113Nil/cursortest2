package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f5k {
    public static final Set a = ph0.a0(new String[]{Sports.FOOTBALL, Sports.HANDBALL, Sports.RUGBY, Sports.FUTSAL, Sports.MINI_FOOTBALL, Sports.BANDY});

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        boolean R = CollectionsKt.R(a, str2);
        switch (str.hashCode()) {
            case -417963532:
                if (str.equals("ALL_PERIODS")) {
                    String string = context.getString(R.string.all);
                    string.getClass();
                    return string;
                }
                return str;
            case 1600:
                if (str.equals("1Q")) {
                    String string2 = context.getString(R.string.quarter_1_short);
                    string2.getClass();
                    return string2;
                }
                return str;
            case 1631:
                if (str.equals("2Q")) {
                    String string3 = context.getString(R.string.quarter_2_short);
                    string3.getClass();
                    return string3;
                }
                return str;
            case 1662:
                if (str.equals("3Q")) {
                    String string4 = context.getString(R.string.quarter_3_short);
                    string4.getClass();
                    return string4;
                }
                return str;
            case 1693:
                if (str.equals("4Q")) {
                    String string5 = context.getString(R.string.quarter_4_short);
                    string5.getClass();
                    return string5;
                }
                return str;
            case 2533:
                if (str.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE)) {
                    String string6 = context.getString(R.string.overtime_short);
                    string6.getClass();
                    return string6;
                }
                return str;
            case 49746:
                if (str.equals("1ST")) {
                    String string7 = context.getString(R ? R.string.half_1_short : R.string.set_1_short);
                    string7.getClass();
                    return string7;
                }
                return str;
            case 50536:
                if (str.equals("2ND")) {
                    String string8 = context.getString(R ? R.string.half_2_short : R.string.set_2_short);
                    string8.getClass();
                    return string8;
                }
                return str;
            case 51621:
                if (str.equals("3RD")) {
                    String string9 = context.getString(R.string.set_3_short);
                    string9.getClass();
                    return string9;
                }
                return str;
            case 52648:
                if (str.equals("4TH")) {
                    String string10 = context.getString(R.string.set_4_short);
                    string10.getClass();
                    return string10;
                }
                return str;
            case 53609:
                if (str.equals("5TH")) {
                    String string11 = context.getString(R.string.set_5_short);
                    string11.getClass();
                    return string11;
                }
                return str;
            case 64897:
                if (str.equals("ALL")) {
                    String string12 = context.getString(R.string.all);
                    string12.getClass();
                    return string12;
                }
                return str;
            case 68962:
                if (str.equals("ET1")) {
                    String string13 = context.getString(R.string.extra_time_1_short);
                    string13.getClass();
                    return string13;
                }
                return str;
            case 68963:
                if (str.equals("ET2")) {
                    String string14 = context.getString(R.string.extra_time_2_short);
                    string14.getClass();
                    return string14;
                }
                return str;
            case 78572:
                if (str.equals("OT1")) {
                    String string15 = context.getString(R.string.overtime_1_short);
                    string15.getClass();
                    return string15;
                }
                return str;
            case 78573:
                if (str.equals("OT2")) {
                    String string16 = context.getString(R.string.overtime_2_short);
                    string16.getClass();
                    return string16;
                }
                return str;
            case 78574:
                if (str.equals("OT3")) {
                    String string17 = context.getString(R.string.overtime_3_short);
                    string17.getClass();
                    return string17;
                }
                return str;
            case 78575:
                if (str.equals("OT4")) {
                    String string18 = context.getString(R.string.overtime_4_short);
                    string18.getClass();
                    return string18;
                }
                return str;
            case 78576:
                if (str.equals("OT5")) {
                    String string19 = context.getString(R.string.overtime_5_short);
                    string19.getClass();
                    return string19;
                }
                return str;
            default:
                return str;
        }
    }

    public static String b(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        return c(str, str2).b(context);
    }

    public static r9k c(String str, String str2) {
        str.getClass();
        if (str.equals(Season.SubSeasonType.OVERALL.getLabel())) {
            return new q9k(R.string.whole_season);
        }
        if (str.equals(Season.SubSeasonType.REGULAR_SEASON.getLabel())) {
            return new q9k(R.string.regular_season);
        }
        if (str.equals(Season.SubSeasonType.TOP16.getLabel())) {
            return new q9k(R.string.top_16);
        }
        Season.SubSeasonType subSeasonType = Season.SubSeasonType.PLAYOFFS;
        return (str.equals(subSeasonType.getLabel()) && Intrinsics.c(str2, Sports.BASEBALL)) ? new q9k(R.string.baseball_postseason) : str.equals(subSeasonType.getLabel()) ? new q9k(R.string.playoffs) : new m9k(str);
    }
}
