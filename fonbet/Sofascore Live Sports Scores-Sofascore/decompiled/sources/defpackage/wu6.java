package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wu6 {
    public final int a;
    public final boolean b;
    public final gv9 c;
    public final gv9 d;

    public wu6(int i, gv9 gv9Var, gv9 gv9Var2, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = z;
        this.c = gv9Var;
        this.d = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu6)) {
            return false;
        }
        wu6 wu6Var = (wu6) obj;
        return this.a == wu6Var.a && this.b == wu6Var.b && Intrinsics.c(this.c, wu6Var.c) && Intrinsics.c(this.d, wu6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ljg.d(dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "FantasyCompetitionSelectorState(currentCompetitionId=" + this.a + ", isLoading=" + this.b + ", allCompetitions=" + this.c + ", userCompetitions=" + this.d + ")";
    }
}
