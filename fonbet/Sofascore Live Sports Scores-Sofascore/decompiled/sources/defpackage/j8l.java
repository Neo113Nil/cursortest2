package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j8l implements wfc {
    public final lv1 a;
    public final int b;

    public j8l(lv1 lv1Var, int i) {
        this.a = lv1Var;
        this.b = i;
    }

    @Override // defpackage.wfc
    public final int a(x6a x6aVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? vxd.b(i2 - i, 2.0f, 1.0f) : llf.c(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8l)) {
            return false;
        }
        j8l j8lVar = (j8l) obj;
        return this.a.equals(j8lVar.a) && this.b == j8lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return wv8.j(sb, this.b, ')');
    }
}
