package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jm5 implements edd {
    public final gv9 a;
    public final mea b;
    public final long c;
    public final int d;
    public final int e;

    public jm5(b7 b7Var, mea meaVar, long j, int i, int i2) {
        b7Var.getClass();
        meaVar.getClass();
        this.a = b7Var;
        this.b = meaVar;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.edd
    public final gv9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm5)) {
            return false;
        }
        jm5 jm5Var = (jm5) obj;
        return Intrinsics.c(this.a, jm5Var.a) && this.b == jm5Var.b && this.c == jm5Var.c && this.d == jm5Var.d && this.e == jm5Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wv8.a(this.d, ljg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyLeaderboardUiModel(leagues=");
        sb.append(this.a);
        sb.append(", joinCompetitionAction=");
        sb.append(this.b);
        sb.append(", leagueEndTimestamp=");
        sb.append(this.c);
        sb.append(", titleRes=");
        sb.append(this.d);
        return fn0.k(this.e, ", subtitleRes=", ")", sb);
    }
}
