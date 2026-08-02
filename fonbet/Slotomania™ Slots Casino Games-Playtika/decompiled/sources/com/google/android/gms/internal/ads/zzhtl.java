package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtl extends zzidr implements zzifd {
    private static final zzhtl zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private zzhth zzc;
    private zzicn zzd;
    private zzicn zze;

    static {
        zzhtl zzhtlVar = new zzhtl();
        zzf = zzhtlVar;
        zzidr.zzbu(zzhtl.class, zzhtlVar);
    }

    private zzhtl() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzhtl zze(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhtl) zzidr.zzbT(zzf, zzicnVar, zzidbVar);
    }

    public static zzhtk zzg() {
        return (zzhtk) zzf.zzbn();
    }

    public static zzhtl zzh() {
        return zzf;
    }

    public static zzifk zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhth zzb() {
        zzhth zzhthVar = this.zzc;
        return zzhthVar == null ? zzhth.zzc() : zzhthVar;
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
            return new zzhtl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtk(bArr);
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
        synchronized (zzhtl.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzj(zzhth zzhthVar) {
        zzhthVar.getClass();
        this.zzc = zzhthVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzl(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zze = zzicnVar;
    }
}
