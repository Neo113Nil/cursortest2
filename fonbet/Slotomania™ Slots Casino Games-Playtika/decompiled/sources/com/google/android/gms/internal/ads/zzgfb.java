package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgfb extends zzidr implements zzifd {
    private static final zzgfb zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzgfd zzb;
    private zzicn zzc;
    private zzicn zzd;
    private int zze;

    static {
        zzgfb zzgfbVar = new zzgfb();
        zzf = zzgfbVar;
        zzidr.zzbu(zzgfb.class, zzgfbVar);
    }

    private zzgfb() {
        zzicn zzicnVar = zzicn.zza;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    public static zzgfa zzd() {
        return (zzgfa) zzf.zzbn();
    }

    public final zzgfd zza() {
        zzgfd zzgfdVar = this.zzb;
        return zzgfdVar == null ? zzgfd.zzg() : zzgfdVar;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgfr.zza});
        }
        if (ordinal == 3) {
            return new zzgfb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgfa(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzg;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzgfb.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzgfd zzgfdVar) {
        zzgfdVar.getClass();
        this.zzb = zzgfdVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 2;
        this.zzc = zzicnVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 4;
        this.zzd = zzicnVar;
    }

    public final int zzj() {
        int zza = zzgfs.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}
