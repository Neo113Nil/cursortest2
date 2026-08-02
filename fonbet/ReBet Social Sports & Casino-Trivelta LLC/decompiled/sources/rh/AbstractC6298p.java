package rh;

import ph.AbstractC6076g;
import ph.AbstractC6079j;

/* renamed from: rh.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6298p {
    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == 0) {
            return b();
        }
        char[] a10 = AbstractC6079j.a(32);
        AbstractC6076g.g(j10, a10, 0);
        AbstractC6076g.g(j11, a10, 16);
        return new String(a10, 0, 32);
    }

    public static String b() {
        return "00000000000000000000000000000000";
    }

    public static int c() {
        return 32;
    }

    public static boolean isValid(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 32 && !"00000000000000000000000000000000".contentEquals(charSequence) && AbstractC6076g.f(charSequence);
    }
}
