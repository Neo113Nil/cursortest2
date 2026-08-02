package io.sentry;

import io.sentry.L1;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4806h;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: io.sentry.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4730c0 {
    List A();

    C4802d B();

    void C(String str, Object obj);

    void D(InterfaceC4790o0 interfaceC4790o0);

    List E();

    void F(String str, Object obj);

    String G();

    void H();

    void I(String str);

    io.sentry.featureflags.b J();

    void K(InterfaceC4755h0 interfaceC4755h0);

    void L(String str);

    V3 M();

    EnumC4788n3 N();

    E1 O();

    void P(String str);

    InterfaceC4755h0 Q();

    void R(C4792o2 c4792o2);

    List S();

    void T(C4733c3 c4733c3);

    void U();

    E1 V(L1.a aVar);

    void W(L1.c cVar);

    void X(io.sentry.protocol.u uVar);

    List Y();

    void Z(E1 e12);

    String b();

    io.sentry.protocol.p c();

    void clear();

    /* renamed from: clone */
    InterfaceC4730c0 m125clone();

    void d(C4744f c4744f);

    void e(String str, String str2);

    V3 endSession();

    void f(String str, String str2);

    void g(C4744f c4744f, J j10);

    Map getExtras();

    io.sentry.protocol.F getUser();

    void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str);

    F3 i();

    void j(io.sentry.protocol.F f10);

    InterfaceC4790o0 k();

    C4806h l();

    io.sentry.protocol.u r();

    void s(io.sentry.protocol.u uVar);

    L1.d t();

    void u(F3 f32);

    InterfaceC4780m0 v();

    Queue w();

    V3 x(L1.b bVar);

    Map y();

    void z();
}
