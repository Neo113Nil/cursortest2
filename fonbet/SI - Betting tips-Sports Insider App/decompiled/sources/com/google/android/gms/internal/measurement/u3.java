package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u3 extends g5 {
    private static final u3 zzf;
    private int zzb;
    private m5 zzd = f6.f5043e;
    private s3 zze;

    static {
        u3 u3Var = new u3();
        zzf = u3Var;
        g5.m(u3.class, u3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", v3.class, "zze"});
        }
        if (i10 == 3) {
            return new u3();
        }
        if (i10 == 4) {
            return new q1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final s3 q() {
        s3 s3Var = this.zze;
        return s3Var == null ? s3.r() : s3Var;
    }
}
