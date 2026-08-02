package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m87 {
    public final uj7 a;
    public final gv9 b;

    public m87(uj7 uj7Var, gv9 gv9Var) {
        uj7Var.getClass();
        gv9Var.getClass();
        this.a = uj7Var;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m87)) {
            return false;
        }
        m87 m87Var = (m87) obj;
        return this.a == m87Var.a && Intrinsics.c(this.b, m87Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyNewsArticlesState(status=" + this.a + ", articles=" + this.b + ")";
    }

    public m87() {
        this(uj7.a, rlh.b);
    }
}
