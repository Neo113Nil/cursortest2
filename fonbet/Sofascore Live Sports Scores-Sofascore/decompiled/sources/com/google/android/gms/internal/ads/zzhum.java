package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhum extends zzifm implements zzigx {
    private static final zzhum zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhuo zzc;

    static {
        zzhum zzhumVar = new zzhum();
        zzd = zzhumVar;
        zzifm.y(zzhum.class, zzhumVar);
    }

    private zzhum() {
    }

    public static zzhum F(zziei zzieiVar, zziew zziewVar) {
        return (zzhum) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhul G() {
        return (zzhul) zzd.v();
    }

    public static zzihe H() {
        return zzd.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhuo E() {
        zzhuo zzhuoVar = this.zzc;
        return zzhuoVar == null ? zzhuo.H() : zzhuoVar;
    }

    public final /* synthetic */ void I(zzhuo zzhuoVar) {
        this.zzc = zzhuoVar;
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
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhum();
        }
        if (ordinal == 4) {
            return new zzhul(zzd);
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
        synchronized (zzhum.class) {
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
