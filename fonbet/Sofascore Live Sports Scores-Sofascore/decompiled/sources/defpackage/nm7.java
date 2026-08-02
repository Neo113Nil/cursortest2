package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nm7 {
    public final gv9 a;
    public final gv9 b;
    public final cm7 c;
    public final rz6 d;
    public final boolean e;

    public nm7(gv9 gv9Var, gv9 gv9Var2, cm7 cm7Var, rz6 rz6Var, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = cm7Var;
        this.d = rz6Var;
        this.e = z;
    }

    public static nm7 a(nm7 nm7Var, gv9 gv9Var, gv9 gv9Var2, cm7 cm7Var, rz6 rz6Var, int i) {
        if ((i & 1) != 0) {
            gv9Var = nm7Var.a;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 2) != 0) {
            gv9Var2 = nm7Var.b;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 4) != 0) {
            cm7Var = nm7Var.c;
        }
        cm7 cm7Var2 = cm7Var;
        if ((i & 8) != 0) {
            rz6Var = nm7Var.d;
        }
        rz6 rz6Var2 = rz6Var;
        boolean z = (i & 16) != 0 ? nm7Var.e : false;
        nm7Var.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new nm7(gv9Var3, gv9Var4, cm7Var2, rz6Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm7)) {
            return false;
        }
        nm7 nm7Var = (nm7) obj;
        return Intrinsics.c(this.a, nm7Var.a) && Intrinsics.c(this.b, nm7Var.b) && this.c == nm7Var.c && this.d == nm7Var.d && this.e == nm7Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        rz6 rz6Var = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (rz6Var == null ? 0 : rz6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("FantasyTopPlayersState(categories=", this.a, ", players=", this.b, ", selectedCategory=");
        l.append(this.c);
        l.append(", position=");
        l.append(this.d);
        l.append(", isLoading=");
        return wt3.p(l, this.e, ")");
    }
}
