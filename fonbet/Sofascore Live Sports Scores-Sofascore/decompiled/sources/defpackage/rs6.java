package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rs6 implements at6 {
    public final int a;
    public final int b;

    public rs6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs6)) {
            return false;
        }
        rs6 rs6Var = (rs6) obj;
        return this.a == rs6Var.a && this.b == rs6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "OnRevealFixturesClick(roundId=", ", roundSequence=", ")");
    }
}
