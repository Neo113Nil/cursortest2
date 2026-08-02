package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z1 extends g5 {
    private static final z1 zzi;
    private int zzb;
    private m5 zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private m5 zzh;

    static {
        z1 z1Var = new z1();
        zzi = z1Var;
        g5.m(z1.class, z1Var);
    }

    public z1() {
        f6 f6Var = f6.f5043e;
        this.zzd = f6Var;
        this.zze = f6Var;
        this.zzf = f6Var;
        this.zzh = f6Var;
    }

    public static z1 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", w1.class, "zze", x1.class, "zzf", y1.class, "zzg", "zzh", w1.class});
        }
        if (i10 == 3) {
            return new z1();
        }
        if (i10 == 4) {
            return new q1(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final m5 u() {
        return this.zzh;
    }
}
