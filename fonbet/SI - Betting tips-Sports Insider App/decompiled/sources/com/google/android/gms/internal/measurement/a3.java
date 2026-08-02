package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a3 extends g5 {
    private static final a3 zzj;
    private int zzb;
    private m5 zzd = f6.f5043e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        a3 a3Var = new a3();
        zzj = a3Var;
        g5.m(a3.class, a3Var);
    }

    public static z2 z() {
        return (z2) zzj.h();
    }

    public final /* synthetic */ void A(int i5, d3 d3Var) {
        J();
        this.zzd.set(i5, d3Var);
    }

    public final /* synthetic */ void B(d3 d3Var) {
        d3Var.getClass();
        J();
        this.zzd.add(d3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        q4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = f6.f5043e;
    }

    public final /* synthetic */ void E(int i5) {
        J();
        this.zzd.remove(i5);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        m5 m5Var = this.zzd;
        if (((r4) m5Var).f5228a) {
            return;
        }
        int size = m5Var.size();
        this.zzd = m5Var.i0(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", d3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new a3();
        }
        if (i10 == 4) {
            return new z2(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final d3 r(int i5) {
        return (d3) this.zzd.get(i5);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
