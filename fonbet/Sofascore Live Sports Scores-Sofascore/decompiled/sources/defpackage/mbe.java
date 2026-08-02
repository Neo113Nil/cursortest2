package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mbe extends wbe {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public mbe(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof mbe)) {
            return false;
        }
        mbe mbeVar = (mbe) obj;
        return Float.compare(this.c, mbeVar.c) == 0 && Float.compare(this.d, mbeVar.d) == 0 && Float.compare(this.e, mbeVar.e) == 0 && this.f == mbeVar.f && this.g == mbeVar.g && Float.compare(this.h, mbeVar.h) == 0 && Float.compare(this.i, mbeVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + fc6.a(this.h, dmi.e(dmi.e(fc6.a(this.e, fc6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return wt3.n(sb, this.i, ')');
    }
}
