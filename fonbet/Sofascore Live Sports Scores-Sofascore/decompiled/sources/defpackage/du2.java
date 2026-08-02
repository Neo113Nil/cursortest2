package defpackage;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class du2 {
    public final boolean a;
    public final Integer b;
    public final List c;
    public final Integer d;
    public final Integer e;

    public du2(boolean z, Integer num, List list, Integer num2, Integer num3) {
        list.getClass();
        this.a = z;
        this.b = num;
        this.c = list;
        this.d = num2;
        this.e = num3;
    }

    public static du2 a(du2 du2Var, Integer num, AbstractList abstractList, Integer num2, Integer num3, int i) {
        Integer num4 = num;
        boolean z = du2Var.a;
        if ((i & 2) != 0) {
            num4 = du2Var.b;
        }
        if ((i & 8) != 0) {
            num2 = du2Var.d;
        }
        if ((i & 16) != 0) {
            num3 = du2Var.e;
        }
        Integer num5 = num3;
        abstractList.getClass();
        return new du2(z, num4, abstractList, num2, num5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du2)) {
            return false;
        }
        du2 du2Var = (du2) obj;
        return this.a == du2Var.a && Intrinsics.c(this.b, du2Var.b) && Intrinsics.c(this.c, du2Var.c) && Intrinsics.c(this.d, du2Var.d) && Intrinsics.c(this.e, du2Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int d = dmi.d((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        int hashCode2 = (d + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChronologicalMatchesState(firstInitDone=");
        sb.append(this.a);
        sb.append(", snapPosition=");
        sb.append(this.b);
        sb.append(", pages=");
        sb.append(this.c);
        sb.append(", prevKey=");
        sb.append(this.d);
        sb.append(", nextKey=");
        return vxd.n(sb, this.e, ")");
    }
}
