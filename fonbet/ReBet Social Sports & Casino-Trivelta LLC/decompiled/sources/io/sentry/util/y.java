package io.sentry.util;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f52815a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f52816b;

    static {
        try {
            f52815a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f52815a = false;
        }
        if (f52815a) {
            f52816b = false;
            return;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f52816b = Double.parseDouble(property) >= 9.0d;
            } else {
                f52816b = false;
            }
        } catch (Throwable unused2) {
            f52816b = false;
        }
    }

    public static boolean a() {
        return f52815a;
    }

    public static boolean b() {
        return f52816b;
    }

    public static boolean c() {
        return !f52815a;
    }
}
