package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@Deprecated
/* loaded from: classes8.dex */
public final class zziiw extends zzidr implements zzifd {
    private static final zziiw zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zziiv zzc;
    private zziiv zzd;

    static {
        zziiw zziiwVar = new zziiw();
        zze = zziiwVar;
        zzidr.zzbu(zziiw.class, zziiwVar);
    }

    private zziiw() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", zziit.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zziiw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziis(bArr);
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
        synchronized (zziiw.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
