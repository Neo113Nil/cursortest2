package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w4 extends g3 {
    private static final w4 zzb;

    static {
        w4 w4Var = new w4();
        zzb = w4Var;
        g3.k(w4.class, w4Var);
    }

    public static w4 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new w4();
        }
        if (i10 == 4) {
            return new v4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
