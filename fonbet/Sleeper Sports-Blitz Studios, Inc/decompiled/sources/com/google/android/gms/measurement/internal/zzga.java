package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzga {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    public final zzbf zza() {
        return new zzbf(this.zza, new zzba(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzga zza(zzbf zzbfVar) {
        return new zzga(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.zzb(), zzbfVar.zzd);
    }

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    private zzga(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }
}
