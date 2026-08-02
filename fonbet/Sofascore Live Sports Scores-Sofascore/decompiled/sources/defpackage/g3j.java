package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g3j implements qnj {
    public final gv9 a;
    public final String b;
    public final gv9 c;
    public final gv9 d;
    public final SeasonSpinnerData e;
    public final UniqueTournamentSeasonsSpinnerData f;
    public final gv9 g;
    public final c3j h;
    public final gv9 i;
    public final gv9 j;
    public final pnj k;
    public final String l;

    public g3j(gv9 gv9Var, String str, gv9 gv9Var2, gv9 gv9Var3, SeasonSpinnerData seasonSpinnerData, UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData, gv9 gv9Var4, c3j c3jVar, gv9 gv9Var5, gv9 gv9Var6, pnj pnjVar) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        this.a = gv9Var;
        this.b = str;
        this.c = gv9Var2;
        this.d = gv9Var3;
        this.e = seasonSpinnerData;
        this.f = uniqueTournamentSeasonsSpinnerData;
        this.g = gv9Var4;
        this.h = c3jVar;
        this.i = gv9Var5;
        this.j = gv9Var6;
        this.k = pnjVar;
        this.l = str;
    }

    public static g3j d(g3j g3jVar, String str, gv9 gv9Var, c3j c3jVar, gv9 gv9Var2, pnj pnjVar, int i) {
        gv9 gv9Var3 = g3jVar.a;
        if ((i & 2) != 0) {
            str = g3jVar.b;
        }
        String str2 = str;
        gv9 gv9Var4 = g3jVar.c;
        gv9 gv9Var5 = g3jVar.d;
        SeasonSpinnerData seasonSpinnerData = g3jVar.e;
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = g3jVar.f;
        if ((i & 64) != 0) {
            gv9Var = g3jVar.g;
        }
        gv9 gv9Var6 = gv9Var;
        c3j c3jVar2 = (i & 128) != 0 ? g3jVar.h : c3jVar;
        gv9 gv9Var7 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? g3jVar.i : gv9Var2;
        gv9 gv9Var8 = g3jVar.j;
        pnj pnjVar2 = (i & 1024) != 0 ? g3jVar.k : pnjVar;
        g3jVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        gv9Var7.getClass();
        gv9Var8.getClass();
        return new g3j(gv9Var3, str2, gv9Var4, gv9Var5, seasonSpinnerData, uniqueTournamentSeasonsSpinnerData, gv9Var6, c3jVar2, gv9Var7, gv9Var8, pnjVar2);
    }

    @Override // defpackage.qnj
    public final String a() {
        return this.l;
    }

    @Override // defpackage.qnj
    public final lnj b() {
        return null;
    }

    @Override // defpackage.qnj
    public final pnj c() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3j)) {
            return false;
        }
        g3j g3jVar = (g3j) obj;
        return Intrinsics.c(this.a, g3jVar.a) && Intrinsics.c(this.b, g3jVar.b) && Intrinsics.c(this.c, g3jVar.c) && Intrinsics.c(this.d, g3jVar.d) && Intrinsics.c(this.e, g3jVar.e) && Intrinsics.c(this.f, g3jVar.f) && Intrinsics.c(this.g, g3jVar.g) && Intrinsics.c(this.h, g3jVar.h) && Intrinsics.c(this.i, g3jVar.i) && Intrinsics.c(this.j, g3jVar.j) && Intrinsics.c(this.k, g3jVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int d = ljg.d(ljg.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        SeasonSpinnerData seasonSpinnerData = this.e;
        int hashCode2 = (d + (seasonSpinnerData == null ? 0 : seasonSpinnerData.hashCode())) * 31;
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = this.f;
        int d2 = ljg.d((hashCode2 + (uniqueTournamentSeasonsSpinnerData == null ? 0 : uniqueTournamentSeasonsSpinnerData.hashCode())) * 31, 31, this.g);
        c3j c3jVar = this.h;
        int d3 = ljg.d(ljg.d((d2 + (c3jVar == null ? 0 : c3jVar.hashCode())) * 31, 31, this.i), 31, this.j);
        pnj pnjVar = this.k;
        return d3 + (pnjVar != null ? pnjVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamTopPlayersHeaders(subSeasonTypes=");
        sb.append(this.a);
        sb.append(", subSeasonType=");
        sb.append(this.b);
        sb.append(", seasonSpinnerItems=");
        vxd.u(sb, this.c, ", tournamentSpinnerItems=", this.d, ", selectedSeason=");
        sb.append(this.e);
        sb.append(", selectedTournament=");
        sb.append(this.f);
        sb.append(", percentageFilterItems=");
        sb.append(this.g);
        sb.append(", selectedPercentageFilter=");
        sb.append(this.h);
        sb.append(", quickFindItems=");
        vxd.u(sb, this.i, ", additionalFilterItems=", this.j, ", selectedSpinnerFilter=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
