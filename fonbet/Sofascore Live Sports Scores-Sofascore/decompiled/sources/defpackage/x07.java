package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x07 {
    public final ho7 a;
    public final boolean b;

    public x07(ho7 ho7Var, boolean z) {
        this.a = ho7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x07)) {
            return false;
        }
        x07 x07Var = (x07) obj;
        return Intrinsics.c(this.a, x07Var.a) && this.b == x07Var.b;
    }

    public final int hashCode() {
        ho7 ho7Var = this.a;
        return Boolean.hashCode(this.b) + ((ho7Var == null ? 0 : ho7Var.hashCode()) * 31);
    }

    public final String toString() {
        return "FantasyGameweekHighlightsPointsState(userRound=" + this.a + ", isLoading=" + this.b + ")";
    }
}
