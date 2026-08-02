package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w1 extends g5 {
    private static final w1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        w1 w1Var = new w1();
        zzg = w1Var;
        g5.m(w1.class, w1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", r1.f5217e, "zze", r1.f5216d, "zzf", r1.f5218f});
        }
        if (i10 == 3) {
            return new w1();
        }
        if (i10 == 4) {
            return new q1(zzg);
        }
        if (i10 == 5) {
            return zzg;
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
        int i5;
        int i10 = this.zze;
        if (i10 != 0) {
            i5 = 2;
            if (i10 != 1) {
                i5 = i10 != 2 ? 0 : 3;
            }
        } else {
            i5 = 1;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    public final int r() {
        int i5;
        int i10 = this.zzf;
        if (i10 != 0) {
            i5 = 2;
            if (i10 != 1) {
                i5 = i10 != 2 ? 0 : 3;
            }
        } else {
            i5 = 1;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }
}
