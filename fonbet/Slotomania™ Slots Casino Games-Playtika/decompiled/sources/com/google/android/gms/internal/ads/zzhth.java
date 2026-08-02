package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhth extends zzidr implements zzifd {
    private static final zzhth zzb;
    private static volatile zzifk zzc;
    private int zza;

    static {
        zzhth zzhthVar = new zzhth();
        zzb = zzhthVar;
        zzidr.zzbu(zzhth.class, zzhthVar);
    }

    private zzhth() {
    }

    public static zzhtg zzb() {
        return (zzhtg) zzb.zzbn();
    }

    public static zzhth zzc() {
        return zzb;
    }

    public final zzhrw zza() {
        zzhrw zzb2 = zzhrw.zzb(this.zza);
        return zzb2 == null ? zzhrw.UNRECOGNIZED : zzb2;
    }

    final /* synthetic */ void zzd(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhth();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtg(bArr);
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
        synchronized (zzhth.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
