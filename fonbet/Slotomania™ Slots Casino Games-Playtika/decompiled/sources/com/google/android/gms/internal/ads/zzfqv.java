package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfqv extends zzidr implements zzifd {
    private static final zzfqv zzb;
    private static volatile zzifk zzc;
    private zzied zza = zzbM();

    static {
        zzfqv zzfqvVar = new zzfqv();
        zzb = zzfqvVar;
        zzidr.zzbu(zzfqv.class, zzfqvVar);
    }

    private zzfqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfqt.class});
        }
        if (ordinal == 3) {
            return new zzfqv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqu(bArr);
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
        synchronized (zzfqv.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
