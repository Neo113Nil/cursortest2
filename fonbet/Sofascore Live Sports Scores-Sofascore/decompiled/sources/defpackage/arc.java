package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class arc {
    public final double a;
    public final double b;
    public final Double c;

    public arc(double d, double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arc)) {
            return false;
        }
        arc arcVar = (arc) obj;
        return Double.compare(this.a, arcVar.a) == 0 && Double.compare(this.b, arcVar.b) == 0 && Intrinsics.c(this.c, arcVar.c);
    }

    public final int hashCode() {
        int b = dmi.b(Double.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        return b + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "MmaStatValues(percentage=" + this.a + ", numerator=" + this.b + ", denominator=" + this.c + ")";
    }
}
