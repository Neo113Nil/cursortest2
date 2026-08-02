package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.UniqueTournamentRecapTopPerformancesResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eva {
    public final UniqueTournamentDetails a;
    public final v2f b;
    public final PlayerOfTheSeasonResponse c;
    public final TopPerformanceResponse d;
    public final List e;
    public final List f;
    public final String g;
    public final List h;
    public final List i;
    public final SeasonInfo j;
    public final bu7 k;
    public final List l;
    public final List m;
    public final UniqueTournamentRecapTopPerformancesResponse n;
    public final gv9 o;
    public final exa p;

    public eva(UniqueTournamentDetails uniqueTournamentDetails, v2f v2fVar, PlayerOfTheSeasonResponse playerOfTheSeasonResponse, TopPerformanceResponse topPerformanceResponse, List list, List list2, String str, List list3, List list4, SeasonInfo seasonInfo, bu7 bu7Var, List list5, List list6, UniqueTournamentRecapTopPerformancesResponse uniqueTournamentRecapTopPerformancesResponse, gv9 gv9Var, exa exaVar) {
        gv9Var.getClass();
        this.a = uniqueTournamentDetails;
        this.b = v2fVar;
        this.c = playerOfTheSeasonResponse;
        this.d = topPerformanceResponse;
        this.e = list;
        this.f = list2;
        this.g = str;
        this.h = list3;
        this.i = list4;
        this.j = seasonInfo;
        this.k = bu7Var;
        this.l = list5;
        this.m = list6;
        this.n = uniqueTournamentRecapTopPerformancesResponse;
        this.o = gv9Var;
        this.p = exaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eva)) {
            return false;
        }
        eva evaVar = (eva) obj;
        return Intrinsics.c(this.a, evaVar.a) && Intrinsics.c(this.b, evaVar.b) && Intrinsics.c(this.c, evaVar.c) && Intrinsics.c(this.d, evaVar.d) && Intrinsics.c(this.e, evaVar.e) && Intrinsics.c(this.f, evaVar.f) && Intrinsics.c(this.g, evaVar.g) && Intrinsics.c(this.h, evaVar.h) && Intrinsics.c(this.i, evaVar.i) && Intrinsics.c(this.j, evaVar.j) && Intrinsics.c(this.k, evaVar.k) && Intrinsics.c(this.l, evaVar.l) && Intrinsics.c(this.m, evaVar.m) && Intrinsics.c(this.n, evaVar.n) && Intrinsics.c(this.o, evaVar.o) && Intrinsics.c(this.p, evaVar.p);
    }

    public final int hashCode() {
        UniqueTournamentDetails uniqueTournamentDetails = this.a;
        int hashCode = (uniqueTournamentDetails == null ? 0 : uniqueTournamentDetails.hashCode()) * 31;
        v2f v2fVar = this.b;
        int hashCode2 = (hashCode + (v2fVar == null ? 0 : v2fVar.hashCode())) * 31;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = this.c;
        int hashCode3 = (hashCode2 + (playerOfTheSeasonResponse == null ? 0 : playerOfTheSeasonResponse.hashCode())) * 31;
        TopPerformanceResponse topPerformanceResponse = this.d;
        int hashCode4 = (hashCode3 + (topPerformanceResponse == null ? 0 : topPerformanceResponse.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List list3 = this.h;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.i;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        SeasonInfo seasonInfo = this.j;
        int hashCode10 = (hashCode9 + (seasonInfo == null ? 0 : seasonInfo.hashCode())) * 31;
        bu7 bu7Var = this.k;
        int hashCode11 = (hashCode10 + (bu7Var == null ? 0 : bu7Var.hashCode())) * 31;
        List list5 = this.l;
        int hashCode12 = (hashCode11 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.m;
        int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
        UniqueTournamentRecapTopPerformancesResponse uniqueTournamentRecapTopPerformancesResponse = this.n;
        int d = ljg.d((hashCode13 + (uniqueTournamentRecapTopPerformancesResponse == null ? 0 : uniqueTournamentRecapTopPerformancesResponse.hashCode())) * 31, 31, this.o);
        exa exaVar = this.p;
        return d + (exaVar != null ? exaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeagueDetailsDataWrapper(uniqueTournamentDetails=");
        sb.append(this.a);
        sb.append(", powerRankingsCompact=");
        sb.append(this.b);
        sb.append(", playerOfTheSeason=");
        sb.append(this.c);
        sb.append(", playerOfTheSeasonRace=");
        sb.append(this.d);
        sb.append(", leagueEditors=");
        vxd.w(sb, this.e, ", leagueOrganizations=", this.f, ", lastHistoricalSeasonYear=");
        sb.append(this.g);
        sb.append(", media=");
        sb.append(this.h);
        sb.append(", rounds=");
        sb.append(this.i);
        sb.append(", seasonInfo=");
        sb.append(this.j);
        sb.append(", featuredEvent=");
        sb.append(this.k);
        sb.append(", previousWinners=");
        sb.append(this.l);
        sb.append(", offersBanner=");
        sb.append(this.m);
        sb.append(", recapTopPerformances=");
        sb.append(this.n);
        sb.append(", playerUpdates=");
        sb.append(this.o);
        sb.append(", goatPlayers=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
