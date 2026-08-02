package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zye implements cze {
    public final String a;
    public final String b;
    public final boolean c;
    public final gv9 d;
    public final gv9 e;
    public final int f;
    public final int g;
    public final boolean h;
    public final Integer i;

    public zye(String str, String str2, boolean z, gv9 gv9Var, gv9 gv9Var2, int i, int i2, boolean z2, Integer num) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = gv9Var;
        this.e = gv9Var2;
        this.f = i;
        this.g = i2;
        this.h = z2;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zye)) {
            return false;
        }
        zye zyeVar = (zye) obj;
        return this.a.equals(zyeVar.a) && this.b.equals(zyeVar.b) && this.c == zyeVar.c && Intrinsics.c(this.d, zyeVar.d) && Intrinsics.c(this.e, zyeVar.e) && this.f == zyeVar.f && this.g == zyeVar.g && this.h == zyeVar.h && Intrinsics.c(this.i, zyeVar.i);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.g, wv8.a(this.f, ljg.d(ljg.d(dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
        Integer num = this.i;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder s = mz1.s("DetailedGame(homeScore=", this.a, ", awayScore=", this.b, ", isHome=");
        s.append(this.c);
        s.append(", points=");
        s.append(this.d);
        s.append(", playerLabels=");
        s.append(this.e);
        s.append(", winnerType=");
        s.append(this.f);
        s.append(", liveIconRes=");
        s.append(this.g);
        s.append(", isLastItem=");
        s.append(this.h);
        s.append(", openablePlayerId=");
        return vxd.n(s, this.i, ")");
    }
}
