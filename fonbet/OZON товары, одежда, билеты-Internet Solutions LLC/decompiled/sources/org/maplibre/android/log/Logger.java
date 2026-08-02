package org.maplibre.android.log;

import android.util.Log;
import androidx.annotation.Keep;
import bg.InterfaceC5660a;

@Keep
/* loaded from: classes10.dex */
public final class Logger {
    public static final int DEBUG = 3;
    private static final InterfaceC5660a DEFAULT;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 99;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static int logLevel;
    private static volatile InterfaceC5660a logger;

    final class a implements InterfaceC5660a {
    }

    static {
        a aVar = new a();
        DEFAULT = aVar;
        logger = aVar;
    }

    public static void d(String str, String str2) {
        if (logLevel <= 3) {
            ((a) logger).getClass();
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (logLevel <= 6) {
            ((a) logger).getClass();
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (logLevel <= 4) {
            ((a) logger).getClass();
            Log.i(str, str2);
        }
    }

    public static void log(int i11, String str, String str2) {
        if (i11 == 2) {
            v(str, str2);
            return;
        }
        if (i11 == 3) {
            d(str, str2);
            return;
        }
        if (i11 == 4) {
            i(str, str2);
        } else if (i11 == 5) {
            w(str, str2);
        } else {
            if (i11 != 6) {
                throw new UnsupportedOperationException();
            }
            e(str, str2);
        }
    }

    public static void setLoggerDefinition(InterfaceC5660a interfaceC5660a) {
        logger = interfaceC5660a;
    }

    public static void setVerbosity(int i11) {
        logLevel = i11;
    }

    public static void v(String str, String str2) {
        if (logLevel <= 2) {
            ((a) logger).getClass();
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (logLevel <= 5) {
            ((a) logger).getClass();
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (logLevel <= 3) {
            ((a) logger).getClass();
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (logLevel <= 6) {
            ((a) logger).getClass();
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (logLevel <= 4) {
            ((a) logger).getClass();
            Log.i(str, str2, th2);
        }
    }

    public static void v(String str, String str2, Throwable th2) {
        if (logLevel <= 2) {
            ((a) logger).getClass();
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (logLevel <= 5) {
            ((a) logger).getClass();
            Log.w(str, str2, th2);
        }
    }
}
