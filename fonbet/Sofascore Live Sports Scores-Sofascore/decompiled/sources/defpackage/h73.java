package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h73 {
    public final String a;
    public final FantasyPlayerFixtureUiModel b;
    public final FantasyPlayerFixtureUiModel c;

    public h73(String str, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2) {
        str.getClass();
        this.a = str;
        this.b = fantasyPlayerFixtureUiModel;
        this.c = fantasyPlayerFixtureUiModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h73)) {
            return false;
        }
        h73 h73Var = (h73) obj;
        return Intrinsics.c(this.a, h73Var.a) && Intrinsics.c(this.b, h73Var.b) && Intrinsics.c(this.c, h73Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = this.b;
        int hashCode2 = (hashCode + (fantasyPlayerFixtureUiModel == null ? 0 : fantasyPlayerFixtureUiModel.hashCode())) * 31;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = this.c;
        return hashCode2 + (fantasyPlayerFixtureUiModel2 != null ? fantasyPlayerFixtureUiModel2.hashCode() : 0);
    }

    public final String toString() {
        return "ComparisonFixtureData(roundShortname=" + this.a + ", playerFirstFixture=" + this.b + ", playerSecondFixture=" + this.c + ")";
    }
}
