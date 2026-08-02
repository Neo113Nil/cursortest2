package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q5j {
    public final int a;
    public final int b;
    public final gv9 c;

    public q5j(int i, int i2, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5j)) {
            return false;
        }
        q5j q5jVar = (q5j) obj;
        return this.a == q5jVar.a && this.b == q5jVar.b && Intrinsics.c(this.c, q5jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "TennisEventRankingUIModel(homeTeamId=", ", awayTeamId=", ", rankings=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
