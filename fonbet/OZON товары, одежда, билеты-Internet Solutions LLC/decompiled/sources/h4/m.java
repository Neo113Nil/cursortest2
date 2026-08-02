package h4;

import j3.t;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class m {
    public static t a(int i11, C8050C c8050c) {
        int F11;
        c8050c.S(12);
        while (c8050c.f() < i11) {
            int f7 = c8050c.f();
            int p11 = c8050c.p();
            if (c8050c.p() == 1935766900) {
                if (p11 < 16) {
                    return null;
                }
                c8050c.S(4);
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < 2; i14++) {
                    int E11 = c8050c.E();
                    int E12 = c8050c.E();
                    if (E11 == 0) {
                        i12 = E12;
                    } else if (E11 == 1) {
                        i13 = E12;
                    }
                }
                if (i12 == 12) {
                    F11 = 240;
                } else if (i12 == 13) {
                    F11 = 120;
                } else {
                    if (i12 == 21 && c8050c.a() >= 8 && c8050c.f() + 8 <= i11) {
                        int p12 = c8050c.p();
                        int p13 = c8050c.p();
                        if (p12 >= 12 && p13 == 1936877170) {
                            F11 = c8050c.F();
                        }
                    }
                    F11 = -2147483647;
                }
                if (F11 == -2147483647) {
                    return null;
                }
                return new t(new c4.c(F11, i13));
            }
            c8050c.R(f7 + p11);
        }
        return null;
    }
}
