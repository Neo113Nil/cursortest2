package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hj5 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final gv9 d;

    public hj5(int i, gv9 gv9Var, boolean z, boolean z2) {
        gv9Var.getClass();
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        hj5 hj5Var = (hj5) obj;
        return this.a == hj5Var.a && this.b == hj5Var.b && this.c == hj5Var.c && Intrinsics.c(this.d, hj5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.e(dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "EliminationRound(type=" + this.a + ", drawRound=" + this.b + ", afterDrawRound=" + this.c + ", blocks=" + this.d + ")";
    }
}
