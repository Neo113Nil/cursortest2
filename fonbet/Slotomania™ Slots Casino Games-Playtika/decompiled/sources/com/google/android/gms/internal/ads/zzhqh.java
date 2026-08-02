package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhqh extends zzidr implements zzifd {
    private static final zzhqh zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzhql zzb;
    private zzhsa zzc;

    static {
        zzhqh zzhqhVar = new zzhqh();
        zzd = zzhqhVar;
        zzidr.zzbu(zzhqh.class, zzhqhVar);
    }

    private zzhqh() {
    }

    public static zzhqh zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqh) zzidr.zzbT(zzd, zzicnVar, zzidbVar);
    }

    public static zzhqg zzd() {
        return (zzhqg) zzd.zzbn();
    }

    public final zzhql zza() {
        zzhql zzhqlVar = this.zzb;
        return zzhqlVar == null ? zzhql.zzd() : zzhqlVar;
    }

    public final zzhsa zzb() {
        zzhsa zzhsaVar = this.zzc;
        return zzhsaVar == null ? zzhsa.zzg() : zzhsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqg(bArr);
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
        synchronized (zzhqh.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzhql zzhqlVar) {
        zzhqlVar.getClass();
        this.zzb = zzhqlVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhsa zzhsaVar) {
        zzhsaVar.getClass();
        this.zzc = zzhsaVar;
        this.zza |= 2;
    }
}
