package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class do7 implements Serializable {
    public final int a;
    public final String b;
    public final ev6 c;
    public final Integer d;
    public final Integer e;
    public final Float f;
    public final String g;
    public final mj7 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Integer l;
    public final mj7 m;

    public do7(int i, String str, ev6 ev6Var, Integer num, Integer num2, Float f, String str2, mj7 mj7Var, boolean z, boolean z2, boolean z3, Integer num3) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = ev6Var;
        this.d = num;
        this.e = num2;
        this.f = f;
        this.g = str2;
        this.h = mj7Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = num3;
        int i2 = mj7Var.c;
        mj7 mj7Var2 = ev6Var.i;
        this.m = i2 <= mj7Var2.c ? mj7Var2 : mj7Var;
    }

    public static do7 a(do7 do7Var, String str, ev6 ev6Var, int i) {
        int i2 = do7Var.a;
        if ((i & 2) != 0) {
            str = do7Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            ev6Var = do7Var.c;
        }
        Integer num = do7Var.d;
        Integer num2 = do7Var.e;
        Float f = do7Var.f;
        String str3 = do7Var.g;
        mj7 mj7Var = do7Var.h;
        boolean z = do7Var.i;
        boolean z2 = do7Var.j;
        boolean z3 = do7Var.k;
        Integer num3 = do7Var.l;
        do7Var.getClass();
        str2.getClass();
        str3.getClass();
        return new do7(i2, str2, ev6Var, num, num2, f, str3, mj7Var, z, z2, z3, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do7)) {
            return false;
        }
        do7 do7Var = (do7) obj;
        return this.a == do7Var.a && Intrinsics.c(this.b, do7Var.b) && this.c.equals(do7Var.c) && Intrinsics.c(this.d, do7Var.d) && Intrinsics.c(this.e, do7Var.e) && Intrinsics.c(this.f, do7Var.f) && Intrinsics.c(this.g, do7Var.g) && this.h.equals(do7Var.h) && this.i == do7Var.i && this.j == do7Var.j && this.k == do7Var.k && Intrinsics.c(this.l, do7Var.l);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.f;
        int e = dmi.e(dmi.e(dmi.e((this.h.hashCode() + dmi.c((hashCode3 + (f == null ? 0 : f.hashCode())) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k);
        Integer num3 = this.l;
        return e + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyUserCompetitionUiModel(id=", ", name=", this.b, ", competition=");
        t.append(this.c);
        t.append(", totalScore=");
        t.append(this.d);
        t.append(", roundScore=");
        t.append(this.e);
        t.append(", avgScore=");
        t.append(this.f);
        t.append(", userName=");
        t.append(this.g);
        t.append(", joinedInRound=");
        t.append(this.h);
        t.append(", wildcards=");
        vxd.t(", freeHits=", ", tripleCaptains=", t, this.i, this.j);
        t.append(this.k);
        t.append(", rank=");
        t.append(this.l);
        t.append(")");
        return t.toString();
    }
}
