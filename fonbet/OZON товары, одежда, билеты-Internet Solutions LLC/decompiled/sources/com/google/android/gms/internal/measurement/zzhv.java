package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzhv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzic zzi;

    private zzhv(String str, Uri uri, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, zzic zzicVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z11;
        this.zzf = false;
        this.zzg = z13;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzhv zza() {
        return new zzhv(null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, null);
    }

    public final zzhv zzb() {
        if (this.zzc.isEmpty()) {
            return new zzhv(null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzhy zzc(String str, double d11) {
        return new zzht(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzhy zzd(String str, long j11) {
        return new zzhr(this, str, Long.valueOf(j11), true);
    }

    public final zzhy zze(String str, String str2) {
        return new zzhu(this, str, str2, true);
    }

    public final zzhy zzf(String str, boolean z11) {
        return new zzhs(this, str, Boolean.valueOf(z11), true);
    }

    public zzhv(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
