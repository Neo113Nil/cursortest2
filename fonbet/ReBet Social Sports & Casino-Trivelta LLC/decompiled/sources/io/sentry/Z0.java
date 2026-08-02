package io.sentry;

import io.sentry.L1;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4806h;
import io.sentry.util.p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class Z0 implements InterfaceC4730c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Z0 f50572b = new Z0();

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.p f50573a = new io.sentry.util.p(new p.a() { // from class: io.sentry.Y0
        @Override // io.sentry.util.p.a
        public final Object a() {
            F3 empty;
            empty = F3.empty();
            return empty;
        }
    });

    public static Z0 m() {
        return f50572b;
    }

    @Override // io.sentry.InterfaceC4730c0
    public List A() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4802d B() {
        return new C4802d();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void C(String str, Object obj) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void D(InterfaceC4790o0 interfaceC4790o0) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public List E() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void F(String str, Object obj) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public String G() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void H() {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void I(String str) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.featureflags.b J() {
        return io.sentry.featureflags.c.a();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void K(InterfaceC4755h0 interfaceC4755h0) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void L(String str) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 M() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public EnumC4788n3 N() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 O() {
        return new E1();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void P(String str) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4755h0 Q() {
        return C4741e1.n();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void R(C4792o2 c4792o2) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public List S() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void T(C4733c3 c4733c3) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void U() {
    }

    @Override // io.sentry.InterfaceC4730c0
    public E1 V(L1.a aVar) {
        return new E1();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void W(L1.c cVar) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void X(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public List Y() {
        return new ArrayList();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void Z(E1 e12) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public String b() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.p c() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void clear() {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void d(C4744f c4744f) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void e(String str, String str2) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 endSession() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void f(String str, String str2) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public void g(C4744f c4744f, J j10) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.F getUser() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public F3 i() {
        return (F3) this.f50573a.a();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void j(io.sentry.protocol.F f10) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4790o0 k() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public C4806h l() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public io.sentry.protocol.u r() {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void s(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public L1.d t() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public void u(F3 f32) {
    }

    @Override // io.sentry.InterfaceC4730c0
    public InterfaceC4780m0 v() {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public Queue w() {
        return new ArrayDeque();
    }

    @Override // io.sentry.InterfaceC4730c0
    public V3 x(L1.b bVar) {
        return null;
    }

    @Override // io.sentry.InterfaceC4730c0
    public Map y() {
        return new HashMap();
    }

    @Override // io.sentry.InterfaceC4730c0
    public void z() {
    }

    @Override // io.sentry.InterfaceC4730c0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC4730c0 m130clone() {
        return m();
    }
}
