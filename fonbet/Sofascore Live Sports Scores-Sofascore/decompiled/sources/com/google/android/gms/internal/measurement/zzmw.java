package com.google.android.gms.internal.measurement;

import defpackage.aw9;
import defpackage.fwf;
import defpackage.hbo;
import defpackage.me4;
import defpackage.w1a;
import defpackage.x5d;
import defpackage.yv9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmw {
    public static final zzmw b;
    public final aw9 a;

    static {
        int i = aw9.f;
        b = new zzmw(fwf.h);
    }

    public zzmw(aw9 aw9Var) {
        this.a = aw9Var;
    }

    public static zzmw a(zzacv zzacvVar) {
        String str;
        long j;
        zzmv zzmvVar;
        int G = zzacvVar.G();
        if (G < 0) {
            hbo.o("Negative number of flags");
            return null;
        }
        int i = aw9.f;
        yv9 yv9Var = new yv9(x5d.a);
        long j2 = 0;
        for (int i2 = 0; i2 < G; i2++) {
            long H = zzacvVar.H();
            int i3 = (int) H;
            long j3 = H >>> 3;
            if (j3 == 0) {
                j = 0;
                str = zzacvVar.w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    hbo.o("Flag name larger than max size");
                    return null;
                }
                str = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                zzmvVar = new zzmv(j, str, i4, 0L, null);
            } else if (i4 == 2) {
                zzmvVar = new zzmv(j, str, i4, zzacvVar.H(), null);
            } else if (i4 == 3) {
                zzmvVar = new zzmv(j, str, i4, Double.doubleToRawLongBits(zzacvVar.o()), null);
            } else if (i4 == 4) {
                zzmvVar = new zzmv(j, str, i4, 0L, zzacvVar.w());
            } else {
                if (i4 != 5) {
                    hbo.o(me4.g(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                zzmvVar = new zzmv(j, str, i4, 0L, zzacvVar.z());
            }
            long j5 = zzmvVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            yv9Var.c(zzmvVar);
        }
        return new zzmw(yv9Var.i());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmw)) {
            return false;
        }
        return this.a.equals(((zzmw) obj).a);
    }

    public final int hashCode() {
        aw9 aw9Var = this.a;
        aw9Var.getClass();
        return w1a.s(aw9Var);
    }
}
