package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nx4 implements kx4 {
    public final float a;
    public final float b;

    public nx4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        return Float.compare(this.a, nx4Var.a) == 0 && Float.compare(this.b, nx4Var.b) == 0;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return wt3.n(sb, this.b, ')');
    }
}
