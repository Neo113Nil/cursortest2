package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o22 {
    public final String a;
    public final double b;
    public final boolean c;

    public o22(String str, double d, boolean z) {
        this.a = str;
        this.b = d;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) obj;
        return this.a.equals(o22Var.a) && Double.compare(this.b, o22Var.b) == 0 && this.c == o22Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BoxScoreStatCell(value=" + this.a + ", compareValue=" + this.b + ", isWide=" + this.c + ")";
    }
}
