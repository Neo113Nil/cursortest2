package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzayz extends zzifm implements zzigx {
    private static final zzayz zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzayz zzayzVar = new zzayz();
        zzj = zzayzVar;
        zzifm.y(zzayz.class, zzayzVar);
    }

    private zzayz() {
    }

    public static zzayy D() {
        return (zzayy) zzj.v();
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzayz();
        }
        if (ordinal == 4) {
            return new zzayy(zzj);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzk;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzayz.class) {
            try {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
