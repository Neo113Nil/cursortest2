package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zp2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public zp2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp2)) {
            return false;
        }
        zp2 zp2Var = (zp2) obj;
        return Float.compare(this.a, zp2Var.a) == 0 && Float.compare(this.b, zp2Var.b) == 0 && Float.compare(this.c, zp2Var.c) == 0 && Float.compare(this.d, zp2Var.d) == 0 && Float.compare(this.e, zp2Var.e) == 0 && Float.compare(this.f, zp2Var.f) == 0 && Float.compare(this.g, zp2Var.g) == 0 && Float.compare(this.h, zp2Var.h) == 0 && Float.compare(this.i, zp2Var.i) == 0 && Float.compare(this.j, zp2Var.j) == 0 && Float.compare(this.k, zp2Var.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + fc6.a(this.j, fc6.a(this.i, fc6.a(this.h, fc6.a(this.g, fc6.a(this.f, fc6.a(this.e, fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ChartDimensions(yAxisPadding=" + this.a + ", endPadding=" + this.b + ", paddingTop=" + this.c + ", paddingBottom=" + this.d + ", lineStrokeWidth=" + this.e + ", dashedStrokeWidth=" + this.f + ", yAxisMargin=" + this.g + ", xAxisMargin=" + this.h + ", textSize=" + this.i + ", eliminationRadius=" + this.j + ", thumbStrokeWidth=" + this.k + ")";
    }
}
