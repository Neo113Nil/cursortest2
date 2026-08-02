package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rm1 {
    public final Player a;
    public final Team b;

    public rm1(Player player, Team team) {
        player.getClass();
        team.getClass();
        this.a = player;
        this.b = team;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return Intrinsics.c(this.a, rm1Var.a) && Intrinsics.c(this.b, rm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BaseballTopPerformerPlayerInfo(player=" + this.a + ", team=" + this.b + ")";
    }
}
