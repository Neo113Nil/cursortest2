package l1;

import bc.C5637m;
import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: b, reason: collision with root package name */
    private static final long f72232b = C5637m.a(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f72233c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f72234a;

    private /* synthetic */ N0(long j11) {
        this.f72234a = j11;
    }

    public static final /* synthetic */ N0 b(long j11) {
        return new N0(j11);
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

    public static String f(long j11) {
        return "TransformOrigin(packedValue=" + j11 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N0) {
            return this.f72234a == ((N0) obj).f72234a;
        }
        return false;
    }

    public final /* synthetic */ long g() {
        return this.f72234a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72234a);
    }

    public final String toString() {
        return f(this.f72234a);
    }
}
