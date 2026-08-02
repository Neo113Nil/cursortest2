package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtp extends zzifm implements zzigx {
    private static final zzhtp zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzhtr zzb;
    private int zzc;
    private int zzd;

    static {
        zzhtp zzhtpVar = new zzhtp();
        zze = zzhtpVar;
        zzifm.y(zzhtp.class, zzhtpVar);
    }

    private zzhtp() {
    }

    public static zzhtp G(zziei zzieiVar, zziew zziewVar) {
        return (zzhtp) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhto H() {
        return (zzhto) zze.v();
    }

    public static zzhtp I() {
        return zze;
    }

    public final zzhtr D() {
        zzhtr zzhtrVar = this.zzb;
        return zzhtrVar == null ? zzhtr.G() : zzhtrVar;
    }

    public final int E() {
        return this.zzc;
    }

    public final int F() {
        return this.zzd;
    }

    public final /* synthetic */ void J(zzhtr zzhtrVar) {
        this.zzb = zzhtrVar;
        this.zza |= 1;
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
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhtp();
        }
        if (ordinal == 4) {
            return new zzhto(zze);
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
        synchronized (zzhtp.class) {
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
