package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hjl {
    public final int a;
    public final String b;
    public final double c;
    public final int d;
    public final String e;
    public final Event f;
    public final Player g;
    public final Team h;

    static {
        ypa.a(ysa.c, new wel(5));
    }

    public hjl(int i, String str, double d, int i2, String str2, Event event, Player player, Team team) {
        str.getClass();
        str2.getClass();
        event.getClass();
        player.getClass();
        team.getClass();
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = i2;
        this.e = str2;
        this.f = event;
        this.g = player;
        this.h = team;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjl)) {
            return false;
        }
        hjl hjlVar = (hjl) obj;
        return this.a == hjlVar.a && Intrinsics.c(this.b, hjlVar.b) && Double.compare(this.c, hjlVar.c) == 0 && this.d == hjlVar.d && Intrinsics.c(this.e, hjlVar.e) && Intrinsics.c(this.f, hjlVar.f) && Intrinsics.c(this.g, hjlVar.g) && Intrinsics.c(this.h, hjlVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + dmi.c(wv8.a(this.d, dmi.b(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupTopPerformerUiModel(id=", ", name=", this.b, ", rating=");
        t.append(this.c);
        t.append(", teamId=");
        t.append(this.d);
        t.append(", countryName=");
        t.append(this.e);
        t.append(", event=");
        t.append(this.f);
        t.append(", player=");
        t.append(this.g);
        t.append(", team=");
        t.append(this.h);
        t.append(")");
        return t.toString();
    }
}
