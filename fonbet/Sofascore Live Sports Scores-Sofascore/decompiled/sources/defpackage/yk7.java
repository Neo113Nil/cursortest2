package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yk7 implements al7 {
    public final FantasyRoundPlayerUiModel a;

    public yk7(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        this.a = fantasyRoundPlayerUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk7) && this.a.equals(((yk7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.a + ")";
    }
}
