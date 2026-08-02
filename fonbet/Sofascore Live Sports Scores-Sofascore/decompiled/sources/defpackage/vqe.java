package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vqe implements yqe {
    public final FantasyPlayerFixtureUiModel a;
    public final int b;

    public vqe(FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, int i) {
        fantasyPlayerFixtureUiModel.getClass();
        this.a = fantasyPlayerFixtureUiModel;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqe)) {
            return false;
        }
        vqe vqeVar = (vqe) obj;
        return Intrinsics.c(this.a, vqeVar.a) && this.b == vqeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnFixtureClick(fixture=" + this.a + ", competitionId=" + this.b + ")";
    }
}
