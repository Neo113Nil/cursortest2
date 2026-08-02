package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t77 {
    public final int a;
    public final s77 b;
    public final s77 c;
    public final boolean d;
    public final boolean e;

    public t77(int i, s77 s77Var, s77 s77Var2, boolean z, boolean z2) {
        this.a = i;
        this.b = s77Var;
        this.c = s77Var2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t77)) {
            return false;
        }
        t77 t77Var = (t77) obj;
        return this.a == t77Var.a && this.b.equals(t77Var.b) && this.c.equals(t77Var.c) && this.d == t77Var.d && this.e == t77Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyMatchupUiModel(id=");
        sb.append(this.a);
        sb.append(", home=");
        sb.append(this.b);
        sb.append(", away=");
        sb.append(this.c);
        sb.append(", homeIsWinner=");
        sb.append(this.d);
        sb.append(", awayIsWinner=");
        return wt3.p(sb, this.e, ")");
    }
}
