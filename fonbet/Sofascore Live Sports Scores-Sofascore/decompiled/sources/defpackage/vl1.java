package defpackage;

import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vl1 {
    public final BaseballSeasonPitchesPerspective a;
    public final int b;
    public final int c;
    public final gv9 d;
    public final ll1 e;
    public final gv9 f;
    public final kl1 g;
    public final ql1 h;
    public final Boolean i;
    public final jl1 j;

    public vl1(BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, int i, int i2, gv9 gv9Var, ll1 ll1Var, b7 b7Var, kl1 kl1Var, ql1 ql1Var, Boolean bool, jl1 jl1Var) {
        gv9Var.getClass();
        b7Var.getClass();
        kl1Var.getClass();
        this.a = baseballSeasonPitchesPerspective;
        this.b = i;
        this.c = i2;
        this.d = gv9Var;
        this.e = ll1Var;
        this.f = b7Var;
        this.g = kl1Var;
        this.h = ql1Var;
        this.i = bool;
        this.j = jl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl1)) {
            return false;
        }
        vl1 vl1Var = (vl1) obj;
        return this.a == vl1Var.a && this.b == vl1Var.b && this.c == vl1Var.c && Intrinsics.c(this.d, vl1Var.d) && this.e == vl1Var.e && Intrinsics.c(this.f, vl1Var.f) && this.g == vl1Var.g && this.h.equals(vl1Var.h) && Intrinsics.c(this.i, vl1Var.i) && Intrinsics.c(this.j, vl1Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ljg.d((this.e.hashCode() + ljg.d(wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31, this.f)) * 31)) * 31;
        Boolean bool = this.i;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        jl1 jl1Var = this.j;
        return hashCode2 + (jl1Var != null ? jl1Var.hashCode() : 0);
    }

    public final String toString() {
        return "BaseballSeasonChartState(perspective=" + this.a + ", titleIconResId=" + this.b + ", titleResId=" + this.c + ", availableSections=" + this.d + ", selectedSection=" + this.e + ", availableDisplayTypes=" + this.f + ", selectedDisplayType=" + this.g + ", rememberedDisplayTypes=" + this.h + ", lastFilterChangePrimary=" + this.i + ", displayedChartData=" + this.j + ")";
    }
}
