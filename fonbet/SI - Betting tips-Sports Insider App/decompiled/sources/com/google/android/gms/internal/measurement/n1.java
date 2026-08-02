package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n1 extends g5 {
    private static final n1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private m5 zzf = f6.f5043e;
    private boolean zzg;
    private s1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        n1 n1Var = new n1();
        zzl = n1Var;
        g5.m(n1.class, n1Var);
    }

    public static m1 B() {
        return (m1) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i5, p1 p1Var) {
        m5 m5Var = this.zzf;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zzf = m5Var.i0(size + size);
        }
        this.zzf.set(i5, p1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", p1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new n1();
        }
        if (i10 == 4) {
            return new m1(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final p1 u(int i5) {
        return (p1) this.zzf.get(i5);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final s1 w() {
        s1 s1Var = this.zzh;
        return s1Var == null ? s1.y() : s1Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
