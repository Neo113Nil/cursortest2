package j3;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f69263a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f69264b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (r.class) {
            if (f69263a.add(str)) {
                f69264b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (r.class) {
            str = f69264b;
        }
        return str;
    }
}
