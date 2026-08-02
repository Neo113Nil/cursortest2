package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ha3 {
    public final boolean a;
    public final y93 b;
    public final List c;

    public ha3(boolean z, y93 y93Var, List list) {
        list.getClass();
        this.a = z;
        this.b = y93Var;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static ha3 a(ha3 ha3Var, y93 y93Var, ArrayList arrayList, int i) {
        boolean z = ha3Var.a;
        if ((i & 2) != 0) {
            y93Var = ha3Var.b;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = ha3Var.c;
        }
        arrayList2.getClass();
        return new ha3(z, y93Var, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3)) {
            return false;
        }
        ha3 ha3Var = (ha3) obj;
        return this.a == ha3Var.a && Intrinsics.c(this.b, ha3Var.b) && Intrinsics.c(this.c, ha3Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        y93 y93Var = this.b;
        return this.c.hashCode() + ((hashCode + (y93Var == null ? 0 : y93Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompetitionsState(categoriesLoaded=");
        sb.append(this.a);
        sb.append(", pinnedTournamentsCategory=");
        sb.append(this.b);
        sb.append(", categories=");
        return mz1.p(sb, this.c, ")");
    }
}
