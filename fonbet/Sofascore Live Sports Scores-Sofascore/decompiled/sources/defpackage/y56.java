package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y56 {
    public final Event a;
    public final TopPerformanceStatistics b;
    public final TopPerformanceStatistics c;
    public final LineupsResponse d;

    public y56(Event event, TopPerformanceStatistics topPerformanceStatistics, TopPerformanceStatistics topPerformanceStatistics2, LineupsResponse lineupsResponse) {
        this.a = event;
        this.b = topPerformanceStatistics;
        this.c = topPerformanceStatistics2;
        this.d = lineupsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y56)) {
            return false;
        }
        y56 y56Var = (y56) obj;
        return this.a.equals(y56Var.a) && Intrinsics.c(this.b, y56Var.b) && Intrinsics.c(this.c, y56Var.c) && Intrinsics.c(this.d, y56Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TopPerformanceStatistics topPerformanceStatistics = this.b;
        int hashCode2 = (hashCode + (topPerformanceStatistics == null ? 0 : topPerformanceStatistics.hashCode())) * 31;
        TopPerformanceStatistics topPerformanceStatistics2 = this.c;
        int hashCode3 = (hashCode2 + (topPerformanceStatistics2 == null ? 0 : topPerformanceStatistics2.hashCode())) * 31;
        LineupsResponse lineupsResponse = this.d;
        return hashCode3 + (lineupsResponse != null ? lineupsResponse.hashCode() : 0);
    }

    public final String toString() {
        return "TopPlayersDataWrapper(event=" + this.a + ", firstTeamTopPlayers=" + this.b + ", secondTeamTopPlayers=" + this.c + ", lineupsResponse=" + this.d + ")";
    }
}
