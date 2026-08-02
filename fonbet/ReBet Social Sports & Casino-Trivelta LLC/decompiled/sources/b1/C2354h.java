package b1;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354h {

    /* renamed from: a, reason: collision with root package name */
    public final int f24588a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24589b;

    public C2354h(int i10, float f10) {
        this.f24588a = i10;
        this.f24589b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2354h.class == obj.getClass()) {
            C2354h c2354h = (C2354h) obj;
            if (this.f24588a == c2354h.f24588a && Float.compare(c2354h.f24589b, this.f24589b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f24588a) * 31) + Float.floatToIntBits(this.f24589b);
    }
}
