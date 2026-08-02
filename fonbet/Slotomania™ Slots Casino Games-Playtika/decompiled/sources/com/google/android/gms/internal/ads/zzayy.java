package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzayy extends zzidr implements zzifd {
    private static final zzayy zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzied zzb = zzbM();
    private zzicn zzc = zzicn.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzayy zzayyVar = new zzayy();
        zzf = zzayyVar;
        zzidr.zzbu(zzayy.class, zzayyVar);
    }

    private zzayy() {
    }

    public static zzayx zza() {
        return (zzayx) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzicn zzicnVar) {
        zzicnVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzicnVar);
    }

    final /* synthetic */ void zzc(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zza |= 1;
        this.zzc = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzays.zza, "zze", zzayo.zza});
        }
        if (ordinal == 3) {
            return new zzayy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayx(bArr);
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
        synchronized (zzayy.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}
