package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xgl implements eil {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public xgl(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgl)) {
            return false;
        }
        xgl xglVar = (xgl) obj;
        return this.a == xglVar.a && this.b == xglVar.b && this.c.equals(xglVar.c) && this.d.equals(xglVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return fc6.o(lnb.s(this.a, this.b, "OpenHighlightsActivity(highlightId=", ", teamId=", ", title="), this.c, ", url=", this.d, ")");
    }
}
