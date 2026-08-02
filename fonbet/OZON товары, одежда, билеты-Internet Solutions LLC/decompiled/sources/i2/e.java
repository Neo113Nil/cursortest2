package i2;

/* loaded from: classes8.dex */
public final class e extends C7000c {

    /* renamed from: e, reason: collision with root package name */
    float f65759e;

    public e(float f7) {
        super(null);
        this.f65759e = f7;
    }

    @Override // i2.C7000c
    public final float c() {
        if (Float.isNaN(this.f65759e) && g()) {
            this.f65759e = Float.parseFloat(b());
        }
        return this.f65759e;
    }

    @Override // i2.C7000c
    public final int e() {
        if (Float.isNaN(this.f65759e) && g()) {
            this.f65759e = Integer.parseInt(b());
        }
        return (int) this.f65759e;
    }

    @Override // i2.C7000c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float c11 = c();
            float c12 = ((e) obj).c();
            if ((Float.isNaN(c11) && Float.isNaN(c12)) || c11 == c12) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.C7000c
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f7 = this.f65759e;
        return hashCode + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0);
    }
}
