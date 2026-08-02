package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l3 extends g5 {
    private static final l3 zzg;
    private l5 zzb;
    private l5 zzd;
    private m5 zze;
    private m5 zzf;

    static {
        l3 l3Var = new l3();
        zzg = l3Var;
        g5.m(l3.class, l3Var);
    }

    public l3() {
        t5 t5Var = t5.f5250e;
        this.zzb = t5Var;
        this.zzd = t5Var;
        f6 f6Var = f6.f5043e;
        this.zze = f6Var;
        this.zzf = f6Var;
    }

    public static k3 x() {
        return (k3) zzg.h();
    }

    public static l3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = t5.f5250e;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((r4) randomAccess).f5228a) {
            t5 t5Var = (t5) randomAccess;
            int i5 = t5Var.f5252c;
            this.zzd = t5Var.i0(i5 + i5);
        }
        q4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = t5.f5250e;
    }

    public final void D(ArrayList arrayList) {
        m5 m5Var = this.zze;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zze = m5Var.i0(size + size);
        }
        q4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = f6.f5043e;
    }

    public final void F(Iterable iterable) {
        m5 m5Var = this.zzf;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zzf = m5Var.i0(size + size);
        }
        q4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = f6.f5043e;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", y2.class, "zzf", n3.class});
        }
        if (i10 == 3) {
            return new l3();
        }
        if (i10 == 4) {
            return new k3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((t5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((t5) this.zzd).size();
    }

    public final m5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((r4) randomAccess).f5228a) {
            t5 t5Var = (t5) randomAccess;
            int i5 = t5Var.f5252c;
            this.zzb = t5Var.i0(i5 + i5);
        }
        q4.c(iterable, this.zzb);
    }
}
