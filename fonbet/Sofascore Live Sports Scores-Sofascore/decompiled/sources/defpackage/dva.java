package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dva {
    public final List a;
    public final List b;

    public dva(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dva)) {
            return false;
        }
        dva dvaVar = (dva) obj;
        return Intrinsics.c(this.a, dvaVar.a) && Intrinsics.c(this.b, dvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeagueDetailsViewConfig(headers=" + this.a + ", footers=" + this.b + ")";
    }
}
