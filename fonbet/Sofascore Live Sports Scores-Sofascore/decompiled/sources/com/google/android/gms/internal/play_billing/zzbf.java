package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;
import defpackage.dmn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbf {
    public static final zzbq a;

    static {
        dmn dmnVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            dmnVar = new dmn(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            dmnVar = new dmn(1);
        }
        a = dmnVar;
    }
}
