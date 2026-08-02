package k5;

/* renamed from: k5.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7482A extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final C7558q2 f70513a;

    C7482A(C7558q2 c7558q2) {
        this.f70513a = c7558q2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "\n\n\tCircular dependency detected:\n" + this.f70513a;
    }
}
