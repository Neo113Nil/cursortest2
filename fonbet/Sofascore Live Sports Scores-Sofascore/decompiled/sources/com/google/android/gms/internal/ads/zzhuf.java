package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuf extends zzifm implements zzigx {
    private static final zzhuf zze;
    private static volatile zzihe zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhuf zzhufVar = new zzhuf();
        zze = zzhufVar;
        zzifm.y(zzhuf.class, zzhufVar);
    }

    private zzhuf() {
    }

    public static zzhue D() {
        return (zzhue) zze.v();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    public final void G(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    public final void H(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhuf();
        }
        if (ordinal == 4) {
            return new zzhue(zze);
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
        synchronized (zzhuf.class) {
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
