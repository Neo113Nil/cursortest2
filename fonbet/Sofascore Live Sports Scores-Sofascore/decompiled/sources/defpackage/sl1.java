package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sl1 implements jl1 {
    public final int a;
    public final gv9 b;
    public final gv9 c;
    public final int d;

    public sl1(int i, b7 b7Var, gv9 gv9Var, int i2) {
        b7Var.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = b7Var;
        this.c = gv9Var;
        this.d = i2;
    }

    @Override // defpackage.jl1
    public final nl1 a() {
        return null;
    }

    @Override // defpackage.jl1
    public final nl1 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl1)) {
            return false;
        }
        sl1 sl1Var = (sl1) obj;
        return this.a == sl1Var.a && Intrinsics.c(this.b, sl1Var.b) && Intrinsics.c(this.c, sl1Var.c) && this.d == sl1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ljg.d(ljg.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TableData(rowHeaderLabelResId=" + this.a + ", columnResIds=" + this.b + ", rows=" + this.c + ", emptyStateLabelResId=" + this.d + ")";
    }
}
