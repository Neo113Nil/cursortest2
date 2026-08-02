package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxw extends zzifm implements zzigx {
    private static final zzaxw zzi;
    private static volatile zzihe zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzi = zzaxwVar;
        zzifm.y(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxv D() {
        return (zzaxv) zzi.v();
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void J(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void K(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", lkn.f, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzaxw();
        }
        if (ordinal == 4) {
            return new zzaxv(zzi);
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
        synchronized (zzaxw.class) {
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
