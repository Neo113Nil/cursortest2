package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w28 {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;

    public w28(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w28)) {
            return false;
        }
        w28 w28Var = (w28) obj;
        return Intrinsics.c(this.a, w28Var.a) && Intrinsics.c(this.b, w28Var.b) && Intrinsics.c(this.c, w28Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = wv8.l("FilterOptions(teams=", this.a, ", prices=", this.b, ", positions=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
