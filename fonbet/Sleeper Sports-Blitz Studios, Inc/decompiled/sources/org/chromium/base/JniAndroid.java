package org.chromium.base;

/* loaded from: classes10.dex */
public final class JniAndroid {
    private static final String TAG = "JniAndroid";
    static boolean sSimulateOomInSanitizedStacktraceForTesting;

    private JniAndroid() {
    }

    private static String sanitizedStacktraceForUnhandledException(Throwable throwable) {
        if (sSimulateOomInSanitizedStacktraceForTesting) {
            return null;
        }
        try {
            try {
                return PiiElider.sanitizeStacktrace(Log.getStackTraceString(throwable));
            } catch (Throwable th) {
                return "Error while getting stack trace: " + Log.getStackTraceString(th);
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static class UncaughtExceptionException extends RuntimeException {
        public UncaughtExceptionException(String nativeStackTrace, Throwable uncaughtException) {
            super("Native stack trace:" + System.lineSeparator() + nativeStackTrace, uncaughtException);
        }
    }

    private static Throwable handleException(Throwable throwable, String nativeStackTrace) {
        try {
            Log.e(TAG, "Handling uncaught Java exception", throwable);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new UncaughtExceptionException(nativeStackTrace, throwable));
            Log.e(TAG, "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            Log.e(TAG, "Exception in uncaught exception handler.", th);
            return th;
        }
    }
}
