package org.chromium.base;

import B0.A0;
import android.util.Log;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class JniAndroid {

    public static class a extends RuntimeException {
    }

    private JniAndroid() {
    }

    @CalledByNative
    private static Throwable handleException(Throwable th2, String str) {
        try {
            j.b("JniAndroid", "Handling uncaught Java exception", th2);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new a(A0.b("Native stack trace:", System.lineSeparator(), str), th2));
            j.a("JniAndroid", "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th3) {
            j.b("JniAndroid", "Exception in uncaught exception handler.", th3);
            return th3;
        }
    }

    @CalledByNative
    private static String sanitizedStacktraceForUnhandledException(Throwable th2) {
        try {
            try {
                return n.a(Log.getStackTraceString(th2));
            } catch (Throwable th3) {
                return "Error while getting stack trace: " + Log.getStackTraceString(th3);
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
