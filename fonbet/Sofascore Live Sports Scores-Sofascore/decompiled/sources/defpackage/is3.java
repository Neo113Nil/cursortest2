package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class is3 {
    public final Integer a;
    public final Integer b;
    public final gv9 c;
    public final gv9 d;
    public final boolean e;

    public is3(Integer num, Integer num2, gv9 gv9Var, b7 b7Var, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? rlh.b : gv9Var, (gv9) ((i & 8) != 0 ? rlh.b : b7Var), false);
    }

    public static is3 a(is3 is3Var, boolean z) {
        Integer num = is3Var.a;
        Integer num2 = is3Var.b;
        gv9 gv9Var = is3Var.c;
        gv9 gv9Var2 = is3Var.d;
        is3Var.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        return new is3(num, num2, gv9Var, gv9Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is3)) {
            return false;
        }
        is3 is3Var = (is3) obj;
        return Intrinsics.c(this.a, is3Var.a) && Intrinsics.c(this.b, is3Var.b) && Intrinsics.c(this.c, is3Var.c) && Intrinsics.c(this.d, is3Var.d) && this.e == is3Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return Boolean.hashCode(this.e) + ljg.d(ljg.d((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder k = wv8.k(this.a, "ContributionState(crowdsourcingAggregatesCurrentRanking=", ", credibilityScore=", ", contributionItemList=", this.b);
        vxd.u(k, this.c, ", contributionSummary=", this.d, ", isPullToRefreshing=");
        return wt3.p(k, this.e, ")");
    }

    public is3(Integer num, Integer num2, gv9 gv9Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = num;
        this.b = num2;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = z;
    }
}
