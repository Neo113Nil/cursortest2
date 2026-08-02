package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z2e implements b3e {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final double h;
    public final boolean i;
    public final String j;

    public z2e(int i, String str, int i2, String str2, int i3, String str3, int i4, double d, boolean z) {
        me4.p(str, str2, str3);
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = d;
        this.i = z;
        StringBuilder s = lnb.s(i, i3, "PlayerUiModel: playerId:", " teamId:", " seasonId:");
        me4.q(s, i2, " uniqueTournamentId:", i4, " rating:");
        s.append(d);
        this.j = s.toString();
    }

    @Override // defpackage.b3e
    public final String a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2e)) {
            return false;
        }
        z2e z2eVar = (z2e) obj;
        return this.a == z2eVar.a && Intrinsics.c(this.b, z2eVar.b) && this.c == z2eVar.c && Intrinsics.c(this.d, z2eVar.d) && this.e == z2eVar.e && Intrinsics.c(this.f, z2eVar.f) && this.g == z2eVar.g && Double.compare(this.h, z2eVar.h) == 0 && this.i == z2eVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + dmi.b(wv8.a(this.g, dmi.c(wv8.a(this.e, dmi.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PlayerUiModel(playerId=", ", playerName=", this.b, ", seasonId=");
        vxd.p(this.c, ", seasonName=", this.d, ", teamId=", t);
        vxd.p(this.e, ", teamName=", this.f, ", uniqueTournamentId=", t);
        t.append(this.g);
        t.append(", rating=");
        t.append(this.h);
        t.append(", isLast=");
        t.append(this.i);
        t.append(")");
        return t.toString();
    }
}
