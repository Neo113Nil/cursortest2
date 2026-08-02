package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class Z2 implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    private final String f66821a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66822b;

    public Z2() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f66821a = property;
        this.f66822b = property2;
    }

    @NotNull
    private void a(@NotNull O1 o12) {
        if (o12.C().i() == null) {
            o12.C().v(new io.sentry.protocol.v());
        }
        io.sentry.protocol.v i11 = o12.C().i();
        if (i11 != null && i11.d() == null && i11.e() == null) {
            i11.f(this.f66822b);
            i11.h(this.f66821a);
        }
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final C7230z2 d(@NotNull C7230z2 c7230z2, E e11) {
        a(c7230z2);
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, E e11) {
        a(a11);
        return a11;
    }
}
