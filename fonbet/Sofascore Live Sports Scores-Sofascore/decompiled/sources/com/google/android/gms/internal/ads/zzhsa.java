package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsa extends zzifm implements zzigx {
    private static final zzhsa zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsc zzb;
    private int zzc;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzd = zzhsaVar;
        zzifm.y(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhrz F() {
        return (zzhrz) zzd.v();
    }

    public static zzhsa G() {
        return zzd;
    }

    public final zzhsc D() {
        zzhsc zzhscVar = this.zzb;
        return zzhscVar == null ? zzhsc.F() : zzhscVar;
    }

    public final int E() {
        return this.zzc;
    }

    public final /* synthetic */ void H(zzhsc zzhscVar) {
        this.zzb = zzhscVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(int i) {
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
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsa();
        }
        if (ordinal == 4) {
            return new zzhrz(zzd);
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
        synchronized (zzhsa.class) {
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
