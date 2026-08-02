package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dhl implements eil {
    public final Event a;
    public final Player b;
    public final Team c;
    public final Double d;

    public dhl(Event event, Team team, Player player, Double d) {
        player.getClass();
        this.a = event;
        this.b = player;
        this.c = team;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhl)) {
            return false;
        }
        dhl dhlVar = (dhl) obj;
        return this.a.equals(dhlVar.a) && Intrinsics.c(this.b, dhlVar.b) && Intrinsics.c(this.c, dhlVar.c) && Intrinsics.c(this.d, dhlVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Team team = this.c;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Double d = this.d;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "OpenMatchdayPotm(event=" + this.a + ", player=" + this.b + ", team=" + this.c + ", ratingDouble=" + this.d + ")";
    }
}
