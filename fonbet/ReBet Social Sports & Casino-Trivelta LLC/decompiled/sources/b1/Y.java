package b1;

import e1.Z;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: e, reason: collision with root package name */
    public static final Y f24525e = new Y(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f24526f = Z.K0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f24527g = Z.K0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24528h = Z.K0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f24529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24531c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24532d;

    public Y(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            Y y10 = (Y) obj;
            if (this.f24529a == y10.f24529a && this.f24530b == y10.f24530b && this.f24532d == y10.f24532d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f24529a) * 31) + this.f24530b) * 31) + Float.floatToRawIntBits(this.f24532d);
    }

    public Y(int i10, int i11, float f10) {
        this.f24529a = i10;
        this.f24530b = i11;
        this.f24531c = 0;
        this.f24532d = f10;
    }
}
