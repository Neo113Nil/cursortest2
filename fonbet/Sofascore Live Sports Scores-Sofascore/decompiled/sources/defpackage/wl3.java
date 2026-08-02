package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wl3 {
    public final Object a;
    public final int b;
    public final ll3 c;

    public wl3(Object obj, int i, ll3 ll3Var) {
        this.a = obj;
        this.b = i;
        this.c = ll3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl3)) {
            return false;
        }
        wl3 wl3Var = (wl3) obj;
        return this.a.equals(wl3Var.a) && this.b == wl3Var.b && this.c.equals(wl3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
