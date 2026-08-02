package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzijo extends zzifm implements zzigx {
    private static final zzijo zzy;
    private static volatile zzihe zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private zzify zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzify zzo;
    private boolean zzp;
    private long zzu;
    private zzifu zzv;
    private boolean zzw;
    private zzifu zzx;

    static {
        zzijo zzijoVar = new zzijo();
        zzy = zzijoVar;
        zzifm.y(zzijo.class, zzijoVar);
    }

    private zzijo() {
        kqo kqoVar = kqo.e;
        this.zze = kqoVar;
        this.zzj = "";
        this.zzo = kqoVar;
        wpo wpoVar = wpo.e;
        this.zzv = wpoVar;
        this.zzx = wpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", lkn.z, "zzc", "zzd", "zze", "zzf", lkn.x, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzijk.class, "zzp", "zzu", "zzv", lkn.v, "zzw", "zzx", lkn.y});
        }
        if (ordinal == 3) {
            return new zzijo();
        }
        if (ordinal == 4) {
            return new zzijh(zzy);
        }
        if (ordinal == 5) {
            return zzy;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzz;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzijo.class) {
            try {
                zziheVar = zzz;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzy);
                    zzz = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
