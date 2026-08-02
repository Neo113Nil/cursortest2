package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bs9 implements zy7 {
    public final nr9 a;
    public final boolean b;
    public final pe4 c;

    public bs9(nr9 nr9Var, boolean z, pe4 pe4Var) {
        this.a = nr9Var;
        this.b = z;
        this.c = pe4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs9)) {
            return false;
        }
        bs9 bs9Var = (bs9) obj;
        return this.a.equals(bs9Var.a) && this.b == bs9Var.b && this.c == bs9Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
