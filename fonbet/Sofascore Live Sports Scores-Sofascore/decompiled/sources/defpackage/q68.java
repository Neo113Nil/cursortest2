package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q68 {
    public final gv9 a;
    public final gv9 b;

    public q68(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q68)) {
            return false;
        }
        q68 q68Var = (q68) obj;
        return Intrinsics.c(this.a, q68Var.a) && Intrinsics.c(this.b, q68Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FixturesFdrData(teamFdrs=" + this.a + ", roundData=" + this.b + ")";
    }
}
