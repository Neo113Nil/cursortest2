package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yz0 {
    public final double a;
    public final int b;

    public yz0(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz0)) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        return Double.compare(this.a, yz0Var.a) == 0 && this.b == yz0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BarData(value=" + this.a + ", color=" + this.b + ")";
    }
}
