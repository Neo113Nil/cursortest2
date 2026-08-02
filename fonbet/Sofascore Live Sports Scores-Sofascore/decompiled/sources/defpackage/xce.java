package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xce {
    public final Player a;
    public final Player b;
    public final int c;
    public final Integer d;
    public final PlayerPenaltyHistoryResponse e;
    public final PlayerPenaltyHistoryResponse f;
    public final boolean g;

    public xce(Player player, Player player2, int i, Integer num, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2, boolean z) {
        player.getClass();
        this.a = player;
        this.b = player2;
        this.c = i;
        this.d = num;
        this.e = playerPenaltyHistoryResponse;
        this.f = playerPenaltyHistoryResponse2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xce)) {
            return false;
        }
        xce xceVar = (xce) obj;
        return Intrinsics.c(this.a, xceVar.a) && Intrinsics.c(this.b, xceVar.b) && this.c == xceVar.c && Intrinsics.c(this.d, xceVar.d) && Intrinsics.c(this.e, xceVar.e) && Intrinsics.c(this.f, xceVar.f) && this.g == xceVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Player player = this.b;
        int a = wv8.a(this.c, (hashCode + (player == null ? 0 : player.hashCode())) * 31, 31);
        Integer num = this.d;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = this.e;
        int hashCode3 = (hashCode2 + (playerPenaltyHistoryResponse == null ? 0 : playerPenaltyHistoryResponse.hashCode())) * 31;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (playerPenaltyHistoryResponse2 != null ? playerPenaltyHistoryResponse2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PenaltyHistoryUiModel(taker=");
        sb.append(this.a);
        sb.append(", goalKeeper=");
        sb.append(this.b);
        sb.append(", takerTeamId=");
        sb.append(this.c);
        sb.append(", goalkeeperTeamId=");
        sb.append(this.d);
        sb.append(", takerPenaltyHistory=");
        sb.append(this.e);
        sb.append(", goalkeeperPenaltyHistory=");
        sb.append(this.f);
        sb.append(", showInfoRow=");
        return wt3.p(sb, this.g, ")");
    }
}
