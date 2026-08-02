package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ysi implements zsi {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final gv9 g;

    public ysi(int i, int i2, String str, String str2, Integer num, Integer num2, gv9 gv9Var) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = num2;
        this.g = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysi)) {
            return false;
        }
        ysi ysiVar = (ysi) obj;
        return this.a == ysiVar.a && this.b == ysiVar.b && this.c.equals(ysiVar.c) && this.d.equals(ysiVar.d) && Intrinsics.c(this.e, ysiVar.e) && Intrinsics.c(this.f, ysiVar.f) && this.g.equals(ysiVar.g);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        Integer num = this.e;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return this.g.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "IceHockey(homeTeamId=", ", awayTeamId=", ", homeNameCode=");
        bf3.v(s, this.c, ", awayNameCode=", this.d, ", homeShotsOnGoal=");
        vxd.r(this.e, this.f, ", awayShotsOnGoal=", ", periods=", s);
        s.append(this.g);
        s.append(")");
        return s.toString();
    }
}
