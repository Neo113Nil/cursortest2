package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q9k implements r9k {
    public final int a;
    public final gv9 b;

    public q9k(int i, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9k)) {
            return false;
        }
        q9k q9kVar = (q9k) obj;
        return this.a == q9kVar.a && Intrinsics.c(this.b, q9kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StringResource(id=" + this.a + ", args=" + this.b + ")";
    }

    public q9k(int i) {
        this(i, rlh.b);
    }
}
