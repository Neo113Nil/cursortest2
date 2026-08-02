package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jn2 {
    public int a;
    public int b;
    public int c;
    public int d;

    public jn2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn2)) {
            return false;
        }
        jn2 jn2Var = (jn2) obj;
        return this.a == jn2Var.a && this.b == jn2Var.b && this.c == jn2Var.c && this.d == jn2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.a);
        sb.append(", preEnd=");
        sb.append(this.b);
        sb.append(", originalStart=");
        sb.append(this.c);
        sb.append(", originalEnd=");
        return wv8.j(sb, this.d, ')');
    }
}
