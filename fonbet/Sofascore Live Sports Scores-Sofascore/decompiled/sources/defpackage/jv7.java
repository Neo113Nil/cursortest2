package defpackage;

import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jv7 {
    public final UniqueTournamentDetails a;
    public final List b;
    public final PlayerOfTheSeasonResponse c;
    public final TopPerformanceResponse d;
    public final List e;
    public final CupTreesResponse f;

    public jv7(UniqueTournamentDetails uniqueTournamentDetails, List list, PlayerOfTheSeasonResponse playerOfTheSeasonResponse, TopPerformanceResponse topPerformanceResponse, List list2, CupTreesResponse cupTreesResponse) {
        this.a = uniqueTournamentDetails;
        this.b = list;
        this.c = playerOfTheSeasonResponse;
        this.d = topPerformanceResponse;
        this.e = list2;
        this.f = cupTreesResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv7)) {
            return false;
        }
        jv7 jv7Var = (jv7) obj;
        return Intrinsics.c(this.a, jv7Var.a) && Intrinsics.c(this.b, jv7Var.b) && Intrinsics.c(this.c, jv7Var.c) && Intrinsics.c(this.d, jv7Var.d) && Intrinsics.c(this.e, jv7Var.e) && Intrinsics.c(this.f, jv7Var.f);
    }

    public final int hashCode() {
        UniqueTournamentDetails uniqueTournamentDetails = this.a;
        int hashCode = (uniqueTournamentDetails == null ? 0 : uniqueTournamentDetails.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = this.c;
        int hashCode3 = (hashCode2 + (playerOfTheSeasonResponse == null ? 0 : playerOfTheSeasonResponse.hashCode())) * 31;
        TopPerformanceResponse topPerformanceResponse = this.d;
        int hashCode4 = (hashCode3 + (topPerformanceResponse == null ? 0 : topPerformanceResponse.hashCode())) * 31;
        List list2 = this.e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CupTreesResponse cupTreesResponse = this.f;
        return hashCode5 + (cupTreesResponse != null ? cupTreesResponse.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturedTournamentData(uniqueTournamentDetails=" + this.a + ", groups=" + this.b + ", playerOfTheTournament=" + this.c + ", playerOfTheTournamentRace=" + this.d + ", rounds=" + this.e + ", cupTreesResponse=" + this.f + ")";
    }
}
