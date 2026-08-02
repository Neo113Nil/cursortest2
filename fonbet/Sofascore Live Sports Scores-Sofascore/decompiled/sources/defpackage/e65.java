package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e65 extends f65 {
    public final float b;
    public final float c;

    public e65(float f, float f2) {
        this.b = f;
        this.c = f2;
        if (f <= 0.0d || f >= 1.0d) {
            a70.p("minRatio must be in the interval (0.0, 1.0)");
            throw null;
        }
        if (f2 <= 0.0d || f2 >= 1.0d) {
            a70.p("maxRatio must be in the interval (0.0, 1.0)");
            throw null;
        }
        if (f <= f2) {
            return;
        }
        a70.p("minRatio must be less than or equal to maxRatio");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e65)) {
            return false;
        }
        e65 e65Var = (e65) obj;
        return this.b == e65Var.b && this.c == e65Var.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitRatioDragRange[");
        sb.append(this.b);
        sb.append(", ");
        return wt3.n(sb, this.c, ']');
    }
}
