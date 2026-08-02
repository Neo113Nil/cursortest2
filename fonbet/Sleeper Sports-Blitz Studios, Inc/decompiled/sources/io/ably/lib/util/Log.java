package io.ably.lib.util;

import java.io.PrintStream;

/* loaded from: classes9.dex */
public class Log {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 99;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static final LogHandler defaultHandler;
    public static final int defaultLevel = 5;
    public static LogHandler handler = null;
    public static int level = 5;
    private static String[] severities;

    public interface LogHandler {
        void println(int i, String str, String str2, Throwable th);
    }

    public static class DefaultHandler implements LogHandler {
        @Override // io.ably.lib.util.Log.LogHandler
        public void println(int i, String str, String str2, Throwable th) {
            println(System.out, i, str, str2, th);
        }

        protected void println(PrintStream printStream, int i, String str, String str2, Throwable th) {
            printStream.print("(" + Log.severities[i] + "): ");
            if (str != null && str.length() != 0) {
                printStream.print(str + ": ");
            }
            if (str2 != null && str2.length() != 0) {
                printStream.print(str2);
            }
            printStream.println();
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    public static int v(String str, String str2) {
        print(2, str, str2, null);
        return 0;
    }

    public static int v(String str, String str2, Throwable th) {
        print(2, str, str2, th);
        return 0;
    }

    public static int d(String str, String str2) {
        print(3, str, str2, null);
        return 0;
    }

    public static int d(String str, String str2, Throwable th) {
        print(3, str, str2, th);
        return 0;
    }

    public static int i(String str, String str2) {
        print(4, str, str2, null);
        return 0;
    }

    public static int i(String str, String str2, Throwable th) {
        print(4, str, str2, th);
        return 0;
    }

    public static int w(String str, String str2) {
        print(5, str, str2, null);
        return 0;
    }

    public static int w(String str, String str2, Throwable th) {
        print(5, str, str2, th);
        return 0;
    }

    public static int w(String str, Throwable th) {
        print(5, str, null, th);
        return 0;
    }

    public static int e(String str, String str2) {
        print(6, str, str2, null);
        return 0;
    }

    public static int e(String str, String str2, Throwable th) {
        print(6, str, str2, th);
        return 0;
    }

    public static void setLevel(int i) {
        if (i == 0) {
            i = 5;
        }
        level = i;
    }

    public static void setHandler(LogHandler logHandler) {
        if (logHandler == null) {
            logHandler = defaultHandler;
        }
        handler = logHandler;
    }

    static {
        DefaultHandler defaultHandler2 = new DefaultHandler();
        defaultHandler = defaultHandler2;
        handler = defaultHandler2;
        severities = new String[]{"", "", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT"};
    }

    private static void print(int i, String str, String str2, Throwable th) {
        if (i >= level) {
            handler.println(i, str, str2, th);
        }
    }
}
