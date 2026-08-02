package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x63 {
    public final qo2 a;
    public final gv9 b;

    public x63(qo2 qo2Var, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = qo2Var;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x63)) {
            return false;
        }
        x63 x63Var = (x63) obj;
        return this.a.equals(x63Var.a) && Intrinsics.c(this.b, x63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComparisonEntityData(entityInfo=" + this.a + ", tournamentSeasons=" + this.b + ")";
    }
}
