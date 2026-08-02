package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ehl implements eil {
    public final Event a;
    public final Player b;
    public final Team c;
    public final double d;
    public final int e;

    public ehl(Event event, Player player, Team team, double d, int i) {
        event.getClass();
        player.getClass();
        team.getClass();
        this.a = event;
        this.b = player;
        this.c = team;
        this.d = d;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehl)) {
            return false;
        }
        ehl ehlVar = (ehl) obj;
        return Intrinsics.c(this.a, ehlVar.a) && Intrinsics.c(this.b, ehlVar.b) && Intrinsics.c(this.c, ehlVar.c) && Double.compare(this.d, ehlVar.d) == 0 && this.e == ehlVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + dmi.b(fc6.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPESM(event=");
        sb.append(this.a);
        sb.append(", player=");
        sb.append(this.b);
        sb.append(", team=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        return fn0.k(this.e, ", side=", ")", sb);
    }
}
