package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.text.TextUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Incident;
import defpackage.ilg;
import defpackage.ljg;
import defpackage.mz1;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap hashMap = new HashMap();
        COLOR_MAP = hashMap;
        ljg.s(-984833, -332841, "aliceblue", "antiquewhite", hashMap);
        mz1.B(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        ljg.s(-983041, -657956, "azure", "beige", hashMap);
        ljg.s(-6972, -16777216, "bisque", "black", hashMap);
        ljg.s(-5171, -16776961, "blanchedalmond", "blue", hashMap);
        ljg.s(-7722014, -5952982, "blueviolet", "brown", hashMap);
        ljg.s(-2180985, -10510688, "burlywood", "cadetblue", hashMap);
        ljg.s(-8388864, -2987746, "chartreuse", "chocolate", hashMap);
        ljg.s(-32944, -10185235, "coral", "cornflowerblue", hashMap);
        ljg.s(-1828, -2354116, "cornsilk", "crimson", hashMap);
        mz1.B(hashMap, "cyan", -16711681, -16777077, "darkblue");
        ljg.s(-16741493, -4684277, "darkcyan", "darkgoldenrod", hashMap);
        mz1.B(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        mz1.B(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        ljg.s(-7667573, -11179217, "darkmagenta", "darkolivegreen", hashMap);
        ljg.s(-29696, -6737204, "darkorange", "darkorchid", hashMap);
        ljg.s(-7667712, -1468806, "darkred", "darksalmon", hashMap);
        ljg.s(-7357297, -12042869, "darkseagreen", "darkslateblue", hashMap);
        mz1.B(hashMap, "darkturquoise", mz1.f(-13676721, -16724271, "darkslategray", "darkslategrey", hashMap), -7077677, "darkviolet");
        ljg.s(-60269, -16728065, "deeppink", "deepskyblue", hashMap);
        mz1.B(hashMap, "dodgerblue", mz1.f(-9868951, -14774017, "dimgray", "dimgrey", hashMap), -5103070, "firebrick");
        ljg.s(-1296, -14513374, "floralwhite", "forestgreen", hashMap);
        mz1.B(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        ljg.s(-460545, -10496, "ghostwhite", "gold", hashMap);
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        ljg.s(-16744448, -5374161, "green", "greenyellow", hashMap);
        mz1.B(hashMap, "grey", -8355712, -983056, "honeydew");
        ljg.s(-38476, -3318692, "hotpink", "indianred", hashMap);
        ljg.s(-11861886, -16, "indigo", "ivory", hashMap);
        ljg.s(-989556, -1644806, "khaki", "lavender", hashMap);
        ljg.s(-3851, -8586240, "lavenderblush", "lawngreen", hashMap);
        ljg.s(-1331, -5383962, "lemonchiffon", "lightblue", hashMap);
        ljg.s(-1015680, -2031617, "lightcoral", "lightcyan", hashMap);
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        ljg.s(-18751, -24454, "lightpink", "lightsalmon", hashMap);
        ljg.s(-14634326, -7876870, "lightseagreen", "lightskyblue", hashMap);
        mz1.B(hashMap, "lightsteelblue", mz1.f(-8943463, -5192482, "lightslategray", "lightslategrey", hashMap), -32, "lightyellow");
        ljg.s(-16711936, -13447886, "lime", "limegreen", hashMap);
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        ljg.s(-8388608, -10039894, "maroon", "mediumaquamarine", hashMap);
        ljg.s(-16777011, -4565549, "mediumblue", "mediumorchid", hashMap);
        ljg.s(-7114533, -12799119, "mediumpurple", "mediumseagreen", hashMap);
        ljg.s(-8689426, -16713062, "mediumslateblue", "mediumspringgreen", hashMap);
        ljg.s(-12004916, -3730043, "mediumturquoise", "mediumvioletred", hashMap);
        ljg.s(-15132304, -655366, "midnightblue", "mintcream", hashMap);
        ljg.s(-6943, -6987, "mistyrose", "moccasin", hashMap);
        ljg.s(-8531, -16777088, "navajowhite", "navy", hashMap);
        ljg.s(-133658, -8355840, "oldlace", "olive", hashMap);
        ljg.s(-9728477, -23296, "olivedrab", "orange", hashMap);
        ljg.s(-47872, -2461482, "orangered", "orchid", hashMap);
        ljg.s(-1120086, -6751336, "palegoldenrod", "palegreen", hashMap);
        ljg.s(-5247250, -2396013, "paleturquoise", "palevioletred", hashMap);
        ljg.s(-4139, -9543, "papayawhip", "peachpuff", hashMap);
        ljg.s(-3308225, -16181, "peru", "pink", hashMap);
        ljg.s(-2252579, -5185306, "plum", "powderblue", hashMap);
        ljg.s(-8388480, -10079335, "purple", "rebeccapurple", hashMap);
        ljg.s(-65536, -4419697, Incident.CardIncident.CARD_RED, "rosybrown", hashMap);
        ljg.s(-12490271, -7650029, "royalblue", "saddlebrown", hashMap);
        ljg.s(-360334, -744352, "salmon", "sandybrown", hashMap);
        ljg.s(-13726889, -2578, "seagreen", "seashell", hashMap);
        ljg.s(-6270419, -4144960, "sienna", "silver", hashMap);
        ljg.s(-7876885, -9807155, "skyblue", "slateblue", hashMap);
        mz1.B(hashMap, "snow", mz1.f(-9404272, -1286, "slategray", "slategrey", hashMap), -16711809, "springgreen");
        ljg.s(-12156236, -2968436, "steelblue", "tan", hashMap);
        ljg.s(-16744320, -2572328, "teal", "thistle", hashMap);
        ljg.s(-40121, 0, "tomato", U3.i.T, hashMap);
        ljg.s(-12525360, -1146130, "turquoise", "violet", hashMap);
        ljg.s(-663885, -1, "wheat", "white", hashMap);
        ljg.s(-657931, -256, "whitesmoke", Incident.CardIncident.CARD_YELLOW, hashMap);
        hashMap.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    private static int argb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static int parseColorInternal(String str, boolean z) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            ilg.c();
            return 0;
        }
        if (replace.startsWith(RGBA)) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(replace);
            if (matcher.matches()) {
                return argb(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(replace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        ilg.c();
        return 0;
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    private static int rgb(int i, int i2, int i3) {
        return argb(255, i, i2, i3);
    }
}
