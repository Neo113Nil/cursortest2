package j3;

import java.util.Locale;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f69344d = new x(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f69345a;

    /* renamed from: b, reason: collision with root package name */
    public final float f69346b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69347c;

    static {
        m3.N.L(0);
        m3.N.L(1);
    }

    public x(float f7, float f11) {
        G10.a.c(f7 > 0.0f);
        G10.a.c(f11 > 0.0f);
        this.f69345a = f7;
        this.f69346b = f11;
        this.f69347c = Math.round(f7 * 1000.0f);
    }

    public final long a(long j11) {
        return j11 * this.f69347c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f69345a == xVar.f69345a && this.f69346b == xVar.f69346b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f69346b) + ((Float.floatToRawIntBits(this.f69345a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f69345a), Float.valueOf(this.f69346b)};
        int i11 = m3.N.f74289a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
