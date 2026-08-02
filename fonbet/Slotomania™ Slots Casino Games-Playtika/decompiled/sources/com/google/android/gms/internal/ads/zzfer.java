package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfer implements zzfby {
    private final zzhbs zza;

    public zzfer(zzhbs zzhbsVar) {
        this.zza = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(zzfeq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 51;
    }
}
