package uh;

/* renamed from: uh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6579c {
    static InterfaceC6579c current() {
        InterfaceC6579c current = InterfaceC6581e.get().current();
        return current != null ? current : d();
    }

    static InterfaceC6579c d() {
        return InterfaceC6581e.get().d();
    }

    default Runnable e(final Runnable runnable) {
        return new Runnable() { // from class: uh.b
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC6579c.this.g(runnable);
            }
        };
    }

    InterfaceC6579c f(InterfaceC6580d interfaceC6580d, Object obj);

    /* synthetic */ default void g(Runnable runnable) {
        InterfaceC6587k makeCurrent = makeCurrent();
        try {
            runnable.run();
            if (makeCurrent != null) {
                makeCurrent.close();
            }
        } catch (Throwable th2) {
            if (makeCurrent != null) {
                try {
                    makeCurrent.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    Object h(InterfaceC6580d interfaceC6580d);

    default InterfaceC6579c i(InterfaceC6585i interfaceC6585i) {
        return interfaceC6585i.b(this);
    }

    default InterfaceC6587k makeCurrent() {
        return InterfaceC6581e.get().r(this);
    }
}
