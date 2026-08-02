package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c12 {
    public final foa a;
    public final int b;
    public final int c;

    public c12(foa foaVar, int i, int i2) {
        this.a = foaVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c12)) {
            return false;
        }
        c12 c12Var = (c12) obj;
        return this.a == c12Var.a && this.b == c12Var.b && this.c == c12Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) eo.b(this.b)) + ", verticalAlignment=" + ((Object) go.b(this.c)) + ')';
    }
}
