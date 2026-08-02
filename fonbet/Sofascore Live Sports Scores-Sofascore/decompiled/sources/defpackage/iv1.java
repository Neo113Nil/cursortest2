package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iv1 implements fo {
    public final float a;

    public iv1(float f) {
        this.a = f;
    }

    @Override // defpackage.fo
    public final int a(int i, int i2, ema emaVar) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv1) && Float.compare(this.a, ((iv1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wt3.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
