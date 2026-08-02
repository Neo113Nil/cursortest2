package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wn0 {
    public static final wn0 d = new vn0().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public wn0(vn0 vn0Var) {
        this.a = vn0Var.a;
        this.b = vn0Var.b;
        this.c = vn0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wn0.class != obj.getClass()) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return this.a == wn0Var.a && this.b == wn0Var.b && this.c == wn0Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
