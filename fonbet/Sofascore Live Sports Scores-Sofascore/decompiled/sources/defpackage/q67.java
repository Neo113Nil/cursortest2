package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q67 {
    public final FantasyRoundPlayerUiModel a;
    public final gv9 b;
    public final boolean c;

    public q67(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, gv9 gv9Var, boolean z) {
        fantasyRoundPlayerUiModel.getClass();
        gv9Var.getClass();
        this.a = fantasyRoundPlayerUiModel;
        this.b = gv9Var;
        this.c = z;
    }

    public static q67 a(q67 q67Var, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        gv9 gv9Var = q67Var.b;
        boolean z = q67Var.c;
        gv9Var.getClass();
        return new q67(fantasyRoundPlayerUiModel, gv9Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q67)) {
            return false;
        }
        q67 q67Var = (q67) obj;
        return Intrinsics.c(this.a, q67Var.a) && Intrinsics.c(this.b, q67Var.b) && this.c == q67Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyListPlayerWrapper(player=");
        sb.append(this.a);
        sb.append(", gameweeks=");
        sb.append(this.b);
        sb.append(", inUserSquad=");
        return wt3.p(sb, this.c, ")");
    }
}
