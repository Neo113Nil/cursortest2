package defpackage;

import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f14 implements Serializable {
    public final Team a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public f14(Team team, int i, boolean z, boolean z2) {
        team.getClass();
        this.a = team;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f14)) {
            return false;
        }
        f14 f14Var = (f14) obj;
        return Intrinsics.c(this.a, f14Var.a) && this.b == f14Var.b && this.c == f14Var.c && this.d == f14Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CricketTeamInningWrapper(team=");
        sb.append(this.a);
        sb.append(", inning=");
        sb.append(this.b);
        sb.append(", isCurrentInning=");
        return w1l.i(", isSuperOver=", ")", sb, this.c, this.d);
    }
}
