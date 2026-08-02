package io.sentry;

/* renamed from: io.sentry.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4661a implements InterfaceC4808q0 {
    @Override // io.sentry.InterfaceC4808q0
    public io.sentry.transport.p a(F3 f32, I1 i12) {
        io.sentry.util.w.c(f32, "options is required");
        io.sentry.util.w.c(i12, "requestDetails is required");
        return new io.sentry.transport.e(f32, new io.sentry.transport.z(f32), f32.getTransportGate(), i12);
    }
}
