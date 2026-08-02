package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfxm extends zzidr implements zzifd {
    private static final zzfxm zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfxj zze;

    static {
        zzfxm zzfxmVar = new zzfxm();
        zzf = zzfxmVar;
        zzidr.zzbu(zzfxm.class, zzfxmVar);
    }

    private zzfxm() {
    }

    public static zzfxk zza() {
        return (zzfxk) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzc(zzfxj zzfxjVar) {
        zzfxjVar.getClass();
        this.zze = zzfxjVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfxl.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfxm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfxk(bArr);
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
        synchronized (zzfxm.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
