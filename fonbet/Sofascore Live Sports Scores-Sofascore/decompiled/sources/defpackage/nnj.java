package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nnj implements pnj {
    public final rp9 a;

    public nnj(rp9 rp9Var) {
        rp9Var.getClass();
        this.a = rp9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnj) && Intrinsics.c(this.a, ((nnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivisionFilter(value=" + this.a + ")";
    }
}
