package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z33 {
    public final zl9 a;
    public final boolean b;

    public z33(zl9 zl9Var, boolean z) {
        this.a = zl9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        return this.a.equals(z33Var.a) && this.b == z33Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommentaryCollapsibleItem(groupItem=" + this.a + ", isExpanded=" + this.b + ")";
    }
}
