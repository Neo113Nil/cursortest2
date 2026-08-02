package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhud extends zzidr implements zzifd {
    private static final zzhud zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhud zzhudVar = new zzhud();
        zzb = zzhudVar;
        zzidr.zzbu(zzhud.class, zzhudVar);
    }

    private zzhud() {
    }

    public static zzhud zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhud) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhud zzc() {
        return zzb;
    }

    public final int zza() {
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
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhud();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuc(bArr);
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
        synchronized (zzhud.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
