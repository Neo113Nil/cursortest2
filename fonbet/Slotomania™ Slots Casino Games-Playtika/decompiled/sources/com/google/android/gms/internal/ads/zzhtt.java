package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtt extends zzidr implements zzifd {
    private static final zzhtt zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private zzhtp zzc;
    private zzicn zzd;
    private zzicn zze;

    static {
        zzhtt zzhttVar = new zzhtt();
        zzf = zzhttVar;
        zzidr.zzbu(zzhtt.class, zzhttVar);
    }

    private zzhtt() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzhtt zze(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtt) zzidr.zzbT(zzf, zzicnVar, zzidbVar);
    }

    public static zzhts zzg() {
        return (zzhts) zzf.zzbn();
    }

    public static zzhtt zzh() {
        return zzf;
    }

    public static zzifk zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtp zzb() {
        zzhtp zzhtpVar = this.zzc;
        return zzhtpVar == null ? zzhtp.zze() : zzhtpVar;
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
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhtt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhts(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzg;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhtt.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzk(zzhtp zzhtpVar) {
        zzhtpVar.getClass();
        this.zzc = zzhtpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzl(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzm(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zze = zzicnVar;
    }
}
