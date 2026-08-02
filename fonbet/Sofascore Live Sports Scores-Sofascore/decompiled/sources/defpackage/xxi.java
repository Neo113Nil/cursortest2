package defpackage;

import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xxi {
    public final String a;
    public final int b;
    public final gv9 c;
    public final TournamentRoundWrapper d;
    public final String e;
    public final String f;
    public final String g;
    public final TeamOfTheWeekFieldUIData h;
    public final boolean i;
    public final boolean j;
    public final nn6 k;
    public final boolean l;
    public final gv9 m;

    public xxi(String str, int i, gv9 gv9Var, TournamentRoundWrapper tournamentRoundWrapper, String str2, String str3, String str4, TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData, boolean z, boolean z2, nn6 nn6Var, boolean z3, gv9 gv9Var2) {
        str.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = str;
        this.b = i;
        this.c = gv9Var;
        this.d = tournamentRoundWrapper;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = teamOfTheWeekFieldUIData;
        this.i = z;
        this.j = z2;
        this.k = nn6Var;
        this.l = z3;
        this.m = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxi)) {
            return false;
        }
        xxi xxiVar = (xxi) obj;
        return Intrinsics.c(this.a, xxiVar.a) && this.b == xxiVar.b && Intrinsics.c(this.c, xxiVar.c) && Intrinsics.c(this.d, xxiVar.d) && this.e.equals(xxiVar.e) && Intrinsics.c(this.f, xxiVar.f) && this.g.equals(xxiVar.g) && Intrinsics.c(this.h, xxiVar.h) && this.i == xxiVar.i && this.j == xxiVar.j && Intrinsics.c(this.k, xxiVar.k) && this.l == xxiVar.l && Intrinsics.c(this.m, xxiVar.m);
    }

    public final int hashCode() {
        int d = ljg.d(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        TournamentRoundWrapper tournamentRoundWrapper = this.d;
        int c = dmi.c((d + (tournamentRoundWrapper == null ? 0 : tournamentRoundWrapper.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int c2 = dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData = this.h;
        int e = dmi.e(dmi.e((c2 + (teamOfTheWeekFieldUIData == null ? 0 : teamOfTheWeekFieldUIData.hashCode())) * 31, 31, this.i), 31, this.j);
        nn6 nn6Var = this.k;
        return this.m.hashCode() + dmi.e((e + (nn6Var != null ? nn6Var.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "TeamOfTheRoundUiState(sport=", this.a, ", uniqueTournamentId=", ", roundItems=");
        q.append(this.c);
        q.append(", selectedRound=");
        q.append(this.d);
        q.append(", title=");
        bf3.v(q, this.e, ", subtitle=", this.f, ", publishedText=");
        q.append(this.g);
        q.append(", fieldData=");
        q.append(this.h);
        q.append(", showShareButton=");
        vxd.t(", showDiscussion=", ", fakeMessage=", q, this.i, this.j);
        q.append(this.k);
        q.append(", isLoading=");
        q.append(this.l);
        q.append(", pesmPlayers=");
        q.append(this.m);
        q.append(")");
        return q.toString();
    }
}
