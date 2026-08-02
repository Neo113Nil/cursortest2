package b1;

import java.util.HashSet;

/* renamed from: b1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2332A {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f24190a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f24191b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (AbstractC2332A.class) {
            if (f24190a.add(str)) {
                f24191b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (AbstractC2332A.class) {
            str = f24191b;
        }
        return str;
    }
}
