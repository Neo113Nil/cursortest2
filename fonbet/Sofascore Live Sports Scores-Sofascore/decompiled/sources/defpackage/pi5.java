package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pi5 {
    public final gv9 a;
    public final gv9 b;
    public final qi5 c;
    public final si5 d;
    public final boolean e;
    public final boolean f;

    public pi5(gv9 gv9Var, gv9 gv9Var2, qi5 qi5Var, si5 si5Var, boolean z, boolean z2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = qi5Var;
        this.d = si5Var;
        this.e = z;
        this.f = z2;
    }

    public static pi5 a(pi5 pi5Var, gv9 gv9Var, gv9 gv9Var2, qi5 qi5Var, si5 si5Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            gv9Var = pi5Var.a;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 2) != 0) {
            gv9Var2 = pi5Var.b;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 4) != 0) {
            qi5Var = pi5Var.c;
        }
        qi5 qi5Var2 = qi5Var;
        if ((i & 8) != 0) {
            si5Var = pi5Var.d;
        }
        si5 si5Var2 = si5Var;
        if ((i & 16) != 0) {
            z = pi5Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = pi5Var.f;
        }
        pi5Var.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new pi5(gv9Var3, gv9Var4, qi5Var2, si5Var2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi5)) {
            return false;
        }
        pi5 pi5Var = (pi5) obj;
        return Intrinsics.c(this.a, pi5Var.a) && Intrinsics.c(this.b, pi5Var.b) && Intrinsics.c(this.c, pi5Var.c) && Intrinsics.c(this.d, pi5Var.d) && this.e == pi5Var.e && this.f == pi5Var.f;
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        qi5 qi5Var = this.c;
        int hashCode = (d + (qi5Var == null ? 0 : qi5Var.hashCode())) * 31;
        si5 si5Var = this.d;
        return Boolean.hashCode(this.f) + dmi.e((hashCode + (si5Var != null ? si5Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder l = wv8.l("EditorState(popularEvents=", this.a, ", managedTournaments=", this.b, ", editorStatistics=");
        l.append(this.c);
        l.append(", graphData=");
        l.append(this.d);
        l.append(", shouldShowTorneoInfo=");
        return w1l.i(", isPullToRefreshing=", ")", l, this.e, this.f);
    }
}
