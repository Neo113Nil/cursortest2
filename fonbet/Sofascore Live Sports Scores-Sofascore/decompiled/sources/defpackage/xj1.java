package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xj1 {
    public static final xj1 a = new xj1();

    public static String a(Number number) {
        return yid.d("%.1f", Float.valueOf(number.floatValue()));
    }

    public static String b(Number number) {
        return rei.e(Double.valueOf(number.doubleValue() * 100.0d), 0, 6);
    }

    public static String c(Number number) {
        return l4a.O(StringsKt.V(yid.d("%.3f", Float.valueOf(number.floatValue())), "0"));
    }

    public static String d(Number number) {
        return yid.d("%.2f", Float.valueOf(number.floatValue()));
    }
}
