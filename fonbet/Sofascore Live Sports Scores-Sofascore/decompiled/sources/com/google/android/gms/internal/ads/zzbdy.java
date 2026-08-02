package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdy extends zzifm implements zzigx {
    private static final zzbdy zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzifu zzd = wpo.e;

    static {
        zzbdy zzbdyVar = new zzbdy();
        zze = zzbdyVar;
        zzifm.y(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    public static zzbdx D() {
        return (zzbdx) zze.v();
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = 15;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbdy();
        }
        if (ordinal == 4) {
            return new zzbdx(zze);
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
        synchronized (zzbdy.class) {
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
