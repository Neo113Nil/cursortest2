package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n3 extends g5 {
    private static final n3 zzf;
    private int zzb;
    private int zzd;
    private l5 zze = t5.f5250e;

    static {
        n3 n3Var = new n3();
        zzf = n3Var;
        g5.m(n3.class, n3Var);
    }

    public static m3 u() {
        return (m3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new n3();
        }
        if (i10 == 4) {
            return new m3(zzf);
        }
        if (i10 == 5) {
            return zzf;
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
        return ((t5) this.zze).size();
    }

    public final long t(int i5) {
        return ((t5) this.zze).b(i5);
    }

    public final /* synthetic */ void v(int i5) {
        this.zzb |= 1;
        this.zzd = i5;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((r4) randomAccess).f5228a) {
            t5 t5Var = (t5) randomAccess;
            int i5 = t5Var.f5252c;
            this.zze = t5Var.i0(i5 + i5);
        }
        q4.c(list, this.zze);
    }
}
