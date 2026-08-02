package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ks5 {
    public final n9k a;
    public final gv9 b;

    public ks5(n9k n9kVar, b7 b7Var) {
        b7Var.getClass();
        this.a = n9kVar;
        this.b = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks5)) {
            return false;
        }
        ks5 ks5Var = (ks5) obj;
        return this.a.equals(ks5Var.a) && Intrinsics.c(this.b, ks5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventAiInsightsSetResultsSection(title=" + this.a + ", results=" + this.b + ")";
    }
}
