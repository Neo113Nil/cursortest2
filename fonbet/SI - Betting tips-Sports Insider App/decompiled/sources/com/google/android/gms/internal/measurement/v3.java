package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v3 extends g5 {
    private static final v3 zzj;
    private int zzb;
    private int zzd;
    private m5 zze = f6.f5043e;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        v3 v3Var = new v3();
        zzj = v3Var;
        g5.m(v3.class, v3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", r1.f5226o, "zze", v3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new v3();
        }
        if (i10 == 4) {
            return new q1(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zze;
    }

    public final String q() {
        return this.zzf;
    }

    public final boolean r() {
        return (this.zzb & 4) != 0;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zzb & 8) != 0;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 16) != 0;
    }

    public final double w() {
        return this.zzi;
    }

    public final int x() {
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
}
