package x1;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final long f104912a;

    private /* synthetic */ w(long j11) {
        this.f104912a = j11;
    }

    public static final /* synthetic */ w a(long j11) {
        return new w(j11);
    }

    public static boolean b(long j11, Object obj) {
        return (obj instanceof w) && j11 == ((w) obj).f104912a;
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static String d(long j11) {
        return "PointerId(value=" + j11 + ')';
    }

    public final boolean equals(Object obj) {
        return b(this.f104912a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f104912a);
    }

    public final String toString() {
        return d(this.f104912a);
    }
}
