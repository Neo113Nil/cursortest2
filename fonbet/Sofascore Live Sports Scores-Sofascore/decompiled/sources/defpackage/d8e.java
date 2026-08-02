package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d8e {
    public final a20 a;
    public final int b;
    public final int c;

    public d8e(a20 a20Var, int i, int i2) {
        this.a = a20Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d8e) {
            d8e d8eVar = (d8e) obj;
            if (this.a == d8eVar.a && this.b == d8eVar.b && this.c == d8eVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return wv8.j(sb, this.c, ')');
    }
}
