package defpackage;

import com.sofascore.model.TeamSelection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fv5 {
    public final TeamSelection a;
    public final gv9 b;
    public final boolean c;
    public final String d;
    public final gv9 e;
    public final wkc f;
    public final r9k g;

    public fv5(TeamSelection teamSelection, gv9 gv9Var, boolean z, String str, gv9 gv9Var2, wkc wkcVar, r9k r9kVar) {
        teamSelection.getClass();
        gv9Var.getClass();
        str.getClass();
        gv9Var2.getClass();
        this.a = teamSelection;
        this.b = gv9Var;
        this.c = z;
        this.d = str;
        this.e = gv9Var2;
        this.f = wkcVar;
        this.g = r9kVar;
    }

    public static fv5 a(fv5 fv5Var, TeamSelection teamSelection, boolean z, gv9 gv9Var, wkc wkcVar, r9k r9kVar, int i) {
        if ((i & 1) != 0) {
            teamSelection = fv5Var.a;
        }
        TeamSelection teamSelection2 = teamSelection;
        gv9 gv9Var2 = fv5Var.b;
        if ((i & 4) != 0) {
            z = fv5Var.c;
        }
        boolean z2 = z;
        String str = fv5Var.d;
        if ((i & 32) != 0) {
            wkcVar = fv5Var.f;
        }
        wkc wkcVar2 = wkcVar;
        if ((i & 64) != 0) {
            r9kVar = fv5Var.g;
        }
        teamSelection2.getClass();
        gv9Var2.getClass();
        str.getClass();
        gv9Var.getClass();
        return new fv5(teamSelection2, gv9Var2, z2, str, gv9Var, wkcVar2, r9kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv5)) {
            return false;
        }
        fv5 fv5Var = (fv5) obj;
        return this.a == fv5Var.a && Intrinsics.c(this.b, fv5Var.b) && this.c == fv5Var.c && Intrinsics.c(this.d, fv5Var.d) && Intrinsics.c(this.e, fv5Var.e) && Intrinsics.c(this.f, fv5Var.f) && Intrinsics.c(this.g, fv5Var.g);
    }

    public final int hashCode() {
        int d = ljg.d(dmi.c(dmi.e(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        wkc wkcVar = this.f;
        int hashCode = (d + (wkcVar == null ? 0 : wkcVar.hashCode())) * 31;
        r9k r9kVar = this.g;
        return hashCode + (r9kVar != null ? r9kVar.hashCode() : 0);
    }

    public final String toString() {
        return "EventBoxScoreState(selectedTeam=" + this.a + ", teamSegmentedButtons=" + this.b + ", hasRating=" + this.c + ", sport=" + this.d + ", sections=" + this.e + ", missingPlayers=" + this.f + ", ratingInfoText=" + this.g + ")";
    }
}
