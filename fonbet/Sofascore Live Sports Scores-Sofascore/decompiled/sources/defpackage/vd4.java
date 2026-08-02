package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vd4 {
    public final ud4 a;
    public final ud4 b;
    public final double c;

    public vd4(ud4 ud4Var, ud4 ud4Var2, double d) {
        this.a = ud4Var;
        this.b = ud4Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd4)) {
            return false;
        }
        vd4 vd4Var = (vd4) obj;
        return this.a == vd4Var.a && this.b == vd4Var.b && Double.compare(this.c, vd4Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
