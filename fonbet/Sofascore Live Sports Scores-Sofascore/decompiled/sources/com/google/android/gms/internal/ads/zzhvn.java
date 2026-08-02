package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvn extends zzifm implements zzigx {
    private static final zzhvn zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhvn zzhvnVar = new zzhvn();
        zzb = zzhvnVar;
        zzifm.y(zzhvn.class, zzhvnVar);
    }

    private zzhvn() {
    }

    public static zzhvm E() {
        return (zzhvm) zzb.v();
    }

    public static zzhvn F() {
        return zzb;
    }

    public final int D() {
        return this.zza;
    }

    public final /* synthetic */ void G(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhvn();
        }
        if (ordinal == 4) {
            return new zzhvm(zzb);
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
        synchronized (zzhvn.class) {
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
