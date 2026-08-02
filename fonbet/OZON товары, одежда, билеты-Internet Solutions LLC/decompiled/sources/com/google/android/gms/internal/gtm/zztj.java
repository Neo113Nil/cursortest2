package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class zztj {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zztk zzc;

    /* synthetic */ zztj(zzti zztiVar) {
    }

    public static int zzs(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long zzt(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public abstract int zza();

    public abstract int zzb(int i11) throws zzvk;

    public abstract int zzc() throws IOException;

    public abstract zztd zzd() throws IOException;

    public abstract String zze() throws IOException;

    public abstract String zzf() throws IOException;

    public abstract void zzg(int i11) throws zzvk;

    public abstract void zzh(int i11);

    public abstract boolean zzi() throws IOException;

    public abstract boolean zzj() throws IOException;

    public abstract boolean zzk(int i11) throws IOException;
}
