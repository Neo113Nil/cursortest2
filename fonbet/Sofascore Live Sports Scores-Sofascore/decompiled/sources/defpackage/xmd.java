package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xmd {
    public final gv9 a;
    public final OddsCountryProvider b;
    public final OddsEventUIModel c;
    public final boolean d;
    public final tld e;

    public xmd(gv9 gv9Var, OddsCountryProvider oddsCountryProvider, OddsEventUIModel oddsEventUIModel, boolean z, tld tldVar) {
        gv9Var.getClass();
        oddsEventUIModel.getClass();
        tldVar.getClass();
        this.a = gv9Var;
        this.b = oddsCountryProvider;
        this.c = oddsEventUIModel;
        this.d = z;
        this.e = tldVar;
    }

    public static xmd a(xmd xmdVar, gv9 gv9Var, OddsEventUIModel oddsEventUIModel, boolean z, int i) {
        OddsCountryProvider oddsCountryProvider = xmdVar.b;
        if ((i & 4) != 0) {
            oddsEventUIModel = xmdVar.c;
        }
        OddsEventUIModel oddsEventUIModel2 = oddsEventUIModel;
        if ((i & 8) != 0) {
            z = xmdVar.d;
        }
        tld tldVar = xmdVar.e;
        xmdVar.getClass();
        gv9Var.getClass();
        oddsEventUIModel2.getClass();
        tldVar.getClass();
        return new xmd(gv9Var, oddsCountryProvider, oddsEventUIModel2, z, tldVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmd)) {
            return false;
        }
        xmd xmdVar = (xmd) obj;
        return Intrinsics.c(this.a, xmdVar.a) && Intrinsics.c(this.b, xmdVar.b) && Intrinsics.c(this.c, xmdVar.c) && this.d == xmdVar.d && Intrinsics.c(this.e, xmdVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        OddsCountryProvider oddsCountryProvider = this.b;
        return this.e.hashCode() + dmi.e((this.c.hashCode() + ((hashCode + (oddsCountryProvider == null ? 0 : oddsCountryProvider.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "OddsState(oddsList=" + this.a + ", analyticsCountryProvider=" + this.b + ", event=" + this.c + ", hasAdditionalOdds=" + this.d + ", promotions=" + this.e + ")";
    }

    public /* synthetic */ xmd(gv9 gv9Var, OddsCountryProvider oddsCountryProvider, OddsEventUIModel oddsEventUIModel, tld tldVar, int i) {
        this(gv9Var, oddsCountryProvider, oddsEventUIModel, false, (i & 16) != 0 ? new tld(false, false, false) : tldVar);
    }
}
