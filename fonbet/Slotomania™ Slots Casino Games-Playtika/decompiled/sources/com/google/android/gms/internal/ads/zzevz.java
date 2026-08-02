package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzevz implements zzfby {
    private final zzfkm zza;

    zzevz(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzewa(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 58;
    }
}
