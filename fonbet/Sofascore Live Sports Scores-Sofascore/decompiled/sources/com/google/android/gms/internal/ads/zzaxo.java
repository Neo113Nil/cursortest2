package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxo extends zzifm implements zzigx {
    private static final zzaxo zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzaxo zzaxoVar = new zzaxo();
        zzc = zzaxoVar;
        zzifm.y(zzaxo.class, zzaxoVar);
    }

    private zzaxo() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", lkn.d});
        }
        if (ordinal == 3) {
            return new zzaxo();
        }
        if (ordinal == 4) {
            return new zzaxn(zzc);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzd;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaxo.class) {
            try {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
