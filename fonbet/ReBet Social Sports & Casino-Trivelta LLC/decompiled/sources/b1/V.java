package b1;

/* loaded from: classes.dex */
public final class V extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final long f24523a;

    public V(String str) {
        this(str, -9223372036854775807L);
    }

    public static V a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static V b(Exception exc, long j10) {
        return exc instanceof V ? (V) exc : new V(exc, j10);
    }

    public V(String str, long j10) {
        super(str);
        this.f24523a = j10;
    }

    public V(Throwable th2) {
        this(th2, -9223372036854775807L);
    }

    public V(Throwable th2, long j10) {
        super(th2);
        this.f24523a = j10;
    }
}
