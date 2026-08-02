package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcms {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcms(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcms zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcms(3, 0, 0) : zzrVar.zzi ? new zzcms(2, 0, 0) : zzrVar.zzh ? new zzcms(0, 0, 0) : new zzcms(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcms zzb() {
        return new zzcms(0, 0, 0);
    }

    public static zzcms zzc(int i, int i2) {
        return new zzcms(1, i, i2);
    }

    public static zzcms zzd() {
        return new zzcms(4, 0, 0);
    }

    public static zzcms zze() {
        return new zzcms(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
