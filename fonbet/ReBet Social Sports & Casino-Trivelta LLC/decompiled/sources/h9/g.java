package h9;

/* loaded from: classes2.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C4490b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new C4490b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j10) {
        return new C4490b(a.OK, j10);
    }

    public static g f() {
        return new C4490b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
