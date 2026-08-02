package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes2.dex */
public final class zzwl extends zzalf<zzwl, zza> implements zzamo {
    private static final zzwl zzc;
    private static volatile zzamv<zzwl> zzd;
    private int zze;
    private zzwo zzf;

    public static final class zza extends zzalf.zzb<zzwl, zza> implements zzamo {
        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwl.zza((zzwl) this.zza, zzwoVar);
            return this;
        }

        private zza() {
            super(zzwl.zzc);
        }
    }

    static {
        zzwl zzwlVar = new zzwl();
        zzc = zzwlVar;
        zzalf.zza((Class<zzwl>) zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzwo zzc() {
        zzwo zzwoVar = this.zzf;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public static zzwl zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwl) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i10, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzwn.zza[i10 - 1]) {
            case 1:
                return new zzwl();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwl> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzwl.class) {
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

    public static /* synthetic */ void zza(zzwl zzwlVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwlVar.zzf = zzwoVar;
        zzwlVar.zze |= 1;
    }
}
