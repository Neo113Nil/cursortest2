package com.google.android.gms.measurement.internal;

import N3.C3660k;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class zzfb {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzfb(@NonNull String str, @NonNull String str2, Bundle bundle, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j11;
    }

    public static zzfb zzb(zzaw zzawVar) {
        return new zzfb(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.zzc(), zzawVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder d11 = C3660k.d("origin=", str, ",name=", str2, ",params=");
        d11.append(obj);
        return d11.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
