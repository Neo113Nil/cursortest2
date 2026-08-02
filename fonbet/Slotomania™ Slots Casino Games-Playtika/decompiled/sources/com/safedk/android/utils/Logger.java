package com.safedk.android.utils;

import android.util.Log;
import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes6.dex */
public final class Logger {
    private static final String TAG = "ApplovinQualityService";
    private static boolean debugMode = false;

    public enum FeatureTag {
        RESOURCES("__RESOURCES__"),
        JS_RESOURCES("__JS__ __RESOURCES__"),
        NW_RESOURCES("__NW__ __RESOURCES__"),
        MEMORY_LOAD("__MEMORY_LOAD__"),
        AD_CAPTURE("__AD_CAPTURE__"),
        REDIRECTS("__REDIRECTS__"),
        CI_MATCHING("__CI_MATCHING__"),
        PREFETCH("__PREFETCH__");

        private final String i;

        FeatureTag(String value) {
            this.i = value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.i;
        }
    }

    private Logger() {
    }

    public static void setDebugMode(boolean debug) {
        debugMode = debug;
    }

    public static boolean getDebugMode() {
        return debugMode;
    }

    private static String buildMessage(String tag, FeatureTag feature, Object... msg) {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(tag);
        sb.append("] ");
        if (feature != null) {
            sb.append(feature);
            sb.append(ServerSentEventKt.SPACE);
        }
        for (Object obj : msg) {
            if (!(obj instanceof Throwable)) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static int v(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            String buildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.v(TAG, buildMessage, (Throwable) obj);
            }
            return Log.v(TAG, buildMessage);
        }
        return 0;
    }

    public static int v(String tag, Object... msg) {
        return v(tag, null, msg);
    }

    public static int d(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            String buildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.d(TAG, buildMessage, (Throwable) obj);
            }
            return Log.d(TAG, buildMessage);
        }
        return 0;
    }

    public static int d(String tag, Object... msg) {
        return d(tag, null, msg);
    }

    public static int d(String tag_msg) {
        if (debugMode) {
            String[] split = tag_msg.split("\\|");
            if (split.length > 1) {
                return d(split[0], null, split[1]);
            }
            if (split.length == 1) {
                return d("UnknownClass", null, split[0]);
            }
        }
        return 0;
    }

    public static int i(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String buildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.i(TAG, buildMessage, (Throwable) obj);
            }
            return Log.i(TAG, buildMessage);
        }
        return 0;
    }

    public static int i(String tag, Object... msg) {
        return i(tag, null, msg);
    }

    public static int w(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String buildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.w(TAG, buildMessage, (Throwable) obj);
            }
            return Log.w(TAG, buildMessage);
        }
        return 0;
    }

    public static int w(String tag, Object... msg) {
        return w(tag, null, msg);
    }

    public static int e(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String buildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.e(TAG, buildMessage, (Throwable) obj);
            }
            return Log.e(TAG, buildMessage);
        }
        return 0;
    }

    public static int e(String tag, Object... msg) {
        return e(tag, null, msg);
    }

    public static void printStackTrace() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            d("StackTrace", null, stackTraceElement);
        }
    }

    public static void printStackTrace(String tag) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            d(tag, null, "printStackTrace " + stackTraceElement);
        }
    }

    public static void printFullVerboseLog(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : msg) {
                if (!(obj instanceof Throwable)) {
                    sb.append(obj);
                }
            }
            int length = sb.length() / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
            int i = 0;
            while (i <= length) {
                int i2 = i + 1;
                int i3 = i2 * Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
                if (i3 >= sb.length()) {
                    i3 = sb.length();
                }
                v(tag, feature, sb.substring(i * Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, i3));
                i = i2;
            }
        }
    }

    public static void printFullVerboseLog(String tag, Object... msg) {
        printFullVerboseLog(tag, null, msg);
    }
}
