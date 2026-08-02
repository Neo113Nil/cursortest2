package org.chromium.base;

import android.os.StrictMode;
import internal.org.jni_zero.CalledByNative;
import java.util.TimeZone;

/* loaded from: classes10.dex */
final class TimezoneUtils {
    private TimezoneUtils() {
    }

    @CalledByNative
    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id2 = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id2;
    }
}
