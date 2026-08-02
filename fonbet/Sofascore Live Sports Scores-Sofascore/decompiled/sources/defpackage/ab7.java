package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class ab7 {

    @NotNull
    public static final za7 Companion = new za7();
    public final int a;
    public final int b;
    public final String c;
    public final FantasyRoundPlayerUiModel d;

    public /* synthetic */ ab7(int i, int i2, int i3, String str, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        if (15 != (i & 15)) {
            oea.z(i, 15, ya7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = fantasyRoundPlayerUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return this.a == ab7Var.a && this.b == ab7Var.b && Intrinsics.c(this.c, ab7Var.c) && Intrinsics.c(this.d, ab7Var.d);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = this.d;
        return hashCode + (fantasyRoundPlayerUiModel != null ? fantasyRoundPlayerUiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "SelectReplacement(competitionId=", ", roundId=", ", position=");
        s.append(this.c);
        s.append(", player=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }

    public ab7(int i, int i2, String str, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = fantasyRoundPlayerUiModel;
    }
}
