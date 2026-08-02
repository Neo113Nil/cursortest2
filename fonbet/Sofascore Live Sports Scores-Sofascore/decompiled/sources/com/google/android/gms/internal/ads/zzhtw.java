package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtw extends zzifm implements zzigx {
    private static final zzhtw zzd;
    private static volatile zzihe zze;
    private String zza = "";
    private zziei zzb = zziei.b;
    private int zzc;

    static {
        zzhtw zzhtwVar = new zzhtw();
        zzd = zzhtwVar;
        zzifm.y(zzhtw.class, zzhtwVar);
    }

    private zzhtw() {
    }

    public static zzhtw F(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zzd, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzhtw) B;
    }

    public static zzhtv G() {
        return (zzhtv) zzd.v();
    }

    public static zzhtv H(zzhtw zzhtwVar) {
        zzifg v = zzd.v();
        v.p(zzhtwVar);
        return (zzhtv) v;
    }

    public static zzhtw I() {
        return zzd;
    }

    public final String D() {
        return this.zza;
    }

    public final zziei E() {
        return this.zzb;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void K(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    public final int L() {
        int a = zzhup.a(this.zzc);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final void M(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhtw();
        }
        if (ordinal == 4) {
            return new zzhtv(zzd);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zze;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhtw.class) {
            try {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
