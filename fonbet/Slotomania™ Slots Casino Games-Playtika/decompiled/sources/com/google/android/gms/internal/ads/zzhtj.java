package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtj extends zzidr implements zzifd {
    private static final zzhtj zzj;
    private static volatile zzifk zzk;
    private int zza;
    private int zzb;
    private zzhtl zzc;
    private zzicn zzd;
    private zzicn zze;
    private zzicn zzf;
    private zzicn zzg;
    private zzicn zzh;
    private zzicn zzi;

    static {
        zzhtj zzhtjVar = new zzhtj();
        zzj = zzhtjVar;
        zzidr.zzbu(zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
        this.zzf = zzicnVar;
        this.zzg = zzicnVar;
        this.zzh = zzicnVar;
        this.zzi = zzicnVar;
    }

    public static zzhtj zzj(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtj) zzidr.zzbT(zzj, zzicnVar, zzidbVar);
    }

    public static zzhti zzk() {
        return (zzhti) zzj.zzbn();
    }

    public static zzifk zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtl zzb() {
        zzhtl zzhtlVar = this.zzc;
        return zzhtlVar == null ? zzhtl.zzh() : zzhtlVar;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    public final zzicn zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzhtj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhti(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzk;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhtj.class) {
            zzifkVar = zzk;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzj);
                zzk = zzifkVar;
            }
        }
        return zzifkVar;
    }

    public final zzicn zze() {
        return this.zzf;
    }

    public final zzicn zzg() {
        return this.zzg;
    }

    public final zzicn zzh() {
        return this.zzh;
    }

    public final zzicn zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(zzhtl zzhtlVar) {
        zzhtlVar.getClass();
        this.zzc = zzhtlVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzp(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zze = zzicnVar;
    }

    final /* synthetic */ void zzq(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzf = zzicnVar;
    }

    final /* synthetic */ void zzr(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzg = zzicnVar;
    }

    final /* synthetic */ void zzs(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzh = zzicnVar;
    }

    final /* synthetic */ void zzt(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzi = zzicnVar;
    }
}
