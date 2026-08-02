package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yil {
    public final gv9 a;
    public final gv9 b;
    public final xil c;

    public yil(gv9 gv9Var, gv9 gv9Var2, xil xilVar) {
        gv9Var.getClass();
        xilVar.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = xilVar;
    }

    public static yil a(yil yilVar, gv9 gv9Var, xil xilVar, int i) {
        gv9 gv9Var2 = yilVar.a;
        if ((i & 4) != 0) {
            xilVar = yilVar.c;
        }
        yilVar.getClass();
        gv9Var2.getClass();
        xilVar.getClass();
        return new yil(gv9Var2, gv9Var, xilVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yil)) {
            return false;
        }
        yil yilVar = (yil) obj;
        return Intrinsics.c(this.a, yilVar.a) && Intrinsics.c(this.b, yilVar.b) && this.c == yilVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gv9 gv9Var = this.b;
        return this.c.hashCode() + ((hashCode + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = wv8.l("WorldCupStatsLeadersUiModel(buttons=", this.a, ", categories=", this.b, ", selectedFilter=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
