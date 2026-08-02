package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o {
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j) {
        runnable.getClass();
        this.a.postAtTime(runnable, SystemClock.uptimeMillis() + j);
    }
}
