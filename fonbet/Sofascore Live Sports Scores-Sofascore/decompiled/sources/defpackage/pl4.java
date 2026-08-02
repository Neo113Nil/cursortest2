package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pl4 implements Comparable {
    public final int a;
    public final int b;

    public pl4(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        ogj.h(ljg.j(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = n4o.h;
        int i2 = this.a;
        int i3 = this.b;
        return i == i3 ? i2 : i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        pl4 pl4Var = (pl4) obj;
        pl4Var.getClass();
        int max = Math.max(this.b, pl4Var.b);
        return Intrinsics.d(a(max), pl4Var.a(max));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pl4)) {
            return false;
        }
        pl4 pl4Var = (pl4) obj;
        int max = Math.max(this.b, pl4Var.b);
        return Intrinsics.d(a(max), pl4Var.a(max)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = n4o.h[this.b];
        int i2 = this.a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(StringsKt.V(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
