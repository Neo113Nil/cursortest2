package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class syg {
    public final Player a;
    public final List b;
    public final Double c;
    public final Team d;

    public syg(Player player, List list, Double d, Team team) {
        player.getClass();
        list.getClass();
        this.a = player;
        this.b = list;
        this.c = d;
        this.d = team;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syg)) {
            return false;
        }
        syg sygVar = (syg) obj;
        return Intrinsics.c(this.a, sygVar.a) && Intrinsics.c(this.b, sygVar.b) && Intrinsics.c(this.c, sygVar.c) && Intrinsics.c(this.d, sygVar.d);
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        Double d2 = this.c;
        int hashCode = (d + (d2 == null ? 0 : d2.hashCode())) * 31;
        Team team = this.d;
        return hashCode + (team != null ? team.hashCode() : 0);
    }

    public final String toString() {
        return "SeasonLastRatingsData(player=" + this.a + ", playerEventRatings=" + this.b + ", averageRating=" + this.c + ", team=" + this.d + ")";
    }
}
