package k1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: k1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7464j {

    /* renamed from: a, reason: collision with root package name */
    private final long f70292a;

    /* renamed from: k1.j$a */
    public static final class a {
    }

    private /* synthetic */ C7464j(long j11) {
        this.f70292a = j11;
    }

    public static final /* synthetic */ C7464j a(long j11) {
        return new C7464j(j11);
    }

    public static long b(float f7, float f11, int i11, long j11) {
        if ((i11 & 1) != 0) {
            f7 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final float d(long j11) {
        if (j11 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        Fl0.b.d();
        throw null;
    }

    public static final float e(long j11) {
        if (j11 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j11 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j11 & 2147483647L)));
        }
        Fl0.b.d();
        throw null;
    }

    public static final float f(long j11) {
        if (j11 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j11 >> 32));
        }
        Fl0.b.d();
        throw null;
    }

    public static final boolean g(long j11) {
        if (j11 != 9205357640488583168L) {
            long j12 = j11 & (~((((-9223372034707292160L) & j11) >>> 31) * (-1)));
            return ((j12 & 4294967295L) & (j12 >>> 32)) == 0;
        }
        Fl0.b.d();
        throw null;
    }

    @NotNull
    public static String h(long j11) {
        if (j11 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + C7457c.a(f(j11)) + ", " + C7457c.a(d(j11)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7464j) {
            return this.f70292a == ((C7464j) obj).f70292a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f70292a);
    }

    public final /* synthetic */ long i() {
        return this.f70292a;
    }

    @NotNull
    public final String toString() {
        return h(this.f70292a);
    }
}
