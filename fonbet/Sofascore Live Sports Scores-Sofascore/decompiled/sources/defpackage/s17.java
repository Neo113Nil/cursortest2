package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s17 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public s17(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s17)) {
            return false;
        }
        s17 s17Var = (s17) obj;
        return this.a == s17Var.a && this.b == s17Var.b && this.c == s17Var.c && this.d == s17Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return w1l.i(", rankings=", ")", w1l.k("FantasyHighlightsStoryHeadFlags(potgw=", this.a, ", totgw=", this.b, ", points="), this.c, this.d);
    }
}
