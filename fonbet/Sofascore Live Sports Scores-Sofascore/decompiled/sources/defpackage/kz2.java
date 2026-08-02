package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kz2 implements mz2 {
    public final double a;
    public final double b;

    public kz2(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz2)) {
            return false;
        }
        if (a() && ((kz2) obj).a()) {
            return true;
        }
        kz2 kz2Var = (kz2) obj;
        return this.a == kz2Var.a && this.b == kz2Var.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
