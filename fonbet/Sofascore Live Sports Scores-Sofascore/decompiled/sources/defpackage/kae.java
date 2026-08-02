package defpackage;

import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kae {
    public final gv9 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final TeamShirtColors f;
    public final TeamShirtColors g;

    public kae(gv9 gv9Var, int i, int i2, int i3, boolean z, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = teamShirtColors;
        this.g = teamShirtColors2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kae)) {
            return false;
        }
        kae kaeVar = (kae) obj;
        return Intrinsics.c(this.a, kaeVar.a) && this.b == kaeVar.b && this.c == kaeVar.c && this.d == kaeVar.d && this.e == kaeVar.e && Intrinsics.c(this.f, kaeVar.f) && Intrinsics.c(this.g, kaeVar.g);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
        TeamShirtColors teamShirtColors = this.f;
        int hashCode = (e + (teamShirtColors == null ? 0 : teamShirtColors.hashCode())) * 31;
        TeamShirtColors teamShirtColors2 = this.g;
        return hashCode + (teamShirtColors2 != null ? teamShirtColors2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassingNetworkData(actionSegments=");
        sb.append(this.a);
        sb.append(", eventId=");
        sb.append(this.b);
        sb.append(", homeTeamId=");
        me4.q(sb, this.c, ", awayTeamId=", this.d, ", reverseTeams=");
        sb.append(this.e);
        sb.append(", homeTeamColors=");
        sb.append(this.f);
        sb.append(", awayTeamColors=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
