package fi0;

/* loaded from: classes7.dex */
final class r<T> implements o<T> {

    /* renamed from: a, reason: collision with root package name */
    private volatile kotlin.time.b f63503a;

    public r(kotlin.time.b bVar) {
        this.f63503a = bVar;
    }

    @Override // fi0.o
    public final void a(kotlin.time.b bVar) {
        this.f63503a = bVar;
    }

    @Override // fi0.q
    public final T getValue() {
        return (T) this.f63503a;
    }
}
