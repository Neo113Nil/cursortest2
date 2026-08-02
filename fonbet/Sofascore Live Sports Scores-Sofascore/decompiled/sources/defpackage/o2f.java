package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o2f implements r2f {
    public final int a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Double e;
    public final Player f;
    public final Team g;

    public o2f(int i, String str, Integer num, String str2, Double d, Player player, Team team) {
        str.getClass();
        player.getClass();
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = d;
        this.f = player;
        this.g = team;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2f)) {
            return false;
        }
        o2f o2fVar = (o2f) obj;
        return this.a == o2fVar.a && Intrinsics.c(this.b, o2fVar.b) && Intrinsics.c(this.c, o2fVar.c) && Intrinsics.c(this.d, o2fVar.d) && Intrinsics.c(this.e, o2fVar.e) && Intrinsics.c(this.f, o2fVar.f) && Intrinsics.c(this.g, o2fVar.g);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (d == null ? 0 : d.hashCode())) * 31)) * 31;
        Team team = this.g;
        return hashCode3 + (team != null ? team.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "Loaded(playerId=", ", playerTranslatedName=", this.b, ", teamId=");
        vxd.s(this.c, ", teamTranslatedName=", this.d, ", ratingDouble=", t);
        t.append(this.e);
        t.append(", player=");
        t.append(this.f);
        t.append(", team=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
