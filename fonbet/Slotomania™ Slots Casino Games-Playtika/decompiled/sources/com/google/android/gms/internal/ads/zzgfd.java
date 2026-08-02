package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgfd extends zzidr implements zzifd {
    private static final zzgfd zzf;
    private static volatile zzifk zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zzidz zze = zzbC();

    static {
        zzgfd zzgfdVar = new zzgfd();
        zzf = zzgfdVar;
        zzidr.zzbu(zzgfd.class, zzgfdVar);
    }

    private zzgfd() {
    }

    public static zzgfd zzd(zzicn zzicnVar) throws zzieg {
        return (zzgfd) zzidr.zzbS(zzf, zzicnVar);
    }

    public static zzgfc zze() {
        return (zzgfc) zzf.zzbn();
    }

    public static zzgfd zzg() {
        return zzf;
    }

    public final zzbdp zza() {
        return this.zzb == 1 ? (zzbdp) this.zzc : zzbdp.zzj();
    }

    public final zzbdn zzb() {
        return this.zzb == 2 ? (zzbdn) this.zzc : zzbdn.zzd();
    }

    public final zzbdh zzc() {
        zzbdh zzb = zzbdh.zzb(this.zzd);
        return zzb == null ? zzbdh.UNSUPPORTED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzbdp.class, zzbdn.class, "zzd", zzbdh.zzc(), "zze"});
        }
        if (ordinal == 3) {
            return new zzgfd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgfc(bArr);
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
        synchronized (zzgfd.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzbdp zzbdpVar) {
        zzbdpVar.getClass();
        this.zzc = zzbdpVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzi(zzbdn zzbdnVar) {
        zzbdnVar.getClass();
        this.zzc = zzbdnVar;
        this.zzb = 2;
    }

    final /* synthetic */ void zzj(zzbdh zzbdhVar) {
        this.zzd = zzbdhVar.zza();
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(Iterable iterable) {
        zzidz zzidzVar = this.zze;
        if (!zzidzVar.zza()) {
            this.zze = zzidr.zzbD(zzidzVar);
        }
        zzibw.zzaW(iterable, this.zze);
    }
}
