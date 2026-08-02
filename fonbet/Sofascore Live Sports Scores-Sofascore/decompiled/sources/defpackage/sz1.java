package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sz1 {
    public final jqb a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public sz1(jqb jqbVar, String str, int i, int i2, boolean z) {
        this.a = jqbVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz1)) {
            return false;
        }
        sz1 sz1Var = (sz1) obj;
        return this.a == sz1Var.a && this.b.equals(sz1Var.b) && this.c == sz1Var.c && this.d == sz1Var.d && this.e == sz1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dmi.e(wv8.a(this.d, wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomNavItemConfig(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", iconSelectedRes=");
        me4.q(sb, this.c, ", iconUnSelectedRes=", this.d, ", isProminent=");
        return wt3.p(sb, this.e, ", showBadge=false)");
    }
}
