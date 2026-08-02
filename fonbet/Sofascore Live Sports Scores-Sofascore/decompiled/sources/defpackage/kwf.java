package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kwf implements uah {
    public final int a;
    public final float b;
    public final b20 c = e20.a();

    public kwf(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        emaVar.getClass();
        kx4Var.getClass();
        b20 b20Var = this.c;
        b20Var.i();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) / 2.0f;
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)) / 2.0f;
        int i3 = this.a;
        double d = 6.283185307179586d / i3;
        double d2 = ((this.b * 3.141592653589793d) / 180.0d) - 1.5707963267948966d;
        int i4 = (int) (floatToRawIntBits >> 32);
        double d3 = min;
        int i5 = (int) (floatToRawIntBits & 4294967295L);
        b20Var.g(Float.intBitsToFloat(i4) + ((float) (Math.cos(d2) * d3)), Float.intBitsToFloat(i5) + ((float) (Math.sin(d2) * d3)));
        int i6 = 1;
        while (i6 < i3) {
            double d4 = (i6 * d) + d2;
            int i7 = i5;
            b20Var.f(Float.intBitsToFloat(i4) + ((float) (Math.cos(d4) * d3)), Float.intBitsToFloat(i7) + ((float) (Math.sin(d4) * d3)));
            i6++;
            i5 = i7;
        }
        b20Var.d();
        return new cxd(b20Var);
    }
}
