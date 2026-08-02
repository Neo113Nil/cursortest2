package com.vk.sqliteext.log;

import androidx.annotation.Keep;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;

@Keep
/* loaded from: classes5.dex */
public final class SQLiteNativeLogger {
    private static boolean isTrackingEnabled = true;

    public static final class NativeException extends RuntimeException {
    }

    public static void enableErrorTracking(boolean z) {
        isTrackingEnabled = z;
    }

    @Keep
    public static void logErrorFromNative(String str) {
        NativeException nativeException = new NativeException(str);
        if (isTrackingEnabled) {
            b.a.q(nativeException);
        } else {
            L.i(nativeException);
        }
    }
}
