package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ava {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Gender l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public ava(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Gender gender, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = gender;
        this.m = z11;
        this.n = z12;
        this.o = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ava)) {
            return false;
        }
        ava avaVar = (ava) obj;
        return Intrinsics.c(this.a, avaVar.a) && this.b == avaVar.b && this.c == avaVar.c && this.d == avaVar.d && this.e == avaVar.e && this.f == avaVar.f && this.g == avaVar.g && this.h == avaVar.h && this.i == avaVar.i && this.j == avaVar.j && this.k == avaVar.k && this.l == avaVar.l && this.m == avaVar.m && this.n == avaVar.n && this.o == avaVar.o;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Gender gender = this.l;
        return Boolean.hashCode(this.o) + dmi.e(dmi.e((e + (gender == null ? 0 : gender.hashCode())) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeagueDetailsHeadFlags(sport=");
        sb.append(this.a);
        sb.append(", details=");
        sb.append(this.b);
        sb.append(", events=");
        vxd.t(", standings=", ", cupTree=", sb, this.c, this.d);
        vxd.t(", topPlayers=", ", cricketStatistics=", sb, this.e, this.f);
        vxd.t(", topTeams=", ", topStats=", sb, this.g, this.h);
        vxd.t(", powerRankings=", ", hasActiveCupTree=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", gender=");
        sb.append(this.l);
        sb.append(", transactions=");
        vxd.t(", draft=", ", awards=", sb, this.m, this.n);
        return wt3.p(sb, this.o, ")");
    }
}
