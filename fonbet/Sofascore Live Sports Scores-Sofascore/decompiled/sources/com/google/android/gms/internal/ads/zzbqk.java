package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqk {
    public boolean a = false;
    public boolean b = false;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z) {
        if (!this.d.get()) {
            return z;
        }
        return this.a;
    }
}
