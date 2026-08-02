package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hre {
    public final gv9 a;
    public final tn6 b;
    public final yd7 c;
    public final FantasyPlayerUiModel d;
    public final gv9 e;
    public final gv9 f;
    public final boolean g;
    public final boolean h;

    public hre(gv9 gv9Var, tn6 tn6Var, yd7 yd7Var, FantasyPlayerUiModel fantasyPlayerUiModel, gv9 gv9Var2, gv9 gv9Var3, boolean z, boolean z2) {
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = gv9Var;
        this.b = tn6Var;
        this.c = yd7Var;
        this.d = fantasyPlayerUiModel;
        this.e = gv9Var2;
        this.f = gv9Var3;
        this.g = z;
        this.h = z2;
    }

    public static hre a(hre hreVar, gv9 gv9Var, tn6 tn6Var, yd7 yd7Var, FantasyPlayerUiModel fantasyPlayerUiModel, gv9 gv9Var2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            gv9Var = hreVar.a;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 2) != 0) {
            tn6Var = hreVar.b;
        }
        tn6 tn6Var2 = tn6Var;
        if ((i & 4) != 0) {
            yd7Var = hreVar.c;
        }
        yd7 yd7Var2 = yd7Var;
        if ((i & 8) != 0) {
            fantasyPlayerUiModel = hreVar.d;
        }
        FantasyPlayerUiModel fantasyPlayerUiModel2 = fantasyPlayerUiModel;
        if ((i & 16) != 0) {
            gv9Var2 = hreVar.e;
        }
        gv9 gv9Var4 = gv9Var2;
        gv9 gv9Var5 = hreVar.f;
        if ((i & 64) != 0) {
            z = hreVar.g;
        }
        boolean z3 = z;
        hreVar.getClass();
        boolean z4 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? hreVar.h : z2;
        hreVar.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        return new hre(gv9Var3, tn6Var2, yd7Var2, fantasyPlayerUiModel2, gv9Var4, gv9Var5, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hre)) {
            return false;
        }
        hre hreVar = (hre) obj;
        return Intrinsics.c(this.a, hreVar.a) && Intrinsics.c(this.b, hreVar.b) && Intrinsics.c(this.c, hreVar.c) && Intrinsics.c(this.d, hreVar.d) && Intrinsics.c(this.e, hreVar.e) && Intrinsics.c(this.f, hreVar.f) && this.g == hreVar.g && this.h == hreVar.h;
    }

    public final int hashCode() {
        gv9 gv9Var = this.a;
        int hashCode = (gv9Var == null ? 0 : gv9Var.hashCode()) * 31;
        tn6 tn6Var = this.b;
        int hashCode2 = (hashCode + (tn6Var == null ? 0 : tn6Var.hashCode())) * 31;
        yd7 yd7Var = this.c;
        int hashCode3 = (hashCode2 + (yd7Var == null ? 0 : yd7Var.hashCode())) * 31;
        FantasyPlayerUiModel fantasyPlayerUiModel = this.d;
        return Boolean.hashCode(this.h) + dmi.e(dmi.e(ljg.d(ljg.d((hashCode3 + (fantasyPlayerUiModel == null ? 0 : fantasyPlayerUiModel.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerFantasyScreenState(competitions=");
        sb.append(this.a);
        sb.append(", selectedCompetition=");
        sb.append(this.b);
        sb.append(", priceGraphData=");
        sb.append(this.c);
        sb.append(", fantasyPlayer=");
        sb.append(this.d);
        sb.append(", fixtures=");
        vxd.u(sb, this.e, ", userCompetitionIds=", this.f, ", isLoading=");
        return w1l.i(", userLoggedIn=false, assetsRestricted=", ")", sb, this.g, this.h);
    }
}
