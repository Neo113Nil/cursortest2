package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ql1 {
    public final kl1 a;
    public final kl1 b;

    public ql1(kl1 kl1Var, kl1 kl1Var2) {
        kl1Var.getClass();
        kl1Var2.getClass();
        this.a = kl1Var;
        this.b = kl1Var2;
    }

    public static ql1 a(ql1 ql1Var, kl1 kl1Var, kl1 kl1Var2, int i) {
        if ((i & 1) != 0) {
            kl1Var = ql1Var.a;
        }
        if ((i & 2) != 0) {
            kl1Var2 = ql1Var.b;
        }
        kl1Var.getClass();
        kl1Var2.getClass();
        return new ql1(kl1Var, kl1Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        return this.a == ql1Var.a && this.b == ql1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RememberedDisplayTypes(pointGraph=" + this.a + ", zoneGraph=" + this.b + ")";
    }
}
