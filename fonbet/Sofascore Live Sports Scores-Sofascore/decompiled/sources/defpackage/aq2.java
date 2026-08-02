package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aq2 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public aq2(zp2 zp2Var, float f, float f2, int i, int i2) {
        zp2Var.getClass();
        this.a = i;
        this.b = i2;
        float f3 = zp2Var.a;
        this.c = f3;
        float f4 = zp2Var.c;
        this.d = f4;
        float f5 = f - zp2Var.b;
        this.e = f5;
        float f6 = f2 - zp2Var.d;
        this.f = f6;
        this.g = f4;
        this.h = f6;
        float f7 = f5 - f3;
        this.i = f7;
        float f8 = f6 - f4;
        if (i > 1) {
            f7 /= i - 1;
        } else if (f7 < 1.0f) {
            f7 = 1.0f;
        }
        this.j = f7;
        this.k = f8 / (i2 - 1);
    }

    public final float a(int i) {
        return ((i - 1) * this.k) + this.d;
    }

    public final float b(int i) {
        return (i * this.j) + this.c;
    }

    public final int c(float f, float f2, boolean z) {
        if (z) {
            f = f2 - f;
        }
        return llf.c(wzb.b((f - this.c) / this.j), 0, this.a - 1) + 1;
    }
}
