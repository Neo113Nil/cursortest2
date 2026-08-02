package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
public final class zzgl extends zzkc implements zzlk {
    private static final zzgl zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgl zzglVar = new zzgl();
        zza = zzglVar;
        zzkc.zzbM(zzgl.class, zzglVar);
    }

    private zzgl() {
    }

    public static zzgk zzd() {
        return (zzgk) zza.zzbA();
    }

    static /* synthetic */ void zzh(zzgl zzglVar, long j11) {
        zzglVar.zze |= 1;
        zzglVar.zzf = j11;
    }

    static /* synthetic */ void zzi(zzgl zzglVar, String str) {
        str.getClass();
        zzglVar.zze |= 2;
        zzglVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzgl zzglVar, String str) {
        str.getClass();
        zzglVar.zze |= 4;
        zzglVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzgl zzglVar) {
        zzglVar.zze &= -5;
        zzglVar.zzh = zza.zzh;
    }

    static /* synthetic */ void zzm(zzgl zzglVar, long j11) {
        zzglVar.zze |= 8;
        zzglVar.zzi = j11;
    }

    static /* synthetic */ void zzn(zzgl zzglVar) {
        zzglVar.zze &= -9;
        zzglVar.zzi = 0L;
    }

    static /* synthetic */ void zzo(zzgl zzglVar, double d11) {
        zzglVar.zze |= 32;
        zzglVar.zzk = d11;
    }

    static /* synthetic */ void zzp(zzgl zzglVar) {
        zzglVar.zze &= -33;
        zzglVar.zzk = 0.0d;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzgl();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzgk(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzq() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}
