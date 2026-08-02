package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qz1 {
    public final float a;
    public final n52 b;

    public qz1(float f, n52 n52Var) {
        this.a = f;
        this.b = n52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return p75.b(this.a, qz1Var.a) && this.b.equals(qz1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) p75.c(this.a)) + ", brush=" + this.b + ')';
    }
}
