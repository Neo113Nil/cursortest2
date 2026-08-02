package k5;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    private static R2 f70599a;

    @NonNull
    public static synchronized R2 a() {
        R2 r22;
        synchronized (L2.class) {
            try {
                if (f70599a == null) {
                    f70599a = new R2();
                }
                r22 = f70599a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r22;
    }

    static void b(Process process) {
        if (process != null) {
            try {
                try {
                    process.exitValue();
                } catch (Throwable unused) {
                }
            } catch (IllegalThreadStateException unused2) {
                process.destroy();
            }
        }
    }
}
