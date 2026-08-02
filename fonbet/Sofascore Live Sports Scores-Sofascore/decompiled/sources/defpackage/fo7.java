package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fo7 implements Serializable {
    public final j67 a;
    public final eo7 b;
    public final boolean c;

    static {
        j67 j67Var = j67.l;
        j67 j67Var2 = j67.l;
        eo7 eo7Var = eo7.r;
        new fo7(j67Var2, eo7.r, true);
    }

    public fo7(j67 j67Var, eo7 eo7Var, boolean z) {
        eo7Var.getClass();
        this.a = j67Var;
        this.b = eo7Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo7)) {
            return false;
        }
        fo7 fo7Var = (fo7) obj;
        return Intrinsics.c(this.a, fo7Var.a) && Intrinsics.c(this.b, fo7Var.b) && this.c == fo7Var.c;
    }

    public final int hashCode() {
        j67 j67Var = this.a;
        int hashCode = j67Var == null ? 0 : j67Var.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyUserLeagueUiModel(league=");
        sb.append(this.a);
        sb.append(", leaderboard=");
        sb.append(this.b);
        sb.append(", isLeagueOwner=");
        return wt3.p(sb, this.c, ")");
    }
}
