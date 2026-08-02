package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class A0 implements InterfaceC7154i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f66538a;

    public A0(@NotNull W2 w22) {
        this.f66538a = w22;
    }

    @Override // io.sentry.InterfaceC7154i0
    public final boolean a() {
        io.sentry.internal.a.a().b();
        return G2.d().c(this.f66538a.getFatalLogger());
    }
}
