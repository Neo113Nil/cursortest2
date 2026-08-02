package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes2.dex */
public final class zztc extends zzalf<zztc, zza> implements zzamo {
    private static final zztc zzc;
    private static volatile zzamv<zztc> zzd;
    private int zze;

    public static final class zza extends zzalf.zzb<zztc, zza> implements zzamo {
        public final zza zza(int i10) {
            zzg();
            ((zztc) this.zza).zze = i10;
            return this;
        }

        private zza() {
            super(zztc.zzc);
        }
    }

    static {
        zztc zztcVar = new zztc();
        zzc = zztcVar;
        zzalf.zza((Class<zztc>) zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i10, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzte.zza[i10 - 1]) {
            case 1:
                return new zztc();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztc> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zztc.class) {
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
}
