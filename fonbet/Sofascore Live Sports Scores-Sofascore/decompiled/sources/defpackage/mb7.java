package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mb7 {
    public final uj7 a;
    public final gv9 b;
    public final gv9 c;
    public final boolean d;
    public final boolean e;
    public final FantasyCompetitionType f;

    public mb7(uj7 uj7Var, gv9 gv9Var, gv9 gv9Var2, boolean z, boolean z2, FantasyCompetitionType fantasyCompetitionType) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = uj7Var;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = z;
        this.e = z2;
        this.f = fantasyCompetitionType;
    }

    public static mb7 a(mb7 mb7Var, uj7 uj7Var, gv9 gv9Var, gv9 gv9Var2, boolean z, boolean z2, FantasyCompetitionType fantasyCompetitionType, int i) {
        if ((i & 1) != 0) {
            uj7Var = mb7Var.a;
        }
        uj7 uj7Var2 = uj7Var;
        if ((i & 2) != 0) {
            gv9Var = mb7Var.b;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 4) != 0) {
            gv9Var2 = mb7Var.c;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 8) != 0) {
            z = mb7Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = mb7Var.e;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            fantasyCompetitionType = mb7Var.f;
        }
        mb7Var.getClass();
        uj7Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        return new mb7(uj7Var2, gv9Var3, gv9Var4, z3, z4, fantasyCompetitionType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb7)) {
            return false;
        }
        mb7 mb7Var = (mb7) obj;
        return this.a == mb7Var.a && Intrinsics.c(this.b, mb7Var.b) && Intrinsics.c(this.c, mb7Var.c) && this.d == mb7Var.d && this.e == mb7Var.e && this.f == mb7Var.f;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        FantasyCompetitionType fantasyCompetitionType = this.f;
        return e + (fantasyCompetitionType == null ? 0 : fantasyCompetitionType.hashCode());
    }

    public final String toString() {
        return "FantasyOnboardingSelectCompetitionState(status=" + this.a + ", seasonCompetitions=" + this.b + ", weeklyCompetitions=" + this.c + ", showCompetitionUnavailableDialog=" + this.d + ", showCompetitionTypeBottomSheet=" + this.e + ", visibleCompetitionTypeBottomSheet=" + this.f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb7() {
        this(r1, r2, r2, false, false, null);
        uj7 uj7Var = uj7.a;
        rlh rlhVar = rlh.b;
    }
}
