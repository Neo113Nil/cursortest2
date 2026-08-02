package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class si5 {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final int d;
    public final int e;

    public si5(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, int i, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si5)) {
            return false;
        }
        si5 si5Var = (si5) obj;
        return Intrinsics.c(this.a, si5Var.a) && Intrinsics.c(this.b, si5Var.b) && Intrinsics.c(this.c, si5Var.c) && this.d == si5Var.d && this.e == si5Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wv8.a(this.d, ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("EditorViewsGraphData(points=", this.a, ", months=", this.b, ", openings=");
        l.append(this.c);
        l.append(", maxYValue=");
        l.append(this.d);
        l.append(", average=");
        return fc6.h(this.e, ")", l);
    }
}
