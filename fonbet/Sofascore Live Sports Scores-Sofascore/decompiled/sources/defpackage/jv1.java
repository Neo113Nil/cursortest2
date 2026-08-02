package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jv1 implements io {
    public final float a;
    public final float b;

    public jv1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.io
    public final long a(long j, long j2, ema emaVar) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = (this.a + 1.0f) * (((int) (j3 >> 32)) / 2.0f);
        float f2 = 1.0f + this.b;
        return (Math.round(f2 * (((int) (j3 & 4294967295L)) / 2.0f)) & 4294967295L) | (Math.round(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv1)) {
            return false;
        }
        jv1 jv1Var = (jv1) obj;
        return Float.compare(this.a, jv1Var.a) == 0 && Float.compare(this.b, jv1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return wt3.n(sb, this.b, ')');
    }
}
