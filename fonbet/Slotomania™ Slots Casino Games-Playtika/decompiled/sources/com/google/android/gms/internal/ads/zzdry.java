package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdry implements zzhbf {
    final /* synthetic */ zzdyi zza;
    final /* synthetic */ zzdsb zzb;

    zzdry(zzdsb zzdsbVar, zzdyi zzdyiVar) {
        this.zza = zzdyiVar;
        Objects.requireNonNull(zzdsbVar);
        this.zzb = zzdsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zzb.zzd().zzf(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
