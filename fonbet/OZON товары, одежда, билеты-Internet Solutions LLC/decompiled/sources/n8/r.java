package n8;

import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class r<T> implements InterfaceC10861a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f76609c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f76610a = f76609c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC10861a<T> f76611b;

    public r(InterfaceC10861a<T> interfaceC10861a) {
        this.f76611b = interfaceC10861a;
    }

    @Override // y8.InterfaceC10861a
    public final T get() {
        T t2;
        T t11 = (T) this.f76610a;
        Object obj = f76609c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t2 = (T) this.f76610a;
                if (t2 == obj) {
                    t2 = this.f76611b.get();
                    this.f76610a = t2;
                    this.f76611b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t2;
    }
}
