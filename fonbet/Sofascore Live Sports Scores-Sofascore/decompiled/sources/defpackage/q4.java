package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q4 {
    public q4(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            pvd.m(i3, lnb.s(i, i2, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            a70.p(dmi.k(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            zzl.r(dmi.k(i, i2, "index: ", ", size: "));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            zzl.r(dmi.k(i, i2, "index: ", ", size: "));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            pvd.m(i3, lnb.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            a70.p(dmi.k(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }
}
