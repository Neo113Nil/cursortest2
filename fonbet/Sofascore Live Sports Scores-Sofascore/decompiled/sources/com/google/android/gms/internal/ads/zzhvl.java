package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvl extends zzifm implements zzigx {
    private static final zzhvl zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhvn zzc;

    static {
        zzhvl zzhvlVar = new zzhvl();
        zzd = zzhvlVar;
        zzifm.y(zzhvl.class, zzhvlVar);
    }

    private zzhvl() {
    }

    public static zzhvl F(zziei zzieiVar, zziew zziewVar) {
        return (zzhvl) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhvk G() {
        return (zzhvk) zzd.v();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhvn E() {
        zzhvn zzhvnVar = this.zzc;
        return zzhvnVar == null ? zzhvn.F() : zzhvnVar;
    }

    public final /* synthetic */ void H(zzhvn zzhvnVar) {
        this.zzc = zzhvnVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhvl();
        }
        if (ordinal == 4) {
            return new zzhvk(zzd);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zze;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhvl.class) {
            try {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
