package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p52 implements ycj {
    public final oah a;
    public final float b;

    public p52(oah oahVar, float f) {
        this.a = oahVar;
        this.b = f;
    }

    @Override // defpackage.ycj
    public final float a() {
        return this.b;
    }

    @Override // defpackage.ycj
    public final long b() {
        int i = r13.j;
        return r13.i;
    }

    @Override // defpackage.ycj
    public final n52 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p52)) {
            return false;
        }
        p52 p52Var = (p52) obj;
        return this.a.equals(p52Var.a) && Float.compare(this.b, p52Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return wt3.n(sb, this.b, ')');
    }
}
