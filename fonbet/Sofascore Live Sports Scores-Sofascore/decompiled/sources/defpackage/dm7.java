package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dm7 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final rz6 e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;

    public dm7(int i, int i2, int i3, String str, rz6 rz6Var, String str2, String str3, int i4, String str4) {
        str.getClass();
        rz6Var.getClass();
        str3.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = rz6Var;
        this.f = str2;
        this.g = str3;
        this.h = i4;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm7)) {
            return false;
        }
        dm7 dm7Var = (dm7) obj;
        return this.a == dm7Var.a && this.b == dm7Var.b && this.c == dm7Var.c && Intrinsics.c(this.d, dm7Var.d) && this.e == dm7Var.e && this.f.equals(dm7Var.f) && Intrinsics.c(this.g, dm7Var.g) && this.h == dm7Var.h && this.i.equals(dm7Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + wv8.a(this.h, dmi.c(dmi.c((this.e.hashCode() + dmi.c(wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "FantasyTopPlayerItem(id=", ", playerId=", ", teamId=");
        vxd.p(this.c, ", playerName=", this.d, ", position=", s);
        s.append(this.e);
        s.append(", teamNameCode=");
        s.append(this.f);
        s.append(", points=");
        w1l.q(this.h, this.g, ", competitionId=", ", price=", s);
        return mz1.o(s, this.i, ")");
    }
}
