package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes6.dex */
public final class ThreadUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f78519a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f78520b;

    public static Handler a() {
        if (f78520b != null) {
            return f78520b;
        }
        Looper mainLooper = Looper.getMainLooper();
        synchronized (f78519a) {
            try {
                if (f78520b == null) {
                    f78520b = new Handler(mainLooper);
                    TraceEvent.q();
                } else if (f78520b.getLooper() != mainLooper) {
                    throw new RuntimeException("UI thread looper is already set to " + String.valueOf(f78520b.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(mainLooper));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f78520b;
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i11) {
        return Process.getThreadPriority(i11) == -16;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i11) {
        Process.setThreadPriority(i11, -16);
    }
}
