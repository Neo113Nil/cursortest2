package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.w7n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzje extends zzadu implements zzafd {
    private static final zzje zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private zzaef zzf = ldn.e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        zzje zzjeVar = new zzje();
        zzk = zzjeVar;
        zzadu.t(zzje.class, zzjeVar);
    }

    private zzje() {
    }

    public final boolean A() {
        return (this.zzb & 4) != 0;
    }

    public final String B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zzb & 8) != 0;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final boolean E() {
        return (this.zzb & 16) != 0;
    }

    public final double F() {
        return this.zzj;
    }

    public final int G() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", w7n.p, "zzf", zzje.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzje();
        }
        if (i2 == 4) {
            return new zzjb(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzl;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzje.class) {
            try {
                zzafjVar = zzl;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzk);
                    zzl = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final List y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
