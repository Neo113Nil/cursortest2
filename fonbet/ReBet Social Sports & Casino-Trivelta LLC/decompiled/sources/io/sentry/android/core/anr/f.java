package io.sentry.android.core.anr;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f50910a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f50911b = new Object();

    public static boolean a(File file) {
        File file2 = new File(file, "anr_profile_old");
        if (file2.exists()) {
            return file2.delete();
        }
        return true;
    }

    public static File b(File file) {
        d(file);
        return new File(file, "anr_profile");
    }

    public static File c(File file) {
        d(file);
        return new File(file, "anr_profile_old");
    }

    public static void d(File file) {
        AtomicBoolean atomicBoolean = f50910a;
        if (atomicBoolean.get()) {
            synchronized (f50911b) {
                try {
                    if (atomicBoolean.get()) {
                        File file2 = new File(file, "anr_profile");
                        File file3 = new File(file, "anr_profile_old");
                        try {
                            file3.delete();
                        } catch (Throwable unused) {
                        }
                        try {
                            file2.renameTo(file3);
                        } catch (Throwable unused2) {
                        }
                        f50910a.set(false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void e() {
        f50910a.set(true);
    }
}
