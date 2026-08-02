package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzber extends zzifm implements zzigx {
    private static final zzber zzg;
    private static volatile zzihe zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzber zzberVar = new zzber();
        zzg = zzberVar;
        zzifm.y(zzber.class, zzberVar);
    }

    private zzber() {
    }

    public static zzber I(mpo mpoVar) {
        zzber zzberVar = zzg;
        zziew zziewVar = zziew.b;
        int i = dpo.a;
        zzifm r = zzifm.r(zzberVar, mpoVar, zziew.c);
        zzifm.C(r);
        return (zzber) r;
    }

    public static zzber J(mpo mpoVar, zziew zziewVar) {
        return (zzber) zzifm.r(zzg, mpoVar, zziewVar);
    }

    public static zzbeq K() {
        return (zzbeq) zzg.v();
    }

    public static zzber L() {
        return zzg;
    }

    public final String D() {
        return this.zzb;
    }

    public final String E() {
        return this.zzc;
    }

    public final long F() {
        return this.zzd;
    }

    public final long G() {
        return this.zze;
    }

    public final long H() {
        return this.zzf;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzber();
        }
        if (ordinal == 4) {
            return new zzbeq(zzg);
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
        synchronized (zzber.class) {
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
