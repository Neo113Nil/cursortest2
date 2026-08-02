package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaxw extends zzidr implements zzifd {
    private static final zzaxw zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzd = zzaxwVar;
        zzidr.zzbu(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzaxj.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzaxw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxv(bArr);
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
        synchronized (zzaxw.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
