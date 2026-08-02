package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fbe extends wbe {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public fbe(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbe)) {
            return false;
        }
        fbe fbeVar = (fbe) obj;
        return Float.compare(this.c, fbeVar.c) == 0 && Float.compare(this.d, fbeVar.d) == 0 && Float.compare(this.e, fbeVar.e) == 0 && Float.compare(this.f, fbeVar.f) == 0 && Float.compare(this.g, fbeVar.g) == 0 && Float.compare(this.h, fbeVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + fc6.a(this.g, fc6.a(this.f, fc6.a(this.e, fc6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return wt3.n(sb, this.h, ')');
    }
}
