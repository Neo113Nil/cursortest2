package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsc extends zzidr implements zzifd {
    private static final zzhsc zzc;
    private static volatile zzifk zzd;
    private int zza;
    private int zzb;

    static {
        zzhsc zzhscVar = new zzhsc();
        zzc = zzhscVar;
        zzidr.zzbu(zzhsc.class, zzhscVar);
    }

    private zzhsc() {
    }

    public static zzhsb zzc() {
        return (zzhsb) zzc.zzbn();
    }

    public static zzhsc zzd() {
        return zzc;
    }

    public final zzhrw zza() {
        zzhrw zzb = zzhrw.zzb(this.zza);
        return zzb == null ? zzhrw.UNRECOGNIZED : zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhsc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsb(bArr);
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
        synchronized (zzhsc.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzhrw zzhrwVar) {
        this.zza = zzhrwVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
