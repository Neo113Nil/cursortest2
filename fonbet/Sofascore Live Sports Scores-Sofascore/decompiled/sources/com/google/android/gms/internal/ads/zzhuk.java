package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuk extends zzifm implements zzigx {
    private static final zzhuk zzb;
    private static volatile zzihe zzc;
    private String zza = "";

    static {
        zzhuk zzhukVar = new zzhuk();
        zzb = zzhukVar;
        zzifm.y(zzhuk.class, zzhukVar);
    }

    private zzhuk() {
    }

    public static zzhuk E(zziei zzieiVar, zziew zziewVar) {
        return (zzhuk) zzifm.r(zzb, zzieiVar, zziewVar);
    }

    public static zzhuj F() {
        return (zzhuj) zzb.v();
    }

    public static zzhuk G() {
        return zzb;
    }

    public final String D() {
        return this.zza;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhuk();
        }
        if (ordinal == 4) {
            return new zzhuj(zzb);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzc;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhuk.class) {
            try {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
