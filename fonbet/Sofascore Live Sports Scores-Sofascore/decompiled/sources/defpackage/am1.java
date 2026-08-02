package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class am1 {
    public final int a;
    public final int b;
    public final String c;
    public final gv9 d;

    public am1(int i, int i2, String str, gv9 gv9Var) {
        str.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return this.a == am1Var.a && this.b == am1Var.b && Intrinsics.c(this.c, am1Var.c) && Intrinsics.c(this.d, am1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BaseballSeasonStatisticsSeasonUiModel(seasonId=", ", tournamentId=", ", yearLabel=");
        s.append(this.c);
        s.append(", availableSubSeasonTypes=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
