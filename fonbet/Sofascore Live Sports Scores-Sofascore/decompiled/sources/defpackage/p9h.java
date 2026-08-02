package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p9h implements vg5 {
    public final int a;
    public final int b;

    public p9h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        int c = llf.c(this.a, 0, ((j12) xl0Var.f).s());
        int c2 = llf.c(this.b, 0, ((j12) xl0Var.f).s());
        if (c < c2) {
            xl0Var.j(c, c2);
        } else {
            xl0Var.j(c2, c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9h)) {
            return false;
        }
        p9h p9hVar = (p9h) obj;
        return this.a == p9hVar.a && this.b == p9hVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return wv8.j(sb, this.b, ')');
    }
}
