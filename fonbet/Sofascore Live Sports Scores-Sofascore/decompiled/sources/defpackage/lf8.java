package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lf8 {
    public final List a;
    public final List b;
    public final List c;

    public lf8(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf8)) {
            return false;
        }
        lf8 lf8Var = (lf8) obj;
        return Intrinsics.c(this.a, lf8Var.a) && Intrinsics.c(this.b, lf8Var.b) && Intrinsics.c(this.c, lf8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.p(fc6.s("FollowedItemsWrapper(players=", ", teams=", ", leagues=", this.a, this.b), this.c, ")");
    }
}
