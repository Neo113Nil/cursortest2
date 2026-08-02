package rh;

import ph.AbstractC6076g;
import ph.AbstractC6079j;

/* renamed from: rh.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6294l {
    public static String a(long j10) {
        if (j10 == 0) {
            return b();
        }
        char[] a10 = AbstractC6079j.a(16);
        AbstractC6076g.g(j10, a10, 0);
        return new String(a10, 0, 16);
    }

    public static String b() {
        return "0000000000000000";
    }

    public static int c() {
        return 16;
    }

    public static boolean isValid(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 16 && !"0000000000000000".contentEquals(charSequence) && AbstractC6076g.f(charSequence);
    }
}
