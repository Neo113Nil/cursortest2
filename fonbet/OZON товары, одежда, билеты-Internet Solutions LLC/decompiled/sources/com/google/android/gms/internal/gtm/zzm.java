package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzm extends zzuz<zzm, zzl> implements zzwl {
    private static final zzm zza;
    private byte zzg = 2;
    private zzvh<zzk> zze = zzuz.zzag();
    private zzvh<zzg> zzf = zzuz.zzag();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzuz.zzak(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zze", zzk.class, "zzf", zzg.class});
        }
        if (i12 == 3) {
            return new zzm();
        }
        zzc zzcVar = null;
        if (i12 == 4) {
            return new zzl(zzcVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
