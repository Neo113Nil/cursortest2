package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t7i implements z7i {
    public final j5i a;
    public final ArrayList b;
    public final List c;
    public final Integer d;

    public t7i(j5i j5iVar, ArrayList arrayList, List list, Integer num) {
        this.a = j5iVar;
        this.b = arrayList;
        this.c = list;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7i)) {
            return false;
        }
        t7i t7iVar = (t7i) obj;
        return this.a == t7iVar.a && this.b.equals(t7iVar.b) && Intrinsics.c(this.c, t7iVar.c) && Intrinsics.c(this.d, t7iVar.d);
    }

    public final int hashCode() {
        int d = vxd.d(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Header(teamType=" + this.a + ", basicColumns=" + this.b + ", availableStages=" + this.c + ", selectedIndex=" + this.d + ")";
    }
}
