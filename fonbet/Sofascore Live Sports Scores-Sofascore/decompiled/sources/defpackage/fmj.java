package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fmj implements slj, Serializable {
    public final Player a;
    public final Team b;
    public final boolean c;
    public final jei d;

    public fmj(Player player, Team team, boolean z, jei jeiVar) {
        player.getClass();
        this.a = player;
        this.b = team;
        this.c = z;
        this.d = jeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fmj) {
            fmj fmjVar = (fmj) obj;
            return Intrinsics.c(this.a, fmjVar.a) && Intrinsics.c(this.b, fmjVar.b) && this.c == fmjVar.c && this.d == fmjVar.d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Team team = this.b;
        return Boolean.hashCode(false) + ((this.d.hashCode() + dmi.e((hashCode + (team == null ? 0 : team.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "TopPlayerWrapper(player=" + this.a + ", team=" + this.b + ", playedEnough=" + this.c + ", statisticItem=" + this.d + ", roundedBottom=false)";
    }
}
