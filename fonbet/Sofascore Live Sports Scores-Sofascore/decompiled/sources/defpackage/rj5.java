package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rj5 {
    public final List a;
    public final boolean b;

    public rj5(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj5)) {
            return false;
        }
        rj5 rj5Var = (rj5) obj;
        return Intrinsics.c(this.a, rj5Var.a) && this.b == rj5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EliteFaceoffRevealState(items=" + this.a + ", isLoading=" + this.b + ")";
    }
}
