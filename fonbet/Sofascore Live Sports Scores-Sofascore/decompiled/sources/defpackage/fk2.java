package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fk2 {
    public final int a;
    public final boolean b;

    public fk2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk2)) {
            return false;
        }
        fk2 fk2Var = (fk2) obj;
        return this.a == fk2Var.a && this.b == fk2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CardData(cardIcon=" + this.a + ", isRedCard=" + this.b + ")";
    }
}
