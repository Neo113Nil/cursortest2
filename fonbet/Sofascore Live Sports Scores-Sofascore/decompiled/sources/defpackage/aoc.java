package defpackage;

import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aoc {
    public final Team a;
    public final boolean b;
    public final boolean c;

    public aoc(Team team, boolean z, boolean z2) {
        team.getClass();
        this.a = team;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoc)) {
            return false;
        }
        aoc aocVar = (aoc) obj;
        return Intrinsics.c(this.a, aocVar.a) && this.b == aocVar.b && this.c == aocVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MmaFighterHeadFlags(fighter=");
        sb.append(this.a);
        sb.append(", statistics=");
        sb.append(this.b);
        sb.append(", fights=");
        return wt3.p(sb, this.c, ")");
    }
}
