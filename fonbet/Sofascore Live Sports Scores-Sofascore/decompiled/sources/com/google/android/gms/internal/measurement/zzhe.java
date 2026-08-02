package com.google.android.gms.internal.measurement;

import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhe extends zzadu implements zzafd {
    private static final zzhe zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhe zzheVar = new zzhe();
        zzl = zzheVar;
        zzadu.t(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    public static zzhd F() {
        return (zzhd) zzl.p();
    }

    public static zzhe G() {
        return zzl;
    }

    public final boolean A() {
        return this.zzg;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return this.zzi;
    }

    public final boolean D() {
        return this.zzj;
    }

    public final boolean E() {
        return this.zzk;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void I(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void J(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void K(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void L(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void M(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void N(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzhe();
        }
        if (i2 == 4) {
            return new zzhd(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhe.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzf;
    }
}
