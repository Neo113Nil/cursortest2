package e3;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4172c extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f45640a;

    public C4172c(String str, Exception exc) {
        super(str);
        this.f45640a = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f45640a;
    }
}
