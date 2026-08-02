package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public class zzbjo {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbjo(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbjo zza(String str, boolean z) {
        return new zzbjo(str, Boolean.valueOf(z), 1);
    }

    public static zzbjo zzb(String str, long j) {
        return new zzbjo(str, Long.valueOf(j), 2);
    }

    public static zzbjo zzc(String str, double d) {
        return new zzbjo(str, Double.valueOf(d), 3);
    }

    public static zzbjo zzd(String str, String str2) {
        return new zzbjo("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbku zza = zzbkw.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzb(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbkw.zzb() != null) {
            zzbkw.zzb().zza();
        }
        return this.zzb;
    }
}
