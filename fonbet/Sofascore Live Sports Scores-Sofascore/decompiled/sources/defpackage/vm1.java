package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vm1 {
    public final gv9 a;
    public final LinkedHashMap b;

    public vm1(gv9 gv9Var, LinkedHashMap linkedHashMap) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm1)) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        return Intrinsics.c(this.a, vm1Var.a) && this.b.equals(vm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BaseballTopPerformersResult(performers=" + this.a + ", playerInfo=" + this.b + ")";
    }
}
