package Sh;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class I {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10768a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f10768a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
