package io.agora.utils2.internal;

import io.agora.base.internal.CalledByNative;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class Logging {
    private static final int AGORA_LOG_DEBUG = 2048;
    private static final int AGORA_LOG_ERROR = 4;
    private static final int AGORA_LOG_INFO = 1;
    private static final int AGORA_LOG_WARN = 2;
    private static int nativeLogLevel = 2055;

    public static void d(String str) {
        if ((nativeLogLevel & 2048) != 0) {
            nativeLog(2048, str);
        }
    }

    public static void e(String str) {
        if ((nativeLogLevel & 4) != 0) {
            nativeLog(4, str);
        }
    }

    public static String getStackTraceString(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            th2.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Throwable unused) {
            String message = th2.getMessage();
            return message == null ? "" : message;
        }
    }

    public static void i(String str) {
        if ((nativeLogLevel & 1) != 0) {
            nativeLog(1, str);
        }
    }

    public static void log(int i10, String str, String str2) {
        if ((nativeLogLevel & i10) != 0) {
            nativeLog(i10, "[" + str + "] " + str2);
        }
    }

    public static native int nativeLog(int i10, String str);

    @CalledByNative
    public static void setNativeLogLevel(int i10) {
        nativeLogLevel = i10;
        io.agora.base.internal.Logging.setNativeLogLevel(i10);
    }

    public static void w(String str) {
        if ((nativeLogLevel & 2) != 0) {
            nativeLog(2, str);
        }
    }

    public static void d(String str, String str2) {
        log(2048, str, str2);
    }

    public static void e(String str, String str2) {
        log(4, str, str2);
    }

    public static void i(String str, String str2) {
        log(1, str, str2);
    }

    public static void w(String str, String str2) {
        log(2, str, str2);
    }

    public static void d(String str, String str2, Throwable th2) {
        log(2048, str, str2);
        log(2048, str, th2.toString());
        log(2048, str, getStackTraceString(th2));
    }

    public static void e(String str, String str2, Throwable th2) {
        log(4, str, str2);
        log(4, str, th2.toString());
        log(4, str, getStackTraceString(th2));
    }

    public static void w(String str, String str2, Throwable th2) {
        log(2, str, str2);
        log(2, str, th2.toString());
        log(2, str, getStackTraceString(th2));
    }
}
