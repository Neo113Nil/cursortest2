package org.maplibre.android;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f79607a;

    public static synchronized void a(boolean z11) {
        synchronized (b.class) {
            f79607a = z11;
        }
    }

    public static void b(Exception exc) {
        if (f79607a) {
            throw new c(String.format("%s", exc));
        }
    }

    public static void c(String str) {
        if (f79607a) {
            throw new c(str);
        }
    }

    public static void d(String str, Throwable th2) {
        if (f79607a) {
            throw new c(String.format("%s - %s", str, th2));
        }
    }
}
