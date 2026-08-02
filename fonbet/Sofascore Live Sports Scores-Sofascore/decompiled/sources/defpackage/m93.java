package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m93 {
    public final Integer a;
    public final String b;
    public final gv9 c;
    public final boolean d;

    public m93(Integer num, String str, gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = num;
        this.b = str;
        this.c = gv9Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m93)) {
            return false;
        }
        m93 m93Var = (m93) obj;
        return Intrinsics.c(this.a, m93Var.a) && Intrinsics.c(this.b, m93Var.b) && Intrinsics.c(this.c, m93Var.c) && this.d == m93Var.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + ljg.d((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = wv8.m("ComparisonTournamentSeasons(uniqueTournamentId=", this.a, ", uniqueTournamentName=", this.b, ", seasons=");
        m.append(this.c);
        m.append(", isDirectlySelectable=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
