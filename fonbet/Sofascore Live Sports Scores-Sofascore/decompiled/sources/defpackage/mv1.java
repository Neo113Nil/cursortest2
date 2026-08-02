package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mv1 implements io {
    public final float a;
    public final float b;

    public mv1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.io
    public final long a(long j, long j2, ema emaVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        ema emaVar2 = ema.a;
        float f3 = this.a;
        if (emaVar != emaVar2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv1)) {
            return false;
        }
        mv1 mv1Var = (mv1) obj;
        return Float.compare(this.a, mv1Var.a) == 0 && Float.compare(this.b, mv1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return wt3.n(sb, this.b, ')');
    }
}
