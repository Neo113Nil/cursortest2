package com.google.android.gms.internal.cast;

import defpackage.f7a;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrb extends zzyd implements zzzj {
    private static final zzrb zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzrb zzrbVar = new zzrb();
        zzh = zzrbVar;
        zzyd.g(zzrb.class, zzrbVar);
    }

    private zzrb() {
    }

    public static zzra n() {
        return (zzra) zzh.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", f7a.s, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzrb();
        }
        if (i2 == 4) {
            return new zzra(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void o(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void p(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    public final /* synthetic */ void q(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    public final /* synthetic */ void r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
