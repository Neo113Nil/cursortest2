package ie;

/* loaded from: classes.dex */
final class m<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f66279a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f66280b = Thread.currentThread();

    m(T t2) {
        this.f66279a = t2;
    }

    public final T a() {
        if (b()) {
            return this.f66279a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public final boolean b() {
        return this.f66280b == Thread.currentThread();
    }
}
