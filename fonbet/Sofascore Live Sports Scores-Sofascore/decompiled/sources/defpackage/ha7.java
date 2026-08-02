package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ha7 {
    public final aa7 a;
    public final boolean b;

    public ha7(aa7 aa7Var, boolean z) {
        this.a = aa7Var;
        this.b = z;
    }

    public static ha7 a(ha7 ha7Var, aa7 aa7Var, boolean z, int i) {
        if ((i & 1) != 0) {
            aa7Var = ha7Var.a;
        }
        if ((i & 2) != 0) {
            z = ha7Var.b;
        }
        ha7Var.getClass();
        return new ha7(aa7Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha7)) {
            return false;
        }
        ha7 ha7Var = (ha7) obj;
        return Intrinsics.c(this.a, ha7Var.a) && this.b == ha7Var.b;
    }

    public final int hashCode() {
        aa7 aa7Var = this.a;
        return Boolean.hashCode(this.b) + ((aa7Var == null ? 0 : aa7Var.hashCode()) * 31);
    }

    public final String toString() {
        return "FantasyOnboardingJoinLeagueState(bottomSheetType=" + this.a + ", showLoadingDialog=" + this.b + ")";
    }
}
