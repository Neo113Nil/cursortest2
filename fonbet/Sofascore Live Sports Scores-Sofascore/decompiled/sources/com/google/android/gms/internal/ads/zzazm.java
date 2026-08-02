package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazm extends zzifm implements zzigx {
    private static final zzazm zzi;
    private static volatile zzihe zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        zzazm zzazmVar = new zzazm();
        zzi = zzazmVar;
        zzifm.y(zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    public static zzazl D() {
        return (zzazl) zzi.v();
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 4;
        this.zzd = j;
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

    public final /* synthetic */ void J(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzazm();
        }
        if (ordinal == 4) {
            return new zzazl(zzi);
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
        synchronized (zzazm.class) {
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
