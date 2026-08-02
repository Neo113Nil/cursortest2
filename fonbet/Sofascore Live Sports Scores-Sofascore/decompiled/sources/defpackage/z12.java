package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z12 {
    public final m22 a;
    public final int b;
    public final int c;

    public z12(m22 m22Var, int i, int i2) {
        this.a = m22Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z12)) {
            return false;
        }
        z12 z12Var = (z12) obj;
        return this.a.equals(z12Var.a) && this.b == z12Var.b && this.c == z12Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxScoreFloatingHeaderData(sectionItem=");
        sb.append(this.a);
        sb.append(", indexFrom=");
        sb.append(this.b);
        sb.append(", indexTo=");
        return fc6.h(this.c, ")", sb);
    }
}
