package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s3 extends g5 {
    private static final s3 zzd;
    private m5 zzb = f6.f5043e;

    static {
        s3 s3Var = new s3();
        zzd = s3Var;
        g5.m(s3.class, s3Var);
    }

    public static s3 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", t3.class});
        }
        if (i10 == 3) {
            return new s3();
        }
        if (i10 == 4) {
            return new q1(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
