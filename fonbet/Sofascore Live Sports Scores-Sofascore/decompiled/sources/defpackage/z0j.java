package defpackage;

import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z0j {
    public final TeamSeasonStatisticsResponse a;
    public final boolean b;

    public z0j(TeamSeasonStatisticsResponse teamSeasonStatisticsResponse, boolean z) {
        this.a = teamSeasonStatisticsResponse;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0j)) {
            return false;
        }
        z0j z0jVar = (z0j) obj;
        return Intrinsics.c(this.a, z0jVar.a) && this.b == z0jVar.b;
    }

    public final int hashCode() {
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse = this.a;
        return Boolean.hashCode(this.b) + ((teamSeasonStatisticsResponse == null ? 0 : teamSeasonStatisticsResponse.hashCode()) * 31);
    }

    public final String toString() {
        return "TeamSeasonStatisticsWrapper(response=" + this.a + ", shouldShowSubSeasonLabel=" + this.b + ")";
    }
}
