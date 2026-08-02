package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d9h implements vg5 {
    public final int a;
    public final int b;

    public d9h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.vg5
    public final void a(xl0 xl0Var) {
        boolean z = xl0Var.d != -1;
        j12 j12Var = (j12) xl0Var.f;
        if (z) {
            xl0Var.d = -1;
            xl0Var.e = -1;
        }
        int c = llf.c(this.a, 0, j12Var.s());
        int c2 = llf.c(this.b, 0, j12Var.s());
        if (c != c2) {
            if (c < c2) {
                xl0Var.i(c, c2);
            } else {
                xl0Var.i(c2, c);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9h)) {
            return false;
        }
        d9h d9hVar = (d9h) obj;
        return this.a == d9hVar.a && this.b == d9hVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return wv8.j(sb, this.b, ')');
    }
}
