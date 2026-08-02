package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziju extends zzidr implements zzifd {
    private static final zziju zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zziju zzijuVar = new zziju();
        zzd = zzijuVar;
        zzidr.zzbu(zziju.class, zzijuVar);
    }

    private zziju() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzidx zzidxVar = zzijt.zza;
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzidxVar, "zzc", zzidxVar});
        }
        if (ordinal == 3) {
            return new zziju();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijs(bArr);
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
        synchronized (zziju.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
