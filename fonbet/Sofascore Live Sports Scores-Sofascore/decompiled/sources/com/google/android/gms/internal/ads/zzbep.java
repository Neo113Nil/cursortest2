package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbep extends zzifm implements zzigx {
    private static final zzbep zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzbet zzb;
    private zziei zzc = zziei.b;
    private long zzd;
    private long zze;

    static {
        zzbep zzbepVar = new zzbep();
        zzf = zzbepVar;
        zzifm.y(zzbep.class, zzbepVar);
    }

    private zzbep() {
    }

    public static zzbep G() {
        return zzf;
    }

    public final zzbet D() {
        zzbet zzbetVar = this.zzb;
        return zzbetVar == null ? zzbet.F() : zzbetVar;
    }

    public final zziei E() {
        return this.zzc;
    }

    public final long F() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzbep();
        }
        if (ordinal == 4) {
            return new zzbeo(zzf);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzg;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzbep.class) {
            try {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
