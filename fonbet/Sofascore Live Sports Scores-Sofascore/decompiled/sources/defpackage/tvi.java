package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tvi implements vvi {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final svi h;
    public final boolean i;
    public final boolean j;

    public tvi(int i, int i2, boolean z, int i3, int i4, String str, String str2, svi sviVar, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str2;
        this.h = sviVar;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvi)) {
            return false;
        }
        tvi tviVar = (tvi) obj;
        return this.a == tviVar.a && this.b == tviVar.b && this.c == tviVar.c && this.d == tviVar.d && this.e == tviVar.e && Intrinsics.c(this.f, tviVar.f) && this.g.equals(tviVar.g) && this.h == tviVar.h && this.i == tviVar.i && this.j == tviVar.j;
    }

    public final int hashCode() {
        int a = wv8.a(this.e, wv8.a(this.d, dmi.e(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
        String str = this.f;
        int c = dmi.c((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        svi sviVar = this.h;
        return Boolean.hashCode(this.j) + dmi.e((c + (sviVar != null ? sviVar.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "Event(dayOfMonth=", ", eventId=", ", isHomeTeam=");
        s.append(this.c);
        s.append(", opponentTeamId=");
        s.append(this.d);
        s.append(", uniqueTournamentId=");
        vxd.p(this.e, ", score=", this.f, ", status=", s);
        s.append(this.g);
        s.append(", state=");
        s.append(this.h);
        s.append(", reduceFontSize=");
        return w1l.i(", isToday=", ")", s, this.i, this.j);
    }
}
