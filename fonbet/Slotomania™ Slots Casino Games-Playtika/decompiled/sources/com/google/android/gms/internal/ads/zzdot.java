package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdot implements zzhbf {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdpc zzb;

    zzdot(zzdpc zzdpcVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdpcVar);
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzelb) obj);
    }
}
