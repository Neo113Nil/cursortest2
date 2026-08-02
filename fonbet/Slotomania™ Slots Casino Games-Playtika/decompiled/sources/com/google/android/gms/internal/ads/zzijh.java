package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzijh extends zzidr implements zzifd {
    private static final zzijh zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzicn zzd;
    private zzicn zze;

    static {
        zzijh zzijhVar = new zzijh();
        zzf = zzijhVar;
        zzidr.zzbu(zzijh.class, zzijhVar);
    }

    private zzijh() {
        zzicn zzicnVar = zzicn.zza;
        this.zzd = zzicnVar;
        this.zze = zzicnVar;
    }

    public static zzijf zzc() {
        return (zzijf) zzf.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzijg.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzijh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijf(bArr);
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
        synchronized (zzijh.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 4;
        this.zzd = zzicnVar;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
