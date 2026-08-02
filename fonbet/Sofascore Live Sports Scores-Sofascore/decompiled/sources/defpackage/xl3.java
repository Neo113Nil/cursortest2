package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xl3 {
    public final Object a;
    public final int b;
    public final yna c;

    public xl3(Object obj, int i, yna ynaVar) {
        this.a = obj;
        this.b = i;
        this.c = ynaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        return this.a.equals(xl3Var.a) && this.b == xl3Var.b && this.c.equals(xl3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
