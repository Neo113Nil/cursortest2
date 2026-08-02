package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes2.dex */
public final class zzwo extends zzalf<zzwo, zza> implements zzamo {
    private static final zzwo zzc;
    private static volatile zzamv<zzwo> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public static final class zza extends zzalf.zzb<zzwo, zza> implements zzamo {
        public final zza zza(zzwk zzwkVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwkVar);
            return this;
        }

        private zza() {
            super(zzwo.zzc);
        }

        public final zza zza(zzwj zzwjVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwjVar);
            return this;
        }

        public final zza zza(zzwm zzwmVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwmVar);
            return this;
        }
    }

    static {
        zzwo zzwoVar = new zzwo();
        zzc = zzwoVar;
        zzalf.zza((Class<zzwo>) zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzwo zzf() {
        return zzc;
    }

    public final zzwk zza() {
        zzwk zza2 = zzwk.zza(this.zzg);
        return zza2 == null ? zzwk.UNRECOGNIZED : zza2;
    }

    public final zzwj zzb() {
        zzwj zza2 = zzwj.zza(this.zzf);
        return zza2 == null ? zzwj.UNRECOGNIZED : zza2;
    }

    public final zzwm zzc() {
        zzwm zza2 = zzwm.zza(this.zze);
        return zza2 == null ? zzwm.UNRECOGNIZED : zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i10, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzwq.zza[i10 - 1]) {
            case 1:
                return new zzwo();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwo> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzwo.class) {
                    try {
                        zzamvVar = zzd;
                        if (zzamvVar == null) {
                            zzamvVar = new zzalf.zza(zzc);
                            zzd = zzamvVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zzamvVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwk zzwkVar) {
        zzwoVar.zzg = zzwkVar.zza();
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwj zzwjVar) {
        zzwoVar.zzf = zzwjVar.zza();
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwm zzwmVar) {
        zzwoVar.zze = zzwmVar.zza();
    }
}
