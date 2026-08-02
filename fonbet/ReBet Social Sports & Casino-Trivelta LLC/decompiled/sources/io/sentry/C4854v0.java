package io.sentry;

/* renamed from: io.sentry.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4854v0 implements InterfaceC4662a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f52821a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC4662a0
    public void c() {
    }

    @Override // io.sentry.InterfaceC4662a0
    public void d(C4860w1 c4860w1) {
        c4860w1.f(Long.valueOf(this.f52821a.totalMemory() - this.f52821a.freeMemory()));
    }
}
