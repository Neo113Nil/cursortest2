package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfmz {
    private final long zza;
    private long zzc;
    private final zzfmy zzb = new zzfmy();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfmz() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzfmy zzg() {
        zzfmy zzfmyVar = this.zzb;
        zzfmy clone = zzfmyVar.clone();
        zzfmyVar.zza = false;
        zzfmyVar.zzb = 0;
        return clone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
