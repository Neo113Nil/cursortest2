package n3;

import j3.t;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8432e implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f76380a;

    /* renamed from: b, reason: collision with root package name */
    public final float f76381b;

    public C8432e(float f7, float f11) {
        G10.a.b("Invalid latitude or longitude", f7 >= -90.0f && f7 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f76380a = f7;
        this.f76381b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8432e.class == obj.getClass()) {
            C8432e c8432e = (C8432e) obj;
            if (this.f76380a == c8432e.f76380a && this.f76381b == c8432e.f76381b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f76381b).hashCode() + ((Float.valueOf(this.f76380a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f76380a + ", longitude=" + this.f76381b;
    }
}
