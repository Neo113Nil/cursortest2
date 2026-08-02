package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mj7 implements Serializable {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final Float g;
    public final Long h;
    public final Integer i;
    public final int j;
    public final String k;
    public final int l;
    public final jj7 m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public mj7(int i, String str, int i2, long j, long j2, long j3, Float f, Long l, Integer num, int i3, String str2, int i4, jj7 jj7Var, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = f;
        this.h = l;
        this.i = num;
        this.j = i3;
        this.k = str2;
        this.l = i4;
        this.m = jj7Var;
        this.n = z;
        this.o = z2;
        this.p = z3;
    }

    public final boolean d() {
        return this.f < yaa.w();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj7)) {
            return false;
        }
        mj7 mj7Var = (mj7) obj;
        return this.a == mj7Var.a && Intrinsics.c(this.b, mj7Var.b) && this.c == mj7Var.c && this.d == mj7Var.d && this.e == mj7Var.e && this.f == mj7Var.f && Intrinsics.c(this.g, mj7Var.g) && Intrinsics.c(this.h, mj7Var.h) && Intrinsics.c(this.i, mj7Var.i) && this.j == mj7Var.j && Intrinsics.c(this.k, mj7Var.k) && this.l == mj7Var.l && this.m == mj7Var.m && this.n == mj7Var.n && this.o == mj7Var.o && this.p == mj7Var.p;
    }

    public final boolean g() {
        long w = yaa.w();
        return this.e <= w && w <= this.f;
    }

    public final boolean h() {
        return this.d < yaa.w();
    }

    public final int hashCode() {
        int c = ljg.c(ljg.c(ljg.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
        Float f = this.g;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.h;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.i;
        int a = wv8.a(this.j, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.k;
        return Boolean.hashCode(this.p) + dmi.e(dmi.e((this.m.hashCode() + wv8.a(this.l, (a + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31, 31, this.n), 31, this.o);
    }

    public final boolean i() {
        Long l = this.h;
        return l == null || l.longValue() < yaa.w();
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyRoundUiModel(id=", ", name=", this.b, ", sequence=");
        t.append(this.c);
        t.append(", deadlineTimestamp=");
        t.append(this.d);
        fn0.t(this.e, ", startTimestamp=", ", endTimestamp=", t);
        t.append(this.f);
        t.append(", averagePoints=");
        t.append(this.g);
        t.append(", revealTimestamp=");
        t.append(this.h);
        t.append(", highestPoints=");
        t.append(this.i);
        fn0.s(this.j, ", competitionId=", ", highestPointsUserId=", this.k, t);
        t.append(", maxPlayersFromSameTeam=");
        t.append(this.l);
        t.append(", status=");
        t.append(this.m);
        fn0.y(", isPlaceholderRound=", ", isFinalized=", t, this.n, this.o);
        t.append(", rebuildSquadActive=");
        t.append(this.p);
        t.append(")");
        return t.toString();
    }
}
