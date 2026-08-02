package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfru extends zzifm implements zzigx {
    private static final zzfru zzi;
    private static volatile zzihe zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfru zzfruVar = new zzfru();
        zzi = zzfruVar;
        zzifm.y(zzfru.class, zzfruVar);
    }

    private zzfru() {
    }

    public static zzfrt D() {
        return (zzfrt) zzi.v();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zzc = j;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zzd = z;
    }

    public final /* synthetic */ void I(long j) {
        this.zze = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zzf = j;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void L(int i) {
        this.zzh = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfru();
        }
        if (ordinal == 4) {
            return new zzfrt(zzi);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzj;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfru.class) {
            try {
                zziheVar = zzj;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzi);
                    zzj = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
