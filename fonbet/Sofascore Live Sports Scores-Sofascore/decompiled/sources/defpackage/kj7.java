package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kj7 {
    public final FantasyRoundPlayerUiModel a;
    public final int b;
    public final String c;

    public kj7(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i, String str) {
        str.getClass();
        this.a = fantasyRoundPlayerUiModel;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj7)) {
            return false;
        }
        kj7 kj7Var = (kj7) obj;
        return this.a.equals(kj7Var.a) && this.b == kj7Var.b && Intrinsics.c(this.c, kj7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyRoundTopPlayerWrapper(player=");
        sb.append(this.a);
        sb.append(", roundId=");
        sb.append(this.b);
        sb.append(", roundShortname=");
        return mz1.o(sb, this.c, ")");
    }
}
