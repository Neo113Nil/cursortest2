package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bm1 {
    public final int a;
    public final int b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Float f;

    public bm1(int i, int i2, String str, Integer num, Integer num2, Float f) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return this.a == bm1Var.a && this.b == bm1Var.b && Intrinsics.c(this.c, bm1Var.c) && Intrinsics.c(this.d, bm1Var.d) && Intrinsics.c(this.e, bm1Var.e) && Intrinsics.c(this.f, bm1Var.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.f;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BaseballSeasonStatisticsStatUiModel(shortLabelResId=", ", labelResId=", ", displayValue=");
        me4.o(this.d, this.c, ", rank=", ", count=", s);
        s.append(this.e);
        s.append(", rankPercentage=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
