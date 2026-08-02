package I0;

/* renamed from: I0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341f extends D {

    /* renamed from: b, reason: collision with root package name */
    public final Object f5084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5085c;

    public C1341f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f5084b = obj;
        this.f5085c = i10;
    }

    public final void b() {
        Object obj = this.f5084b;
        if ((obj != null ? obj.hashCode() : 0) != this.f5085c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f5084b;
    }
}
