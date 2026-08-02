package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y5j {
    public final gv9 a;
    public final gv9 b;

    public y5j(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5j)) {
            return false;
        }
        y5j y5jVar = (y5j) obj;
        return Intrinsics.c(this.a, y5jVar.a) && Intrinsics.c(this.b, y5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TennisGrandSlamPerformanceUIModel(years=" + this.a + ", tournaments=" + this.b + ")";
    }
}
