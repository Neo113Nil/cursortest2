package com.google.android.gms.internal.measurement;

import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfh extends zzadu implements zzafd {
    private static final zzfh zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzfr zze;
    private zzfl zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzfh zzfhVar = new zzfh();
        zzi = zzfhVar;
        zzadu.t(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static zzfh G() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final zzfl B() {
        zzfl zzflVar = this.zzf;
        return zzflVar == null ? zzfl.H() : zzflVar;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final boolean D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final String F() {
        return this.zzh;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfh();
        }
        if (i2 == 4) {
            return new zzfg(zzi);
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
        synchronized (zzfh.class) {
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

    public final zzfr z() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.F() : zzfrVar;
    }
}
