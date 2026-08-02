package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mi5 {
    public final int a;
    public final int b;
    public final ms3 c;
    public final ms3 d;
    public final Integer e;

    public mi5(int i, int i2, ms3 ms3Var, ms3 ms3Var2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = ms3Var;
        this.d = ms3Var2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi5)) {
            return false;
        }
        mi5 mi5Var = (mi5) obj;
        return this.a == mi5Var.a && this.b == mi5Var.b && this.c.equals(mi5Var.c) && this.d.equals(mi5Var.d) && Intrinsics.c(this.e, mi5Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31;
        Integer num = this.e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "EditorPopularMatchData(id=", ", eventOpenings=", ", homeTeam=");
        s.append(this.c);
        s.append(", awayTeam=");
        s.append(this.d);
        s.append(", winnerCode=");
        return vxd.n(s, this.e, ")");
    }
}
