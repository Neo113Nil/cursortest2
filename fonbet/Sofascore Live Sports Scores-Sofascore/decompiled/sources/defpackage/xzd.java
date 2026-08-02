package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xzd {
    public final int a;
    public final yzd b;
    public final gv9 c;
    public final mzd d;
    public final gv9 e;
    public final gv9 f;
    public final pzd g;

    public xzd(int i, yzd yzdVar, gv9 gv9Var, mzd mzdVar, gv9 gv9Var2, gv9 gv9Var3, pzd pzdVar) {
        yzdVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = i;
        this.b = yzdVar;
        this.c = gv9Var;
        this.d = mzdVar;
        this.e = gv9Var2;
        this.f = gv9Var3;
        this.g = pzdVar;
    }

    public static xzd a(xzd xzdVar, yzd yzdVar, mzd mzdVar, gv9 gv9Var, pzd pzdVar, int i) {
        int i2 = xzdVar.a;
        if ((i & 2) != 0) {
            yzdVar = xzdVar.b;
        }
        yzd yzdVar2 = yzdVar;
        gv9 gv9Var2 = xzdVar.c;
        if ((i & 8) != 0) {
            mzdVar = xzdVar.d;
        }
        mzd mzdVar2 = mzdVar;
        gv9 gv9Var3 = xzdVar.e;
        if ((i & 32) != 0) {
            gv9Var = xzdVar.f;
        }
        gv9 gv9Var4 = gv9Var;
        if ((i & 64) != 0) {
            pzdVar = xzdVar.g;
        }
        xzdVar.getClass();
        yzdVar2.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new xzd(i2, yzdVar2, gv9Var2, mzdVar2, gv9Var3, gv9Var4, pzdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzdVar = (xzd) obj;
        return this.a == xzdVar.a && this.b == xzdVar.b && Intrinsics.c(this.c, xzdVar.c) && this.d == xzdVar.d && Intrinsics.c(this.e, xzdVar.e) && Intrinsics.c(this.f, xzdVar.f) && this.g == xzdVar.g;
    }

    public final int hashCode() {
        int d = ljg.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        mzd mzdVar = this.d;
        int d2 = ljg.d(ljg.d((d + (mzdVar == null ? 0 : mzdVar.hashCode())) * 31, 31, this.e), 31, this.f);
        pzd pzdVar = this.g;
        return d2 + (pzdVar != null ? pzdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PESMStatisticsCategoryPickerUiData(id=");
        sb.append(this.a);
        sb.append(", selectedView=");
        sb.append(this.b);
        sb.append(", availableCategories=");
        sb.append(this.c);
        sb.append(", selectedCategory=");
        sb.append(this.d);
        sb.append(", availableGraphSubcategories=");
        vxd.u(sb, this.e, ", displayedGraphSubcategories=", this.f, ", selectedGraphSubcategory=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
