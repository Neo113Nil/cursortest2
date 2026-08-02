package b2;

import b1.C2334C;
import com.plaid.internal.EnumC3631g;
import e1.J;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i10, J j10, int i11) {
        if (i10 == 12) {
            return EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && j10.a() >= 8 && j10.g() + 8 <= i11) {
            int v10 = j10.v();
            int v11 = j10.v();
            if (v10 >= 12 && v11 == 1936877170) {
                return j10.N();
            }
        }
        return -2147483647;
    }

    public static C2334C b(J j10, int i10) {
        j10.c0(12);
        while (j10.g() < i10) {
            int g10 = j10.g();
            int v10 = j10.v();
            if (j10.v() == 1935766900) {
                if (v10 < 16) {
                    return null;
                }
                j10.c0(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int M10 = j10.M();
                    int M11 = j10.M();
                    if (M10 == 0) {
                        i11 = M11;
                    } else if (M10 == 1) {
                        i12 = M11;
                    }
                }
                int a10 = a(i11, j10, i10);
                if (a10 == -2147483647) {
                    return null;
                }
                return new C2334C(new W1.d(a10, i12));
            }
            j10.b0(g10 + v10);
        }
        return null;
    }
}
