package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l6i implements m6i {
    public final List a;
    public final List b;
    public final boolean c;

    public l6i(List list, List list2, boolean z) {
        list.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6i)) {
            return false;
        }
        l6i l6iVar = (l6i) obj;
        return Intrinsics.c(this.a, l6iVar.a) && Intrinsics.c(this.b, l6iVar.b) && this.c == l6iVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return wt3.p(fc6.s("LegendRow(columns=", ", additionalRows=", ", showTyreLegend=", this.a, this.b), this.c, ")");
    }
}
