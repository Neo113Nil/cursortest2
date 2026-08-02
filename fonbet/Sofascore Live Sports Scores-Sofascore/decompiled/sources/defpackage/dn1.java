package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dn1 {
    public final q9k a;
    public final String b;

    public dn1(q9k q9kVar, String str) {
        this.a = q9kVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return this.a.equals(dn1Var.a) && this.b.equals(dn1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BaseballUmpireItem(label=" + this.a + ", name=" + this.b + ")";
    }
}
