package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g93 implements i93 {
    public final d73 a;
    public final LinkedHashMap b;
    public final gv9 c;

    public g93(d73 d73Var, LinkedHashMap linkedHashMap, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = d73Var;
        this.b = linkedHashMap;
        this.c = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g93)) {
            return false;
        }
        g93 g93Var = (g93) obj;
        return this.a.equals(g93Var.a) && this.b.equals(g93Var.b) && Intrinsics.c(this.c, g93Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Filterable(statistics=" + this.a + ", statisticsByFilterKey=" + this.b + ", filterChipItems=" + this.c + ")";
    }
}
