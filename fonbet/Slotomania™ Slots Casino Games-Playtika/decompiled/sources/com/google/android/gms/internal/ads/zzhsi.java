package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsi extends zzidr implements zzifd {
    private static final zzhsi zzd;
    private static volatile zzifk zze;
    private String zza = "";
    private zzicn zzb = zzicn.zza;
    private int zzc;

    static {
        zzhsi zzhsiVar = new zzhsi();
        zzd = zzhsiVar;
        zzidr.zzbu(zzhsi.class, zzhsiVar);
    }

    private zzhsi() {
    }

    public static zzhsi zzd(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzhsi) zzidr.zzbV(zzd, bArr, zzidbVar);
    }

    public static zzhsh zze() {
        return (zzhsh) zzd.zzbn();
    }

    public static zzhsh zzg(zzhsi zzhsiVar) {
        return (zzhsh) zzd.zzbo(zzhsiVar);
    }

    public static zzhsi zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzicn zzb() {
        return this.zzb;
    }

    public final zzhtb zzc() {
        zzhtb zzb = zzhtb.zzb(this.zzc);
        return zzb == null ? zzhtb.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsi();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsh(bArr);
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
        synchronized (zzhsi.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }

    final /* synthetic */ void zzk(zzhtb zzhtbVar) {
        this.zzc = zzhtbVar.zza();
    }
}
