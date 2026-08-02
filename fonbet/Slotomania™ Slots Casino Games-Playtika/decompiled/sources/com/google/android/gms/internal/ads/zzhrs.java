package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhrs extends zzidr implements zzifd {
    private static final zzhrs zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzicn zzc = zzicn.zza;
    private zzhru zzd;

    static {
        zzhrs zzhrsVar = new zzhrs();
        zze = zzhrsVar;
        zzidr.zzbu(zzhrs.class, zzhrsVar);
    }

    private zzhrs() {
    }

    public static zzhrs zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrs) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhrr zze() {
        return (zzhrr) zze.zzbn();
    }

    public static zzifk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzhru zzc() {
        zzhru zzhruVar = this.zzd;
        return zzhruVar == null ? zzhru.zze() : zzhruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhrs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrr(bArr);
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
        synchronized (zzhrs.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzc = zzicnVar;
    }

    final /* synthetic */ void zzi(zzhru zzhruVar) {
        zzhruVar.getClass();
        this.zzd = zzhruVar;
        this.zza |= 1;
    }
}
