package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jxk {
    public final int a;
    public final int b;
    public final ixk c;
    public final gv9 d;

    public jxk(int i, int i2, ixk ixkVar, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = ixkVar;
        this.d = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxk)) {
            return false;
        }
        jxk jxkVar = (jxk) obj;
        return this.a == jxkVar.a && this.b == jxkVar.b && this.c.equals(jxkVar.c) && Intrinsics.c(this.d, jxkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "VolleyballGraphUiModel(topTeamId=", ", bottomTeamId=", ", eventStatus=");
        s.append(this.c);
        s.append(", pointsPerSet=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
