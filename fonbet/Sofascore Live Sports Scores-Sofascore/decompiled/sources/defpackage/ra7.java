package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ra7 {
    public final uj7 a;
    public final ev6 b;
    public final String c;
    public final boolean d;
    public final gv9 e;
    public final rn6 f;
    public final boolean g;
    public final boolean h;

    public ra7(uj7 uj7Var, ev6 ev6Var, String str, boolean z, gv9 gv9Var, rn6 rn6Var, boolean z2, boolean z3) {
        str.getClass();
        gv9Var.getClass();
        this.a = uj7Var;
        this.b = ev6Var;
        this.c = str;
        this.d = z;
        this.e = gv9Var;
        this.f = rn6Var;
        this.g = z2;
        this.h = z3;
    }

    public static ra7 a(ra7 ra7Var, uj7 uj7Var, ev6 ev6Var, String str, boolean z, gv9 gv9Var, rn6 rn6Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            uj7Var = ra7Var.a;
        }
        uj7 uj7Var2 = uj7Var;
        if ((i & 2) != 0) {
            ev6Var = ra7Var.b;
        }
        ev6 ev6Var2 = ev6Var;
        if ((i & 4) != 0) {
            str = ra7Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = ra7Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            gv9Var = ra7Var.e;
        }
        gv9 gv9Var2 = gv9Var;
        if ((i & 32) != 0) {
            rn6Var = ra7Var.f;
        }
        rn6 rn6Var2 = rn6Var;
        boolean z5 = (i & 64) != 0 ? ra7Var.g : z2;
        boolean z6 = (i & 128) != 0 ? ra7Var.h : z3;
        ra7Var.getClass();
        uj7Var2.getClass();
        str2.getClass();
        gv9Var2.getClass();
        return new ra7(uj7Var2, ev6Var2, str2, z4, gv9Var2, rn6Var2, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra7)) {
            return false;
        }
        ra7 ra7Var = (ra7) obj;
        return this.a == ra7Var.a && Intrinsics.c(this.b, ra7Var.b) && Intrinsics.c(this.c, ra7Var.c) && this.d == ra7Var.d && Intrinsics.c(this.e, ra7Var.e) && Intrinsics.c(this.f, ra7Var.f) && this.g == ra7Var.g && this.h == ra7Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ev6 ev6Var = this.b;
        int d = ljg.d(dmi.e(dmi.c((hashCode + (ev6Var == null ? 0 : ev6Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        rn6 rn6Var = this.f;
        return Boolean.hashCode(this.h) + dmi.e((d + (rn6Var != null ? rn6Var.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyOnboardingNameTeamState(status=");
        sb.append(this.a);
        sb.append(", competition=");
        sb.append(this.b);
        sb.append(", teamName=");
        dmi.w(sb, this.c, ", isTeamNameValid=", this.d, ", ageGroups=");
        sb.append(this.e);
        sb.append(", selectedAgeGroup=");
        sb.append(this.f);
        sb.append(", brandTermsAndConditionsAccepted=");
        return w1l.i(", canConfirmSquad=", ")", sb, this.g, this.h);
    }

    public ra7(String str, int i) {
        this(uj7.a, null, (i & 4) != 0 ? "" : str, false, rlh.b, null, false, false);
    }
}
