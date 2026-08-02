package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ul7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ul7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul7)) {
            return false;
        }
        ul7 ul7Var = (ul7) obj;
        return this.a == ul7Var.a && this.b == ul7Var.b && this.c == ul7Var.c && this.d == ul7Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return me4.i(lnb.s(this.a, this.b, "FantasyTokenColorScheme(topBackgroundColorRes=", ", bottomBackgroundColorRes=", ", topTextColorRes="), this.c, ", bottomTextColorRes=", this.d, ")");
    }
}
