package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.ilg;
import defpackage.me4;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzguk {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(zzgvb.a(str, Integer.valueOf(i)));
    }

    public static void d(long j, boolean z, String str) {
        if (z) {
            return;
        }
        a70.p(zzgvb.a(str, Long.valueOf(j)));
    }

    public static void e(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(zzgvb.a(str, obj));
    }

    public static void f(boolean z) {
        if (z) {
            return;
        }
        defpackage.zzl.s();
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(str);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static void i(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = zzgvb.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a70.p(me4.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                a = zzgvb.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void j(int i, int i2) {
        if (i < 0 || i > i2) {
            defpackage.zzl.r(l(i, i2, "index"));
        }
    }

    public static void k(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? l(i, i3, "start index") : (i2 < 0 || i2 > i3) ? l(i2, i3, "end index") : zzgvb.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String l(int i, int i2, String str) {
        if (i < 0) {
            return zzgvb.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzgvb.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a70.p(me4.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
