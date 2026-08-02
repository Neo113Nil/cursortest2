package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g65 extends i65 {
    public final f65 d;
    public final boolean e;

    public g65(int i, int i2, f65 f65Var, boolean z) {
        super(i, i2);
        this.d = f65Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g65)) {
            return false;
        }
        g65 g65Var = (g65) obj;
        return this.a == g65Var.a && this.b == g65Var.b && this.d.equals(g65Var.d) && this.e == g65Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (((this.a * 31) + this.b) * 31)) * 31);
    }

    @Override // defpackage.i65
    public final String toString() {
        StringBuilder sb = new StringBuilder(g65.class.getSimpleName());
        sb.append("{width=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", primaryContainerDragRange=");
        sb.append(this.d);
        sb.append(", isDraggingToFullscreenAllowed=");
        return lnb.r(sb, this.e, '}');
    }
}
