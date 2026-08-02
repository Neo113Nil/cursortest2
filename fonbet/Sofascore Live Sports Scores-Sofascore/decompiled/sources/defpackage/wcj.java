package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wcj {
    public static final y3g d = new y3g(9, new t6j(8), new qaj(4));
    public final q80 a;
    public final long b;
    public final pej c;

    public wcj(q80 q80Var, long j, pej pejVar) {
        pej pejVar2;
        this.a = q80Var;
        this.b = t6a.q(q80Var.b.length(), j);
        if (pejVar != null) {
            pejVar2 = new pej(t6a.q(q80Var.b.length(), pejVar.a));
        } else {
            pejVar2 = null;
        }
        this.c = pejVar2;
    }

    public static wcj a(wcj wcjVar, q80 q80Var, long j, int i) {
        if ((i & 1) != 0) {
            q80Var = wcjVar.a;
        }
        if ((i & 2) != 0) {
            j = wcjVar.b;
        }
        pej pejVar = (i & 4) != 0 ? wcjVar.c : null;
        wcjVar.getClass();
        return new wcj(q80Var, j, pejVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcj)) {
            return false;
        }
        wcj wcjVar = (wcj) obj;
        return pej.c(this.b, wcjVar.b) && Intrinsics.c(this.c, wcjVar.c) && Intrinsics.c(this.a, wcjVar.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = pej.c;
        int c = ljg.c(hashCode, 31, this.b);
        pej pejVar = this.c;
        return c + (pejVar != null ? Long.hashCode(pejVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) pej.i(this.b)) + ", composition=" + this.c + ')';
    }

    public wcj(int i, long j, String str) {
        this(new q80((i & 1) != 0 ? "" : str), (i & 2) != 0 ? pej.b : j, (pej) null);
    }
}
