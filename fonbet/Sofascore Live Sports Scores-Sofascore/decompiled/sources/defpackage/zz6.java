package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zz6 {
    public final FantasyRoundPlayerUiModel a;
    public final FantasyRoundPlayerUiModel b;

    public zz6(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2) {
        fantasyRoundPlayerUiModel.getClass();
        fantasyRoundPlayerUiModel2.getClass();
        this.a = fantasyRoundPlayerUiModel;
        this.b = fantasyRoundPlayerUiModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz6)) {
            return false;
        }
        zz6 zz6Var = (zz6) obj;
        return Intrinsics.c(this.a, zz6Var.a) && Intrinsics.c(this.b, zz6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyFootballTransferWrapper(playerOut=" + this.a + ", playerIn=" + this.b + ")";
    }
}
