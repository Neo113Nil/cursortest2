package io.sentry;

/* renamed from: io.sentry.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4755h0 {
    void a(boolean z10);

    void b(long j10);

    default boolean c() {
        return true;
    }

    io.sentry.protocol.u d(G3 g32, InterfaceC4730c0 interfaceC4730c0, J j10);

    io.sentry.transport.z e();

    io.sentry.protocol.u f(C4866x2 c4866x2, J j10);

    io.sentry.protocol.u g(io.sentry.protocol.B b10, j4 j4Var, InterfaceC4730c0 interfaceC4730c0, J j10, C1 c12);

    void h(V3 v32, J j10);

    io.sentry.protocol.u i(io.sentry.protocol.i iVar, J j10, InterfaceC4730c0 interfaceC4730c0);

    boolean isEnabled();

    void j(C4815r3 c4815r3);

    void k(C4862w3 c4862w3);

    io.sentry.protocol.u l(C4870y1 c4870y1, InterfaceC4730c0 interfaceC4730c0);

    io.sentry.protocol.u m(C4733c3 c4733c3, InterfaceC4730c0 interfaceC4730c0, J j10);
}
