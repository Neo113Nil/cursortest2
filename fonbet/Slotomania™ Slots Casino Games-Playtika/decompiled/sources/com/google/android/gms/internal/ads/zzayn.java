package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzayn extends zzidr implements zzifd {
    private static final zzayn zze;
    private static volatile zzifk zzf;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;

    static {
        zzayn zzaynVar = new zzayn();
        zze = zzaynVar;
        zzidr.zzbu(zzayn.class, zzaynVar);
    }

    private zzayn() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzayn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaym(bArr);
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
        synchronized (zzayn.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
