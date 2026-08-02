package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbek extends zzifm implements zzigx {
    private static final zzbek zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzber zzb;
    private zziei zzc;
    private zziei zzd;

    static {
        zzbek zzbekVar = new zzbek();
        zze = zzbekVar;
        zzifm.y(zzbek.class, zzbekVar);
    }

    private zzbek() {
        mpo mpoVar = zziei.b;
        this.zzc = mpoVar;
        this.zzd = mpoVar;
    }

    public static zzbek G(mpo mpoVar, zziew zziewVar) {
        return (zzbek) zzifm.r(zze, mpoVar, zziewVar);
    }

    public static zzbek H(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zze, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzbek) B;
    }

    public final zzber D() {
        zzber zzberVar = this.zzb;
        return zzberVar == null ? zzber.L() : zzberVar;
    }

    public final zziei E() {
        return this.zzc;
    }

    public final zziei F() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbek();
        }
        if (ordinal == 4) {
            return new zzbej(zze);
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
        synchronized (zzbek.class) {
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
