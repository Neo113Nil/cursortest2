package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class owe {
    public final wyg a;
    public final ryg b;
    public final syg c;
    public final dzg d;
    public final Team e;
    public final PlayerPenaltyHistoryResponse f;
    public final Map g;
    public final boolean h;

    public owe(wyg wygVar, ryg rygVar, syg sygVar, dzg dzgVar, Team team, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, Map map, boolean z) {
        this.a = wygVar;
        this.b = rygVar;
        this.c = sygVar;
        this.d = dzgVar;
        this.e = team;
        this.f = playerPenaltyHistoryResponse;
        this.g = map;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owe)) {
            return false;
        }
        owe oweVar = (owe) obj;
        return Intrinsics.c(this.a, oweVar.a) && Intrinsics.c(this.b, oweVar.b) && Intrinsics.c(this.c, oweVar.c) && Intrinsics.c(this.d, oweVar.d) && Intrinsics.c(this.e, oweVar.e) && Intrinsics.c(this.f, oweVar.f) && Intrinsics.c(this.g, oweVar.g) && this.h == oweVar.h;
    }

    public final int hashCode() {
        wyg wygVar = this.a;
        int hashCode = (wygVar == null ? 0 : wygVar.hashCode()) * 31;
        ryg rygVar = this.b;
        int hashCode2 = (hashCode + (rygVar == null ? 0 : rygVar.hashCode())) * 31;
        syg sygVar = this.c;
        int hashCode3 = (hashCode2 + (sygVar == null ? 0 : sygVar.hashCode())) * 31;
        dzg dzgVar = this.d;
        int hashCode4 = (hashCode3 + (dzgVar == null ? 0 : dzgVar.hashCode())) * 31;
        Team team = this.e;
        int hashCode5 = (hashCode4 + (team == null ? 0 : team.hashCode())) * 31;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = this.f;
        int hashCode6 = (hashCode5 + (playerPenaltyHistoryResponse == null ? 0 : playerPenaltyHistoryResponse.hashCode())) * 31;
        Map map = this.g;
        return Boolean.hashCode(this.h) + ((hashCode6 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlayerSeasonStatisticsWrapper(playerStatistics=" + this.a + ", seasonHeatMapData=" + this.b + ", seasonLastRatingsData=" + this.c + ", seasonShotMapData=" + this.d + ", team=" + this.e + ", penaltyHistoryResponse=" + this.f + ", highlightedStatistics=" + this.g + ", shouldShowSubSeasonLabel=" + this.h + ")";
    }
}
