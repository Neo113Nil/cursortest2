package defpackage;

import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b4i {
    public final x2g a;
    public final TvCountryChannelsResponse b;
    public final c4i c;

    public b4i(x2g x2gVar, TvCountryChannelsResponse tvCountryChannelsResponse, c4i c4iVar) {
        x2gVar.getClass();
        this.a = x2gVar;
        this.b = tvCountryChannelsResponse;
        this.c = c4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4i)) {
            return false;
        }
        b4i b4iVar = (b4i) obj;
        return Intrinsics.c(this.a, b4iVar.a) && Intrinsics.c(this.b, b4iVar.b) && Intrinsics.c(this.c, b4iVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TvCountryChannelsResponse tvCountryChannelsResponse = this.b;
        int hashCode2 = (hashCode + (tvCountryChannelsResponse == null ? 0 : tvCountryChannelsResponse.hashCode())) * 31;
        c4i c4iVar = this.c;
        return hashCode2 + (c4iVar != null ? c4iVar.hashCode() : 0);
    }

    public final String toString() {
        return "RaceResultsDataWrapper(standings=" + this.a + ", tvCountriesResponse=" + this.b + ", featuredOdds=" + this.c + ")";
    }
}
