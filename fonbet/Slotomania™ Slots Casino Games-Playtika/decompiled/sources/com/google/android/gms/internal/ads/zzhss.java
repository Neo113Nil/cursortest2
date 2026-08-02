package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhss extends zzidr implements zzifd {
    private static final zzhss zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzied zzb = zzbM();

    static {
        zzhss zzhssVar = new zzhss();
        zzc = zzhssVar;
        zzidr.zzbu(zzhss.class, zzhssVar);
    }

    private zzhss() {
    }

    public static zzhsp zza() {
        return (zzhsp) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzc(zzhsr zzhsrVar) {
        zzhsrVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzhsrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhsr.class});
        }
        if (ordinal == 3) {
            return new zzhss();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsp(bArr);
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
        synchronized (zzhss.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
