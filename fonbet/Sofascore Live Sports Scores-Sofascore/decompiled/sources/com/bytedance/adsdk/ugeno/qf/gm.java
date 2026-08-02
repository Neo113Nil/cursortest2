package com.bytedance.adsdk.ugeno.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gm {
    public static int pcc(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static float pcc(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static long pcc(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static double pcc(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static boolean pcc(String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Throwable unused) {
            return z;
        }
    }
}
