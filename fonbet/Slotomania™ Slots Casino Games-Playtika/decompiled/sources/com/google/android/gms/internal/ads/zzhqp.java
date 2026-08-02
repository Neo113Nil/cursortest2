package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhqp extends zzidr implements zzifd {
    private static final zzhqp zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzhqt zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzhqp zzhqpVar = new zzhqp();
        zze = zzhqpVar;
        zzidr.zzbu(zzhqp.class, zzhqpVar);
    }

    private zzhqp() {
    }

    public static zzhqp zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhqp) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhqo zze() {
        return (zzhqo) zze.zzbn();
    }

    public static zzifk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqt zzb() {
        zzhqt zzhqtVar = this.zzc;
        return zzhqtVar == null ? zzhqt.zzc() : zzhqtVar;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhqp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqo(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzf;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhqp.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzhqt zzhqtVar) {
        zzhqtVar.getClass();
        this.zzc = zzhqtVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzd = zzicnVar;
    }
}
