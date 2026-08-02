package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfqr extends zzidr implements zzifd {
    private static final zzfqr zzg;
    private static volatile zzifk zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfqr zzfqrVar = new zzfqr();
        zzg = zzfqrVar;
        zzidr.zzbu(zzfqr.class, zzfqrVar);
    }

    private zzfqr() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfqr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqq(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzh;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzfqr.class) {
            zzifkVar = zzh;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzg);
                zzh = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
