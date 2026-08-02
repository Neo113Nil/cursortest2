package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfws implements zzfwl {
    public static zzfws d;
    public float a;
    public zzfwg b;
    public zzfwk c;

    public static zzfws a() {
        zzfws zzfwsVar = d;
        if (zzfwsVar != null) {
            return zzfwsVar;
        }
        new zzfwd();
        new zzfwh();
        zzfws zzfwsVar2 = new zzfws();
        zzfwsVar2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        d = zzfwsVar2;
        return zzfwsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(boolean z) {
        if (z) {
            zzfxu.f.getClass();
            zzfxu.b();
            return;
        }
        zzfxu.f.getClass();
        Handler handler = zzfxu.h;
        if (handler != null) {
            handler.removeCallbacks(zzfxu.j);
            zzfxu.h = null;
        }
    }
}
