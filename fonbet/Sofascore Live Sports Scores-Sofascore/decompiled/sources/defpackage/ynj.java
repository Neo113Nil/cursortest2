package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ynj {
    public final gv9 a;
    public final gv9 b;
    public final boj c;
    public final rnj d;
    public final boolean e;
    public final qnj f;

    public ynj(gv9 gv9Var, gv9 gv9Var2, boj bojVar, rnj rnjVar, boolean z, qnj qnjVar) {
        gv9Var2.getClass();
        qnjVar.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = bojVar;
        this.d = rnjVar;
        this.e = z;
        this.f = qnjVar;
    }

    public static ynj a(ynj ynjVar, gv9 gv9Var, gv9 gv9Var2, boj bojVar, boolean z, qnj qnjVar, int i) {
        if ((i & 1) != 0) {
            gv9Var = ynjVar.a;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i & 2) != 0) {
            gv9Var2 = ynjVar.b;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i & 4) != 0) {
            bojVar = ynjVar.c;
        }
        boj bojVar2 = bojVar;
        rnj rnjVar = ynjVar.d;
        if ((i & 16) != 0) {
            z = ynjVar.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            qnjVar = ynjVar.f;
        }
        qnj qnjVar2 = qnjVar;
        ynjVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        qnjVar2.getClass();
        return new ynj(gv9Var3, gv9Var4, bojVar2, rnjVar, z2, qnjVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj)) {
            return false;
        }
        ynj ynjVar = (ynj) obj;
        return this.a.equals(ynjVar.a) && Intrinsics.c(this.b, ynjVar.b) && this.c == ynjVar.c && this.d.equals(ynjVar.d) && this.e == ynjVar.e && Intrinsics.c(this.f, ynjVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dmi.e((this.d.hashCode() + ((this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder l = wv8.l("TopStatsState(topPerformanceItems=", this.a, ", filteredPerformanceItems=", this.b, ", topStatsType=");
        l.append(this.c);
        l.append(", topStatsInfo=");
        l.append(this.d);
        l.append(", isLoading=");
        l.append(this.e);
        l.append(", topStatsHeaders=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}
