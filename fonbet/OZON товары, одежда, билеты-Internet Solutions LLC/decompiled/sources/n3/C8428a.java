package n3;

import Ij.C3261b;
import m3.C8050C;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8428a {

    /* renamed from: a, reason: collision with root package name */
    public final String f76369a;

    private C8428a(String str) {
        this.f76369a = str;
    }

    public static C8428a a(C8050C c8050c) {
        String str;
        c8050c.S(2);
        int E11 = c8050c.E();
        int i11 = E11 >> 1;
        int E12 = ((c8050c.E() >> 3) & 31) | ((E11 & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7 || i11 == 8) {
            str = "dvhe";
        } else if (i11 == 9) {
            str = "dvav";
        } else {
            if (i11 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder e11 = C3261b.e(str);
        e11.append(i11 < 10 ? ".0" : ".");
        e11.append(i11);
        e11.append(E12 < 10 ? ".0" : ".");
        e11.append(E12);
        return new C8428a(e11.toString());
    }
}
