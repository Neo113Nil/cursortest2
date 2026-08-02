package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nme {
    public final vle a;
    public final List b;
    public final List c;

    public nme(vle vleVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = vleVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nme)) {
            return false;
        }
        nme nmeVar = (nme) obj;
        return Intrinsics.c(this.a, nmeVar.a) && Intrinsics.c(this.b, nmeVar.b) && Intrinsics.c(this.c, nmeVar.c);
    }

    public final int hashCode() {
        vle vleVar = this.a;
        return this.c.hashCode() + dmi.d((vleVar == null ? 0 : vleVar.a.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CareerStatisticsDisplayData(headerRow=");
        sb.append(this.a);
        sb.append(", statisticRows=");
        sb.append(this.b);
        sb.append(", displayedCategories=");
        return mz1.p(sb, this.c, ")");
    }
}
