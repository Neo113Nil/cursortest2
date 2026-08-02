package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzimw extends zzifm implements zzigx {
    private static final zzimw zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzify zze = kqo.e;

    static {
        zzimw zzimwVar = new zzimw();
        zzf = zzimwVar;
        zzifm.y(zzimw.class, zzimwVar);
    }

    private zzimw() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzimw();
        }
        if (ordinal == 4) {
            return new zzimv(zzf);
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
        synchronized (zzimw.class) {
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
