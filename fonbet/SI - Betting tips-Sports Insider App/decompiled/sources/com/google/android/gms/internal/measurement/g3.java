package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g3 extends g5 {
    private static final g3 zzh;
    private int zzb;
    private m5 zzd = f6.f5043e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        g3 g3Var = new g3();
        zzh = g3Var;
        g5.m(g3.class, g3Var);
    }

    public static f3 w() {
        return (f3) zzh.h();
    }

    public static f3 x(g3 g3Var) {
        f5 h10 = zzh.h();
        h10.g(g3Var);
        return (f3) h10;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        q4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = f6.f5043e;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new g6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", i3.class, "zze", "zzf", "zzg", r1.j});
        }
        if (i10 == 3) {
            return new g3();
        }
        if (i10 == 4) {
            return new f3(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final i3 r(int i5) {
        return (i3) this.zzd.get(i5);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i5, i3 i3Var) {
        E();
        this.zzd.set(i5, i3Var);
    }

    public final /* synthetic */ void z(i3 i3Var) {
        E();
        this.zzd.add(i3Var);
    }
}
