package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ls0 extends hb3 {
    public final hu0 a;

    public ls0(hu0 hu0Var) {
        gb3 gb3Var = gb3.a;
        this.a = hu0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb3)) {
            return false;
        }
        if (!this.a.equals(((ls0) ((hb3) obj)).a)) {
            return false;
        }
        Object obj2 = gb3.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ gb3.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + gb3.a + "}";
    }
}
