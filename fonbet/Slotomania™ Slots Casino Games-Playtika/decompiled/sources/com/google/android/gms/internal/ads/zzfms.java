package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfms implements zzhbf {
    final /* synthetic */ zzfmv zza;
    final /* synthetic */ zzfmx zzb;

    zzfms(zzfmx zzfmxVar, zzfmv zzfmvVar) {
        this.zza = zzfmvVar;
        Objects.requireNonNull(zzfmxVar);
        this.zzb = zzfmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfmx zzfmxVar = this.zzb;
        synchronized (zzfmxVar) {
            zzfmxVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfmx zzfmxVar = this.zzb;
        synchronized (zzfmxVar) {
            zzfmxVar.zzf(null);
            zzfmxVar.zze().addFirst(this.zza);
            if (zzfmxVar.zzg() == 1) {
                zzfmxVar.zzd();
            }
        }
    }
}
