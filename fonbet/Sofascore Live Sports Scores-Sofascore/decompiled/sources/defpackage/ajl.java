package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ajl {
    public final gv9 a;
    public final int b;
    public final String c;

    public ajl(int i, gv9 gv9Var, String str) {
        str.getClass();
        this.a = gv9Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajl)) {
            return false;
        }
        ajl ajlVar = (ajl) obj;
        return Intrinsics.c(this.a, ajlVar.a) && this.b == ajlVar.b && Intrinsics.c(this.c, ajlVar.c);
    }

    public final int hashCode() {
        gv9 gv9Var = this.a;
        return this.c.hashCode() + wv8.a(this.b, (gv9Var == null ? 0 : gv9Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorldCupTeamLeadersData(teamLeaders=");
        sb.append(this.a);
        sb.append(", statsTournamentId=");
        sb.append(this.b);
        sb.append(", statsTournamentName=");
        return mz1.o(sb, this.c, ")");
    }
}
