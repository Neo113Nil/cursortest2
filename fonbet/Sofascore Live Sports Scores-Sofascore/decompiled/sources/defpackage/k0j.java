package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k0j {
    public final huj a;
    public final gv9 b;
    public final Integer c;
    public final gv9 d;
    public final boolean e;

    public k0j(huj hujVar, gv9 gv9Var, Integer num, gv9 gv9Var2, boolean z) {
        gv9Var2.getClass();
        this.a = hujVar;
        this.b = gv9Var;
        this.c = num;
        this.d = gv9Var2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0j)) {
            return false;
        }
        k0j k0jVar = (k0j) obj;
        return this.a.equals(k0jVar.a) && Intrinsics.c(this.b, k0jVar.b) && Intrinsics.c(this.c, k0jVar.c) && Intrinsics.c(this.d, k0jVar.d) && this.e == k0jVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gv9 gv9Var = this.b;
        int hashCode2 = (hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.e) + ljg.d((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamRoundDataUiModel(team=");
        sb.append(this.a);
        sb.append(", allPositions=");
        sb.append(this.b);
        sb.append(", roundPosition=");
        sb.append(this.c);
        sb.append(", roundEvents=");
        sb.append(this.d);
        sb.append(", isEliminated=");
        return wt3.p(sb, this.e, ")");
    }
}
