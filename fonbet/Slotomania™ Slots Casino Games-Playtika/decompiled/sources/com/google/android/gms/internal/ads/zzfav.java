package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzfav implements zzfby {
    private final String zza;

    zzfav(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzfaw(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 31;
    }
}
