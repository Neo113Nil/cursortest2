package b;

/* loaded from: classes.dex */
public final class t0 extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f24145a;

    public t0(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24145a;
    }

    public t0(String str, Exception exc) {
        super(str);
        this.f24145a = exc;
    }
}
