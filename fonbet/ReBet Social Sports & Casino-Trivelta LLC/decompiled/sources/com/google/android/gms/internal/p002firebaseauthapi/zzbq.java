package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzbq {
    private boolean zza;
    private zzbk zzb;
    private final zzcb zzc;
    private zzbp zzd;
    private zzbn zze;

    private zzbq(zzcb zzcbVar) {
        this.zzb = zzbk.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzcbVar;
    }

    public final zzbq zzb() {
        zzbp zzbpVar;
        zzbpVar = zzbp.zza;
        this.zzd = zzbpVar;
        return this;
    }

    public final zzbq zza() {
        zzbn zzbnVar = this.zze;
        if (zzbnVar != null) {
            zzbnVar.zzb();
        }
        this.zza = true;
        return this;
    }
}
