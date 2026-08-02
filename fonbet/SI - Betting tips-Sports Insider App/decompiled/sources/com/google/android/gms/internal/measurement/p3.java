package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p3 extends g5 {
    private static final p3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        p3 p3Var = new p3();
        zzg = p3Var;
        g5.m(p3.class, p3Var);
    }

    public static o3 q() {
        return (o3) zzg.h();
    }

    public static p3 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", r1.f5225n, "zze", r1.f5223l, "zzf", r1.f5224m});
        }
        if (i10 == 3) {
            return new p3();
        }
        if (i10 == 4) {
            return new o3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int c2 = androidx.appcompat.widget.c1.c(this.zze);
        if (c2 == 0) {
            return 1;
        }
        return c2;
    }

    public final void s(int i5) {
        this.zze = androidx.appcompat.widget.c1.e(i5);
        this.zzb |= 2;
    }

    public final int t() {
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

    public final int u() {
        int i5;
        int i10 = this.zzf;
        if (i10 != 0) {
            i5 = 2;
            if (i10 != 1) {
                int i11 = 3;
                if (i10 != 2) {
                    i5 = 4;
                    if (i10 != 3) {
                        i11 = 5;
                        if (i10 != 4) {
                            i5 = i10 != 5 ? 0 : 6;
                        }
                    }
                }
                i5 = i11;
            }
        } else {
            i5 = 1;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    public final /* synthetic */ void v(int i5) {
        this.zzd = i5 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i5) {
        this.zzf = i5 - 1;
        this.zzb |= 4;
    }
}
