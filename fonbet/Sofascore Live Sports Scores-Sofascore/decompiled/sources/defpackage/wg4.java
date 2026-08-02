package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wg4 {
    public final IntRange a;
    public final di4 b;
    public final qg4 c;
    public final String d;
    public final String e;

    public wg4(IntRange intRange, di4 di4Var, qg4 qg4Var, gi4 gi4Var, String str, String str2, String str3) {
        this.a = intRange;
        this.b = di4Var;
        this.c = qg4Var;
        this.d = str;
        this.e = str2;
    }

    public final String a(eg2 eg2Var, Locale locale) {
        if (eg2Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] copyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.d, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i = eg2Var.a;
        IntRange intRange = this.a;
        if (intRange.d(i)) {
            this.b.getClass();
            return "";
        }
        Object[] copyOf2 = Arrays.copyOf(new Object[]{ig2.a(intRange.a, locale), ig2.a(intRange.b, locale)}, 2);
        return String.format(this.e, Arrays.copyOf(copyOf2, copyOf2.length));
    }
}
