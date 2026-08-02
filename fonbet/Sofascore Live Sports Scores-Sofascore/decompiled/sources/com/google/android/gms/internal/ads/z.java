package com.google.android.gms.internal.ads;

import defpackage.hbo;
import defpackage.zz0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z {
    public static boolean a(int i, zz0 zz0Var, Object obj) {
        zziem zziemVar = (zziem) zz0Var.e;
        int i2 = zz0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.o1(0);
            ((zziib) obj).d(i3 << 3, Long.valueOf(zziemVar.p()));
            return true;
        }
        if (i4 == 1) {
            zz0Var.o1(1);
            ((zziib) obj).d((i3 << 3) | 1, Long.valueOf(zziemVar.r()));
            return true;
        }
        if (i4 == 2) {
            ((zziib) obj).d((i3 << 3) | 2, zz0Var.J1());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                hbo.i("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                hbo.e();
                return false;
            }
            zz0Var.o1(5);
            ((zziib) obj).d(5 | (i3 << 3), Integer.valueOf(zziemVar.s()));
            return true;
        }
        zziib a = zziib.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            hbo.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zz0Var.H1() != Integer.MAX_VALUE && a(i6, zz0Var, a)) {
        }
        if ((i5 | 4) != zz0Var.b) {
            hbo.i("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (a.e) {
            a.e = false;
        }
        ((zziib) obj).d(i5 | 3, a);
        return true;
    }

    public static final zziib b(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.f) {
            return zziibVar;
        }
        zziib a = zziib.a();
        zzifmVar.zzt = a;
        return a;
    }
}
