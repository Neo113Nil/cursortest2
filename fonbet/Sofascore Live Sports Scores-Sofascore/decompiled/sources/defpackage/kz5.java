package defpackage;

import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGameStatisticsResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kz5 {
    public final EsportsGameStatisticsResponse a;
    public final ESportsGameLineupsResponse b;
    public final ESportsGameRoundsResponse c;
    public final ESportsBansResponse d;

    public kz5(EsportsGameStatisticsResponse esportsGameStatisticsResponse, ESportsGameLineupsResponse eSportsGameLineupsResponse, ESportsGameRoundsResponse eSportsGameRoundsResponse, ESportsBansResponse eSportsBansResponse) {
        this.a = esportsGameStatisticsResponse;
        this.b = eSportsGameLineupsResponse;
        this.c = eSportsGameRoundsResponse;
        this.d = eSportsBansResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz5)) {
            return false;
        }
        kz5 kz5Var = (kz5) obj;
        return Intrinsics.c(this.a, kz5Var.a) && Intrinsics.c(this.b, kz5Var.b) && Intrinsics.c(this.c, kz5Var.c) && Intrinsics.c(this.d, kz5Var.d);
    }

    public final int hashCode() {
        EsportsGameStatisticsResponse esportsGameStatisticsResponse = this.a;
        int hashCode = (esportsGameStatisticsResponse == null ? 0 : esportsGameStatisticsResponse.hashCode()) * 31;
        ESportsGameLineupsResponse eSportsGameLineupsResponse = this.b;
        int hashCode2 = (hashCode + (eSportsGameLineupsResponse == null ? 0 : eSportsGameLineupsResponse.hashCode())) * 31;
        ESportsGameRoundsResponse eSportsGameRoundsResponse = this.c;
        int hashCode3 = (hashCode2 + (eSportsGameRoundsResponse == null ? 0 : eSportsGameRoundsResponse.hashCode())) * 31;
        ESportsBansResponse eSportsBansResponse = this.d;
        return hashCode3 + (eSportsBansResponse != null ? eSportsBansResponse.hashCode() : 0);
    }

    public final String toString() {
        return "ESportGameData(statistics=" + this.a + ", lineups=" + this.b + ", rounds=" + this.c + ", bans=" + this.d + ")";
    }
}
