package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xwc {
    public final int a;
    public final int b;
    public final float c;

    public xwc(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static xwc a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new xwc(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xwc)) {
            return false;
        }
        xwc xwcVar = (xwc) obj;
        return this.a == xwcVar.a && this.b == xwcVar.b && Float.compare(this.c, xwcVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.a);
        sb.append(", originator=");
        sb.append(this.b);
        sb.append(", gain=");
        return wt3.n(sb, this.c, '}');
    }
}
