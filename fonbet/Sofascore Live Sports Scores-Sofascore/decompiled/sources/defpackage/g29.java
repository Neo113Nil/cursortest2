package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g29 {
    public final r9k a;
    public final int b;
    public final gv9 c;

    public g29(r9k r9kVar, int i, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = r9kVar;
        this.b = i;
        this.c = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g29)) {
            return false;
        }
        g29 g29Var = (g29) obj;
        return this.a.equals(g29Var.a) && this.b == g29Var.b && Intrinsics.c(this.c, g29Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GrandSlamTournamentUIModel(name=" + this.a + ", uniqueTournamentId=" + this.b + ", results=" + this.c + ")";
    }
}
