package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzddz extends zzdid implements zzbnu {
    private final Bundle zzb;

    zzddz(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzddy.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
