package org.chromium.base;

import internal.org.chromium.build.BuildConfig;
import java.util.Locale;

/* loaded from: classes10.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    private Log() {
    }

    private static String formatLog(String messageTemplate, Throwable tr, Object[] params) {
        return params != null ? ((tr != null || params.length <= 0) && params.length <= 1) ? messageTemplate : String.format(Locale.US, messageTemplate, params) : messageTemplate;
    }

    public static String normalizeTag(String tag) {
        return BuildConfig.LOGTAG_PREFIX + tag;
    }

    public static boolean isLoggable(String tag, int level) {
        return BuildConfig.ENABLE_DEBUG_LOGS || android.util.Log.isLoggable(tag, level);
    }

    public static void v(String tag, String messageTemplate, Object... args) {
        if (isLoggable(tag, 2)) {
            Throwable throwableToLog = getThrowableToLog(args);
            String formatLog = formatLog(messageTemplate, throwableToLog, args);
            String normalizeTag = normalizeTag(tag);
            if (throwableToLog != null) {
                android.util.Log.v(normalizeTag, formatLog, throwableToLog);
            } else {
                android.util.Log.v(normalizeTag, formatLog);
            }
        }
    }

    public static void d(String tag, String messageTemplate, Object... args) {
        if (isLoggable(tag, 3)) {
            Throwable throwableToLog = getThrowableToLog(args);
            String formatLog = formatLog(messageTemplate, throwableToLog, args);
            String normalizeTag = normalizeTag(tag);
            if (throwableToLog != null) {
                android.util.Log.d(normalizeTag, formatLog, throwableToLog);
            } else {
                android.util.Log.d(normalizeTag, formatLog);
            }
        }
    }

    public static void i(String tag, String messageTemplate, Object... args) {
        Throwable throwableToLog = getThrowableToLog(args);
        String formatLog = formatLog(messageTemplate, throwableToLog, args);
        String normalizeTag = normalizeTag(tag);
        if (throwableToLog != null) {
            android.util.Log.i(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.i(normalizeTag, formatLog);
        }
    }

    public static void i(String tag, String message) {
        android.util.Log.i(normalizeTag(tag), message);
    }

    public static void i(String tag, String message, Throwable t) {
        android.util.Log.i(normalizeTag(tag), message, t);
    }

    public static void i(String tag, String messageTemplate, Object param1) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1));
    }

    public static void i(String tag, String messageTemplate, Object param1, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1), t);
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2));
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2), t);
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3));
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3), t);
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4));
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4), t);
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5));
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5), t);
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6));
    }

    public static void i(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Throwable t) {
        android.util.Log.i(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6), t);
    }

    public static void w(String tag, String messageTemplate, Object... args) {
        Throwable throwableToLog = getThrowableToLog(args);
        String formatLog = formatLog(messageTemplate, throwableToLog, args);
        String normalizeTag = normalizeTag(tag);
        if (throwableToLog != null) {
            android.util.Log.w(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.w(normalizeTag, formatLog);
        }
    }

    public static void w(String tag, String message) {
        android.util.Log.w(normalizeTag(tag), message);
    }

    public static void w(String tag, String message, Throwable t) {
        android.util.Log.w(normalizeTag(tag), message, t);
    }

    public static void w(String tag, String messageTemplate, Object param1) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1));
    }

    public static void w(String tag, String messageTemplate, Object param1, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1), t);
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2));
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2), t);
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3));
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3), t);
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4));
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4), t);
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5));
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5), t);
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6));
    }

    public static void w(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Throwable t) {
        android.util.Log.w(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6), t);
    }

    public static void e(String tag, String messageTemplate, Object... args) {
        Throwable throwableToLog = getThrowableToLog(args);
        String formatLog = formatLog(messageTemplate, throwableToLog, args);
        String normalizeTag = normalizeTag(tag);
        if (throwableToLog != null) {
            android.util.Log.e(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.e(normalizeTag, formatLog);
        }
    }

    public static void e(String tag, String message) {
        android.util.Log.e(normalizeTag(tag), message);
    }

    public static void e(String tag, String message, Throwable t) {
        android.util.Log.e(normalizeTag(tag), message, t);
    }

    public static void e(String tag, String messageTemplate, Object param1) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1));
    }

    public static void e(String tag, String messageTemplate, Object param1, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1), t);
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2));
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2), t);
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3));
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3), t);
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4));
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4), t);
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5));
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5), t);
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6));
    }

    public static void e(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Throwable t) {
        android.util.Log.e(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6), t);
    }

    public static void wtf(String tag, String messageTemplate, Object... args) {
        Throwable throwableToLog = getThrowableToLog(args);
        String formatLog = formatLog(messageTemplate, throwableToLog, args);
        String normalizeTag = normalizeTag(tag);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag, formatLog);
        }
    }

    public static void wtf(String tag, String message) {
        android.util.Log.wtf(normalizeTag(tag), message);
    }

    public static void wtf(String tag, String message, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), message, t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1), t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2), t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3), t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4), t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5), t);
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6));
    }

    public static void wtf(String tag, String messageTemplate, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Throwable t) {
        android.util.Log.wtf(normalizeTag(tag), String.format(Locale.US, messageTemplate, param1, param2, param3, param4, param5, param6), t);
    }

    public static String getStackTraceString(Throwable tr) {
        return android.util.Log.getStackTraceString(tr);
    }

    private static Throwable getThrowableToLog(Object[] args) {
        if (args == null || args.length == 0) {
            return null;
        }
        Object obj = args[args.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
