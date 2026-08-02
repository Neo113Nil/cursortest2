package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nkh implements fm8 {
    public final int a;
    public final vv3 b;

    public nkh(int i, vv3 vv3Var) {
        vv3Var.getClass();
        this.a = i;
        this.b = vv3Var;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 5500;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkh)) {
            return false;
        }
        nkh nkhVar = (nkh) obj;
        return this.a == nkhVar.a && this.b == nkhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(5500) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "SkillBarCard(value=" + this.a + ", coverageType=" + this.b + ", durationMilliseconds=5500)";
    }
}
