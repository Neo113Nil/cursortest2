package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mn1 {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final Integer e;
    public final gv9 f;

    public mn1(int i, int i2, boolean z, int i3, Integer num, gv9 gv9Var) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = num;
        this.f = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn1)) {
            return false;
        }
        mn1 mn1Var = (mn1) obj;
        return this.a == mn1Var.a && this.b == mn1Var.b && this.c == mn1Var.c && this.d == mn1Var.d && Intrinsics.c(this.e, mn1Var.e) && this.f.equals(mn1Var.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, dmi.e(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
        Integer num = this.e;
        return this.f.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BaseballWinProbabilityGraphData(topTeamId=", ", bottomTeamId=", ", isLive=");
        s.append(this.c);
        s.append(", totalInningsToShow=");
        s.append(this.d);
        s.append(", currentInning=");
        s.append(this.e);
        s.append(", graphPoints=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
