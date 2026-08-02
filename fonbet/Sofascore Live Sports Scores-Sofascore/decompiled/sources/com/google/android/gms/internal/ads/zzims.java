package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzims extends zzifm implements zzigx {
    private static final zzims zzl;
    private static volatile zzihe zzm;
    private int zza;
    private zziei zzb = zziei.b;
    private zzifu zzc;
    private long zzd;
    private zzifu zze;
    private zzify zzf;
    private String zzg;
    private zzify zzh;
    private zzimu zzi;
    private zzimw zzj;
    private zzicl zzk;

    static {
        zzims zzimsVar = new zzims();
        zzl = zzimsVar;
        zzifm.y(zzims.class, zzimsVar);
    }

    private zzims() {
        wpo wpoVar = wpo.e;
        this.zzc = wpoVar;
        this.zze = wpoVar;
        kqo kqoVar = kqo.e;
        this.zzf = kqoVar;
        this.zzg = "";
        this.zzh = kqoVar;
    }

    public static zzims D(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zzl, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzims) B;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzimh.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new zzims();
        }
        if (ordinal == 4) {
            return new zzimr(zzl);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzm;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzims.class) {
            try {
                zziheVar = zzm;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzl);
                    zzm = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
