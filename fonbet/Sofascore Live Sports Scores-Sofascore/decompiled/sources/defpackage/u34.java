package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u34 extends w34 {
    public final Map d;
    public final EventSuggest.IncidentSuggest.CardSuggest e;
    public final boolean f;
    public final CrowdsourcingIncidentType g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u34(Map map, EventSuggest.IncidentSuggest.CardSuggest cardSuggest, boolean z, CrowdsourcingIncidentType crowdsourcingIncidentType, boolean z2) {
        super(z, cardSuggest, z2);
        map.getClass();
        crowdsourcingIncidentType.getClass();
        this.d = map;
        this.e = cardSuggest;
        this.f = z;
        this.g = crowdsourcingIncidentType;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34Var = (u34) obj;
        return Intrinsics.c(this.d, u34Var.d) && Intrinsics.c(this.e, u34Var.e) && this.f == u34Var.f && Intrinsics.c(this.g, u34Var.g) && this.h == u34Var.h;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        EventSuggest.IncidentSuggest.CardSuggest cardSuggest = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + dmi.e((hashCode + (cardSuggest == null ? 0 : cardSuggest.hashCode())) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardIncidentData(cardedPlayersMap=");
        sb.append(this.d);
        sb.append(", selectedCard=");
        sb.append(this.e);
        sb.append(", isPostMatch=");
        sb.append(this.f);
        sb.append(", preselectedType=");
        sb.append(this.g);
        sb.append(", canDeleteCard=");
        return wt3.p(sb, this.h, ")");
    }
}
