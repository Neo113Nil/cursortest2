package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pl1 implements jl1 {
    public final ll1 a;
    public final gv9 b;
    public final nl1 c;
    public final nl1 d;
    public final int e;

    public pl1(ll1 ll1Var, gv9 gv9Var, nl1 nl1Var, nl1 nl1Var2, int i) {
        gv9Var.getClass();
        this.a = ll1Var;
        this.b = gv9Var;
        this.c = nl1Var;
        this.d = nl1Var2;
        this.e = i;
    }

    @Override // defpackage.jl1
    public final nl1 a() {
        return this.c;
    }

    @Override // defpackage.jl1
    public final nl1 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl1)) {
            return false;
        }
        pl1 pl1Var = (pl1) obj;
        return this.a == pl1Var.a && Intrinsics.c(this.b, pl1Var.b) && this.c.equals(pl1Var.c) && Intrinsics.c(this.d, pl1Var.d) && this.e == pl1Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        nl1 nl1Var = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (nl1Var == null ? 0 : nl1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointGraphData(chartSection=");
        sb.append(this.a);
        sb.append(", pointsByGroup=");
        sb.append(this.b);
        sb.append(", primaryFilterState=");
        sb.append(this.c);
        sb.append(", secondaryFilterState=");
        sb.append(this.d);
        sb.append(", emptyStateLabelResId=");
        return fc6.h(this.e, ")", sb);
    }
}
