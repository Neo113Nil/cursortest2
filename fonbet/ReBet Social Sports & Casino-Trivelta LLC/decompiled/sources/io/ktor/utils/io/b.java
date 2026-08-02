package io.ktor.utils.io;

/* loaded from: classes3.dex */
public abstract class b {
    public static final Void b(Throwable th2) {
        Throwable th3;
        try {
            th3 = o.e(th2, th2);
        } catch (Throwable unused) {
            th3 = null;
        }
        if (th3 == null) {
            throw th2;
        }
        throw th3;
    }
}
