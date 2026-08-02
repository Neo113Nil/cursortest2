package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qs6 implements at6 {
    public final FantasyRoundPlayerUiModel a;
    public final ho7 b;

    public qs6(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, ho7 ho7Var) {
        ho7Var.getClass();
        this.a = fantasyRoundPlayerUiModel;
        this.b = ho7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs6)) {
            return false;
        }
        qs6 qs6Var = (qs6) obj;
        return this.a.equals(qs6Var.a) && Intrinsics.c(this.b, qs6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.a + ", userRound=" + this.b + ")";
    }
}
