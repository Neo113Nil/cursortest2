package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gv5 {
    public final gv9 a;
    public final gv9 b;

    public gv5(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv5)) {
            return false;
        }
        gv5 gv5Var = (gv5) obj;
        return Intrinsics.c(this.a, gv5Var.a) && Intrinsics.c(this.b, gv5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventBoxScoreTeamUiModel(legend=" + this.a + ", players=" + this.b + ")";
    }
}
