package com.mbridge.msdk.foundation.tools;

import android.os.SystemClock;

/* compiled from: SameDeviceTimeTool.java */
/* loaded from: classes13.dex */
public final class l0 {
    public static final long a() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (currentTimeMillis > 0) {
                return (currentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
