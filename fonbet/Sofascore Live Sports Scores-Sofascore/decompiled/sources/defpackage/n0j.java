package defpackage;

import com.sofascore.model.network.response.TeamAverageRatingVersion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n0j {
    public final List a;
    public final Double b;
    public final Integer c;
    public final TeamAverageRatingVersion d;

    public n0j(List list, Double d, Integer num, TeamAverageRatingVersion teamAverageRatingVersion, int i) {
        d = (i & 2) != 0 ? null : d;
        num = (i & 4) != 0 ? null : num;
        teamAverageRatingVersion = (i & 8) != 0 ? TeamAverageRatingVersion.ORIGINAL : teamAverageRatingVersion;
        list.getClass();
        teamAverageRatingVersion.getClass();
        this.a = list;
        this.b = d;
        this.c = num;
        this.d = teamAverageRatingVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0j)) {
            return false;
        }
        n0j n0jVar = (n0j) obj;
        return Intrinsics.c(this.a, n0jVar.a) && Intrinsics.c(this.b, n0jVar.b) && Intrinsics.c(this.c, n0jVar.c) && this.d == n0jVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        return this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TeamSeasonStatisticsDataWrapper(statistics=" + this.a + ", rating=" + this.b + ", teamCount=" + this.c + ", ratingVersion=" + this.d + ")";
    }
}
