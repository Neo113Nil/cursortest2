package com.google.android.gms.internal.cast;

import defpackage.it7;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqx extends zzyd implements zzzj {
    private static final zzqx zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzqx zzqxVar = new zzqx();
        zzi = zzqxVar;
        zzyd.g(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw n() {
        return (zzqw) zzi.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", it7.w, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzqx();
        }
        if (i2 == 4) {
            return new zzqw(zzi);
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

    public final /* synthetic */ void q(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void s(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
