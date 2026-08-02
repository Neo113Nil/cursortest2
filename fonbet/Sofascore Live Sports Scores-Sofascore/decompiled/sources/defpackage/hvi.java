package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.RecentTeamTournamentsResponse;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hvi {
    public final Event a;
    public final TeamUniqueTournamentsResponse b;
    public final List c;
    public final RecentTeamTournamentsResponse d;
    public final TeamTransfersResponse e;
    public final gv9 f;
    public final TeamAchievementsResponse g;
    public final y5j h;
    public final List i;

    public hvi(Event event, TeamUniqueTournamentsResponse teamUniqueTournamentsResponse, List list, RecentTeamTournamentsResponse recentTeamTournamentsResponse, TeamTransfersResponse teamTransfersResponse, gv9 gv9Var, TeamAchievementsResponse teamAchievementsResponse, y5j y5jVar, List list2) {
        this.a = event;
        this.b = teamUniqueTournamentsResponse;
        this.c = list;
        this.d = recentTeamTournamentsResponse;
        this.e = teamTransfersResponse;
        this.f = gv9Var;
        this.g = teamAchievementsResponse;
        this.h = y5jVar;
        this.i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvi)) {
            return false;
        }
        hvi hviVar = (hvi) obj;
        return Intrinsics.c(this.a, hviVar.a) && Intrinsics.c(this.b, hviVar.b) && Intrinsics.c(this.c, hviVar.c) && Intrinsics.c(this.d, hviVar.d) && Intrinsics.c(this.e, hviVar.e) && Intrinsics.c(this.f, hviVar.f) && Intrinsics.c(this.g, hviVar.g) && Intrinsics.c(this.h, hviVar.h) && Intrinsics.c(this.i, hviVar.i);
    }

    public final int hashCode() {
        Event event = this.a;
        int hashCode = (event == null ? 0 : event.hashCode()) * 31;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse = this.b;
        int hashCode2 = (hashCode + (teamUniqueTournamentsResponse == null ? 0 : teamUniqueTournamentsResponse.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse = this.d;
        int hashCode4 = (hashCode3 + (recentTeamTournamentsResponse == null ? 0 : recentTeamTournamentsResponse.hashCode())) * 31;
        TeamTransfersResponse teamTransfersResponse = this.e;
        int hashCode5 = (hashCode4 + (teamTransfersResponse == null ? 0 : teamTransfersResponse.hashCode())) * 31;
        gv9 gv9Var = this.f;
        int hashCode6 = (hashCode5 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        TeamAchievementsResponse teamAchievementsResponse = this.g;
        int hashCode7 = (hashCode6 + (teamAchievementsResponse == null ? 0 : teamAchievementsResponse.hashCode())) * 31;
        y5j y5jVar = this.h;
        int hashCode8 = (hashCode7 + (y5jVar == null ? 0 : y5jVar.hashCode())) * 31;
        List list2 = this.i;
        return hashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsData(featuredEvent=");
        sb.append(this.a);
        sb.append(", tournaments=");
        sb.append(this.b);
        sb.append(", rankings=");
        sb.append(this.c);
        sb.append(", recentTournaments=");
        sb.append(this.d);
        sb.append(", transfers=");
        sb.append(this.e);
        sb.append(", recentForm=");
        sb.append(this.f);
        sb.append(", achievements=");
        sb.append(this.g);
        sb.append(", grandSlamPerformanceUIModel=");
        sb.append(this.h);
        sb.append(", offersBanner=");
        return mz1.p(sb, this.i, ")");
    }
}
