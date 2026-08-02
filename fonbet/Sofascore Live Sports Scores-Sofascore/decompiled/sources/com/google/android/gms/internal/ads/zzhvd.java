package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvd extends zzifm implements zzigx {
    private static final zzhvd zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhvd zzhvdVar = new zzhvd();
        zzd = zzhvdVar;
        zzifm.y(zzhvd.class, zzhvdVar);
    }

    private zzhvd() {
    }

    public static zzhvc G() {
        return (zzhvc) zzd.v();
    }

    public static zzhvd H() {
        return zzd;
    }

    public final zzhtl D() {
        zzhtl a = zzhtl.a(this.zza);
        return a == null ? zzhtl.UNRECOGNIZED : a;
    }

    public final zzhtl E() {
        zzhtl a = zzhtl.a(this.zzb);
        return a == null ? zzhtl.UNRECOGNIZED : a;
    }

    public final int F() {
        return this.zzc;
    }

    public final /* synthetic */ void I(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    public final /* synthetic */ void J(zzhtl zzhtlVar) {
        this.zzb = zzhtlVar.zza();
    }

    public final /* synthetic */ void K(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhvd();
        }
        if (ordinal == 4) {
            return new zzhvc(zzd);
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
        synchronized (zzhvd.class) {
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
