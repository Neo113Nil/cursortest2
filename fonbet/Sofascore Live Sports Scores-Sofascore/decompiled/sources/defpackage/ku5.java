package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ku5 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final gv9 f;
    public final Double g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public ku5(int i, String str, String str2, String str3, String str4, gv9 gv9Var, Double d, Integer num, boolean z, boolean z2, boolean z3) {
        str.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = gv9Var;
        this.g = d;
        this.h = num;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku5)) {
            return false;
        }
        ku5 ku5Var = (ku5) obj;
        return this.a == ku5Var.a && Intrinsics.c(this.b, ku5Var.b) && this.c.equals(ku5Var.c) && Intrinsics.c(this.d, ku5Var.d) && Intrinsics.c(this.e, ku5Var.e) && Intrinsics.c(this.f, ku5Var.f) && Intrinsics.c(this.g, ku5Var.g) && Intrinsics.c(this.h, ku5Var.h) && this.i == ku5Var.i && this.j == ku5Var.j && this.k == ku5Var.k;
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int d = ljg.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Double d2 = this.g;
        int hashCode2 = (d + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.h;
        return Boolean.hashCode(this.k) + dmi.e(dmi.e((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "EventBoxScorePlayerUiModel(playerId=", ", playerName=", this.b, ", playerAcronym=");
        bf3.v(t, this.c, ", playerPosition=", this.d, ", jerseyNumber=");
        t.append(this.e);
        t.append(", statList=");
        t.append(this.f);
        t.append(", rating=");
        mz1.x(this.g, this.h, ", teamId=", ", showStarterIndicator=", t);
        vxd.t(", showEjected=", ", inPlay=", t, this.i, this.j);
        return wt3.p(t, this.k, ")");
    }
}
