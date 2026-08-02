package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n6j implements Serializable {
    public final gv9 a;

    public n6j(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6j) && Intrinsics.c(this.a, ((n6j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TennisPowerGraphData(sets=" + this.a + ")";
    }
}
