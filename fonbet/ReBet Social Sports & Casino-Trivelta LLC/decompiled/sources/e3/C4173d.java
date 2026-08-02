package e3;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4173d extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f45641a;

    public C4173d(String str, Exception exc) {
        super(str);
        this.f45641a = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f45641a;
    }
}
