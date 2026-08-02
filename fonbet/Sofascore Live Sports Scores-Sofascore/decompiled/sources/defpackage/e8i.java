package defpackage;

import com.sofascore.model.mvvm.model.Team;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e8i {
    public final Team a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public e8i(Team team, List list, List list2, boolean z, boolean z2, boolean z3) {
        team.getClass();
        this.a = team;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8i)) {
            return false;
        }
        e8i e8iVar = (e8i) obj;
        return Intrinsics.c(this.a, e8iVar.a) && Intrinsics.c(this.b, e8iVar.b) && Intrinsics.c(this.c, e8iVar.c) && this.d == e8iVar.d && this.e == e8iVar.e && this.f == e8iVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return Boolean.hashCode(this.f) + dmi.e(dmi.e((hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageTeamHeadFlags(driverOrTeam=");
        sb.append(this.a);
        sb.append(", drivers=");
        sb.append(this.b);
        sb.append(", relatedTeams=");
        sb.append(this.c);
        sb.append(", standings=");
        sb.append(this.d);
        sb.append(", races=");
        return w1l.i(", career=", ")", sb, this.e, this.f);
    }
}
