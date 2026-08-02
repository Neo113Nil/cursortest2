package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbea extends zzifm implements zzigx {
    private static final zzbea zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private zziei zzb = zziei.b;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbea zzbeaVar = new zzbea();
        zzj = zzbeaVar;
        zzifm.y(zzbea.class, zzbeaVar);
    }

    private zzbea() {
    }

    public static zzbdz D() {
        return (zzbdz) zzj.v();
    }

    public final /* synthetic */ void E(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzb = zzieiVar;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void G(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void K(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final void L(int i) {
        this.zzi = i - 2;
        this.zza |= 128;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzbea();
        }
        if (ordinal == 4) {
            return new zzbdz(zzj);
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
        synchronized (zzbea.class) {
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
