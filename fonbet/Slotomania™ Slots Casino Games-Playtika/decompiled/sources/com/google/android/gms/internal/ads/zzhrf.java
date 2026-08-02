package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhrf extends zzidr implements zzifd {
    private static final zzhrf zza;
    private static volatile zzifk zzb;

    static {
        zzhrf zzhrfVar = new zzhrf();
        zza = zzhrfVar;
        zzidr.zzbu(zzhrf.class, zzhrfVar);
    }

    private zzhrf() {
    }

    public static zzhrf zza(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrf) zzidr.zzbT(zza, zzicnVar, zzidbVar);
    }

    public static zzhrf zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhrf();
        }
        if (ordinal == 4) {
            return new zzhre(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzb;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhrf.class) {
            zzifkVar = zzb;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zza);
                zzb = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
