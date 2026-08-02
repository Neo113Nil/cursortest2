package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kv1 implements fo {
    public final float a;

    public kv1(float f) {
        this.a = f;
    }

    @Override // defpackage.fo
    public final int a(int i, int i2, ema emaVar) {
        float f = (i2 - i) / 2.0f;
        ema emaVar2 = ema.a;
        float f2 = this.a;
        if (emaVar != emaVar2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv1) && Float.compare(this.a, ((kv1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wt3.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
