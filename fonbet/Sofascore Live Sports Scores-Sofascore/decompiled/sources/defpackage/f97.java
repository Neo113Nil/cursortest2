package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f97 implements h97 {
    public final FantasyRoundPlayerUiModel a;

    public f97(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        this.a = fantasyRoundPlayerUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f97) && this.a.equals(((f97) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerDetails(player=" + this.a + ")";
    }
}
