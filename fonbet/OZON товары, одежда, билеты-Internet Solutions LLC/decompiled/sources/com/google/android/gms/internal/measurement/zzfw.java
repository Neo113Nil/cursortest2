package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzfw extends zzkc implements zzlk {
    private static final zzfw zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private zzkj zzk = zzkc.zzbG();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzkc.zzbM(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zze() {
        return (zzfv) zza.zzbA();
    }

    static /* synthetic */ void zzj(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 1;
        zzfwVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 2;
        zzfwVar.zzg = str;
    }

    static /* synthetic */ void zzm(zzfw zzfwVar) {
        zzfwVar.zze &= -3;
        zzfwVar.zzg = zza.zzg;
    }

    static /* synthetic */ void zzn(zzfw zzfwVar, long j11) {
        zzfwVar.zze |= 4;
        zzfwVar.zzh = j11;
    }

    static /* synthetic */ void zzo(zzfw zzfwVar) {
        zzfwVar.zze &= -5;
        zzfwVar.zzh = 0L;
    }

    static /* synthetic */ void zzp(zzfw zzfwVar, double d11) {
        zzfwVar.zze |= 16;
        zzfwVar.zzj = d11;
    }

    static /* synthetic */ void zzq(zzfw zzfwVar) {
        zzfwVar.zze &= -17;
        zzfwVar.zzj = 0.0d;
    }

    static /* synthetic */ void zzr(zzfw zzfwVar, zzfw zzfwVar2) {
        zzfwVar2.getClass();
        zzfwVar.zzz();
        zzfwVar.zzk.add(zzfwVar2);
    }

    static /* synthetic */ void zzs(zzfw zzfwVar, Iterable iterable) {
        zzfwVar.zzz();
        zzil.zzbw(iterable, zzfwVar.zzk);
    }

    private final void zzz() {
        zzkj zzkjVar = this.zzk;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzk = zzkc.zzbH(zzkjVar);
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfw.class});
        }
        if (i12 == 3) {
            return new zzfw();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzfv(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}
