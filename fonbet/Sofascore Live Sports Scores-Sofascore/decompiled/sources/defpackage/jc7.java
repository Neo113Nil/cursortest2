package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jc7 implements kc7 {
    public final nc7 a;
    public final FantasyRoundPlayerUiModel b;

    public jc7(nc7 nc7Var, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        nc7Var.getClass();
        this.a = nc7Var;
        this.b = fantasyRoundPlayerUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc7)) {
            return false;
        }
        jc7 jc7Var = (jc7) obj;
        return this.a == jc7Var.a && this.b.equals(jc7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectPlayer(index=" + this.a + ", player=" + this.b + ")";
    }
}
