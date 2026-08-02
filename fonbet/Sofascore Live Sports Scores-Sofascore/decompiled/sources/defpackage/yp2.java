package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yp2 {
    public final gv9 a;
    public final int b;

    public yp2(int i, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp2)) {
            return false;
        }
        yp2 yp2Var = (yp2) obj;
        return Intrinsics.c(this.a, yp2Var.a) && this.b == yp2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartData(bars=" + this.a + ", joinMonthIndex=" + this.b + ")";
    }
}
