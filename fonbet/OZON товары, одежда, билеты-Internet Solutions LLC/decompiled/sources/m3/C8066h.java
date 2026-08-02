package m3;

import Ve.C4598rp;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

/* renamed from: m3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8066h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f74320a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f74321b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f74322c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f74323d;

    static {
        HashMap hashMap = new HashMap();
        f74323d = hashMap;
        C4598rp.e(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        Integer valueOf = Integer.valueOf(BaseDotsIndicator.DEFAULT_POINT_COLOR);
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "aqua", valueOf, -8388652, "aquamarine");
        C4598rp.e(-983041, hashMap, "azure", -657956, "beige");
        C4598rp.e(-6972, hashMap, "bisque", -16777216, "black");
        C4598rp.e(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        C4598rp.e(-7722014, hashMap, "blueviolet", -5952982, "brown");
        C4598rp.e(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        C4598rp.e(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        C4598rp.e(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        C4598rp.e(-1828, hashMap, "cornsilk", -2354116, "crimson");
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "cyan", valueOf, -16777077, "darkblue");
        C4598rp.e(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        C4598rp.e(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        C4598rp.e(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        C4598rp.e(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        C4598rp.e(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        C4598rp.e(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        C4598rp.e(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        C4598rp.e(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        C4598rp.e(-16744448, hashMap, "green", -5374161, "greenyellow");
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "grey", -8355712, -983056, "honeydew");
        C4598rp.e(-38476, hashMap, "hotpink", -3318692, "indianred");
        C4598rp.e(-11861886, hashMap, "indigo", -16, "ivory");
        C4598rp.e(-989556, hashMap, "khaki", -1644806, "lavender");
        C4598rp.e(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        C4598rp.e(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        C4598rp.e(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        C4598rp.e(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        C4598rp.e(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        C4598rp.e(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        C4598rp.e(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        C4598rp.e(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        C4598rp.e(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        C4598rp.e(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        C4598rp.e(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        C4598rp.e(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        C4598rp.e(-6943, hashMap, "mistyrose", -6987, "moccasin");
        C4598rp.e(-8531, hashMap, "navajowhite", -16777088, "navy");
        C4598rp.e(-133658, hashMap, "oldlace", -8355840, "olive");
        C4598rp.e(-9728477, hashMap, "olivedrab", -23296, "orange");
        C4598rp.e(-47872, hashMap, "orangered", -2461482, "orchid");
        C4598rp.e(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        C4598rp.e(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        C4598rp.e(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        C4598rp.e(-3308225, hashMap, "peru", -16181, "pink");
        C4598rp.e(-2252579, hashMap, "plum", -5185306, "powderblue");
        C4598rp.e(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        C4598rp.e(-65536, hashMap, "red", -4419697, "rosybrown");
        C4598rp.e(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        C4598rp.e(-360334, hashMap, "salmon", -744352, "sandybrown");
        C4598rp.e(-13726889, hashMap, "seagreen", -2578, "seashell");
        C4598rp.e(-6270419, hashMap, "sienna", -4144960, "silver");
        C4598rp.e(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        com.google.android.gms.internal.mlkit_common.a.c(hashMap, "snow", -1286, -16711809, "springgreen");
        C4598rp.e(-12156236, hashMap, "steelblue", -2968436, "tan");
        C4598rp.e(-16744320, hashMap, "teal", -2572328, "thistle");
        C4598rp.e(-40121, hashMap, "tomato", 0, "transparent");
        C4598rp.e(-12525360, hashMap, "turquoise", -1146130, "violet");
        C4598rp.e(-663885, hashMap, "wheat", -1, "white");
        C4598rp.e(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z11) {
        int parseInt;
        G10.a.c(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z11 ? f74322c : f74321b).matcher(replace);
            if (matcher.matches()) {
                if (z11) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f74320a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f74323d.get(O7.b.b(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, true);
    }

    public static int c(String str) {
        return a(str, false);
    }
}
