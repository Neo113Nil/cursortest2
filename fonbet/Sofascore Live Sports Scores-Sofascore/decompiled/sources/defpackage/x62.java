package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x62 {
    public final String a;
    public final g72 b;

    public x62(String str, g72 g72Var) {
        this.a = str;
        this.b = g72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x62)) {
            return false;
        }
        x62 x62Var = (x62) obj;
        return this.a.equals(x62Var.a) && this.b.equals(x62Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BundleArg(key=" + this.a + ", value=" + this.b + ")";
    }
}
