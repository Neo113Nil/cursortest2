package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m73 {
    public final FantasyPlayerUiModel a;
    public final gv9 b;
    public final gv9 c;

    public m73(FantasyPlayerUiModel fantasyPlayerUiModel, gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = fantasyPlayerUiModel;
        this.b = gv9Var;
        this.c = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73Var = (m73) obj;
        return Intrinsics.c(this.a, m73Var.a) && Intrinsics.c(this.b, m73Var.b) && Intrinsics.c(this.c, m73Var.c);
    }

    public final int hashCode() {
        FantasyPlayerUiModel fantasyPlayerUiModel = this.a;
        return this.c.hashCode() + ljg.d((fantasyPlayerUiModel == null ? 0 : fantasyPlayerUiModel.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "ComparisonPlayerData(player=" + this.a + ", form=" + this.b + ", fixtures=" + this.c + ")";
    }
}
