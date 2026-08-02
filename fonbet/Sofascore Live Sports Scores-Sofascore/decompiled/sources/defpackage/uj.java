package defpackage;

import com.sofascore.results.event.odds.model.OddsEventUIModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uj {
    public final gv9 a;
    public final old b;
    public final OddsEventUIModel c;

    public uj(gv9 gv9Var, old oldVar, OddsEventUIModel oddsEventUIModel) {
        gv9Var.getClass();
        oddsEventUIModel.getClass();
        this.a = gv9Var;
        this.b = oldVar;
        this.c = oddsEventUIModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj)) {
            return false;
        }
        uj ujVar = (uj) obj;
        return Intrinsics.c(this.a, ujVar.a) && this.b.equals(ujVar.b) && Intrinsics.c(this.c, ujVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdditionalOddsModalState(additionalOddsItems=" + this.a + ", countryProvider=" + this.b + ", event=" + this.c + ")";
    }
}
