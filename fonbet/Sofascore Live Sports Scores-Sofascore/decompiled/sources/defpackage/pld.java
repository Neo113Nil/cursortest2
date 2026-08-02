package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pld {
    public final String a;
    public final OddsCountryProvider b;

    public pld(String str, OddsCountryProvider oddsCountryProvider) {
        this.a = str;
        this.b = oddsCountryProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pld)) {
            return false;
        }
        pld pldVar = (pld) obj;
        return Intrinsics.c(this.a, pldVar.a) && Intrinsics.c(this.b, pldVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OddsCountryProvider oddsCountryProvider = this.b;
        return hashCode + (oddsCountryProvider != null ? oddsCountryProvider.hashCode() : 0);
    }

    public final String toString() {
        return "Analytics(marketName=" + this.a + ", countryProvider=" + this.b + ")";
    }
}
