package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsf extends zzidr implements zzifd {
    private static final zzhsf zzd;
    private static volatile zzifk zze;
    private String zza = "";
    private zzicn zzb = zzicn.zza;
    private int zzc;

    static {
        zzhsf zzhsfVar = new zzhsf();
        zzd = zzhsfVar;
        zzidr.zzbu(zzhsf.class, zzhsfVar);
    }

    private zzhsf() {
    }

    public static zzhsd zzd() {
        return (zzhsd) zzd.zzbn();
    }

    public static zzhsf zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzicn zzb() {
        return this.zzb;
    }

    public final zzhse zzc() {
        int i = this.zzc;
        zzhse zzhseVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzhse.REMOTE : zzhse.ASYMMETRIC_PUBLIC : zzhse.ASYMMETRIC_PRIVATE : zzhse.SYMMETRIC : zzhse.UNKNOWN_KEYMATERIAL;
        return zzhseVar == null ? zzhse.UNRECOGNIZED : zzhseVar;
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
            return new zzhsf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsd(bArr);
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
        synchronized (zzhsf.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }

    final /* synthetic */ void zzi(zzhse zzhseVar) {
        this.zzc = zzhseVar.zza();
    }
}
