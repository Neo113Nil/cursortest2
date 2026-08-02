package com.google.android.gms.internal.cast;

import defpackage.kpg;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqt extends zzyd implements zzzj {
    private static final zzqt zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzqt zzqtVar = new zzqt();
        zzi = zzqtVar;
        zzyd.g(zzqt.class, zzqtVar);
    }

    private zzqt() {
    }

    public static zzqs n() {
        return (zzqs) zzi.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", kpg.n, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzqt();
        }
        if (i2 == 4) {
            return new zzqs(zzi);
        }
        if (i2 == 5) {
            return zzi;
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
        this.zzb |= 16;
        this.zzh = i;
    }

    public final /* synthetic */ void s(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
