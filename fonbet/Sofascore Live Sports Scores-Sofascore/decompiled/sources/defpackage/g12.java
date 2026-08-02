package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g12 implements k1c {
    public final io a;
    public final boolean b;

    public g12(io ioVar, boolean z) {
        this.a = ioVar;
        this.b = z;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        int j2;
        int i;
        qhe J;
        if (list.isEmpty()) {
            return m1c.G0(m1cVar, an3.j(j), an3.i(j), new sx1(29));
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            g1c g1cVar = (g1c) list.get(0);
            Object h = g1cVar.h();
            b12 b12Var = h instanceof b12 ? (b12) h : null;
            if (b12Var != null ? b12Var.p : false) {
                j2 = an3.j(j);
                i = an3.i(j);
                int j4 = an3.j(j);
                int i2 = an3.i(j);
                if (!((i2 >= 0) & (j4 >= 0))) {
                    t3a.a("width and height must be >= 0");
                }
                J = g1cVar.J(cn3.h(j4, j4, i2, i2));
            } else {
                J = g1cVar.J(j3);
                j2 = Math.max(an3.j(j), J.a);
                i = Math.max(an3.i(j), J.b);
            }
            int i3 = i;
            int i4 = j2;
            return m1c.G0(m1cVar, i4, i3, new f12(J, g1cVar, m1cVar, i4, i3, this));
        }
        qhe[] qheVarArr = new qhe[list.size()];
        dsf dsfVar = new dsf();
        dsfVar.a = an3.j(j);
        dsf dsfVar2 = new dsf();
        dsfVar2.a = an3.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            g1c g1cVar2 = (g1c) list.get(i5);
            Object h2 = g1cVar2.h();
            b12 b12Var2 = h2 instanceof b12 ? (b12) h2 : null;
            if (b12Var2 != null ? b12Var2.p : false) {
                z = true;
            } else {
                qhe J2 = g1cVar2.J(j3);
                qheVarArr[i5] = J2;
                dsfVar.a = Math.max(dsfVar.a, J2.a);
                dsfVar2.a = Math.max(dsfVar2.a, J2.b);
            }
        }
        if (z) {
            int i6 = dsfVar.a;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = dsfVar2.a;
            long a = cn3.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                g1c g1cVar3 = (g1c) list.get(i9);
                Object h3 = g1cVar3.h();
                b12 b12Var3 = h3 instanceof b12 ? (b12) h3 : null;
                if (b12Var3 != null ? b12Var3.p : false) {
                    qheVarArr[i9] = g1cVar3.J(a);
                }
            }
        }
        return m1c.G0(m1cVar, dsfVar.a, dsfVar2.a, new yx1(qheVarArr, list, m1cVar, dsfVar, dsfVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        return Intrinsics.c(this.a, g12Var.a) && this.b == g12Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return lnb.r(sb, this.b, ')');
    }
}
