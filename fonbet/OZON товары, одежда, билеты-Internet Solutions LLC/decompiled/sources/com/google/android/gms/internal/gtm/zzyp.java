package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzyp extends zzuz<zzyp, zzym> implements zzwl {
    private static final zzyp zza;
    private byte zzf = 2;
    private zzvh<zzyo> zze = zzuz.zzag();

    static {
        zzyp zzypVar = new zzyp();
        zza = zzypVar;
        zzuz.zzak(zzyp.class, zzypVar);
    }

    private zzyp() {
    }

    public static zzyp zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", zzyo.class});
        }
        if (i12 == 3) {
            return new zzyp();
        }
        zzyj zzyjVar = null;
        if (i12 == 4) {
            return new zzym(zzyjVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
