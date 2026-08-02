package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhtp extends zzidr implements zzifd {
    private static final zzhtp zzd;
    private static volatile zzifk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhtp zzhtpVar = new zzhtp();
        zzd = zzhtpVar;
        zzidr.zzbu(zzhtp.class, zzhtpVar);
    }

    private zzhtp() {
    }

    public static zzhto zzd() {
        return (zzhto) zzd.zzbn();
    }

    public static zzhtp zze() {
        return zzd;
    }

    public final zzhrw zza() {
        zzhrw zzb = zzhrw.zzb(this.zza);
        return zzb == null ? zzhrw.UNRECOGNIZED : zzb;
    }

    public final zzhrw zzb() {
        zzhrw zzb = zzhrw.zzb(this.zzb);
        return zzb == null ? zzhrw.UNRECOGNIZED : zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhtp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhto(bArr);
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
        synchronized (zzhtp.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    final /* synthetic */ void zzh(zzhrw zzhrwVar) {
        this.zzb = zzhrwVar.zza();
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
