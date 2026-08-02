package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgir {
    private final Context zza;
    private final zzgpu zzb;
    private final zzggn zzc;
    private final String zzd;

    zzgir(Context context, zzgpu zzgpuVar, zzggn zzggnVar, zzgco zzgcoVar) {
        this.zza = context;
        this.zzb = zzgpuVar;
        this.zzc = zzggnVar;
        this.zzd = zzgcoVar.zzd();
    }

    public final String zza(boolean z, long j) {
        try {
            this.zzb.zza(55).zza();
            zzayq zza = zzayr.zza();
            zza.zzb(this.zzd);
            zza.zza("0.869425873");
            zza.zzd(this.zza.getPackageName());
            zza.zzc(System.currentTimeMillis() / 1000);
            zza.zzf((System.currentTimeMillis() - j) / 1000);
            try {
                zza.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            zzggn zzggnVar = this.zzc;
            if (!zzggnVar.zzc()) {
                zzggnVar.zza();
            }
            zzayx zzf = zzggnVar.zzf(((zzayr) zza.zzbu()).zzaN(), null);
            zzf.zzc(5);
            zzf.zzd(2);
            return zzgdj.zza(((zzayy) zzf.zzbu()).zzaN(), true);
        } finally {
        }
    }
}
