package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsu extends zzidr implements zzifd {
    private static final zzhsu zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private zzhsw zzc;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zzd = zzhsuVar;
        zzidr.zzbu(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static zzhsu zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsu) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhst zzd() {
        return (zzhst) zzd.zzbn();
    }

    public static zzifk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsw zzb() {
        zzhsw zzhswVar = this.zzc;
        return zzhswVar == null ? zzhsw.zzd() : zzhswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhst(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zze;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhsu.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(zzhsw zzhswVar) {
        zzhswVar.getClass();
        this.zzc = zzhswVar;
        this.zza |= 1;
    }
}
