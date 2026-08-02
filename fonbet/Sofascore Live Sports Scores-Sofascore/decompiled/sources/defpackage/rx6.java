package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rx6 {
    public final Float a;
    public final Float b;

    public rx6(Float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        return this.a.equals(rx6Var.a) && this.b.equals(rx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyExpectedPointsData(current=" + this.a + ", optimisationGain=" + this.b + ")";
    }
}
