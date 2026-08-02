package defpackage;

import com.sofascore.model.mvvm.model.Team;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u26 {
    public final xs2 a;
    public final List b;
    public final Team c;

    public u26(xs2 xs2Var, List list, Team team) {
        list.getClass();
        this.a = xs2Var;
        this.b = list;
        this.c = team;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u26)) {
            return false;
        }
        u26 u26Var = (u26) obj;
        return Intrinsics.c(this.a, u26Var.a) && Intrinsics.c(this.b, u26Var.b) && Intrinsics.c(this.c, u26Var.c);
    }

    public final int hashCode() {
        xs2 xs2Var = this.a;
        int d = dmi.d((xs2Var == null ? 0 : xs2Var.hashCode()) * 31, 31, this.b);
        Team team = this.c;
        return d + (team != null ? team.hashCode() : 0);
    }

    public final String toString() {
        return "FilterResult(checkBoxRow=" + this.a + ", list=" + this.b + ", team=" + this.c + ")";
    }
}
