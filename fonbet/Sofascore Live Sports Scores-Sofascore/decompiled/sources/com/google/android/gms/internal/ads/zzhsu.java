package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsu extends zzifm implements zzigx {
    private static final zzhsu zza;
    private static volatile zzihe zzb;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zza = zzhsuVar;
        zzifm.y(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static void D(zziei zzieiVar, zziew zziewVar) {
    }

    public static zzhsu E() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhsu();
        }
        if (ordinal == 4) {
            return new zzhst(zza);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzb;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhsu.class) {
            try {
                zziheVar = zzb;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zza);
                    zzb = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
