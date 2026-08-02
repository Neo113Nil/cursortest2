package l1;

import Sc.C;
import ed.InterfaceC6346b;
import m1.AbstractC8032c;
import m1.C8033d;
import m1.C8034e;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: l1.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7807Z {

    /* renamed from: b, reason: collision with root package name */
    private static final long f72248b = C7811b0.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    private static final long f72249c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f72250d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f72251e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f72252f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f72253g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f72254h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f72255i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f72256j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f72257k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f72258l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f72259m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f72260n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f72261a;

    /* renamed from: l1.Z$a */
    public static final class a {
    }

    static {
        C7811b0.c(4282664004L);
        f72249c = C7811b0.c(4287137928L);
        f72250d = C7811b0.c(4291611852L);
        f72251e = C7811b0.c(4294967295L);
        f72252f = C7811b0.c(4294901760L);
        f72253g = C7811b0.c(4278255360L);
        f72254h = C7811b0.c(4278190335L);
        f72255i = C7811b0.c(4294967040L);
        f72256j = C7811b0.c(4278255615L);
        f72257k = C7811b0.c(4294902015L);
        f72258l = C7811b0.b(0);
        f72259m = C7811b0.a(0.0f, 0.0f, 0.0f, 0.0f, C8034e.u());
    }

    private /* synthetic */ C7807Z(long j11) {
        this.f72261a = j11;
    }

    public static final /* synthetic */ C7807Z m(long j11) {
        return new C7807Z(j11);
    }

    public static final long n(long j11, @NotNull AbstractC8032c abstractC8032c) {
        return C8033d.d(s(j11), abstractC8032c).a(j11);
    }

    public static long o(float f7, long j11) {
        return C7811b0.a(u(j11), t(j11), r(j11), f7, s(j11));
    }

    public static final boolean p(long j11, long j12) {
        C.Companion companion = Sc.C.INSTANCE;
        return j11 == j12;
    }

    public static final float q(long j11) {
        float a11;
        float f7;
        long j12 = 63 & j11;
        C.Companion companion = Sc.C.INSTANCE;
        if (j12 == 0) {
            a11 = (float) Sc.J.a((j11 >>> 56) & 255);
            f7 = 255.0f;
        } else {
            a11 = (float) Sc.J.a((j11 >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return a11 / f7;
    }

    public static final float r(long j11) {
        int i11;
        int i12;
        int i13;
        float f7;
        long j12 = 63 & j11;
        C.Companion companion = Sc.C.INSTANCE;
        if (j12 == 0) {
            return ((float) Sc.J.a((j11 >>> 32) & 255)) / 255.0f;
        }
        short s11 = (short) ((j11 >>> 16) & 65535);
        int i14 = 32768 & s11;
        int i15 = ((65535 & s11) >>> 10) & 31;
        int i16 = s11 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i16 + 1056964608);
                f7 = C7821g0.f72265a;
                float f11 = intBitsToFloat - f7;
                return i14 == 0 ? f11 : -f11;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    @NotNull
    public static final AbstractC8032c s(long j11) {
        int i11 = C8034e.f73959v;
        C.Companion companion = Sc.C.INSTANCE;
        return C8034e.h()[(int) (j11 & 63)];
    }

    public static final float t(long j11) {
        int i11;
        int i12;
        int i13;
        float f7;
        long j12 = 63 & j11;
        C.Companion companion = Sc.C.INSTANCE;
        if (j12 == 0) {
            return ((float) Sc.J.a((j11 >>> 40) & 255)) / 255.0f;
        }
        short s11 = (short) ((j11 >>> 32) & 65535);
        int i14 = 32768 & s11;
        int i15 = ((65535 & s11) >>> 10) & 31;
        int i16 = s11 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i16 + 1056964608);
                f7 = C7821g0.f72265a;
                float f11 = intBitsToFloat - f7;
                return i14 == 0 ? f11 : -f11;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final float u(long j11) {
        int i11;
        int i12;
        int i13;
        float f7;
        long j12 = 63 & j11;
        C.Companion companion = Sc.C.INSTANCE;
        if (j12 == 0) {
            return ((float) Sc.J.a((j11 >>> 48) & 255)) / 255.0f;
        }
        short s11 = (short) ((j11 >>> 48) & 65535);
        int i14 = 32768 & s11;
        int i15 = ((65535 & s11) >>> 10) & 31;
        int i16 = s11 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i16 + 1056964608);
                f7 = C7821g0.f72265a;
                float f11 = intBitsToFloat - f7;
                return i14 == 0 ? f11 : -f11;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    @NotNull
    public static String v(long j11) {
        return "Color(" + u(j11) + ", " + t(j11) + ", " + r(j11) + ", " + q(j11) + ", " + s(j11).g() + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7807Z) {
            return this.f72261a == ((C7807Z) obj).f72261a;
        }
        return false;
    }

    public final int hashCode() {
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f72261a);
    }

    @NotNull
    public final String toString() {
        return v(this.f72261a);
    }

    public final /* synthetic */ long w() {
        return this.f72261a;
    }
}
