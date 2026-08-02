package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mm0 {
    public final int a;
    public final q9k b;

    public mm0(int i, q9k q9kVar) {
        this.a = i;
        this.b = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm0)) {
            return false;
        }
        mm0 mm0Var = (mm0) obj;
        return this.a == mm0Var.a && this.b.equals(mm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LegendItem(iconRes=" + this.a + ", text=" + this.b + ")";
    }
}
