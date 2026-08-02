package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ba1 implements fa1 {
    public final ll1 a;

    public ba1(ll1 ll1Var) {
        this.a = ll1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba1) && this.a == ((ba1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectChartSection(chartSection=" + this.a + ")";
    }
}
