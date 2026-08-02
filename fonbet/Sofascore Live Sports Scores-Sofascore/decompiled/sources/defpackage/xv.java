package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xv implements wfc {
    public final lv1 a;
    public final lv1 b;
    public final int c;

    public xv(lv1 lv1Var, lv1 lv1Var2, int i) {
        this.a = lv1Var;
        this.b = lv1Var2;
        this.c = i;
    }

    @Override // defpackage.wfc
    public final int a(x6a x6aVar, long j, int i) {
        int a = this.b.a(0, x6aVar.b());
        return x6aVar.b + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return this.a.equals(xvVar.a) && this.b.equals(xvVar.b) && this.c == xvVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fc6.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return wv8.j(sb, this.c, ')');
    }
}
