package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cz6 extends dz6 {
    public final gv9 a;
    public final gv9 b;
    public final a07 c;
    public final FantasyRoundPlayerUiModel d;
    public final mj7 e;
    public final boolean f;
    public final ev6 g;
    public final int h;

    public cz6(gv9 gv9Var, gv9 gv9Var2, a07 a07Var, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, mj7 mj7Var, boolean z, ev6 ev6Var, int i) {
        gv9Var.getClass();
        gv9Var2.getClass();
        fantasyRoundPlayerUiModel.getClass();
        mj7Var.getClass();
        ev6Var.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = a07Var;
        this.d = fantasyRoundPlayerUiModel;
        this.e = mj7Var;
        this.f = z;
        this.g = ev6Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz6)) {
            return false;
        }
        cz6 cz6Var = (cz6) obj;
        return Intrinsics.c(this.a, cz6Var.a) && Intrinsics.c(this.b, cz6Var.b) && Intrinsics.c(this.c, cz6Var.c) && Intrinsics.c(this.d, cz6Var.d) && Intrinsics.c(this.e, cz6Var.e) && this.f == cz6Var.f && Intrinsics.c(this.g, cz6Var.g) && this.h == cz6Var.h;
    }

    public final int hashCode() {
        int d = ljg.d(this.a.hashCode() * 31, 31, this.b);
        a07 a07Var = this.c;
        return Integer.hashCode(this.h) + ((this.g.hashCode() + dmi.e((this.e.hashCode() + ((this.d.hashCode() + ((d + (a07Var == null ? 0 : a07Var.hashCode())) * 31)) * 31)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("PointsBreakdown(statisticsOverview=", this.a, ", statistics=", this.b, ", formAndFixturesWrapper=");
        l.append(this.c);
        l.append(", player=");
        l.append(this.d);
        l.append(", round=");
        l.append(this.e);
        l.append(", tripleCaptainActive=");
        l.append(this.f);
        l.append(", competition=");
        l.append(this.g);
        l.append(", totalPoints=");
        l.append(this.h);
        l.append(")");
        return l.toString();
    }
}
