package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hv5 {
    public final boolean a;
    public final List b;
    public final List c;

    public hv5(boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.a = z;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv5)) {
            return false;
        }
        hv5 hv5Var = (hv5) obj;
        return this.a == hv5Var.a && Intrinsics.c(this.b, hv5Var.b) && Intrinsics.c(this.c, hv5Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionAvailability(longViewAvailable=");
        sb.append(this.a);
        sb.append(", longViewSections=");
        sb.append(this.b);
        sb.append(", longViewColumns=");
        return mz1.p(sb, this.c, ")");
    }
}
