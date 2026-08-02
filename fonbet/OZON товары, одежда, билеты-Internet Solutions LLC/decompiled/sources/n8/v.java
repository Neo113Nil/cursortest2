package n8;

import Am.C2438a;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
final class v<T> implements InterfaceC10861a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final C2438a f76614c = new C2438a();

    /* renamed from: d, reason: collision with root package name */
    private static final u f76615d = new u();

    /* renamed from: a, reason: collision with root package name */
    private C2438a f76616a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC10861a<T> f76617b;

    private v() {
        throw null;
    }

    static <T> v<T> a() {
        C2438a c2438a = f76614c;
        u uVar = f76615d;
        v<T> vVar = new v<>();
        ((v) vVar).f76616a = c2438a;
        ((v) vVar).f76617b = uVar;
        return vVar;
    }

    final void b(InterfaceC10861a<T> interfaceC10861a) {
        C2438a c2438a;
        if (this.f76617b != f76615d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            c2438a = this.f76616a;
            this.f76616a = null;
            this.f76617b = interfaceC10861a;
        }
        c2438a.getClass();
    }

    @Override // y8.InterfaceC10861a
    public final T get() {
        return this.f76617b.get();
    }
}
