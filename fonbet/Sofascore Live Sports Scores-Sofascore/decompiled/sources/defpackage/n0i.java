package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n0i {
    public final Player a;
    public final Team b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public n0i(Player player, Team team, Integer num, Integer num2, Long l) {
        player.getClass();
        this.a = player;
        this.b = team;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0i)) {
            return false;
        }
        n0i n0iVar = (n0i) obj;
        return Intrinsics.c(this.a, n0iVar.a) && Intrinsics.c(this.b, n0iVar.b) && Intrinsics.c(this.c, n0iVar.c) && Intrinsics.c(this.d, n0iVar.d) && Intrinsics.c(this.e, n0iVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Team team = this.b;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SquadPlayerInfo(player=");
        sb.append(this.a);
        sb.append(", previousTeam=");
        sb.append(this.b);
        sb.append(", nationalAppearances=");
        vxd.r(this.c, this.d, ", nationalGoals=", ", nationalDebut=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
