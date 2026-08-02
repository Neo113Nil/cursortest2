package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aa1 implements fa1 {
    public final kl1 a;

    public aa1(kl1 kl1Var) {
        this.a = kl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa1) && this.a == ((aa1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectChartDisplayType(chartType=" + this.a + ")";
    }
}
