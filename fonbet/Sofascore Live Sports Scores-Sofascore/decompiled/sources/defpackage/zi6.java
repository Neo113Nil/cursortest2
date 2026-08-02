package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zi6 {
    public final ri6 a;
    public final double b;

    public zi6(ri6 ri6Var, double d) {
        this.a = ri6Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi6)) {
            return false;
        }
        zi6 zi6Var = (zi6) obj;
        return this.a.equals(zi6Var.a) && Double.compare(this.b, zi6Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentVariant(group=" + this.a + ", weight=" + this.b + ")";
    }
}
