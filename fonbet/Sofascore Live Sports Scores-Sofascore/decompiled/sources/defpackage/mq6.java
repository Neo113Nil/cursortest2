package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mq6 implements uq6 {
    public final FantasyRoundPlayerUiModel a;
    public final int b;

    public mq6(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i) {
        this.a = fantasyRoundPlayerUiModel;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq6)) {
            return false;
        }
        mq6 mq6Var = (mq6) obj;
        return this.a.equals(mq6Var.a) && this.b == mq6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.a + ", roundId=" + this.b + ")";
    }
}
