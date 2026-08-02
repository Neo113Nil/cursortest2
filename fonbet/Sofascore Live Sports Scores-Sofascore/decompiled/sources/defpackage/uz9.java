package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uz9 {
    public final PlayerPenaltyHistoryResponse a;
    public final PlayerPenaltyHistoryResponse b;
    public final Team c;
    public final Team d;

    public uz9(PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2, Team team, Team team2) {
        team.getClass();
        team2.getClass();
        this.a = playerPenaltyHistoryResponse;
        this.b = playerPenaltyHistoryResponse2;
        this.c = team;
        this.d = team2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz9)) {
            return false;
        }
        uz9 uz9Var = (uz9) obj;
        return this.a.equals(uz9Var.a) && Intrinsics.c(this.b, uz9Var.b) && Intrinsics.c(this.c, uz9Var.c) && Intrinsics.c(this.d, uz9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = this.b;
        return this.d.hashCode() + fc6.b((hashCode + (playerPenaltyHistoryResponse == null ? 0 : playerPenaltyHistoryResponse.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "IncidentPenaltyTakerUIModel(penaltyTakerHistory=" + this.a + ", penaltyGoalkeeperHistory=" + this.b + ", penaltyTakerTeam=" + this.c + ", goalkeeperTeam=" + this.d + ")";
    }
}
