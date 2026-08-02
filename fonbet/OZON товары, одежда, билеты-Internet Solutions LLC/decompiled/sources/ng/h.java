package ng;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f77135a;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<h> f77136b;

    static class a extends h {
        @Override // ng.h
        protected final void b() {
        }
    }

    /* loaded from: classes10.dex */
    static class b extends h {
        b() {
        }

        @Override // ng.h
        protected final void b() {
            try {
                Iterator it = Arrays.asList(new i[0]).iterator();
                while (it.hasNext()) {
                    try {
                        i.d((i) it.next());
                    } catch (ServiceConfigurationError e11) {
                        if (!(e11.getCause() instanceof SecurityException)) {
                            throw e11;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    static {
        new a();
        f77135a = new AtomicBoolean(false);
        f77136b = new AtomicReference<>();
    }

    static void a() {
        if (f77135a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = f77136b;
        Co.a.c(atomicReference, new b());
        atomicReference.get().b();
    }

    public static void c(h hVar) {
        if (f77135a.get()) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = f77136b;
        while (!atomicReference.compareAndSet(null, hVar)) {
            if (atomicReference.get() != null) {
                throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
            }
        }
    }

    protected abstract void b();
}
