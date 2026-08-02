package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kxi {
    public final int a;
    public final double b;
    public final jmf c;

    public kxi(int i, double d, jmf jmfVar) {
        jmfVar.getClass();
        this.a = i;
        this.b = d;
        this.c = jmfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxi)) {
            return false;
        }
        kxi kxiVar = (kxi) obj;
        return this.a == kxiVar.a && Double.compare(this.b, kxiVar.b) == 0 && this.c == kxiVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "TeamRankingUiModel(ranking=" + this.a + ", points=" + this.b + ", category=" + this.c + ")";
    }
}
