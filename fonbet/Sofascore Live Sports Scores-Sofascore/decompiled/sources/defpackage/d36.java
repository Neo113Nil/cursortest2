package defpackage;

import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.Head2HeadResponse;
import com.sofascore.model.network.response.TeamStreaksResponse;
import com.sofascore.model.network.response.WinningOddsResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d36 implements Serializable {
    public final TeamStreaksResponse a;
    public final Head2HeadResponse b;
    public final EventManagersResponse c;
    public final WinningOddsResponse d;
    public final GoalDistributionsResponse e;
    public final GoalDistributionsResponse f;
    public final List g;
    public final List h;
    public final List i;

    public d36(TeamStreaksResponse teamStreaksResponse, Head2HeadResponse head2HeadResponse, EventManagersResponse eventManagersResponse, WinningOddsResponse winningOddsResponse, GoalDistributionsResponse goalDistributionsResponse, GoalDistributionsResponse goalDistributionsResponse2, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = teamStreaksResponse;
        this.b = head2HeadResponse;
        this.c = eventManagersResponse;
        this.d = winningOddsResponse;
        this.e = goalDistributionsResponse;
        this.f = goalDistributionsResponse2;
        this.g = list;
        this.h = list2;
        this.i = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d36)) {
            return false;
        }
        d36 d36Var = (d36) obj;
        return Intrinsics.c(this.a, d36Var.a) && Intrinsics.c(this.b, d36Var.b) && Intrinsics.c(this.c, d36Var.c) && Intrinsics.c(this.d, d36Var.d) && Intrinsics.c(this.e, d36Var.e) && Intrinsics.c(this.f, d36Var.f) && Intrinsics.c(this.g, d36Var.g) && Intrinsics.c(this.h, d36Var.h) && Intrinsics.c(this.i, d36Var.i);
    }

    public final int hashCode() {
        TeamStreaksResponse teamStreaksResponse = this.a;
        int hashCode = (teamStreaksResponse == null ? 0 : teamStreaksResponse.hashCode()) * 31;
        Head2HeadResponse head2HeadResponse = this.b;
        int hashCode2 = (hashCode + (head2HeadResponse == null ? 0 : head2HeadResponse.hashCode())) * 31;
        EventManagersResponse eventManagersResponse = this.c;
        int hashCode3 = (hashCode2 + (eventManagersResponse == null ? 0 : eventManagersResponse.hashCode())) * 31;
        WinningOddsResponse winningOddsResponse = this.d;
        int hashCode4 = (hashCode3 + (winningOddsResponse == null ? 0 : winningOddsResponse.hashCode())) * 31;
        GoalDistributionsResponse goalDistributionsResponse = this.e;
        int hashCode5 = (hashCode4 + (goalDistributionsResponse == null ? 0 : goalDistributionsResponse.hashCode())) * 31;
        GoalDistributionsResponse goalDistributionsResponse2 = this.f;
        return this.i.hashCode() + dmi.d(dmi.d((hashCode5 + (goalDistributionsResponse2 != null ? goalDistributionsResponse2.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMatchesFragmentWrapper(teamStreaks=");
        sb.append(this.a);
        sb.append(", head2Head=");
        sb.append(this.b);
        sb.append(", managers=");
        sb.append(this.c);
        sb.append(", winningOdds=");
        sb.append(this.d);
        sb.append(", goalDistributionHome=");
        sb.append(this.e);
        sb.append(", goalDistributionAway=");
        sb.append(this.f);
        sb.append(", firstTeamMatches=");
        vxd.w(sb, this.g, ", secondTeamMatches=", this.h, ", head2HeadMatches=");
        return mz1.p(sb, this.i, ")");
    }
}
