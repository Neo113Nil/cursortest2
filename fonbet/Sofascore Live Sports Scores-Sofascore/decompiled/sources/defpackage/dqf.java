package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dqf {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final old e;
    public final gv9 f;

    public dqf(int i, Integer num, Integer num2, String str, old oldVar, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = oldVar;
        this.f = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqf)) {
            return false;
        }
        dqf dqfVar = (dqf) obj;
        return this.a == dqfVar.a && Intrinsics.c(this.b, dqfVar.b) && Intrinsics.c(this.c, dqfVar.c) && this.d.equals(dqfVar.d) && this.e.equals(dqfVar.e) && Intrinsics.c(this.f, dqfVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + dmi.c((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder r = fc6.r("RecommendedOddsTournamentUIModel(tournamentId=", ", uniqueTournamentId=", ", seasonId=", this.b, this.a);
        vxd.s(this.c, ", tournamentName=", this.d, ", countryProvider=", r);
        r.append(this.e);
        r.append(", events=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
