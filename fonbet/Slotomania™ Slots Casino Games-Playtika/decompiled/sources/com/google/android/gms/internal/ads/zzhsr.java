package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsr extends zzidr implements zzifd {
    private static final zzhsr zze;
    private static volatile zzifk zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhsr zzhsrVar = new zzhsr();
        zze = zzhsrVar;
        zzidr.zzbu(zzhsr.class, zzhsrVar);
    }

    private zzhsr() {
    }

    public static zzhsq zza() {
        return (zzhsq) zze.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzd(zzhtb zzhtbVar) {
        this.zzd = zzhtbVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhsr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsq(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzf;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhsr.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = zzhsg.zza(i);
    }
}
