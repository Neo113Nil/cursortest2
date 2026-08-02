package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuz extends zzifm implements zzigx {
    private static final zzhuz zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private zzhuv zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzhuz zzhuzVar = new zzhuz();
        zzf = zzhuzVar;
        zzifm.y(zzhuz.class, zzhuzVar);
    }

    private zzhuz() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
    }

    public static zzhuz H(zziei zzieiVar, zziew zziewVar) {
        return (zzhuz) zzifm.r(zzf, zzieiVar, zziewVar);
    }

    public static zzhuy I() {
        return (zzhuy) zzf.v();
    }

    public static zzhuz J() {
        return zzf;
    }

    public static zzihe K() {
        return zzf.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhuv E() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.F() : zzhuvVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final zziei G() {
        return this.zze;
    }

    public final /* synthetic */ void L(zzhuv zzhuvVar) {
        this.zzc = zzhuvVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    public final /* synthetic */ void N(mpo mpoVar) {
        mpoVar.getClass();
        this.zze = mpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhuz();
        }
        if (ordinal == 4) {
            return new zzhuy(zzf);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzg;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhuz.class) {
            try {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
