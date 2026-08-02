package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vl7 {
    public final tl7 a;
    public final am7 b;
    public final boolean c;
    public final boolean d;

    public vl7(tl7 tl7Var, am7 am7Var, boolean z, boolean z2) {
        this.a = tl7Var;
        this.b = am7Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl7)) {
            return false;
        }
        vl7 vl7Var = (vl7) obj;
        return this.a == vl7Var.a && this.b.equals(vl7Var.b) && this.c == vl7Var.c && this.d == vl7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyTokenData(token=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", isAvailable=");
        return w1l.i(", renews=", ")", sb, this.c, this.d);
    }
}
