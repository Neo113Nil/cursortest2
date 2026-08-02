package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhse extends zzifm implements zzigx {
    private static final zzhse zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhsi zzc;
    private zziei zzd = zziei.b;

    static {
        zzhse zzhseVar = new zzhse();
        zze = zzhseVar;
        zzifm.y(zzhse.class, zzhseVar);
    }

    private zzhse() {
    }

    public static zzhse G(zziei zzieiVar, zziew zziewVar) {
        return (zzhse) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhsd H() {
        return (zzhsd) zze.v();
    }

    public static zzihe I() {
        return zze.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhsi E() {
        zzhsi zzhsiVar = this.zzc;
        return zzhsiVar == null ? zzhsi.F() : zzhsiVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final /* synthetic */ void J(zzhsi zzhsiVar) {
        this.zzc = zzhsiVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void K(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhse();
        }
        if (ordinal == 4) {
            return new zzhsd(zze);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzf;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhse.class) {
            try {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
