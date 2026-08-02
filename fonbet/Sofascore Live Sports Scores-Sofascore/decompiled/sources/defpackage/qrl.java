package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qrl {
    public final double a;
    public final double b;
    public final String c;

    public qrl(double d, double d2) {
        this.a = d;
        this.b = d2;
        StringBuilder sb = new StringBuilder();
        sb.append((int) d);
        sb.append(':');
        sb.append((int) d2);
        this.c = sb.toString();
    }

    public static qrl copy$default(qrl qrlVar, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = qrlVar.a;
        }
        if ((i & 2) != 0) {
            d2 = qrlVar.b;
        }
        qrlVar.getClass();
        return new qrl(d, d2);
    }

    public final Double a() {
        double d = this.b;
        if (d <= 0.0d) {
            return null;
        }
        double d2 = this.a;
        if (d2 > 0.0d) {
            return Double.valueOf(d2 / d);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrl)) {
            return false;
        }
        qrl qrlVar = (qrl) obj;
        return Double.compare(this.a, qrlVar.a) == 0 && Double.compare(this.b, qrlVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AspectRatioDimensionModel(width=" + this.a + ", height=" + this.b + ')';
    }
}
