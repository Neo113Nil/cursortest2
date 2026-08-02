package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class N1 implements U1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U1 f66692a;

    public N1() {
        if (io.sentry.util.r.c() && io.sentry.util.r.b()) {
            this.f66692a = new F2();
        } else {
            this.f66692a = new T2();
        }
    }

    @Override // io.sentry.U1
    @NotNull
    public final T1 now() {
        return this.f66692a.now();
    }
}
