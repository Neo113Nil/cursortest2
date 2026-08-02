package defpackage;

import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class noj implements slj, Serializable {
    public final Team a;
    public final jei b;

    public noj(Team team, jei jeiVar) {
        team.getClass();
        this.a = team;
        this.b = jeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof noj) {
            noj nojVar = (noj) obj;
            return Intrinsics.c(this.a, nojVar.a) && this.b == nojVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TopTeamWrapper(team=" + this.a + ", statisticItem=" + this.b + ", roundedBottom=false)";
    }
}
