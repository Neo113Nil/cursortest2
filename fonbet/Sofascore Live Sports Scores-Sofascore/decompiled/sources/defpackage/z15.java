package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z15 {
    public final boolean a;
    public final boolean b;
    public final rzg c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public z15(boolean z, boolean z2, rzg rzgVar, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = rzgVar;
        this.d = true;
        this.e = z3;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z15)) {
            return false;
        }
        z15 z15Var = (z15) obj;
        return this.a == z15Var.a && this.b == z15Var.b && this.c == z15Var.c && this.d == z15Var.d && this.e == z15Var.e && this.g == z15Var.g;
    }

    public final int hashCode() {
        return (dmi.e(dmi.e((this.c.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public z15(boolean z, boolean z2) {
        this(z, z2, rzg.a, true);
    }
}
