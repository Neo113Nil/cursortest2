package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uvi implements vvi {
    public final int a;
    public final gv9 b;
    public final boolean c;
    public final boolean d;
    public final gv9 e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;

    public uvi(int i, gv9 gv9Var, boolean z, boolean z2, gv9 gv9Var2, int i2, int i3, String str, boolean z3) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = z;
        this.d = z2;
        this.e = gv9Var2;
        this.f = i2;
        this.g = i3;
        this.h = str;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvi)) {
            return false;
        }
        uvi uviVar = (uvi) obj;
        return this.a == uviVar.a && Intrinsics.c(this.b, uviVar.b) && this.c == uviVar.c && this.d == uviVar.d && Intrinsics.c(this.e, uviVar.e) && this.f == uviVar.f && this.g == uviVar.g && Intrinsics.c(this.h, uviVar.h) && this.i == uviVar.i;
    }

    public final int hashCode() {
        int a = wv8.a(this.g, wv8.a(this.f, ljg.d(dmi.e(dmi.e(ljg.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
        String str = this.h;
        return Boolean.hashCode(this.i) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleEvents(dayOfMonth=");
        sb.append(this.a);
        sb.append(", eventIds=");
        sb.append(this.b);
        sb.append(", isHomeTeam=");
        vxd.t(", isLive=", ", opponentTeamIds=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", uniqueTournamentId=");
        sb.append(this.f);
        sb.append(", eventCount=");
        vxd.p(this.g, ", sport=", this.h, ", isToday=", sb);
        return wt3.p(sb, this.i, ")");
    }
}
