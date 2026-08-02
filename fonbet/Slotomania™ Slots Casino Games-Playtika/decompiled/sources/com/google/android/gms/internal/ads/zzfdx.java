package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfdx implements zzfby {
    final zzhbs zza;
    final List zzb;

    public zzfdx(zzbho zzbhoVar, zzhbs zzhbsVar, List list) {
        this.zza = zzhbsVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdy(zzfdx.this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 48;
    }
}
