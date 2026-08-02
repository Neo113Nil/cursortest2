package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdub implements zzhbf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbpe zzb;

    zzdub(zzdul zzdulVar, String str, zzbpe zzbpeVar) {
        this.zza = str;
        this.zzb = zzbpeVar;
        Objects.requireNonNull(zzdulVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcki) obj).zzab(this.zza, this.zzb);
    }
}
