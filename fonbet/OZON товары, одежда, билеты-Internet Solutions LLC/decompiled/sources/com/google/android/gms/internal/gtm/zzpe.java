package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;

/* loaded from: classes9.dex */
public final class zzpe {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final String zze;
    private final String zzf;

    public zzpe(String str, String str2, String str3, boolean z11, String str4, String str5) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull("");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z11;
        this.zze = str4;
        this.zzf = "";
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        String str = this.zzc;
        if (str == null) {
            return this.zza;
        }
        String str2 = this.zza;
        return C6594f.a(str, "_", str2, new StringBuilder(str.length() + 1 + String.valueOf(str2).length()));
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzd;
    }
}
