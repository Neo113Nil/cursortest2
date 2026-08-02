package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.w7n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfr extends zzadu implements zzafd {
    private static final zzfr zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzaef zzh = ldn.e;

    static {
        zzfr zzfrVar = new zzfr();
        zzi = zzfrVar;
        zzadu.t(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfr F() {
        return zzi;
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final zzaef D() {
        return this.zzh;
    }

    public final int E() {
        return this.zzh.size();
    }

    public final int G() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
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
            return new ndn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", w7n.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfr();
        }
        if (i2 == 4) {
            return new zzfo(zzi);
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
        synchronized (zzfr.class) {
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

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
