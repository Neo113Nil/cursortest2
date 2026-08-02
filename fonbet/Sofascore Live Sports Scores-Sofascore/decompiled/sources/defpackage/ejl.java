package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ejl {
    public final gv9 a;
    public final gv9 b;

    public ejl(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejl)) {
            return false;
        }
        ejl ejlVar = (ejl) obj;
        return Intrinsics.c(this.a, ejlVar.a) && Intrinsics.c(this.b, ejlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorldCupTimelineData(circleX=" + this.a + ", roundProgress=" + this.b + ")";
    }
}
