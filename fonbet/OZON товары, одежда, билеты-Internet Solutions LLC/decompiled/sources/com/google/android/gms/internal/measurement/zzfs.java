package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzfs extends zzkc implements zzlk {
    private static final zzfs zza;
    private int zze;
    private zzkj zzf = zzkc.zzbG();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfs zzfsVar = new zzfs();
        zza = zzfsVar;
        zzkc.zzbM(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    public static zzfr zze() {
        return (zzfr) zza.zzbA();
    }

    static /* synthetic */ void zzj(zzfs zzfsVar, int i11, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.zzv();
        zzfsVar.zzf.set(i11, zzfwVar);
    }

    static /* synthetic */ void zzk(zzfs zzfsVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.zzv();
        zzfsVar.zzf.add(zzfwVar);
    }

    static /* synthetic */ void zzm(zzfs zzfsVar, Iterable iterable) {
        zzfsVar.zzv();
        zzil.zzbw(iterable, zzfsVar.zzf);
    }

    static /* synthetic */ void zzo(zzfs zzfsVar, int i11) {
        zzfsVar.zzv();
        zzfsVar.zzf.remove(i11);
    }

    static /* synthetic */ void zzp(zzfs zzfsVar, String str) {
        str.getClass();
        zzfsVar.zze |= 1;
        zzfsVar.zzg = str;
    }

    static /* synthetic */ void zzq(zzfs zzfsVar, long j11) {
        zzfsVar.zze |= 2;
        zzfsVar.zzh = j11;
    }

    static /* synthetic */ void zzr(zzfs zzfsVar, long j11) {
        zzfsVar.zze |= 4;
        zzfsVar.zzi = j11;
    }

    private final void zzv() {
        zzkj zzkjVar = this.zzf;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzf = zzkc.zzbH(zzkjVar);
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfw zzg(int i11) {
        return (zzfw) this.zzf.get(i11);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfw.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzfs();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzfr(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
