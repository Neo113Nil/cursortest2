package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k24 {
    public final h34 a;
    public final w34 b;

    public k24(h34 h34Var, w34 w34Var) {
        h34Var.getClass();
        w34Var.getClass();
        this.a = h34Var;
        this.b = w34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k24)) {
            return false;
        }
        k24 k24Var = (k24) obj;
        return Intrinsics.c(this.a, k24Var.a) && Intrinsics.c(this.b, k24Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CrowdsourcingCommonData(eventData=" + this.a + ", incidentData=" + this.b + ")";
    }
}
