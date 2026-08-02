package io.sentry;

import An.C2439a;
import io.sentry.C7209u1;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7191g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class N0 implements U {

    /* renamed from: b, reason: collision with root package name */
    private static final N0 f66690b = new N0();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<W2> f66691a = new io.sentry.util.l<>(new C2439a());

    private N0() {
    }

    public static N0 b() {
        return f66690b;
    }

    @Override // io.sentry.U
    @NotNull
    public final Y A() {
        return R0.i();
    }

    @Override // io.sentry.U
    @NotNull
    public final List<InterfaceC7227z> B() {
        return new ArrayList();
    }

    @Override // io.sentry.U
    public final void C(@NotNull C7175n1 c7175n1) {
    }

    @Override // io.sentry.U
    public final void D(@NotNull W2 w22) {
    }

    @Override // io.sentry.U
    @NotNull
    public final List<io.sentry.internal.eventprocessor.a> E() {
        return new ArrayList();
    }

    @Override // io.sentry.U
    @NotNull
    public final List<String> F() {
        return new ArrayList();
    }

    @Override // io.sentry.U
    public final String G() {
        return null;
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 H() {
        return new C7175n1();
    }

    @Override // io.sentry.U
    public final void I(@NotNull C7125b c7125b) {
    }

    @Override // io.sentry.U
    @NotNull
    public final List<C7125b> J() {
        return new ArrayList();
    }

    @Override // io.sentry.U
    @NotNull
    public final C7175n1 K(C7209u1.a aVar) {
        return new C7175n1();
    }

    @Override // io.sentry.U
    public final void L(C7209u1.c cVar) {
    }

    @Override // io.sentry.U
    public final void M(@NotNull io.sentry.protocol.t tVar) {
    }

    @Override // io.sentry.U
    public final String a() {
        return null;
    }

    @Override // io.sentry.U
    public final void c(String str, String str2) {
    }

    @Override // io.sentry.U
    public final void clear() {
    }

    @Override // io.sentry.U
    @NotNull
    /* renamed from: clone */
    public final U m65clone() {
        return f66690b;
    }

    @Override // io.sentry.U
    public final void d(io.sentry.protocol.E e11) {
    }

    @Override // io.sentry.U
    public final void f(@NotNull C7141f c7141f) {
    }

    @Override // io.sentry.U
    public final void g(@NotNull C7141f c7141f, E e11) {
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, Object> getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.U
    public final C7191g getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.U
    public final I2 getLevel() {
        return null;
    }

    @Override // io.sentry.U
    @NotNull
    public final W2 getOptions() {
        return this.f66691a.a();
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.o getRequest() {
        return null;
    }

    @Override // io.sentry.U
    @NotNull
    public final Map<String, String> getTags() {
        return new HashMap();
    }

    @Override // io.sentry.U
    public final io.sentry.protocol.E getUser() {
        return null;
    }

    @Override // io.sentry.U
    public final InterfaceC7142f0 i() {
        return null;
    }

    @Override // io.sentry.U
    public final void j(io.sentry.protocol.o oVar) {
    }

    @Override // io.sentry.U
    public final void k(I2 i22) {
    }

    @Override // io.sentry.U
    public final C7209u1.d l() {
        return null;
    }

    @Override // io.sentry.U
    public final InterfaceC7134d0 m() {
        return null;
    }

    @Override // io.sentry.U
    public final h3 n() {
        return null;
    }

    @Override // io.sentry.U
    public final void o(io.sentry.protocol.t tVar) {
    }

    @Override // io.sentry.U
    public final void p(@NotNull String str) {
    }

    @Override // io.sentry.U
    @NotNull
    public final Queue<C7141f> q() {
        return new ArrayDeque();
    }

    @Override // io.sentry.U
    public final h3 r(C7209u1.b bVar) {
        return null;
    }

    @Override // io.sentry.U
    @NotNull
    public final C7187c s() {
        return new C7187c();
    }

    @Override // io.sentry.U
    public final void setTag(String str, String str2) {
    }

    @Override // io.sentry.U
    public final void t(InterfaceC7142f0 interfaceC7142f0) {
    }

    @Override // io.sentry.U
    public final void u(@NotNull ArrayList arrayList) {
    }

    @Override // io.sentry.U
    public final void v() {
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.featureflags.b w() {
        return io.sentry.featureflags.c.a();
    }

    @Override // io.sentry.U
    public final h3 x() {
        return null;
    }

    @Override // io.sentry.U
    @NotNull
    public final io.sentry.protocol.t y() {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.U
    public final void z(String str) {
    }

    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final Object m60clone() throws CloneNotSupportedException {
        return f66690b;
    }
}
