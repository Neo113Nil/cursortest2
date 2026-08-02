package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r14 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public r14(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r14)) {
            return false;
        }
        r14 r14Var = (r14) obj;
        return this.a.equals(r14Var.a) && this.b == r14Var.b && this.c == r14Var.c && this.d == r14Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return me4.i(mz1.q(this.b, "ZoneData(zoneName=", this.a, ", fours=", ", sixes="), this.c, ", runs=", this.d, ")");
    }
}
