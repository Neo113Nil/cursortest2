package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvj extends zzifm implements zzigx {
    private static final zzhvj zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhvn zzc;
    private zziei zzd = zziei.b;

    static {
        zzhvj zzhvjVar = new zzhvj();
        zze = zzhvjVar;
        zzifm.y(zzhvj.class, zzhvjVar);
    }

    private zzhvj() {
    }

    public static zzhvj G(zziei zzieiVar, zziew zziewVar) {
        return (zzhvj) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhvi H() {
        return (zzhvi) zze.v();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhvn E() {
        zzhvn zzhvnVar = this.zzc;
        return zzhvnVar == null ? zzhvn.F() : zzhvnVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final /* synthetic */ void I(zzhvn zzhvnVar) {
        this.zzc = zzhvnVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
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
            return new zzhvj();
        }
        if (ordinal == 4) {
            return new zzhvi(zze);
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
        synchronized (zzhvj.class) {
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
