package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m1e {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final String h;
    public final double i;
    public final String j;

    public m1e(int i, String str, int i2, String str2, int i3, String str3, int i4, String str4, double d) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = str4;
        this.i = d;
        StringBuilder s = lnb.s(i, i2, "PlayerUiModel: playerId:", " teamId:", " seasonId:");
        me4.q(s, i4, " uniqueTournamentId:", i3, " rating:");
        s.append(d);
        this.j = s.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1e)) {
            return false;
        }
        m1e m1eVar = (m1e) obj;
        return this.a == m1eVar.a && Intrinsics.c(this.b, m1eVar.b) && this.c == m1eVar.c && Intrinsics.c(this.d, m1eVar.d) && this.e == m1eVar.e && this.f.equals(m1eVar.f) && this.g == m1eVar.g && Intrinsics.c(this.h, m1eVar.h) && Double.compare(this.i, m1eVar.i) == 0;
    }

    public final int hashCode() {
        int a = wv8.a(this.g, dmi.c(wv8.a(this.e, dmi.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31);
        String str = this.h;
        return Double.hashCode(this.i) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "POTSHighestRatedPlayerUiModel(playerId=", ", playerName=", this.b, ", teamId=");
        vxd.p(this.c, ", teamName=", this.d, ", uniqueTournamentId=", t);
        vxd.p(this.e, ", uniqueTournamentName=", this.f, ", seasonId=", t);
        vxd.p(this.g, ", year=", this.h, ", rating=", t);
        t.append(this.i);
        t.append(")");
        return t.toString();
    }
}
