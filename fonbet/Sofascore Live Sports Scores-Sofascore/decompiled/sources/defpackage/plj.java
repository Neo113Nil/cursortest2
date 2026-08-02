package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class plj {
    public final gv9 a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public plj(int i, gv9 gv9Var, boolean z, boolean z2) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static plj a(plj pljVar, gv9 gv9Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            gv9Var = pljVar.a;
        }
        if ((i2 & 2) != 0) {
            i = pljVar.b;
        }
        boolean z = (i2 & 4) != 0 ? pljVar.c : false;
        boolean z2 = (i2 & 8) != 0 ? pljVar.d : false;
        pljVar.getClass();
        gv9Var.getClass();
        return new plj(i, gv9Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plj)) {
            return false;
        }
        plj pljVar = (plj) obj;
        return Intrinsics.c(this.a, pljVar.a) && this.b == pljVar.b && this.c == pljVar.c && this.d == pljVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopNewsState(topNewsPosts=");
        sb.append(this.a);
        sb.append(", selectedPostIndex=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return w1l.i(", showScrollTutorial=", ")", sb, this.c, this.d);
    }
}
