package io.sentry;

/* loaded from: classes3.dex */
public final class G implements V {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4740e0 f50339a;

    public G(InterfaceC4740e0 interfaceC4740e0) {
        this.f50339a = interfaceC4740e0;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u a(io.sentry.protocol.i iVar, J j10, N1 n12) {
        return this.f50339a.q(iVar, j10, n12);
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u b(io.sentry.protocol.i iVar) {
        return this.f50339a.C(iVar);
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u c(io.sentry.protocol.i iVar, J j10) {
        return this.f50339a.u(iVar, j10);
    }
}
