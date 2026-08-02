package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfqb extends zzidr implements zzifd {
    private static final zzfqb zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzfpy zzb;

    static {
        zzfqb zzfqbVar = new zzfqb();
        zzc = zzfqbVar;
        zzidr.zzbu(zzfqb.class, zzfqbVar);
    }

    private zzfqb() {
    }

    public static zzfqa zza() {
        return (zzfqa) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfpy zzfpyVar) {
        zzfpyVar.getClass();
        this.zzb = zzfpyVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfqb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqa(bArr);
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
        synchronized (zzfqb.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
