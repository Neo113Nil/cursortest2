package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sp7 extends tp7 {
    public final String b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp7(String str, int i) {
        super(R.string.too_many_players_info);
        str.getClass();
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp7)) {
            return false;
        }
        sp7 sp7Var = (sp7) obj;
        return Intrinsics.c(this.b, sp7Var.b) && this.c == sp7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return vxd.k(this.c, "PlayerTeamLimit(teamName=", this.b, ", maxPlayers=", ")");
    }
}
