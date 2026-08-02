package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhrj extends zzidr implements zzifd {
    private static final zzhrj zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrj zzhrjVar = new zzhrj();
        zzd = zzhrjVar;
        zzidr.zzbu(zzhrj.class, zzhrjVar);
    }

    private zzhrj() {
    }

    public static zzhri zzb() {
        return (zzhri) zzd.zzbn();
    }

    public static zzhrj zzc() {
        return zzd;
    }

    public final zzhrw zza() {
        zzhrw zzb = zzhrw.zzb(this.zza);
        return zzb == null ? zzhrw.UNRECOGNIZED : zzb;
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
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhri(bArr);
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
        synchronized (zzhrj.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = zzhrv.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = zzhro.zza(i);
    }
}
