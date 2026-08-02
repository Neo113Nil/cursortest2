package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iua {
    public final cn2 a;
    public final gv9 b;
    public final gv9 c;
    public final rui d;

    public iua(cn2 cn2Var, gv9 gv9Var, gv9 gv9Var2, rui ruiVar) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = cn2Var;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = ruiVar;
    }

    public static iua a(iua iuaVar, cn2 cn2Var, gv9 gv9Var, gv9 gv9Var2, rui ruiVar, int i) {
        if ((i & 1) != 0) {
            cn2Var = iuaVar.a;
        }
        if ((i & 2) != 0) {
            gv9Var = iuaVar.b;
        }
        if ((i & 4) != 0) {
            gv9Var2 = iuaVar.c;
        }
        if ((i & 8) != 0) {
            ruiVar = iuaVar.d;
        }
        iuaVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        return new iua(cn2Var, gv9Var, gv9Var2, ruiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iua)) {
            return false;
        }
        iua iuaVar = (iua) obj;
        return Intrinsics.c(this.a, iuaVar.a) && Intrinsics.c(this.b, iuaVar.b) && Intrinsics.c(this.c, iuaVar.c) && Intrinsics.c(this.d, iuaVar.d);
    }

    public final int hashCode() {
        cn2 cn2Var = this.a;
        int d = ljg.d(ljg.d((cn2Var == null ? 0 : cn2Var.hashCode()) * 31, 31, this.b), 31, this.c);
        rui ruiVar = this.d;
        return d + (ruiVar != null ? ruiVar.hashCode() : 0);
    }

    public final String toString() {
        return "LeagueAwardsState(champions=" + this.a + ", conferenceChampions=" + this.b + ", individualAwards=" + this.c + ", teamAwardsData=" + this.d + ")";
    }
}
