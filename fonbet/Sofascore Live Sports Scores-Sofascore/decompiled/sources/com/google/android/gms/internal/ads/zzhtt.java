package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtt extends zzifm implements zzigx {
    private static final zzhtt zzd;
    private static volatile zzihe zze;
    private String zza = "";
    private zziei zzb = zziei.b;
    private int zzc;

    static {
        zzhtt zzhttVar = new zzhtt();
        zzd = zzhttVar;
        zzifm.y(zzhtt.class, zzhttVar);
    }

    private zzhtt() {
    }

    public static zzhts F() {
        return (zzhts) zzd.v();
    }

    public static zzhtt G() {
        return zzd;
    }

    public final String D() {
        return this.zza;
    }

    public final zziei E() {
        return this.zzb;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void I(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    public final int J() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void K(int i) {
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhtt();
        }
        if (ordinal == 4) {
            return new zzhts(zzd);
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
        synchronized (zzhtt.class) {
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
