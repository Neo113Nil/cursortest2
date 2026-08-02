package com.google.android.gms.internal.measurement;

import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhg extends zzadu implements zzafd {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.t(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf F() {
        return (zzhf) zzi.p();
    }

    public final zzii A() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.H() : zziiVar;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final zzii C() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.H() : zziiVar;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final boolean E() {
        return this.zzh;
    }

    public final /* synthetic */ void G(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void H(zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void I(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void J(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhg();
        }
        if (i2 == 4) {
            return new zzhf(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzj;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhg.class) {
            try {
                zzafjVar = zzj;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzi);
                    zzj = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final int z() {
        return this.zze;
    }
}
