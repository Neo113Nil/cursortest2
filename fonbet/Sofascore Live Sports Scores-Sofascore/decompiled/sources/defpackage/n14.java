package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n14 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public n14(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n14)) {
            return false;
        }
        n14 n14Var = (n14) obj;
        return this.a == n14Var.a && this.b.equals(n14Var.b) && this.c == n14Var.c && this.d == n14Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return me4.i(dmi.t(this.a, "WagonWheelBallHit(id=", ", incidentClass=", this.b, ", angle="), this.c, ", length=", this.d, ")");
    }
}
