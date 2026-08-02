package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dbe extends wbe {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public dbe(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbe)) {
            return false;
        }
        dbe dbeVar = (dbe) obj;
        return Float.compare(this.c, dbeVar.c) == 0 && Float.compare(this.d, dbeVar.d) == 0 && Float.compare(this.e, dbeVar.e) == 0 && this.f == dbeVar.f && this.g == dbeVar.g && Float.compare(this.h, dbeVar.h) == 0 && Float.compare(this.i, dbeVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + fc6.a(this.h, dmi.e(dmi.e(fc6.a(this.e, fc6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return wt3.n(sb, this.i, ')');
    }
}
