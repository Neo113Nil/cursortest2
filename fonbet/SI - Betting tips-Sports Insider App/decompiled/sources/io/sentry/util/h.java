package io.sentry.util;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f17164a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f17165b;

    static {
        try {
            f17164a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f17164a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f17165b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f17165b = false;
            }
        } catch (Throwable unused2) {
            f17165b = false;
        }
    }
}
