package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xoe implements Serializable {
    public final Player a;
    public final Event b;
    public Double c;
    public final String d;
    public final Team e;
    public final int f;
    public List g;

    public xoe(Player player, Event event, Double d, String str, Team team, int i, List list) {
        player.getClass();
        this.a = player;
        this.b = event;
        this.c = d;
        this.d = str;
        this.e = team;
        this.f = i;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe)) {
            return false;
        }
        xoe xoeVar = (xoe) obj;
        return Intrinsics.c(this.a, xoeVar.a) && Intrinsics.c(this.b, xoeVar.b) && Intrinsics.c(this.c, xoeVar.c) && Intrinsics.c(this.d, xoeVar.d) && Intrinsics.c(this.e, xoeVar.e) && this.f == xoeVar.f && Intrinsics.c(this.g, xoeVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Event event = this.b;
        int hashCode2 = (hashCode + (event == null ? 0 : event.hashCode())) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Team team = this.e;
        int a = wv8.a(this.f, (hashCode4 + (team == null ? 0 : team.hashCode())) * 31, 31);
        List list = this.g;
        return a + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Double d = this.c;
        List list = this.g;
        StringBuilder sb = new StringBuilder("PlayerEventStatisticsDialogPlayerData(player=");
        sb.append(this.a);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", team=");
        sb.append(this.e);
        sb.append(", side=");
        sb.append(this.f);
        sb.append(", allEventPositions=");
        return mz1.p(sb, list, ")");
    }
}
