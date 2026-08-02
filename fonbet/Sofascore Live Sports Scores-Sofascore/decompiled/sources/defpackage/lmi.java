package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lmi {
    public final vv3 a;
    public final int b;

    public lmi(int i, vv3 vv3Var) {
        this.a = vv3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmi)) {
            return false;
        }
        lmi lmiVar = (lmi) obj;
        return this.a == lmiVar.a && this.b == lmiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SummaryChartDataPoint(type=" + this.a + ", value=" + this.b + ")";
    }
}
