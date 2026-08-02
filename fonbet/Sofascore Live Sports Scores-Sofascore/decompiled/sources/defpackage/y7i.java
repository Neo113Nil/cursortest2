package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y7i implements z7i {
    public final l3i a;
    public final ArrayList b;
    public final List c;
    public final Integer d;

    public y7i(l3i l3iVar, ArrayList arrayList, List list, Integer num) {
        l3iVar.getClass();
        this.a = l3iVar;
        this.b = arrayList;
        this.c = list;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7i)) {
            return false;
        }
        y7i y7iVar = (y7i) obj;
        return Intrinsics.c(this.a, y7iVar.a) && this.b.equals(y7iVar.b) && Intrinsics.c(this.c, y7iVar.c) && Intrinsics.c(this.d, y7iVar.d);
    }

    public final int hashCode() {
        int d = vxd.d(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Ranking(ranking=" + this.a + ", basicColumns=" + this.b + ", availableStages=" + this.c + ", selectedIndex=" + this.d + ")";
    }
}
