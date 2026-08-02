package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsw extends zzidr implements zzifd {
    private static final zzhsw zzb;
    private static volatile zzifk zzc;
    private String zza = "";

    static {
        zzhsw zzhswVar = new zzhsw();
        zzb = zzhswVar;
        zzidr.zzbu(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    public static zzhsw zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsw) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhsv zzc() {
        return (zzhsv) zzb.zzbn();
    }

    public static zzhsw zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhsw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsv(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzc;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhsw.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
