package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzihz extends zzidr implements zzifd {
    private static final zzihz zzc;
    private static volatile zzifk zzd;
    private int zza;
    private String zzb = "";

    static {
        zzihz zzihzVar = new zzihz();
        zzc = zzihzVar;
        zzidr.zzbu(zzihz.class, zzihzVar);
    }

    private zzihz() {
    }

    public static zzihy zzc() {
        return (zzihy) zzc.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzihz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihy(bArr);
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
        synchronized (zzihz.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
