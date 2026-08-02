package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z97 implements aa7 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public z97(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static z97 a(z97 z97Var, String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = z97Var.a;
        }
        if ((i & 2) != 0) {
            z = z97Var.b;
        }
        if ((i & 4) != 0) {
            z2 = z97Var.c;
        }
        if ((i & 8) != 0) {
            z3 = z97Var.d;
        }
        return new z97(str, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z97)) {
            return false;
        }
        z97 z97Var = (z97) obj;
        return this.a.equals(z97Var.a) && this.b == z97Var.b && this.c == z97Var.c && this.d == z97Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinLeague(joinCode=");
        sb.append(this.a);
        sb.append(", isError=");
        sb.append(this.b);
        sb.append(", isInProgress=");
        return w1l.i(", confirmEnabled=", ")", sb, this.c, this.d);
    }
}
