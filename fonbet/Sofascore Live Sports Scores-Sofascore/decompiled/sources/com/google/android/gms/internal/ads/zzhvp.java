package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvp extends zzifm implements zzigx {
    private static final zzhvp zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.b;

    static {
        zzhvp zzhvpVar = new zzhvp();
        zzc = zzhvpVar;
        zzifm.y(zzhvp.class, zzhvpVar);
    }

    private zzhvp() {
    }

    public static zzhvp F(zziei zzieiVar, zziew zziewVar) {
        return (zzhvp) zzifm.r(zzc, zzieiVar, zziewVar);
    }

    public static zzhvo G() {
        return (zzhvo) zzc.v();
    }

    public static zzihe H() {
        return zzc.j();
    }

    public final int D() {
        return this.zza;
    }

    public final zziei E() {
        return this.zzb;
    }

    public final /* synthetic */ void I(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhvp();
        }
        if (ordinal == 4) {
            return new zzhvo(zzc);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzd;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhvp.class) {
            try {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
