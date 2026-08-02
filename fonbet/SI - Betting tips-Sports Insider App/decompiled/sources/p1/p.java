package p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f21443a = s.g.a(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final float f21444b = 3.1415927f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21445c = 6.2831855f;

    public static final float a(float f6, float f10) {
        float atan2 = (float) Math.atan2(f10, f6);
        float f11 = f21445c;
        return (atan2 + f11) % f11;
    }

    public static final long b(float f6, float f10) {
        float sqrt = (float) Math.sqrt((f10 * f10) + (f6 * f6));
        if (sqrt > 0.0f) {
            return s.g.a(f6 / sqrt, f10 / sqrt);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float c(float f6, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f6);
    }

    public static final float d(float f6, float f10) {
        return ((f6 % f10) + f10) % f10;
    }

    public static long e(float f6, float f10) {
        double d10 = f10;
        return ci.c.V(ci.c.Z(s.g.a((float) Math.cos(d10), (float) Math.sin(d10)), f6), f21443a);
    }
}
