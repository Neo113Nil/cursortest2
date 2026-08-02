package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v2 extends g5 {
    private static final v2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        v2 v2Var = new v2();
        zzf = v2Var;
        g5.m(v2.class, v2Var);
    }

    public static u2 p() {
        return (u2) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", r1.f5220h, "zze", r1.f5221i});
        }
        if (i10 == 3) {
            return new v2();
        }
        if (i10 == 4) {
            return new u2(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i5;
        int i10 = this.zzd;
        if (i10 != 0) {
            i5 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i5 = 4;
                    if (i10 != 3) {
                        i5 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i5 = 3;
                }
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

    public final /* synthetic */ void s(int i5) {
        this.zzd = i5 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i5) {
        this.zze = i5 - 1;
        this.zzb |= 2;
    }
}
