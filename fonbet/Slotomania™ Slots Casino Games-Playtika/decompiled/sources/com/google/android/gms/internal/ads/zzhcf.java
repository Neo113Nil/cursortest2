package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhcf extends zzhbp {
    final /* synthetic */ zzhch zza;
    private final zzhap zzb;

    zzhcf(zzhch zzhchVar, zzhap zzhapVar) {
        Objects.requireNonNull(zzhchVar);
        this.zza = zzhchVar;
        this.zzb = zzhapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzhap zzhapVar = this.zzb;
        ListenableFuture zza = zzhapVar.zza();
        zzgsw.zzl(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhapVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
