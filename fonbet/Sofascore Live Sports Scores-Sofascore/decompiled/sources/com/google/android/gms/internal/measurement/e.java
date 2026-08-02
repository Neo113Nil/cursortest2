package com.google.android.gms.internal.measurement;

import defpackage.hbo;
import defpackage.zz0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e {
    public static zzaga a(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f) {
            return zzagaVar;
        }
        zzaga a = zzaga.a();
        zzaduVar.zzc = a;
        return a;
    }

    public static boolean b(int i, zz0 zz0Var, Object obj) {
        zzacv zzacvVar = (zzacv) zz0Var.e;
        int i2 = zz0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.o1(0);
            ((zzaga) obj).d(i3 << 3, Long.valueOf(zzacvVar.r()));
            return true;
        }
        if (i4 == 1) {
            zz0Var.o1(1);
            ((zzaga) obj).d((i3 << 3) | 1, Long.valueOf(zzacvVar.t()));
            return true;
        }
        if (i4 == 2) {
            ((zzaga) obj).d((i3 << 3) | 2, zz0Var.K1());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                hbo.o("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                defpackage.zzl.w();
                return false;
            }
            zz0Var.o1(5);
            ((zzaga) obj).d(5 | (i3 << 3), Integer.valueOf(zzacvVar.u()));
            return true;
        }
        zzaga a = zzaga.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zz0Var.H1() != Integer.MAX_VALUE && b(i6, zz0Var, a)) {
        }
        if ((i5 | 4) != zz0Var.b) {
            hbo.o("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (a.e) {
            a.e = false;
        }
        ((zzaga) obj).d(i5 | 3, a);
        return true;
    }
}
