package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lhl implements eil {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public lhl(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhl)) {
            return false;
        }
        lhl lhlVar = (lhl) obj;
        return this.a == lhlVar.a && this.b == lhlVar.b && this.c == lhlVar.c && Intrinsics.c(this.d, lhlVar.d);
    }

    public final int hashCode() {
        int a = wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "OpenPlayerTeamStats(teamId=", ", playerId=", ", tournamentId=");
        s.append(this.c);
        s.append(", statistic=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
