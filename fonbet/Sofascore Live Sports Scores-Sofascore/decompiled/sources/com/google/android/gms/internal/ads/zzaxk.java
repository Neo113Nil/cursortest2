package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxk extends zzifm implements zzigx {
    private static final zzaxk zzo;
    private static volatile zzihe zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zzify zzm = kqo.e;

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzo = zzaxkVar;
        zzifm.y(zzaxk.class, zzaxkVar);
    }

    private zzaxk() {
    }

    public static zzaxg D() {
        return (zzaxg) zzo.v();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void J(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void K(int i) {
        this.zzn = i - 1;
        this.zza |= com.ironsource.mediationsdk.metadata.a.o;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzaxi.class, "zzn", lkn.c});
        }
        if (ordinal == 3) {
            return new zzaxk();
        }
        if (ordinal == 4) {
            return new zzaxg(zzo);
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzp;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaxk.class) {
            try {
                zziheVar = zzp;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzo);
                    zzp = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
