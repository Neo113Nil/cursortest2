package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w2 extends g5 {
    private static final w2 zzd;
    private m5 zzb = f6.f5043e;

    static {
        w2 w2Var = new w2();
        zzd = w2Var;
        g5.m(w2.class, w2Var);
    }

    public static t2 q() {
        return (t2) zzd.h();
    }

    public static w2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", v2.class});
        }
        if (i10 == 3) {
            return new w2();
        }
        if (i10 == 4) {
            return new t2(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        m5 m5Var = this.zzb;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zzb = m5Var.i0(size + size);
        }
        q4.c(arrayList, this.zzb);
    }
}
