package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzija extends zzifm implements zzigx {
    private static final zzija zzc;
    private static volatile zzihe zzd;
    private zzifu zza;
    private zzifu zzb;

    static {
        zzija zzijaVar = new zzija();
        zzc = zzijaVar;
        zzifm.y(zzija.class, zzijaVar);
    }

    private zzija() {
        wpo wpoVar = wpo.e;
        this.zza = wpoVar;
        this.zzb = wpoVar;
    }

    public static zzija D(byte[] bArr, zziew zziewVar) {
        return (zzija) zzifm.s(zzc, bArr, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzija();
        }
        if (ordinal == 4) {
            return new zziiz(zzc);
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
        synchronized (zzija.class) {
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
