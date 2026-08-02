package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s97 {
    public final h97 a;

    public s97(h97 h97Var) {
        this.a = h97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s97) && Intrinsics.c(this.a, ((s97) obj).a);
    }

    public final int hashCode() {
        h97 h97Var = this.a;
        if (h97Var == null) {
            return 0;
        }
        return h97Var.hashCode();
    }

    public final String toString() {
        return "FantasyOnboardingCreateTeamState(bottomSheetType=" + this.a + ")";
    }
}
