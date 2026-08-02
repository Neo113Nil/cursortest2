package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tzj {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;

    public tzj(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
    }

    public static tzj a(tzj tzjVar, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, int i) {
        if ((i & 2) != 0) {
            gv9Var2 = tzjVar.b;
        }
        if ((i & 4) != 0) {
            gv9Var3 = tzjVar.c;
        }
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        return new tzj(gv9Var, gv9Var2, gv9Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzj)) {
            return false;
        }
        tzj tzjVar = (tzj) obj;
        return Intrinsics.c(this.a, tzjVar.a) && Intrinsics.c(this.b, tzjVar.b) && Intrinsics.c(this.c, tzjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = wv8.l("TrendingGridScreenState(rows=", this.a, ", mediumFallbacks=", this.b, ", largeFallbacks=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
