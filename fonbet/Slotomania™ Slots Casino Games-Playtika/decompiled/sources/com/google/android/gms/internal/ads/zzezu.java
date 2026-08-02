package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzezu implements zzfby {
    private final zzfjs zza;

    zzezu(zzfjs zzfjsVar) {
        this.zza = zzfjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzezv(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 25;
    }
}
