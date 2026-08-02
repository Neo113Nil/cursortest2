package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class EventLog {
    @CalledByNative
    public static void writeEvent(int i11, int i12) {
        android.util.EventLog.writeEvent(i11, i12);
    }
}
