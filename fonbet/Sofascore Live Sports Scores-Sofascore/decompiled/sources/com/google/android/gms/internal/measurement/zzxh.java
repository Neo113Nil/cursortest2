package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxh {
    static {
        try {
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
        }
    }
}
