package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class wzb extends vzb {
    public static int a(double d) {
        if (Double.isNaN(d)) {
            a70.p("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        a70.p("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        a70.p("Cannot round NaN value.");
        return 0L;
    }
}
