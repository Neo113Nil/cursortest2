package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aw7 implements pw7 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public aw7(int i, int i2) {
        boolean z = (i2 & 2) == 0;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 8) == 0;
        boolean z4 = (i2 & 16) == 0;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw7)) {
            return false;
        }
        aw7 aw7Var = (aw7) obj;
        return this.a == aw7Var.a && this.b == aw7Var.b && this.c == aw7Var.c && this.d == aw7Var.d && this.e == aw7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(dmi.e(dmi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenEventAction(eventId=");
        sb.append(this.a);
        sb.append(", isGroupCard=");
        sb.append(this.b);
        sb.append(", isStackCard=");
        vxd.t(", isEndStackCard=", ", isAnalystCard=", sb, this.c, this.d);
        return wt3.p(sb, this.e, ")");
    }
}
