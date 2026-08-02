package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class aif {
    public static final gc2 a;

    static {
        gc2 gc2Var = gc2.d;
        a = q1f.o("xn--");
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        pvd.l(i, "unexpected digit: ");
        return 0;
    }
}
