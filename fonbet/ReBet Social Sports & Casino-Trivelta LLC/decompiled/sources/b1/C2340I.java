package b1;

import e1.AbstractC4134a;
import e1.Z;

/* renamed from: b1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2340I {

    /* renamed from: d, reason: collision with root package name */
    public static final C2340I f24312d = new C2340I(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final String f24313e = Z.K0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f24314f = Z.K0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f24315a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24317c;

    public C2340I(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * this.f24317c;
    }

    public C2340I b(float f10) {
        return new C2340I(f10, this.f24316b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2340I.class == obj.getClass()) {
            C2340I c2340i = (C2340I) obj;
            if (this.f24315a == c2340i.f24315a && this.f24316b == c2340i.f24316b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f24315a)) * 31) + Float.floatToRawIntBits(this.f24316b);
    }

    public String toString() {
        return Z.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f24315a), Float.valueOf(this.f24316b));
    }

    public C2340I(float f10, float f11) {
        AbstractC4134a.a(f10 > 0.0f);
        AbstractC4134a.a(f11 > 0.0f);
        this.f24315a = f10;
        this.f24316b = f11;
        this.f24317c = Math.round(f10 * 1000.0f);
    }
}
