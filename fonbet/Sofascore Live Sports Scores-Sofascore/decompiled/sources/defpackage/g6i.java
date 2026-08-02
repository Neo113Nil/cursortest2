package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g6i {
    public final int a;
    public final r9k b;
    public final d6i c;
    public final gv9 d;
    public final gv9 e;
    public final wmd f;
    public final old g;

    public g6i(int i, r9k r9kVar, d6i d6iVar, gv9 gv9Var, gv9 gv9Var2, wmd wmdVar, old oldVar) {
        gv9Var2.getClass();
        this.a = i;
        this.b = r9kVar;
        this.c = d6iVar;
        this.d = gv9Var;
        this.e = gv9Var2;
        this.f = wmdVar;
        this.g = oldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6i)) {
            return false;
        }
        g6i g6iVar = (g6i) obj;
        return this.a == g6iVar.a && Intrinsics.c(this.b, g6iVar.b) && this.c == g6iVar.c && Intrinsics.c(this.d, g6iVar.d) && Intrinsics.c(this.e, g6iVar.e) && this.f.equals(g6iVar.f) && this.g.equals(g6iVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        r9k r9kVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31)) * 31;
        gv9 gv9Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ljg.d((hashCode2 + (gv9Var != null ? gv9Var.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        return "StageOddsUIModel(marketId=" + this.a + ", marketTitle=" + this.b + ", rowType=" + this.c + ", marketChoiceLabels=" + this.d + ", oddRows=" + this.e + ", stage=" + this.f + ", countryProviderUIModel=" + this.g + ")";
    }
}
