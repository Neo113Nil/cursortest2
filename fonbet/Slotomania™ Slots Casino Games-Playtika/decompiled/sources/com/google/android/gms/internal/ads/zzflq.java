package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzflq implements zzimi {
    private zzflq(zzflp zzflpVar) {
    }

    public static zzflq zza(zzflp zzflpVar) {
        return new zzflq(zzflpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzimq.zzb(defaultClock);
        return defaultClock;
    }
}
