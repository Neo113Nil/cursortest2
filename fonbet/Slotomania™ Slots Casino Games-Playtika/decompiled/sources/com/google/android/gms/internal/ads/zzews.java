package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzews implements zzfby {
    private final zzhbs zza;
    private final zzdwv zzb;
    private final String zzc;
    private final zzfkm zzd;

    public zzews(zzhbs zzhbsVar, zzdwv zzdwvVar, zzfkm zzfkmVar, String str) {
        this.zza = zzhbsVar;
        this.zzb = zzdwvVar;
        this.zzd = zzfkmVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzews.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 17;
    }

    final /* synthetic */ zzewt zzc() {
        zzfkm zzfkmVar = this.zzd;
        zzdwv zzdwvVar = this.zzb;
        return new zzewt(zzdwvVar.zzb(zzfkmVar.zzg, this.zzc), zzdwvVar.zzc());
    }
}
