package k1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7455a {

    /* renamed from: b, reason: collision with root package name */
    private static final long f70271b = C7456b.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f70272c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f70273a;

    private /* synthetic */ C7455a(long j11) {
        this.f70273a = j11;
    }

    public static final /* synthetic */ C7455a b(long j11) {
        return new C7455a(j11);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final float d(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float e(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    @NotNull
    public static String f(long j11) {
        if (d(j11) == e(j11)) {
            return "CornerRadius.circular(" + C7457c.a(d(j11)) + ')';
        }
        return "CornerRadius.elliptical(" + C7457c.a(d(j11)) + ", " + C7457c.a(e(j11)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7455a) {
            return this.f70273a == ((C7455a) obj).f70273a;
        }
        return false;
    }

    public final /* synthetic */ long g() {
        return this.f70273a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f70273a);
    }

    @NotNull
    public final String toString() {
        return f(this.f70273a);
    }
}
