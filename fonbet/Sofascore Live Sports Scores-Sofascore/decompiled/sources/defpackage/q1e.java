package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q1e {
    public final gv9 a;
    public final p1e b;
    public final e1e c;

    public q1e(gv9 gv9Var, p1e p1eVar, e1e e1eVar) {
        gv9Var.getClass();
        p1eVar.getClass();
        this.a = gv9Var;
        this.b = p1eVar;
        this.c = e1eVar;
    }

    public static q1e a(q1e q1eVar, gv9 gv9Var, p1e p1eVar, e1e e1eVar, int i) {
        if ((i & 1) != 0) {
            gv9Var = q1eVar.a;
        }
        if ((i & 2) != 0) {
            p1eVar = q1eVar.b;
        }
        if ((i & 4) != 0) {
            e1eVar = q1eVar.c;
        }
        q1eVar.getClass();
        gv9Var.getClass();
        p1eVar.getClass();
        return new q1e(gv9Var, p1eVar, e1eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e)) {
            return false;
        }
        q1e q1eVar = (q1e) obj;
        return Intrinsics.c(this.a, q1eVar.a) && Intrinsics.c(this.b, q1eVar.b) && this.c.equals(q1eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "POTSHighestRatedPlayersState(years=" + this.a + ", selectedYear=" + this.b + ", selectedFilters=" + this.c + ")";
    }
}
