package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzihh extends zzidr implements zzifd {
    private static final zzihh zzc;
    private static volatile zzifk zzd;
    private zzidz zza = zzbC();
    private zzidz zzb = zzbC();

    static {
        zzihh zzihhVar = new zzihh();
        zzc = zzihhVar;
        zzidr.zzbu(zzihh.class, zzihhVar);
    }

    private zzihh() {
    }

    public static zzihh zzc(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzihh) zzidr.zzbV(zzc, bArr, zzidbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzihh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihg(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzd;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzihh.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
