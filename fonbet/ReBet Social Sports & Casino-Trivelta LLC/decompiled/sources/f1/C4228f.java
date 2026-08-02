package f1;

import b1.C2334C;
import e1.AbstractC4134a;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4228f implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f46180a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46181b;

    public C4228f(float f10, float f11) {
        AbstractC4134a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f46180a = f10;
        this.f46181b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4228f.class == obj.getClass()) {
            C4228f c4228f = (C4228f) obj;
            if (this.f46180a == c4228f.f46180a && this.f46181b == c4228f.f46181b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.c.a(this.f46180a)) * 31) + com.google.common.primitives.c.a(this.f46181b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f46180a + ", longitude=" + this.f46181b;
    }
}
