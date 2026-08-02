package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ps6 implements at6 {
    public final int a;
    public final List b;

    public ps6(int i, List list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps6)) {
            return false;
        }
        ps6 ps6Var = (ps6) obj;
        return this.a == ps6Var.a && Intrinsics.c(this.b, ps6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnOptimiseClick(roundId=" + this.a + ", squad=" + this.b + ")";
    }
}
