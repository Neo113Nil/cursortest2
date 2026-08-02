package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfze extends zzifm implements zzigx {
    private static final zzfze zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfzb zze;

    static {
        zzfze zzfzeVar = new zzfze();
        zzf = zzfzeVar;
        zzifm.y(zzfze.class, zzfzeVar);
    }

    private zzfze() {
    }

    public static zzfzc D() {
        return (zzfzc) zzf.v();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void F(zzfzb zzfzbVar) {
        this.zze = zzfzbVar;
        this.zza |= 8;
    }

    public final /* synthetic */ void G(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", lkn.r, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfze();
        }
        if (ordinal == 4) {
            return new zzfzc(zzf);
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
        synchronized (zzfze.class) {
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
