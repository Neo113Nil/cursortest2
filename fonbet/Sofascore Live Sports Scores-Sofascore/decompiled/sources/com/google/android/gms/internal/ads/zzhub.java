package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhub extends zzifm implements zzigx {
    private static final zzhub zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzhtt zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhub zzhubVar = new zzhub();
        zzf = zzhubVar;
        zzifm.y(zzhub.class, zzhubVar);
    }

    private zzhub() {
    }

    public static zzhua G() {
        return (zzhua) zzf.v();
    }

    public final boolean D() {
        return (this.zza & 1) != 0;
    }

    public final zzhtt E() {
        zzhtt zzhttVar = this.zzb;
        return zzhttVar == null ? zzhtt.G() : zzhttVar;
    }

    public final int F() {
        return this.zzd;
    }

    public final /* synthetic */ void H(zzhtt zzhttVar) {
        this.zzb = zzhttVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(int i) {
        this.zzd = i;
    }

    public final int J() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int K() {
        int a = zzhup.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final void L(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    public final void M(int i) {
        if (i != 1) {
            this.zze = i - 2;
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
            return new lqo(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhub();
        }
        if (ordinal == 4) {
            return new zzhua(zzf);
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
        synchronized (zzhub.class) {
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
