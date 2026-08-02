package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class DefaultClock implements Clock {
    public static final DefaultClock a = new DefaultClock();

    private DefaultClock() {
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
