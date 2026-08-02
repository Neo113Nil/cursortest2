package defpackage;

import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.PlayerCharacteristicsResponse;
import com.sofascore.model.util.MarketValueUserVote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class soe {
    public final MarketValueUserVote a;
    public final cxe b;
    public final List c;
    public final AttributeOverviewResponse d;
    public final List e;
    public final PlayerCharacteristicsResponse f;
    public final List g;
    public final r91 h;

    public soe(MarketValueUserVote marketValueUserVote, cxe cxeVar, List list, AttributeOverviewResponse attributeOverviewResponse, List list2, PlayerCharacteristicsResponse playerCharacteristicsResponse, List list3, r91 r91Var) {
        list.getClass();
        list2.getClass();
        this.a = marketValueUserVote;
        this.b = cxeVar;
        this.c = list;
        this.d = attributeOverviewResponse;
        this.e = list2;
        this.f = playerCharacteristicsResponse;
        this.g = list3;
        this.h = r91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soe)) {
            return false;
        }
        soe soeVar = (soe) obj;
        return Intrinsics.c(this.a, soeVar.a) && Intrinsics.c(this.b, soeVar.b) && Intrinsics.c(this.c, soeVar.c) && Intrinsics.c(this.d, soeVar.d) && Intrinsics.c(this.e, soeVar.e) && Intrinsics.c(this.f, soeVar.f) && Intrinsics.c(this.g, soeVar.g) && Intrinsics.c(this.h, soeVar.h);
    }

    public final int hashCode() {
        MarketValueUserVote marketValueUserVote = this.a;
        int hashCode = (marketValueUserVote == null ? 0 : marketValueUserVote.hashCode()) * 31;
        cxe cxeVar = this.b;
        int d = dmi.d((hashCode + (cxeVar == null ? 0 : cxeVar.hashCode())) * 31, 31, this.c);
        AttributeOverviewResponse attributeOverviewResponse = this.d;
        int d2 = dmi.d((d + (attributeOverviewResponse == null ? 0 : attributeOverviewResponse.hashCode())) * 31, 31, this.e);
        PlayerCharacteristicsResponse playerCharacteristicsResponse = this.f;
        int hashCode2 = (d2 + (playerCharacteristicsResponse == null ? 0 : playerCharacteristicsResponse.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        r91 r91Var = this.h;
        return hashCode3 + (r91Var != null ? r91Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerDetailsWrapper(marketValueVote=" + this.a + ", transferHistoryData=" + this.b + ", yearSummary=" + this.c + ", attributeOverview=" + this.d + ", nationalStatistics=" + this.e + ", playerCharacteristics=" + this.f + ", offersBanner=" + this.g + ", baseballKeyStatisticsData=" + this.h + ")";
    }
}
