package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqr extends zzifm implements zzigx {
    private static final zzfqr zzg;
    private static volatile zzihe zzh;
    private long zza;
    private zzifu zzb = wpo.e;
    private zzify zzc;
    private zzify zzd;
    private zzify zze;
    private zzify zzf;

    static {
        zzfqr zzfqrVar = new zzfqr();
        zzg = zzfqrVar;
        zzifm.y(zzfqr.class, zzfqrVar);
    }

    private zzfqr() {
        kqo kqoVar = kqo.e;
        this.zzc = kqoVar;
        this.zzd = kqoVar;
        this.zze = kqoVar;
        this.zzf = kqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfqr();
        }
        if (ordinal == 4) {
            return new zzfqq(zzg);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzh;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfqr.class) {
            try {
                zziheVar = zzh;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzg);
                    zzh = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
