package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfpe implements zzdjr, zzdcv, zzdjv {
    private final zzfps zza;
    private final zzfpi zzb;

    zzfpe(Context context, zzfps zzfpsVar) {
        this.zza = zzfpsVar;
        this.zzb = zzfpi.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zza() {
        if (((Boolean) zzbjx.zzd.zze()).booleanValue()) {
            zzfps zzfpsVar = this.zza;
            zzfpi zzfpiVar = this.zzb;
            zzfpiVar.zzd(true);
            zzfpsVar.zza(zzfpiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
        if (((Boolean) zzbjx.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbjx.zzd.zze()).booleanValue()) {
            zzfps zzfpsVar = this.zza;
            zzfpi zzfpiVar = this.zzb;
            zzfpiVar.zzk(zzeVar.zza().toString());
            zzfpiVar.zzd(false);
            zzfpsVar.zza(zzfpiVar);
        }
    }
}
