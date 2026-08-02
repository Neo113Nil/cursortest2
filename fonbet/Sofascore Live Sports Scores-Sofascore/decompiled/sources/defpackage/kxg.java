package defpackage;

import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kxg implements nxg {
    public final e93 a;
    public final ComparisonSeasonInfo b;

    public kxg(e93 e93Var, ComparisonSeasonInfo comparisonSeasonInfo) {
        e93Var.getClass();
        this.a = e93Var;
        this.b = comparisonSeasonInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxg)) {
            return false;
        }
        kxg kxgVar = (kxg) obj;
        return this.a == kxgVar.a && this.b.equals(kxgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSeasonSelected(slotIndex=" + this.a + ", seasonInfo=" + this.b + ")";
    }
}
