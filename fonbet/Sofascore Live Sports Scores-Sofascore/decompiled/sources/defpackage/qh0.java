package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qh0 implements y78 {
    public float a;
    public float b;

    public qh0(int i) {
        switch (i) {
            case 5:
                break;
            default:
                this.a = Math.max(1.0E-7f, Math.abs(0.1f));
                this.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    public q78 a(float f) {
        double b = b(f);
        double d = r78.a;
        double d2 = d - 1.0d;
        return new q78(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = t00.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    @Override // defpackage.y78
    public float k(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.y78
    public float q() {
        return this.a;
    }

    @Override // defpackage.y78
    public long t(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.y78
    public float w(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // defpackage.y78
    public float y(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    public /* synthetic */ qh0(float f, float f2, float f3, float f4) {
        this.a = f3;
        this.b = f4;
    }
}
