package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuo extends zzifm implements zzigx {
    private static final zzhuo zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzhtw zzc;

    static {
        zzhuo zzhuoVar = new zzhuo();
        zzd = zzhuoVar;
        zzifm.y(zzhuo.class, zzhuoVar);
    }

    private zzhuo() {
    }

    public static zzhuo F(zziei zzieiVar, zziew zziewVar) {
        return (zzhuo) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhun G() {
        return (zzhun) zzd.v();
    }

    public static zzhuo H() {
        return zzd;
    }

    public final String D() {
        return this.zzb;
    }

    public final zzhtw E() {
        zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? zzhtw.I() : zzhtwVar;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void J(zzhtw zzhtwVar) {
        zzhtwVar.getClass();
        this.zzc = zzhtwVar;
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
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhuo();
        }
        if (ordinal == 4) {
            return new zzhun(zzd);
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
        synchronized (zzhuo.class) {
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
