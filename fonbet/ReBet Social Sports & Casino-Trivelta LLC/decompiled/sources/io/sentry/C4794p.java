package io.sentry;

/* renamed from: io.sentry.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4794p implements InterfaceC4745f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f52245a = new ThreadLocal();

    /* renamed from: io.sentry.p$a */
    public static final class a implements InterfaceC4765j0 {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4740e0 f52246a;

        public a(InterfaceC4740e0 interfaceC4740e0) {
            this.f52246a = interfaceC4740e0;
        }

        @Override // io.sentry.InterfaceC4765j0, java.lang.AutoCloseable
        public void close() {
            C4794p.f52245a.set(this.f52246a);
        }
    }

    @Override // io.sentry.InterfaceC4745f0
    public void a() {
    }

    @Override // io.sentry.InterfaceC4745f0
    public InterfaceC4765j0 b(InterfaceC4740e0 interfaceC4740e0) {
        InterfaceC4740e0 interfaceC4740e02 = get();
        f52245a.set(interfaceC4740e0);
        return new a(interfaceC4740e02);
    }

    @Override // io.sentry.InterfaceC4745f0
    public void close() {
        f52245a.remove();
    }

    @Override // io.sentry.InterfaceC4745f0
    public InterfaceC4740e0 get() {
        return (InterfaceC4740e0) f52245a.get();
    }
}
