package io.sentry.util;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    static boolean f68593a;

    /* renamed from: b, reason: collision with root package name */
    static boolean f68594b;

    static {
        try {
            f68593a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f68593a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f68594b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f68594b = false;
            }
        } catch (Throwable unused2) {
            f68594b = false;
        }
    }

    public static boolean a() {
        return f68593a;
    }

    public static boolean b() {
        return f68594b;
    }

    public static boolean c() {
        return !f68593a;
    }
}
