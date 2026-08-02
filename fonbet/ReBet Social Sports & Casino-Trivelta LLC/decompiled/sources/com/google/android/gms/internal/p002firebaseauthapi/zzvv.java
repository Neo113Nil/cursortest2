package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzvv extends zzalf<zzvv, zza> implements zzamo {
    private static final zzvv zzc;
    private static volatile zzamv<zzvv> zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;
    private zzxk zzg;

    public static final class zza extends zzalf.zzb<zzvv, zza> implements zzamo {
        public final zza zza() {
            zzg();
            zzvv.zza((zzvv) this.zza);
            return this;
        }

        private zza() {
            super(zzvv.zzc);
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzajvVar);
            return this;
        }

        public final zza zza(zzxk zzxkVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzxkVar);
            return this;
        }
    }

    static {
        zzvv zzvvVar = new zzvv();
        zzc = zzvvVar;
        zzalf.zza((Class<zzvv>) zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzajv zzc() {
        return this.zzf;
    }

    public static zzvv zza(InputStream inputStream, zzaku zzakuVar) {
        return (zzvv) zzalf.zza(zzc, inputStream, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i10, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzvx.zza[i10 - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvv> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzvv.class) {
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

    public static /* synthetic */ void zza(zzvv zzvvVar) {
        zzvvVar.zzg = null;
        zzvvVar.zze &= -2;
    }

    public static /* synthetic */ void zza(zzvv zzvvVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvvVar.zzf = zzajvVar;
    }

    public static /* synthetic */ void zza(zzvv zzvvVar, zzxk zzxkVar) {
        zzxkVar.getClass();
        zzvvVar.zzg = zzxkVar;
        zzvvVar.zze |= 1;
    }
}
