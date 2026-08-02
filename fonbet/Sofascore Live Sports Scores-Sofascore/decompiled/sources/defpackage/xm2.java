package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xm2 {
    public static final xm2 c = new xm2(CollectionsKt.W0(new ArrayList()), null);
    public final Set a;
    public final ok3 b;

    public xm2(Set set, ok3 ok3Var) {
        set.getClass();
        this.a = set;
        this.b = ok3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xm2)) {
            return false;
        }
        xm2 xm2Var = (xm2) obj;
        return Intrinsics.c(xm2Var.a, this.a) && Intrinsics.c(xm2Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        ok3 ok3Var = this.b;
        return hashCode + (ok3Var != null ? ok3Var.hashCode() : 0);
    }
}
