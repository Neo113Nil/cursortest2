package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tld {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public tld(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tld)) {
            return false;
        }
        tld tldVar = (tld) obj;
        return this.a == tldVar.a && this.b == tldVar.b && this.c == tldVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(w1l.k("OddsPromotionState(showAffiliateLink=", this.a, ", hasBetBoost=", this.b, ", showBetBoost="), this.c, ")");
    }
}
