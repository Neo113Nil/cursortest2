package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lm1 {
    public final int a;
    public final mm1 b;
    public final String c;
    public final String d;
    public final String e;

    public lm1(int i, mm1 mm1Var, String str, String str2, String str3) {
        this.a = i;
        this.b = mm1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm1)) {
            return false;
        }
        lm1 lm1Var = (lm1) obj;
        return this.a == lm1Var.a && this.b == lm1Var.b && this.c.equals(lm1Var.c) && this.d.equals(lm1Var.d) && this.e.equals(lm1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.c(dmi.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseballTablePitcherData(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", name=");
        bf3.v(sb, this.c, ", firstLabel=", this.d, ", secondLabel=");
        return mz1.o(sb, this.e, ")");
    }
}
