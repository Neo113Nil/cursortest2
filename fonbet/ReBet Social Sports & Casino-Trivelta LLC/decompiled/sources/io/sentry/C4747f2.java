package io.sentry;

/* renamed from: io.sentry.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4747f2 implements InterfaceC4737d2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4727b2 f52050a;

    public C4747f2(InterfaceC4727b2 interfaceC4727b2) {
        this.f52050a = (InterfaceC4727b2) io.sentry.util.w.c(interfaceC4727b2, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.InterfaceC4737d2
    public InterfaceC4664a2 c(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        io.sentry.util.w.c(f32, "SentryOptions is required");
        String a10 = this.f52050a.a();
        if (a10 != null && d(a10, f32.getLogger())) {
            return a(new C4855v1(interfaceC4740e0, f32.getEnvelopeReader(), f32.getSerializer(), f32.getLogger(), f32.getFlushTimeoutMillis(), f32.getMaxQueueSize()), a10, f32.getLogger());
        }
        f32.getLogger().c(EnumC4788n3.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}
