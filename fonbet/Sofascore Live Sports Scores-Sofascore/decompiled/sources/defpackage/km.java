package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class km implements mm {
    public final gv9 a;
    public final gv9 b;
    public final hm c;
    public final dm d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final Boolean k;
    public final r9k l;
    public final r9k m;

    public km(gv9 gv9Var, gv9 gv9Var2, hm hmVar, dm dmVar, int i, int i2, String str, String str2, String str3, Boolean bool, Boolean bool2, r9k r9kVar, r9k r9kVar2) {
        gv9Var.getClass();
        str3.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = hmVar;
        this.d = dmVar;
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = bool;
        this.k = bool2;
        this.l = r9kVar;
        this.m = r9kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return Intrinsics.c(this.a, kmVar.a) && Intrinsics.c(this.b, kmVar.b) && this.c.equals(kmVar.c) && Intrinsics.c(this.d, kmVar.d) && this.e == kmVar.e && this.f == kmVar.f && this.g.equals(kmVar.g) && this.h.equals(kmVar.h) && Intrinsics.c(this.i, kmVar.i) && Intrinsics.c(this.j, kmVar.j) && Intrinsics.c(this.k, kmVar.k) && this.l.equals(kmVar.l) && this.m.equals(kmVar.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gv9 gv9Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31)) * 31;
        dm dmVar = this.d;
        int c = dmi.c(dmi.c(dmi.c(wv8.a(this.f, wv8.a(this.e, (hashCode2 + (dmVar == null ? 0 : dmVar.hashCode())) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i);
        Boolean bool = this.j;
        int hashCode3 = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        return this.m.hashCode() + ((this.l.hashCode() + ((hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("Football(sections=", this.a, ", halftimeSections=", this.b, ", predictions=");
        l.append(this.c);
        l.append(", halftimePredictions=");
        l.append(this.d);
        l.append(", homeTeamId=");
        me4.q(l, this.e, ", awayTeamId=", this.f, ", homeTeamName=");
        bf3.v(l, this.g, ", awayTeamName=", this.h, ", statusType=");
        l.append(this.i);
        l.append(", correctAiInsight=");
        l.append(this.j);
        l.append(", correctHalftimeAiInsight=");
        l.append(this.k);
        l.append(", prematchPredictedOutcome=");
        l.append(this.l);
        l.append(", halftimePredictedOutcome=");
        l.append(this.m);
        l.append(")");
        return l.toString();
    }
}
