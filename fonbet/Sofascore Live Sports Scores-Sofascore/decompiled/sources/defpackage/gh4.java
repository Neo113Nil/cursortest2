package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gh4 {
    public final ci6 a;
    public final List b;

    public gh4(ci6 ci6Var, List list) {
        list.getClass();
        this.a = ci6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh4)) {
            return false;
        }
        gh4 gh4Var = (gh4) obj;
        return this.a.equals(gh4Var.a) && Intrinsics.c(this.b, gh4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryEvents(collapsibleCategory=" + this.a + ", mappedItems=" + this.b + ")";
    }
}
