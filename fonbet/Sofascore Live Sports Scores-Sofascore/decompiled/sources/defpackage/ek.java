package defpackage;

import com.sofascore.results.event.odds.model.OddsEventUIModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ek {
    public final OddsEventUIModel a;
    public final old b;
    public final gv9 c;
    public final gv9 d;
    public final w22 e;
    public final boolean f;

    public ek(OddsEventUIModel oddsEventUIModel, old oldVar, gv9 gv9Var, gv9 gv9Var2, w22 w22Var, boolean z) {
        oldVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = oddsEventUIModel;
        this.b = oldVar;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = w22Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        return this.a.equals(ekVar.a) && Intrinsics.c(this.b, ekVar.b) && Intrinsics.c(this.c, ekVar.c) && Intrinsics.c(this.d, ekVar.d) && Intrinsics.c(this.e, ekVar.e) && this.f == ekVar.f;
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        w22 w22Var = this.e;
        return Boolean.hashCode(this.f) + ((d + (w22Var == null ? 0 : w22Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalOddsState(event=");
        sb.append(this.a);
        sb.append(", countryProvider=");
        sb.append(this.b);
        sb.append(", additionalOddsItems=");
        vxd.u(sb, this.c, ", signupLinks=", this.d, ", brand=");
        sb.append(this.e);
        sb.append(", shouldShowAnalyst=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
