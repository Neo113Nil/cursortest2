package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ppe implements Serializable {
    public final PlayerEventStatisticsResponse a;
    public final PlayerEventStatisticsResponse b;
    public final PlayerHeatmapResponse c;
    public final PlayerHeatmapResponse d;
    public final PlayerShotmapResponse e;
    public final FootballShotmapResponse f;
    public final FootballShotmapResponse g;
    public final List h;
    public final Incident.SubstitutionIncident i;
    public final Incident.SubstitutionIncident j;

    public ppe(PlayerEventStatisticsResponse playerEventStatisticsResponse, PlayerEventStatisticsResponse playerEventStatisticsResponse2, PlayerHeatmapResponse playerHeatmapResponse, PlayerHeatmapResponse playerHeatmapResponse2, PlayerShotmapResponse playerShotmapResponse, FootballShotmapResponse footballShotmapResponse, FootballShotmapResponse footballShotmapResponse2, List list, Incident.SubstitutionIncident substitutionIncident, Incident.SubstitutionIncident substitutionIncident2) {
        this.a = playerEventStatisticsResponse;
        this.b = playerEventStatisticsResponse2;
        this.c = playerHeatmapResponse;
        this.d = playerHeatmapResponse2;
        this.e = playerShotmapResponse;
        this.f = footballShotmapResponse;
        this.g = footballShotmapResponse2;
        this.h = list;
        this.i = substitutionIncident;
        this.j = substitutionIncident2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe)) {
            return false;
        }
        ppe ppeVar = (ppe) obj;
        return Intrinsics.c(this.a, ppeVar.a) && Intrinsics.c(this.b, ppeVar.b) && Intrinsics.c(this.c, ppeVar.c) && Intrinsics.c(this.d, ppeVar.d) && Intrinsics.c(this.e, ppeVar.e) && Intrinsics.c(this.f, ppeVar.f) && Intrinsics.c(this.g, ppeVar.g) && Intrinsics.c(this.h, ppeVar.h) && Intrinsics.c(this.i, ppeVar.i) && Intrinsics.c(this.j, ppeVar.j);
    }

    public final int hashCode() {
        PlayerEventStatisticsResponse playerEventStatisticsResponse = this.a;
        int hashCode = (playerEventStatisticsResponse == null ? 0 : playerEventStatisticsResponse.hashCode()) * 31;
        PlayerEventStatisticsResponse playerEventStatisticsResponse2 = this.b;
        int hashCode2 = (hashCode + (playerEventStatisticsResponse2 == null ? 0 : playerEventStatisticsResponse2.hashCode())) * 31;
        PlayerHeatmapResponse playerHeatmapResponse = this.c;
        int hashCode3 = (hashCode2 + (playerHeatmapResponse == null ? 0 : playerHeatmapResponse.hashCode())) * 31;
        PlayerHeatmapResponse playerHeatmapResponse2 = this.d;
        int hashCode4 = (hashCode3 + (playerHeatmapResponse2 == null ? 0 : playerHeatmapResponse2.hashCode())) * 31;
        PlayerShotmapResponse playerShotmapResponse = this.e;
        int hashCode5 = (hashCode4 + (playerShotmapResponse == null ? 0 : playerShotmapResponse.hashCode())) * 31;
        FootballShotmapResponse footballShotmapResponse = this.f;
        int hashCode6 = (hashCode5 + (footballShotmapResponse == null ? 0 : footballShotmapResponse.hashCode())) * 31;
        FootballShotmapResponse footballShotmapResponse2 = this.g;
        int hashCode7 = (hashCode6 + (footballShotmapResponse2 == null ? 0 : footballShotmapResponse2.hashCode())) * 31;
        List list = this.h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Incident.SubstitutionIncident substitutionIncident = this.i;
        int hashCode9 = (hashCode8 + (substitutionIncident == null ? 0 : substitutionIncident.hashCode())) * 31;
        Incident.SubstitutionIncident substitutionIncident2 = this.j;
        return hashCode9 + (substitutionIncident2 != null ? substitutionIncident2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerEventStatisticsWrapper(statistics=" + this.a + ", secondPlayerStatistics=" + this.b + ", heatmapResponse=" + this.c + ", secondPlayerHeatmapResponse=" + this.d + ", basketballShotmapResponse=" + this.e + ", footballShotmapResponse=" + this.f + ", footballGoalkeeperShotmapResponse=" + this.g + ", hockeyShotmap=" + this.h + ", substitutedOnIncident=" + this.i + ", substitutedOffIncident=" + this.j + ")";
    }
}
