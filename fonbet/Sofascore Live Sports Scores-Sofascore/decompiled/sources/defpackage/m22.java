package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m22 implements Serializable {
    public final String a;
    public final r9k b;
    public final ArrayList c;
    public boolean d;
    public int e;
    public x12 f;
    public boolean g;
    public final x12 h;
    public final boolean i;
    public final boolean j;

    public m22(String str, r9k r9kVar, ArrayList arrayList, x12 x12Var, x12 x12Var2, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = r9kVar;
        this.c = arrayList;
        this.d = true;
        this.e = 0;
        this.f = x12Var;
        this.g = false;
        this.h = x12Var2;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m22)) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return Intrinsics.c(this.a, m22Var.a) && this.b.equals(m22Var.b) && this.c.equals(m22Var.c) && this.d == m22Var.d && this.e == m22Var.e && Intrinsics.c(this.f, m22Var.f) && this.g == m22Var.g && this.h.equals(m22Var.h) && this.i == m22Var.i && this.j == m22Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + dmi.e((this.h.hashCode() + dmi.e((this.f.hashCode() + wv8.a(this.e, dmi.e(vxd.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31)) * 31, 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        boolean z = this.d;
        int i = this.e;
        x12 x12Var = this.f;
        boolean z2 = this.g;
        StringBuilder sb = new StringBuilder("BoxScoreSectionItem(name=");
        sb.append(this.a);
        sb.append(", translatedName=");
        sb.append(this.b);
        sb.append(", columnList=");
        sb.append(this.c);
        sb.append(", isClickable=");
        sb.append(z);
        sb.append(", numberOfVisibleColumns=");
        sb.append(i);
        sb.append(", sortedByColumn=");
        sb.append(x12Var);
        sb.append(", isLongViewActive=");
        sb.append(z2);
        sb.append(", defaultColumnForSorting=");
        sb.append(this.h);
        sb.append(", hasRating=");
        return w1l.i(", canBeSorted=", ")", sb, this.i, this.j);
    }
}
