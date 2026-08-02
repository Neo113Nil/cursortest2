package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l1 extends g5 {
    private static final l1 zzi;
    private int zzb;
    private int zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        l1 l1Var = new l1();
        zzi = l1Var;
        g5.m(l1.class, l1Var);
    }

    public l1() {
        f6 f6Var = f6.f5043e;
        this.zze = f6Var;
        this.zzf = f6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", u1.class, "zzf", n1.class, "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new l1();
        }
        if (i10 == 4) {
            return new k1(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final u1 t(int i5) {
        return (u1) this.zze.get(i5);
    }

    public final m5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final n1 w(int i5) {
        return (n1) this.zzf.get(i5);
    }

    public final void x(int i5, u1 u1Var) {
        m5 m5Var = this.zze;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zze = m5Var.i0(size + size);
        }
        this.zze.set(i5, u1Var);
    }

    public final void y(int i5, n1 n1Var) {
        m5 m5Var = this.zzf;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zzf = m5Var.i0(size + size);
        }
        this.zzf.set(i5, n1Var);
    }
}
