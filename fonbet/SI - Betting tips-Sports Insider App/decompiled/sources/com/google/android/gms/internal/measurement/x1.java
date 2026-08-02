package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x1 extends g5 {
    private static final x1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        x1 x1Var = new x1();
        zzf = x1Var;
        g5.m(x1.class, x1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            r1 r1Var = r1.f5217e;
            return new g6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", r1Var, "zze", r1Var});
        }
        if (i10 == 3) {
            return new x1();
        }
        if (i10 == 4) {
            return new q1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int D = a.a.D(this.zzd);
        if (D == 0) {
            return 1;
        }
        return D;
    }

    public final int q() {
        int D = a.a.D(this.zze);
        if (D == 0) {
            return 1;
        }
        return D;
    }
}
