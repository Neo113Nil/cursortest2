package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzayd extends zzifm implements zzigx {
    private static final zzayd zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzayd zzaydVar = new zzayd();
        zzc = zzaydVar;
        zzifm.y(zzayd.class, zzaydVar);
    }

    private zzayd() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zza", "zzb", lkn.j});
        }
        if (ordinal == 3) {
            return new zzayd();
        }
        if (ordinal == 4) {
            return new zzayc(zzc);
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
        synchronized (zzayd.class) {
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
