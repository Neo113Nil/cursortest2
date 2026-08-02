package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbkn {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    public final ScheduledExecutorService c;

    public zzbkn(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }
}
