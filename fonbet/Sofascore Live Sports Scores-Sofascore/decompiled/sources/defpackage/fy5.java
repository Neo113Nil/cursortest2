package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fy5 {
    public final List a;
    public final List b;

    public fy5(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy5)) {
            return false;
        }
        fy5 fy5Var = (fy5) obj;
        return Intrinsics.c(this.a, fy5Var.a) && Intrinsics.c(this.b, fy5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventDetailsViewConfig(headers=" + this.a + ", footers=" + this.b + ")";
    }
}
