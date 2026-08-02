package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class az6 extends dz6 {
    public final FantasyRoundPlayerUiModel a;
    public final mj7 b;
    public final a07 c;
    public final gv9 d;
    public final gv9 e;
    public final ev6 f;
    public final gv9 g;

    public az6(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, mj7 mj7Var, a07 a07Var, b7 b7Var, gv9 gv9Var, ev6 ev6Var, gv9 gv9Var2) {
        fantasyRoundPlayerUiModel.getClass();
        mj7Var.getClass();
        b7Var.getClass();
        gv9Var.getClass();
        ev6Var.getClass();
        gv9Var2.getClass();
        this.a = fantasyRoundPlayerUiModel;
        this.b = mj7Var;
        this.c = a07Var;
        this.d = b7Var;
        this.e = gv9Var;
        this.f = ev6Var;
        this.g = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az6)) {
            return false;
        }
        az6 az6Var = (az6) obj;
        return Intrinsics.c(this.a, az6Var.a) && Intrinsics.c(this.b, az6Var.b) && Intrinsics.c(this.c, az6Var.c) && Intrinsics.c(this.d, az6Var.d) && Intrinsics.c(this.e, az6Var.e) && Intrinsics.c(this.f, az6Var.f) && Intrinsics.c(this.g, az6Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a07 a07Var = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ljg.d(ljg.d((hashCode + (a07Var == null ? 0 : a07Var.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        return "FormAndFixtures(player=" + this.a + ", round=" + this.b + ", formAndFixturesWrapper=" + this.c + ", statisticsOverview=" + this.d + ", expectedStatistics=" + this.e + ", competition=" + this.f + ", events=" + this.g + ")";
    }
}
