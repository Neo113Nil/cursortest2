package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhrq extends zzidr implements zzifd {
    private static final zzhrq zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhrq zzhrqVar = new zzhrq();
        zzb = zzhrqVar;
        zzidr.zzbu(zzhrq.class, zzhrqVar);
    }

    private zzhrq() {
    }

    public static zzhrq zzb(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrq) zzidr.zzbT(zzb, zzicnVar, zzidbVar);
    }

    public static zzhrq zzc() {
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
            return new zzhrq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrp(bArr);
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
        synchronized (zzhrq.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
